package CommandPattern;

public class UpButton implements Command{
    private Device device;

    public UpButton(Device device) {
        this.device = device;
    }
    @Override
    public String execute() {
        return device.upButton();
    }
}
