package CommandPattern;

public class NextButton implements Command{
    private Device device;

    public NextButton(Device device) {
        this.device = device;
    }
    @Override
    public String execute() {
        return device.nextButton();
    }
}
