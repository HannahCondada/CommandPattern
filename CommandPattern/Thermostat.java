package CommandPattern;

public class Thermostat implements Device{

    @Override
    public String turnOn() {
        return "\n\n🟢【Thermostat status: ON!】🟢";
    }

    @Override
    public String turnOff() {
        return "\n\n⭕【Thermostat status: OFF!】⭕";
    }

    @Override
    public String upButton() {
        return "\n\n📈【Temperature increased!】📈";
    }

    @Override
    public String downButton() {
        return "\n\n📉【Temperature decreased!】📉";
    }

    @Override
    public String nextButton(){
        return "\n\n⏭【Next mode activated!】⏭";
    }

    @Override
    public String previousButton() {
        return "\n\n⏮【Previous mode activated!】⏮";
    }
}
