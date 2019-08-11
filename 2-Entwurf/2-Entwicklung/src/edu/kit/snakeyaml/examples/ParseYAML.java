package edu.kit.snakeyaml.examples;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Map;

import org.yaml.snakeyaml.Yaml;

public class ParseYAML {

    public static void main(String[] args) throws IOException {

        String filePath = "resources/ADS1115Config.yaml";

        Yaml yaml = new Yaml();
        InputStream input = new FileInputStream(new File(filePath));

        Object obj = yaml.load(input);
        System.out.println(obj.getClass()); // for PhyPiDAQ config files, this
                                            // should be a LinkedHashMap

        Map map = (Map) obj;
        System.out.println(map); // print entire content of the map

        System.out.println(map.get("DAQModule")); // print module name (example)

    }

}
