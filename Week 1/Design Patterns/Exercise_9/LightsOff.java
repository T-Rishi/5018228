
public class LightsOff implements Command {
       private Light light;

    public LightsOff(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.turnOff();
    }
}
