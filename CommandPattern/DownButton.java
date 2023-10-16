package CommandPattern;

public class DownButton implements Command{
    private Device device;

    public DownButton(Device device) {
        this.device = device;
    }
    @Override
    public String execute() {
        return device.downButton();
    }
}
