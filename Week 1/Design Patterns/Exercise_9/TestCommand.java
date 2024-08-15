
public class TestCommand {
    public static void main(String[] args) {
        Light livingRoomLight = new Light();
        
        Command lightOn = new LightsOn(livingRoomLight);
        Command lightOff = new LightsOff(livingRoomLight);
        
        RemoteControl remote = new RemoteControl();
        

        remote.setCommand(lightOn);
        remote.pressButton();
        

        remote.setCommand(lightOff);
        remote.pressButton();
    }
}
