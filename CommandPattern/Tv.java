package CommandPattern;

public class Tv implements Device{

    @Override
    public String turnOn() {
        return "\n\n🟢【Tv status: ON!】🟢";
    }

    @Override
    public String turnOff() {
        return "\n\n⭕【Tv status: OFF】⭕";
    }

    @Override
    public String upButton() {
        return "\n\n📈【Volume Increased!】📈";
    }

    @Override
    public String downButton() {
        return "\n\n📉【Volume Decreased!📉】";
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
