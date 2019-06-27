package edu.kit.snakeyaml.examples;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.Map;

import org.yaml.snakeyaml.Yaml;

public class CreateYAML {

	public static void main(String[] args) throws IOException {

		String filePath = "resources/dumpOutput.yaml";
		Map map = new HashMap<String, String>();
		
		map.put("DAQModule", "ExampleModuleConfig");
		map.put("exampleKey", "exampleEntry");
		
		Yaml yaml = new Yaml();
		
		OutputStreamWriter writer = new OutputStreamWriter(new FileOutputStream(filePath));
		yaml.dump(map, writer);
		writer.close();
		System.out.println("Success!");

	}

}
