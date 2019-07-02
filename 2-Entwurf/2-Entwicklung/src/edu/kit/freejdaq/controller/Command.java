package edu.kit.freejdaq.controller;

import java.io.FileNotFoundException;

/**
 * Command pattern prototype
 * @author Jan
 *
 */
public interface Command {
	
	public boolean isUndoable();
	
	public void execute() throws FileNotFoundException;
	
}
