

public class LightsOn implements Command{
   private Light light;

    public LightsOn(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.turnOn();
    }
}
