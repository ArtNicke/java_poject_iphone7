public class TestIphone {
    public static void main(String[] args) {
        Iphone myiPhone = new Iphone();

        // Teste a funcionalidade do telefone
        myiPhone.makeCall("123-456-7890");
        myiPhone.answerCall();
        myiPhone.startVoicemail();

        // Teste a funcionalidade do reprodutor musical
        myiPhone.playMusic();
        myiPhone.pauseMusic();
        myiPhone.selectMusic();

        // Teste a funcionalidade do navegador da internet
        myiPhone.displayPage();
        myiPhone.addNewTab();
        myiPhone.updatePage();
    }
}
