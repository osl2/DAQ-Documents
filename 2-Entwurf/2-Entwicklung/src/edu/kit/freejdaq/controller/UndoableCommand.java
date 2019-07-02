package edu.kit.freejdaq.controller;

public interface UndoableCommand extends Command {
	
	public default boolean isUndoable() {
		return true;
	}
	
	public void unExecute();

}
