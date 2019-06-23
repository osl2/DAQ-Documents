package edu.kit.freedaq.configurationBlockManager;

/**
 * 
 * 
 * @author David
 * 
 * 
@startuml


abstract class "Representation" as AR{
id : String
state : String

updateInterval : float
numberOfInputChannels: Integer


xSize: Integer
ySize: Integer

listOfInputChannel<InputChannel>


{abstract} saveRepresentationAsFile(Path path):boolean
{abstract} run()
{abstract} stop()
{abstract} resume()
{abstract} reset()
{abstract} delete()

{abstract} setSize(Integer xSize, Integer ySize):boolean
{abstract} establishConnection(String channelIdOfPartner, String ownChannelId): boolean

}

class "InputChannelList" as ICL {
String: numberOfElements
getInputChannel(String idIC): InputChannel
setInputChannel(String idIC): boolean
}



class "InputChannel" as IC {

idIC: String
connectedTo: OutputChannel
dataProvider: DataProvider

setConnectionPartner(idOC: String):boolean

}

class "OutChannel" as OC {

idOC: String
connectedTo: InputChannel
setConnectionPartner(idIC: String):boolean
}

note right of OC
  can be from Sensor or Transformation
end note



class "Trace" as T{

type: String
setType(String type): boolean

}
class "TableRespresentation" as TR {


saveRepresentationAsFile(Path path): boolean
run()
stop()
resume()
reset()
delete()

setSize(Integer xSize, Integer ySize): boolean
establishConnection(String channelIdOfPartner, String ownChannelId): boolean
}


class "XYRepresentation" as XYR {
title: String
xLabel: String
yLabel: String
hasToolbar: boolean

saveRepresentationAsFile(Path path):boolean
run()
stop()
resume()
reset()
delete()
setSize(Integer xSize, Integer ySize): boolean
establishConnection(String channelIdOfPartner, String ownChannelId): boolean


}

class "Channel X vs Time" as XvT {

}

class "Channel X vs Channel Y"  as XvY{

setChannelX(DataProvider dataProvider): boolean
setChannelY(DataProvider dataProvider): boolean
}

class "N Channels vs Time"  as NvT{
numberOfChannels: Integer
}

Interface "RepresentationManager" as RM {
listOfAllRepresentations<Representations>

getList(): <Representations>
getRepresentation(String id, ): Representation
addRepresentationToList(String id): boolean
removeRepresentationFromList(String id): boolean






}

note right of XYR
  use eclipse nebula 
  for display
end note


class "DataProvider" as DP {

dataName: String
dataUnit: String

}

interface "IDataProvider" as IDP {

getDataProvider(String outPutChannelId): DataProvider

}



note bottom of  T
  examples for type: 
  bar, area, line
end note


RM -- AR
TR   -down-|> AR
XYR -up-|> AR
XvT -up-|> XYR
XvY -up-|> XYR
NvT -up-|> XYR
IC "1..* " --* "1" ICL
ICL "1" --o "1" AR

T "1 ..* "-down-* " 1 " XYR
T "1" .up.-> "1" IDP
AR "1" -- "1..*" IDP
DP --|> IDP
IC "1" -- "1" DP



@enduml

link to an swt xy graph
https://www.eclipse.org/nebula/widgets/visualization/html/GettingStarted.html


*/

public class Representation {

}
