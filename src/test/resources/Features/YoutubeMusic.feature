Feature: Youtube Music
  Scenario: I want to play music without login
    Given User open YoutubeMusic
    When User click play on one of recommendation song
    Then page direct to page of that song with state playing

  Scenario: I want to skip ads
    Given User wait until count down finish
    When User click skip ads
    Then Ads is skipped

  Scenario: I want to pause music
    Given User click button pause
    Then the song is paused

  Scenario: I want to pause music
    Given User click button pause
    Then the song is paused

