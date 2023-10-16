package CommandPattern;

public class Lights implements Device{

    @Override
    public String turnOn() {
        return "\n\n🟢【Lights status: ON!】🟢";
    }

    @Override
    public String turnOff() {
        return "\n\n⭕【Lights status: OFF!】⭕";
    }

    @Override
    public String upButton() {
        return "\n\n📈【Brightness increased!】📈";
    }

    @Override
    public String downButton() {
        return "\n\n📉【Brightness decreased!】📉";
    }

    @Override
    public String nextButton(){
        return "\n\n⏭【You changed to the next light mode!】⏭";
    }

    @Override
    public String previousButton() {
        return "\n\n⏮【You changed to the previous light mode!】⏮";
    }

}
