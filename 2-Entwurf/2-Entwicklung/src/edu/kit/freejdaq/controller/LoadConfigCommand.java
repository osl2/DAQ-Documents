package edu.kit.freejdaq.controller;

import java.io.FileNotFoundException;

import edu.kit.freejdaq.fileservice.YamlService;

/**
 * Command pattern prototype
 * @author Jan
 *
 */
public class LoadConfigCommand implements BasicCommand {
	
	private String filePath;
	
	public LoadConfigCommand(String path) {
		filePath = path;
	}

	@Override
	public void execute() throws FileNotFoundException {

		Object data = YamlService.load(filePath); // extract data from YAML
		
		// work further with data/pass to model
		
	}

}
