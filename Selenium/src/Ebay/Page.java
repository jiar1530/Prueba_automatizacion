package Ebay;

import java.io.File;
import java.util.Calendar;
import java.util.GregorianCalendar;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import pageObject.driverConect;
import pageObject.functions;

public class Page extends driverConect {
	static String result;


	public static void main(String[] args) throws InterruptedException {

		entry Ebay = new entry();// clase
		process Process = new process();
		functions Funciones = new functions();
		try {

			Ebay.Ebay(); //Ingreso a la URL

			Thread.sleep(5000);
			result=Process.initialize(); //Todo el flujo automatizado 

			Funciones.escribir(result);
			Funciones.imagen();


		} catch (Exception e) {
			e.printStackTrace();


		}

	}

}
