package weightWatchers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class WeightWatchers_Automation {

	public static void main(String[] args)
	{
		
		System.setProperty("webdriver.ie.driver","C:\\Selenium Driver\\IEDriverServer.exe");
		WebDriver driver = new InternetExplorerDriver();
		//Navigate to https://www.weightwatchers.com/us/
		String url = "https://www.weightwatchers.com/us/";
        driver.get(url);
        //Verify loaded page title matches “Weight Loss Program, Recipes & Help | Weight Watchers”
        String actualTitle1 = driver.getTitle();
        String expectedTitle1 = ”Weight Loss Program/, Recipes /& Help /| Weight Watchers”;
       
        
        if(actualTitle1.equalsIgnoreCase(expectedTitle1))
        {
        	 System.out.println("Title Matched");
        }
        	 else
        	 System.out.println("Title didn't match");
        //On the right corner of the page, click on “Find a Meeting”
        driver.findElement(By.xpath("//*[@id=ela-menu-visitor-desktop-supplementa_find-a-studio]")).click();
        //Verify loaded page title contains “Get Schedules & Times Near You”
        String actualTitle2 = driver.getTitle();
        String expectedTitleContains = ”Get Schedules & Times Near You”;
       
        
        if(actualTitle2.contains(expectedTitleContains))
        {
        	 System.out.println("Title Matched");
        }
        	 else
        	 System.out.println("Title didn't match");
	    //In the search field, search for meetings for zip code: 10011
        driver.findElement(By.xpath("//*[@id=meetingSearch]")).sendKeys("10011");
        //Print the title of the first result and the distance (located on the right of location title/name)
        WebElement ele1 = driver.findElement(By.xpath("//*[@id=ml-'1180510']/result-location/div/div[1]/a/location-address/div/div/div[1]/div[1]/span"));
        System.out.println(ele1.getAttribute("!linkName"));
        WebElement ele2 = driver.findElement(By.xpath("//*[@id=ml-'1180510']/result-location/div/div[1]/a/location-address/div/div/div[1]/div[2]"));
        System.out.println(ele2.getAttribute("showDistance"));
        //Click on the first search result and then, verify displayed location name matches with the name of the first searched result that was clicked.
        driver.findElement(By.xpath("//*[@id=ml-'1180510']/result-location/div/div[1]/a/location-address/div/div/div[1]/div[1]/span")).click();
        WebElement ele3 = driver.findElement(By.xpath("//*[@id='content']"));
        String actualTitle3 = ele3.getAttribute("!linkName");
        String expectedTitle3 = driver.getTitle();
        
        if(actualTitle3.equalsIgnoreCase(expectedTitle3))
        {
        	 System.out.println("Title Matched");
        }
        	 else
        	 System.out.println("Title didn't match");
        //From this location page, print TODAY’s hours of operation (located towards the bottom of the page)
        WebElement ele4 = driver.findElement(By.xpath("//*[@id='content']/div/div/ui-view/ui-view/div[1]/div/div/div[2]/div[2]/div[1]/hours-list/ul/li[7]/div/div[2]/div"));
        System.out.println(ele4.getAttribute("meeting in day.meetings"));
	}

}
