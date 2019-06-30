package edu.kit.freejdaq.controller;

import java.io.FileNotFoundException;

/**
 * Command pattern prototype
 * @author Jan
 *
 */
public interface Command {
	
	public void execute() throws FileNotFoundException;
	
	public void unExecute() throws FileNotFoundException;
	
}
