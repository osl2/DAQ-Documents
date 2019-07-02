package edu.kit.freejdaq.controller;

public interface BasicCommand extends Command {
	
	public default boolean isUndoable() {
		return false;
	}

}
