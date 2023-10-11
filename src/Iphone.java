public class Iphone implements Phone , MusicPlayer , Browser {

    public void makeCall(String number) {
        System.out.println("Making a call to " + number);
    }

    @Override
    public void answerCall() {
        System.out.println("Call answered.");
    }

    @Override
    public void startVoicemail() {
        System.out.println("Starting voicemail...");
    }

    // MusicPlayer methods
    @Override
    public void playMusic() {
        System.out.println("Playing music...");
    }

    @Override
    public void pauseMusic() {
        System.out.println("Music paused.");
    }

    @Override
    public void selectMusic() {
        System.out.println("Music selected.");
    }

    // InternetBrowser methods
    @Override
    public void displayPage() {
        System.out.println("Displaying webpage...");
    }

    @Override
    public void addNewTab() {
        System.out.println("Adding a new tab...");
    }

    @Override
    public void updatePage() {
        System.out.println("Updating web page...");
    }

    @Override
    public void makeCall() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'makeCall'");
    }
}