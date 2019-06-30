package edu.kit.freejdaq.controller;

import java.io.FileNotFoundException;
import java.util.Stack;

/**
 * Command pattern prototype
 * @author Jan
 *
 */
public class CommandManager {
	
	private Stack<Command> pastCommands;
	
	public void doCmd(Command cmd) throws FileNotFoundException {
		pastCommands.push(cmd);
		cmd.execute();
	}
	
	public void undo( ) throws FileNotFoundException {
		Command cmd = pastCommands.pop();
		cmd.unExecute();
	}

}
