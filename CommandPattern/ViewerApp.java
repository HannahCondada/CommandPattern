package CommandPattern;
import java.util.*;

public class ViewerApp {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("\n\n【ＤＥＶＩＣＥＳ】");
        System.out.println("『1』▶ Tv");
        System.out.println("『2』▶ Lights");
        System.out.println("『3』▶ Stereo");
        System.out.println("『4』▶ Thermostat");
        System.out.println("『5』▶ Humidifier");
        System.out.println("『6』▶ Exit");

        System.out.print("\nSelect a device to turn on: ");
        int select = sc.nextInt();

        switch (select) {
            case 1:
                Tv tv = new Tv();
                RemoteControl rc = new RemoteControl();
                Command tvOn = new PowerOn(tv);
                Command tvOff = new PowerOff(tv);
                Command nextChannel = new NextButton(tv);
                Command previousChannel = new PreviousButton(tv);
                Command UpButton = new UpButton(tv);
                Command DownButton = new DownButton(tv);

                rc.setCommand(tvOn);// turns the tv on when selected
                rc.clickButton();
                System.out.println("\n\n【ＴＶ　ＳＥＴＴＩＮＧＳ】");
                MENU();
                System.out.print("\nWhat do you want to do?: ");
                int select2 = sc.nextInt();

                        if (select2 == 1) {
                            rc.setCommand(tvOff);
                            rc.clickButton();
                        } else if (select2 == 2) {
                            rc.setCommand(nextChannel);
                            rc.clickButton();
                        } else if (select2 == 3) {
                            rc.setCommand(previousChannel);
                            rc.clickButton();
                        } else if (select2 == 4) {
                            rc.setCommand(UpButton);
                            rc.clickButton();
                        } else if (select2 == 5) {
                            rc.setCommand(DownButton);
                            rc.clickButton();
                        } else if (select2 == 6) {
                            main(args);
                        }
                break;

            case 2:
                Lights lights = new Lights();
                rc = new RemoteControl();
                Command lightsOn = new PowerOn(lights);
                Command lightsOff = new PowerOff(lights);
                Command nextMode = new NextButton(lights);
                Command previousMode = new PreviousButton(lights);
                Command brightnessInc = new UpButton(lights);
                Command brightnessDec = new DownButton(lights);

                rc.setCommand(lightsOn);// turns the lights on when selected
                rc.clickButton();
                System.out.println("\n\n【ＬＩＧＨＴＳ　ＳＥＴＴＩＮＧＳ】");
                MENU();
                System.out.print("\nWhat do you want to do?: ");
                select2 = sc.nextInt();

                        if (select2 == 1) {
                            rc.setCommand(lightsOff);
                            rc.clickButton();
                        } else if (select2 == 2) {
                            rc.setCommand(nextMode);
                            rc.clickButton();
                        } else if (select2 == 3) {
                            rc.setCommand(previousMode);
                            rc.clickButton();
                        } else if (select2 == 4) {
                            rc.setCommand(brightnessInc);
                            rc.clickButton();
                        } else if (select2 == 5) {
                            rc.setCommand(brightnessDec);
                            rc.clickButton();
                        } else if (select2 == 6) {
                            main(args);
                        }
                break;

            case 3:
                Stereo stereo = new Stereo();
                rc = new RemoteControl();
                Command stereoOn = new PowerOn(stereo);
                Command stereoOff = new PowerOff(stereo);
                Command nxtChannel = new NextButton(stereo);
                Command prevChannel = new PreviousButton(stereo);
                Command volumeIncreased = new UpButton(stereo);
                Command volumeDecreased = new DownButton(stereo);

                rc.setCommand(stereoOn);// turns the stereo on when selected
                rc.clickButton();
                System.out.println("\n\n【ＳＴＥＲＥＯ　ＳＥＴＴＩＮＧＳ】");
                MENU();
                System.out.print("\nWhat do you want to do?: ");
                select2 = sc.nextInt();

                        if (select2 == 1) {
                            rc.setCommand(stereoOff);
                            rc.clickButton();
                        } else if (select2 == 2) {
                            rc.setCommand(nxtChannel);
                            rc.clickButton();
                        } else if (select2 == 3) {
                            rc.setCommand(prevChannel);
                            rc.clickButton();
                        } else if (select2 == 4) {
                            rc.setCommand(volumeIncreased);
                            rc.clickButton();
                        } else if (select2 == 5) {
                            rc.setCommand(volumeDecreased);
                            rc.clickButton();
                        } else if (select2 == 6) {
                            main(args);
                        }
                break;

            case 4:
                Thermostat thermostat = new Thermostat();
                rc = new RemoteControl();
                Command thermostatOn = new PowerOn(thermostat);
                Command thermostatOff = new PowerOff(thermostat);
                Command nextMode2 = new NextButton(thermostat);
                Command previousMode2 = new PreviousButton(thermostat);
                Command tempIncreased = new UpButton(thermostat);
                Command tempDecreased = new DownButton(thermostat);

                rc.setCommand(thermostatOn);// turns the thermostat on when selected
                rc.clickButton();
                System.out.println("\n【ＴＨＥＲＭＯＳＴＡＴ　ＳＥＴＴＩＮＧＳ】");
                MENU();
                System.out.print("\nWhat do you want to do?: ");
                select2 = sc.nextInt();

                        if (select2 == 1) {
                            rc.setCommand(thermostatOff);
                            rc.clickButton();
                        } else if (select2 == 2) {
                            rc.setCommand(nextMode2);
                            rc.clickButton();
                        } else if (select2 == 3) {
                            rc.setCommand(previousMode2);
                            rc.clickButton();
                        } else if (select2 == 4) {
                            rc.setCommand(tempIncreased);
                            rc.clickButton();
                        } else if (select2 == 5) {
                            rc.setCommand(tempDecreased);
                            rc.clickButton();
                        } else if (select2 == 6) {
                            main(args);
                        }
                break;

            case 5:
                Humidifier humidifier = new Humidifier();
                rc = new RemoteControl();
                Command humidifierOn = new PowerOn(humidifier);
                Command humidifierOff = new PowerOff(humidifier);
                Command nxtMode = new NextButton(humidifier);
                Command prevMode = new PreviousButton(humidifier);
                Command mistIncreased = new UpButton(humidifier);
                Command mistDecreased = new DownButton(humidifier);

                rc.setCommand(humidifierOn); // turns the humidifier on when selected
                rc.clickButton();
                System.out.println("\n【ＨＵＭＩＤＩＦＩＥＲ　ＳＥＴＴＩＮＧＳ】");
                MENU();
                System.out.print("\nWhat do you want to do?: ");
                select2 = sc.nextInt();

                        if (select2 == 1) {
                            rc.setCommand(humidifierOff);
                            rc.clickButton();
                        } else if (select2 == 2) {
                            rc.setCommand(nxtMode);
                            rc.clickButton();
                        } else if (select2 == 3) {
                            rc.setCommand(prevMode);
                            rc.clickButton();
                        } else if (select2 == 4) {
                            rc.setCommand(mistIncreased);
                            rc.clickButton();
                        } else if (select2 == 5) {
                            rc.setCommand(mistDecreased);
                            rc.clickButton();
                        } else if (select2 == 6) {
                            main(args);
                        }
                break;

            case 6:
                System.out.println("\n\nActivity: Command Pattern");
                System.out.println("Progammed by: Hannah Condada | 3 - BSCS - 1");
                System.exit(0);

                }
        System.out.println();
        main(args);
    }

    public static void MENU (){
        System.out.println("『1』▶ Turn off");
        System.out.println("『2』▶ Next Button (▷)");
        System.out.println("『3』▶ Previous Button (◁)");
        System.out.println("『4』▶ Up Button (△)");
        System.out.println("『5』▶ Down Button (▽)");
        System.out.println("『6』▶ Back to DEVICES");
    }
}

