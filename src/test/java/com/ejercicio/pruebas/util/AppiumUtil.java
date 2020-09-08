package com.ejercicio.pruebas.util;

import java.util.Set;

import org.openqa.selenium.WebElement;

import io.appium.java_client.MobileElement;


public class AppiumUtil {


	public static void esperaExplicita(String selector, int tiempoEspera ) throws InterruptedException {

		int counter = 0;
		boolean displayed = false;
		do {
			try {
				Thread.sleep(1000);
				counter++;
				displayed = true;
				Configuracion.driver.switchTo().alert();
				Set<String> contextNames = Configuracion.driver.getContextHandles();
				System.out.println(contextNames);
				System.out.println(contextNames.toArray()[0]);
				System.out.println(contextNames.toArray()[1]);
				//Configuracion.driver.context(contextNames.toArray()[1]);
				// ...
				//Configuracion.driver.context("NATIVE_APP");				
				Configuracion.driver.findElementByXPath(selector).click();
			} catch (Exception e) {
				// TODO: handle exception
				displayed = false;
			}

		} while(displayed && (counter<=tiempoEspera));

	}
}
