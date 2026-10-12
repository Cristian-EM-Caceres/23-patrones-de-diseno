package Estructurales.PatronBridge;

public class Main {
    public static void main(String[] args) {
        Device tv = new TV();
        RemoteControl remote = new RemoteControl(tv);
        remote.power();

        AdvancedRemote advancedRemote = new AdvancedRemote(new Radio());
        advancedRemote.power();
        advancedRemote.mute();
    }
}
