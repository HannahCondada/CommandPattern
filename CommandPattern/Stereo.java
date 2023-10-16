package CommandPattern;

public class Stereo implements Device{

    @Override
    public String turnOn() {
        return "\n\n🟢【Stereo status: ON!】🟢";
    }

    @Override
    public String turnOff() {
        return "\n\n⭕【Stereo status: OFF!】⭕";
    }

    @Override
    public String upButton() {
        return "\n\n📈【Volume increased!】📈";
    }

    @Override
    public String downButton() {
        return "\n\n📉【Volume decreased!】📉";
    }

    @Override
    public String nextButton(){
        return "\n\n⏭【You changed to the next channel!】⏭";
    }

    @Override
    public String previousButton() {
        return "\n\n⏮【You changed to the previous channel!】⏮";
    }

}
