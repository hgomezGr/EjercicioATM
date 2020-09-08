package com.ejercicio.pruebas.util;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class Configuracion {
	
	public static AndroidDriver<MobileElement> driver=null;
	
	public static void setup() throws MalformedURLException {
		DesiredCapabilities caps = new  DesiredCapabilities();
		
		//caps.setCapability("platformNAME", "ANDROID");
		caps.setCapability(CapabilityType.PLATFORM_NAME, "ANDROID");
		caps.setCapability(CapabilityType.VERSION,"6.0");
		caps.setCapability(MobileCapabilityType.DEVICE_NAME,"HUAWEI P9 lite" );
		//caps.setCapability(MobileCapabilityType.UDID   ,"" );	
		caps.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT   ,60 );	
		caps.setCapability(MobileCapabilityType.APP   ,"C:\\Users\\hgomez\\eclipse-workspace\\mavenprj\\src\\test\\resources\\Calculator.apk" );	
		//caps.setCapability(MobileCapabilityType.BROWSER_NAME, "Chrome");
		
		//caps.setCapability(MobileCapabilityType.PLATFORM_NAME,  "ANDROID");
		driver = new AndroidDriver<MobileElement>(new URL("http://localhost:4723/wd/hub"), caps);
		
	}
}
