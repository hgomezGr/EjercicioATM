package com.ejercicio.prueba.po;

import java.net.MalformedURLException;

import com.ejercicio.pruebas.util.AppiumUtil;
import com.ejercicio.pruebas.util.Configuracion;

import io.appium.java_client.MobileElement;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CalculadoraPo {

/*	CalculadoraPo() throws MalformedURLException
	{ 
		Configuracion.setup();
	} 

	public int sumar(int numero1, int numero2 )  {

		Configuracion.driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/androidx.viewpager.widget.ViewPager/android.widget.LinearLayout/android.view.ViewGroup[1]/android.widget.Button[8]").click();
		Configuracion.driver.findElementByXPath("android.widget.Button[@content-desc=\"plus\"]").click();
		Configuracion.driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/androidx.viewpager.widget.ViewPager/android.widget.LinearLayout/android.view.ViewGroup[1]/android.widget.Button[7]").click();

		Configuracion.driver.findElementByXPath("android.widget.Button[@content-desc=\"equals\"]").click();	

		return numero1+numero2;
	}*/
	
	@Given("estando en la aplicacion de la calculadora")
	public void estando_en_la_aplicacion_de_la_calculadora() throws MalformedURLException, InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		Configuracion.setup();
		
		AppiumUtil.esperaExplicita("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.appcompat.widget.LinearLayoutCompat/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.EditText[1]", 30);
		// claves de la calculadora
		
		MobileElement clave1 = (MobileElement) Configuracion.driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.appcompat.widget.LinearLayoutCompat/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.EditText[1]");	
		
		clave1.sendKeys("12345");
		Configuracion.driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.appcompat.widget.LinearLayoutCompat/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.EditText[2]").sendKeys("12345");
		
		Configuracion.driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.appcompat.widget.LinearLayoutCompat/android.widget.ScrollView/android.widget.LinearLayout/android.widget.Button").click();
			
		Configuracion.driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.appcompat.widget.LinearLayoutCompat/android.widget.ScrollView/android.widget.LinearLayout/android.widget.Button").click();
	   // throw new io.cucumber.java.PendingException();
	}


	@When("cuando presiono un numero")
	public void cuando_presiono_un_numero() {
	    // Write code here that turns the phrase above into concrete actions
		
		Configuracion.driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/androidx.viewpager.widget.ViewPager/android.widget.LinearLayout/android.view.ViewGroup[1]/android.widget.Button[8]").click();

	   // throw new io.cucumber.java.PendingException();
	}
	@When("presiono la tecla de suma")
	public void presiono_la_tecla_de_suma() {
	    // Write code here that turns the phrase above into concrete actions
		//Configuracion.driver.findElementByXPath("android.widget.Button[@content-desc=\"plus\"]").click();
	   // throw new io.cucumber.java.PendingException();
	}
	@When("presiono otro numero")
	public void presiono_otro_numero() {
	    // Write code here that turns the phrase above into concrete actions
		
		//Configuracion.driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/androidx.viewpager.widget.ViewPager/android.widget.LinearLayout/android.view.ViewGroup[1]/android.widget.Button[7]").click();
	   // throw new io.cucumber.java.PendingException();
	}
	@When("presiono la tecla igual")
	public void presiono_la_tecla_igual() {
	    // Write code here that turns the phrase above into concrete actions
	//	Configuracion.driver.findElementByXPath("android.widget.Button[@content-desc=\"equals\"]").click();
	  //  throw new io.cucumber.java.PendingException();
	}
	@Then("arroja el resultado de la suma")
	public void arroja_el_resultado_de_la_suma() {
	    // Write code here that turns the phrase above into concrete actions
		
		//Configuracion.driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.EditText[2]").getText();
//	    throw new io.cucumber.java.PendingException();
	}

}
