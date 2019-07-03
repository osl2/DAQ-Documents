package edu.kit.freejdaq.controller;

/**
 * Command pattern prototype
 * @author Jan
 *
 */
public class AddBlockToConfigCommand implements UndoableCommand {
	
	private int blockID;
	
	public AddBlockToConfigCommand(int id) {
		blockID = id;
	}

	@Override
	public void execute() {
		// ausführung über fassade des models

	}

	@Override
	public void unExecute() {
		// ausführung über fassade des models

	}

}
