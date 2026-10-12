package Estructurales.PatronBridge;

public class RemoteControl {
    protected Device device;

    public RemoteControl(Device device) {
        this.device = device;
    }

    public void power() {
        device.turnOn();
    }
}
