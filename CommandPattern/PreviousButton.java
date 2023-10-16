package CommandPattern;

public class PreviousButton implements Command{
    private Device device;

    public PreviousButton(Device device) {
        this.device = device;
    }

    @Override
    public String execute() {
        return device.previousButton();
    }
}
