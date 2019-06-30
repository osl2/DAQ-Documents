package edu.kit.freejdaq.controller;

import java.io.FileNotFoundException;

import edu.kit.freejdaq.fileservice.YamlService;

/**
 * Command pattern prototype
 * @author Jan
 *
 */
public class SaveConfigCommand implements Command {
	
	private String filePath;
	
	public SaveConfigCommand(String path) {
		filePath = path;
	}

	@Override
	public void execute() throws FileNotFoundException {

		Object data = null; // must get data from model
		
		YamlService.save(filePath, data); // save data as YAML

	}

	@Override
	public void unExecute() throws FileNotFoundException {
		// TODO Auto-generated method stub

	}

}
