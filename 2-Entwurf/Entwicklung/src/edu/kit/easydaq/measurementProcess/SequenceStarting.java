package edu.kit.easydaq.measurementProcess;

/**
 * 
 * 
 * @author David
 * 
 * oder alternativ als loop ab getDataStream... , bei der dann die loop für ein 
 * Abtastintervall durchgeführt wird ?
 * 
 * 
 * 
 * 
@startuml



actor "User" as U

activate UI

participant ":UserInterface" as UI
participant ":MeasurementInterface" as MR


participant ":PhyPiDAQInterface" as PPDI

participant ":Display" as D
participant "MK1:MeasurementConfiguration" as MK


U -> UI : start()
UI -> MR : start()
MR -> MR: init()
activate MR
MR -> MR : load(MK)
activate MR
MR -> PPDI : getDataStream(MK1.daq):rawStream
activate PPDI
PPDI --> MR 
MR -> MR: run(rawStream): resultStream
activate MR
MR -> D : displayData(resultStream)
activate D
D -> D : run()
D --> MR: showResults()
MR --> UI : showResults()
UI -> UI : showResultStream()
activate UI
UI-->U



@enduml
*/


public class SequenceStarting {

}
