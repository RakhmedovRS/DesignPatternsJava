package sbt.jrakhm.command;

import sbt.jrakhm.command.commands.*;
import sbt.jrakhm.command.controls.RemoteControl;
import sbt.jrakhm.command.controls.RemoteControlWithUndo;
import sbt.jrakhm.command.controls.SimpleRemoteControl;
import sbt.jrakhm.command.controls.controllers.*;
import sbt.jrakhm.command.controls.types.GarageType;
import sbt.jrakhm.command.controls.types.RoomType;

/**
 * @author rassoll
 * @created 02.06.2017
 * @$Author$
 * @$Revision$
 */
public class RemoteLoader
{
    public static void main(String[] args)
    {
        simpleRemoteControlTest();
        remoteControlTest();
        remoteControlWithUndoTest();
        remoteControlWithUndoAndMacroCommandTest();
    }

    /** Testing SimpleRemoteControl */
    public static void simpleRemoteControlTest()
    {
        SimpleRemoteControl remoteControl = new SimpleRemoteControl();

        Light light = Light.getInstance(RoomType.LIVING_ROOM);
        GarageDoor garageDoor = GarageDoor.getInstance(GarageType.MAIN);

        LightOnCommand lightOn = new LightOnCommand(light);
        GarageDoorUpCommand garageDoorUp = new GarageDoorUpCommand(garageDoor);

        remoteControl.setCommand(lightOn);
        remoteControl.buttonWasPressed();
        remoteControl.setCommand(garageDoorUp);
        remoteControl.buttonWasPressed();
    }

    /** Testing RemoteControl */
    public static void remoteControlTest()
    {
        RemoteControl remoteControl = new RemoteControl();
        Light livingRoomLight = Light.getInstance(RoomType.LIVING_ROOM);
        Light kitchenLight = Light.getInstance(RoomType.KITCHEN);
        CeilingFan ceilingFan = CeilingFan.getInstance(RoomType.LIVING_ROOM);
        GarageDoor garageDoor = GarageDoor.getInstance(GarageType.MAIN);
        Stereo stereo = Stereo.getInstance(RoomType.LIVING_ROOM);

        LightOnCommand livingRoomLightOn = new LightOnCommand(livingRoomLight);
        LightOffCommand livingRoomLightOff = new LightOffCommand(livingRoomLight);
        LightOnCommand kitchenLightOn = new LightOnCommand(kitchenLight);
        LightOffCommand kitchenLightOff = new LightOffCommand(kitchenLight);

        CeilingFanHighCommand ceilingFanOn = new CeilingFanHighCommand(ceilingFan);
        CeilingFanMediumCommand ceilingFanOff = new CeilingFanMediumCommand(ceilingFan);

        GarageDoorUpCommand garageDoorUp = new GarageDoorUpCommand(garageDoor);
        GarageDoorDownCommand garageDoorDown = new GarageDoorDownCommand(garageDoor);

        StereoOnWithCDCommand stereoOnWithCD = new StereoOnWithCDCommand(stereo);
        StereoOffWithCDCommand stereoOffWithCD = new StereoOffWithCDCommand(stereo);

        remoteControl.setCommand(0, livingRoomLightOn, livingRoomLightOff);
        remoteControl.setCommand(1, kitchenLightOn, kitchenLightOff);
        remoteControl.setCommand(2, ceilingFanOn, ceilingFanOff);
        remoteControl.setCommand(3, garageDoorUp, garageDoorDown);
        remoteControl.setCommand(4, stereoOnWithCD, stereoOffWithCD);

        System.out.println(remoteControl);

        remoteControl.onButtonWasPressed(0);
        remoteControl.offButtonWasPressed(0);
        remoteControl.onButtonWasPressed(1);
        remoteControl.offButtonWasPressed(1);
        remoteControl.onButtonWasPressed(2);
        remoteControl.offButtonWasPressed(2);
        remoteControl.onButtonWasPressed(3);
        remoteControl.offButtonWasPressed(3);
        remoteControl.onButtonWasPressed(4);
        remoteControl.offButtonWasPressed(4);
    }

    /** Testing RemoteControlWithUndo */
    public static void remoteControlWithUndoTest()
    {
        RemoteControlWithUndo remoteControl = new RemoteControlWithUndo();

        CeilingFan ceilingFan = CeilingFan.getInstance(RoomType.LIVING_ROOM);

        CeilingFanMediumCommand ceilingFanMedium = new CeilingFanMediumCommand(ceilingFan);
        CeilingFanHighCommand ceilingFanHigh = new CeilingFanHighCommand(ceilingFan);
        CeilingFunOffCommand ceilingFunOff = new CeilingFunOffCommand(ceilingFan);

        remoteControl.setCommand(0, ceilingFanMedium, ceilingFunOff);
        remoteControl.setCommand(1, ceilingFanHigh, ceilingFunOff);

        remoteControl.onButtonWasPressed(0);
        remoteControl.offButtonWasPressed(0);
        System.out.println(remoteControl);
        remoteControl.undoButtonWasPressed();

        remoteControl.onButtonWasPressed(1);
        System.out.println(remoteControl);
        remoteControl.undoButtonWasPressed();
    }

    /** Testing RemoteControlWithUndo and MacroCommand*/
    public static void remoteControlWithUndoAndMacroCommandTest()
    {
        Light light = Light.getInstance(RoomType.LIVING_ROOM);
        TV tv = TV.getInstance(RoomType.LIVING_ROOM);
        Stereo stereo = Stereo.getInstance(RoomType.LIVING_ROOM);
        Hottub hottub = Hottub.getInstance();

        LightOnCommand lightOn = new LightOnCommand(light);
        StereoOnWithCDCommand stereoOnWithCD = new StereoOnWithCDCommand(stereo);
        TVOnCommand tvOn = new TVOnCommand(tv);
        HottubOnCommand hottubOn = new HottubOnCommand(hottub);

        LightOffCommand lightOff = new LightOffCommand(light);
        StereoOffWithCDCommand stereoOffWithCD = new StereoOffWithCDCommand(stereo);
        TVOffCommand tvOff = new TVOffCommand(tv);
        HottubOffCommand hottubOff = new HottubOffCommand(hottub);

        Command[] partyOn = {lightOn, stereoOnWithCD, tvOn, hottubOn};
        Command[] partyOff = {lightOff, stereoOffWithCD, tvOff, hottubOff};

        MacroCommand partyOnMacro = new MacroCommand(partyOn);
        MacroCommand partyOffMacro = new MacroCommand(partyOff);

        RemoteControlWithUndo remoteControl = new RemoteControlWithUndo();

        remoteControl.setCommand(0, partyOnMacro, partyOffMacro);

        System.out.println(remoteControl);
        System.out.println("---- Pushing Macro On ----");
        remoteControl.onButtonWasPressed(0);
        System.out.println("---- Pushing Macro Off ----");
        remoteControl.offButtonWasPressed(0);
    }
}
