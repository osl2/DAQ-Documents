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
 * +check(MeasurementConfiguration):boolean
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
 * +displayDataStream(MeasurementConfiguration, DataStream)
 * 
 * }
 *
 * class UserInterface {
 * 
 * }
 *
 * class PhyPiDAQInterface {
 * + getDataStream(MeasurementConfiguration.DAQ): Datastream
 * + stopDataStream()
 * }
 *
 *
 * class DataStream {
 * metaData : String
 * timeStamp : Integer
 * samplingRate : float
 * 
 * 
 * 
 * }
 *
 * 
 * class MeasurementConfiguration {
 * name : String
 * samplingRate : float
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
