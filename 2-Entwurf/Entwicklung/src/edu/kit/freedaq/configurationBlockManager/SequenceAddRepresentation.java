package edu.kit.freedaq.configurationBlockManager;

/**
 * 
 * @author David
 * 
 * @startuml
 * 
 * actor "User" as U



participant ":IUserInterface" as UI
participant ":IMeasurementConfigurationManager" as IMCM
participant ":IRepresentationManager" as IRM
participant "XvT1:Channel X vs Time" as XvT1
participant ":IDataProvider" as IDP1
participant ":Trace" as T
participant "T1:Transformation" as T1
participant "DP1:DataProvider" as PD1

 * 
 * activate UI
 * activate IMCM
 * activate IRM
 * activate IDP1
 *activate T1
 *U -> UI : drag and drop XvT1 on a certain place
 *UI -> IMCM: create XvT1 on a certain place
 *IMCM -> IRM: getRepresentation(idOfXvT1)
 *activate XvT1
 *IRM --> IMCM: response with XvT1
 *IMCM -> IMCM: do stuff
 *IMCM --> UI: response
 *UI --> U: response
 *
 *
 *U -> UI : connect XvT1 with T1
 *UI -> IMCM: create Connection between XvT1 and T1
 *IMCM -> IMCM : do stuff
 *IMCM -> XvT1: establishConnection(String idOfOutputChannelOfT1)
 *
 *IMCM <-- XvT1: response
 *
 *@enduml
 */









public class SequenceAddRepresentation {

}
