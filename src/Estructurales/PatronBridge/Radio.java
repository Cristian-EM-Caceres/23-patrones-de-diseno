package Estructurales.PatronBridge;

public class Radio implements Device {
    @Override
    public void turnOn() {
        System.out.println("Radio encendida.");
    }
    @Override
    public void turnOff() {
        System.out.println("Radio apagada.");
    }
}