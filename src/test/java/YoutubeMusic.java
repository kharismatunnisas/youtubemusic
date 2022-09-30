import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class YoutubeMusic {
    WebDriver driver;

    @Given("User open YoutubeMusic")
    public void userOpenYoutubeMusic() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/driver/chromedriver");
        driver = new ChromeDriver();
        //driver.manage().window().fullscreen();
        driver.get("https://music.youtube.com/");
        Thread.sleep(1000);
    }

    @When("User click play on one of recommendation song")
    public void userClickPlayOnOneOfRecommendationSong() {
        driver.findElement(By.xpath("(//yt-icon)[11]")).click();
    }

    @Then("page direct to page of that song with state playing")
    public void pageDirectToPageOfThatSongWithStatePlaying() throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("tp-yt-paper-icon-button[title*='Pause']")).isDisplayed();

    }

    @Given("User wait until count down finish")
    public void userWaitUntilCountDownFinish() throws InterruptedException {
        Thread.sleep(4000);
    }

    @When("User click skip ads")
    public void userClickSkipAds() {
        driver.findElement(By.xpath("//button[@class='ytp-ad-skip-button ytp-button']")).click();
    }

    @Then("Ads is skipped")
    public void adsIsSkipped() {
    }

    @Given("User click button pause")
    public void userClickButtonPause() throws InterruptedException {
        Thread.sleep(3000);
        //driver.findElement(By.xpath("//tp-yt-paper-icon-button[@id='play-pause-button'][@title='Jeda']")).click();
        driver.findElement(By.cssSelector("tp-yt-paper-icon-button[title*='Pause']")).click();
    }

    @Then("the song is paused")
    public void theSongIsPaused() {
        //driver.findElement(By.xpath("//tp-yt-paper-icon-button[@id='play-pause-button'][@title='Putar']")).isDisplayed();
        driver.findElement(By.cssSelector("tp-yt-paper-icon-button[title*='Pause']")).isDisplayed();
    }
}