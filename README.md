# PROJECT DESCRIPTION

Project developed during a Java bootcamp with the goal of creating a fully functional smartphone with a web browser and a music player.

# UML diagram
classDiagram
  class iPhone {
    - musicPlayer: MusicPlayer
    - phone: Phone
    - browser: InternetBrowser
    + playMusic()
    + pauseMusic()
    + selectMusic()
    + makeCall()
    + answerCall()
    + startVoiceRecording()
    + displayPage()
    + addNewTab()
    + updatePage()
  }

  class MusicPlayer {
    + playMusic()
    + pauseMusic()
    + selectMusic()
  }

  class Phone {
    + makeCall()
    + answerCall()
    + startVoiceRecording()
  }

  class InternetBrowser {
    + displayPage()
    + addNewTab()
    + updatePage()
  }

  iPhone --> MusicPlayer: musicPlayer
  iPhone --> Phone: phone
  iPhone --> InternetBrowser: browser
