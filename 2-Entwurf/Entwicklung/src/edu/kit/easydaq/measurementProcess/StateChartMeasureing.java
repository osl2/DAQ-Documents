package edu.kit.easydaq.measurementProcess;

/**

@author David


@startuml

[*] --> Idle : startProgram()
Idle -right-> [*] : quitProgram()

Idle : entry / init()
Idle : exit / destroy()
Idle : save(config): configFile
Idle : load(configFile):config
Idle : delete(config)
Idle: saveData(data)
Idle: saveGraph(graph)
Idle: resetMeasurement()


Idle -> Running : startMeasurement(config)
Running: entry / checkSensor(config),createYaml() and RunPhyPiDAQ()
Running: exit / stoppPhyPiDAQ()
Running --> Idle: stoppMeasurement() or ERROR
@enduml


*/
public class StateChartMeasureing {

}
