package edu.kit.freejdaq.controller;

import java.io.FileNotFoundException;
import java.util.Stack;

/**
 * Command pattern prototype
 * @author Jan
 *
 */
public class CommandManager {
	
	private Stack<UndoableCommand> doneCommands;
	private Stack<UndoableCommand> undoneCommands;
	
	/**
	 * runs a specified command, adds it to the undo stack, and clears the redo stack
	 * @param cmd Command object
	 * @throws FileNotFoundException
	 */
	public void doCommand(Command cmd) throws FileNotFoundException {
		cmd.execute();
		if (cmd.isUndoable()) {
			doneCommands.push((UndoableCommand) cmd);
			undoneCommands.clear();
		}
	}
	
	/**
	 * undoes the latest command, adds it to the redo stack
	 * @throws FileNotFoundException
	 */
	public void undo() throws FileNotFoundException {
		UndoableCommand cmd = doneCommands.pop();
		cmd.unExecute();
		undoneCommands.push(cmd);
	}
	
	/**
	 * redoes the latest undone command, adds it back on the undo stack
	 * @throws FileNotFoundException
	 */
	public void redo() throws FileNotFoundException {
		UndoableCommand cmd = undoneCommands.pop();
		cmd.execute();
		doneCommands.push(cmd);
	}
	
}
