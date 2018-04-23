package pageObject;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Calendar;
import java.util.GregorianCalendar;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class functions extends driverConect {


	public void escribir(String nombreArchivo)  //Captura el dato y lo guarda en nombreArchivo

	{

		File f;   //libreria para leeer y esctibir archivo de texto

		f = new File("Resultado.txt"); //Toma un archivo que cree llamado Resultado y guarda alli



		//Escritura

		try{

			FileWriter w = new FileWriter(f);  //Crea Objetos para escribir un archivo de texto propio Java

			BufferedWriter bw = new BufferedWriter(w);

			PrintWriter wr = new PrintWriter(bw);  

			wr.write(nombreArchivo);//escribimos en el archivo



			wr.close();

			bw.close();

		}catch(IOException e){};

	}


	public void imagen() throws IOException

	{

		Calendar fecha = new GregorianCalendar();
		final String cAno = String.valueOf(fecha.get(Calendar.YEAR));
		final int nMes = (fecha.get(Calendar.MONTH));
		String cMes = String.valueOf(nMes+1);
		String cDia = String.valueOf(fecha.get(Calendar.DAY_OF_MONTH));
		String cHora = String.valueOf(fecha.get(Calendar.HOUR_OF_DAY));
		String cMinuto = String.valueOf(fecha.get(Calendar.MINUTE));


		File scr=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File miDir = new File ("."); 
		File dest= new File(miDir.getCanonicalPath()+"/output/Exitoso/"+"Ebay"+cMes+cDia+cHora+cMinuto+".png");

		FileUtils.copyFile(scr, dest);

	}

}
