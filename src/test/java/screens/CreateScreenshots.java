package screens;

import cucumber.api.java.Before;
import io.appium.java_client.android.AndroidDriver;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import stepDefinitions.BaseStep;
import utils.ThreadLocalDriver;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

public class CreateScreenshots extends AbstractObjectScreen {

    public CreateScreenshots (AndroidDriver driver) {
        super(driver);
    }

    public void captureScreenShots() throws IOException {
        // add folder name to save the screenshots
        String folder_name = "screenshots/tokenPLNSK/saldoadarev";
        File f=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        //Date format fot screenshot file name
        DateFormat df = new  SimpleDateFormat("dd-MM-yyyy__HH_mm_ss");
        df.setTimeZone(TimeZone.getTimeZone("Asia/Jakarta"));
        //create dir with given folder name
        new File(folder_name).mkdir();
        //Setting file name
        String file_name=df.format(new Date())+".png";
        //copy screenshot file into screenshot folder.
        FileUtils.copyFile(f, new File(folder_name + "/" + file_name));
    }
    }

