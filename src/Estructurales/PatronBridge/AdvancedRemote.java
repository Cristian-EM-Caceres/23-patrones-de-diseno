package Estructurales.PatronBridge;

public class AdvancedRemote extends RemoteControl {
    public AdvancedRemote(Device device) {
        super(device);
    }

    public void mute() {
        System.out.println("Dispositivo silenciado.");
    }
}
