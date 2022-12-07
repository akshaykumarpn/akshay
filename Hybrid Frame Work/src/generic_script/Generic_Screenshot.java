package generic_script;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Generic_Screenshot {


	public static void getphoto(WebDriver driver) throws IOException
	{
		String photo = "./Photos/";
		Date d=new Date();
		String d1 = d.toString();
		String d2 = d1.replace(":", "-");
		TakesScreenshot ts=(TakesScreenshot)driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dst=new File(photo+d2+".jpeg");
		FileUtils.copyFile(src, dst);
}
	
}
