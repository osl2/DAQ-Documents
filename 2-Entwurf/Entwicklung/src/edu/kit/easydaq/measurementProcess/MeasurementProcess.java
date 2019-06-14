package edu.kit.easydaq.measurementProcess;


/**
 * @author David
 *
 *  
 *
 *@startuml
 *
 * class MeasurementInterface {
 * 
 * init(MeasurementConfiguration)
 * +run(MeasurementConfiguration, DataStream)
 * getDataStream(.DAQ): Integer stream
 * -reset()
 * -stop()
 * 
 * 
 * 
 * }
 *
 *
 * class Display {
 * +saveGraph()
 * +saveData()
 * 
 * }
 *
 * class UserInterface {
 * 
 * }
 *
 * class PhyPiDAQInterface {
 * 
 * }
 *
 *
 * 
 * class MeasurementConfiguration {
 * name : String
 * samplingRate : Integer
 * listOfBlocks : Blocks?
 * 
 * 
 * +save(config)
 * +load(config)
 * }
 * 
 * MeasurementInterface -down- UserInterface
 * MeasurementInterface -up- PhyPiDAQInterface
 * MeasurementConfiguration - MeasurementInterface
 * MeasurementInterface - Display
 * 
 * 
 *
 *
 *@enduml
 *
 * Die Klasse MeasurementInterface nimmt einen Befehl über das UserInterface
 * entgegen (z.B. starte Messung) und führt ihn dann aus. Dabei muss sie
 * auf andere Klassen zugreifen, wie z.B. auf das PhyPiDAQInterface.
 *
 *
 */



public class MeasurementProcess {

}
