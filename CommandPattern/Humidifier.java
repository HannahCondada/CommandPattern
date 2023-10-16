package CommandPattern;

public class Humidifier implements Device{
    @Override
    public String turnOn() {
        return "\n\n🟢【Humidifier status: ON!】🟢";
    }

    @Override
    public String turnOff() {
        return "\n\n⭕【Humidifier status: OFF!】⭕";
    }

    @Override
    public String upButton() {
        return "\n\n📈【Mist increased!】📈";
    }

    @Override
    public String downButton() {
        return "\n\n📉【Mist decreased!】📉";
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
