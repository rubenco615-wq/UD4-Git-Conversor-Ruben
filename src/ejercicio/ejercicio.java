package ejercicio;
import java.util.*;
public class ejercicio {

//comentario local 
	public class ConversorTemperatura {

	    public static double celsiusAFahrenheit(double c) {
	        return c * 9.0 / 5.0 + 32.0;
	    }

	    public static double fahrenheitACelsius(double f) {
	        return (f - 32.0) * 5.0 / 9.0;
	    }

	    public static void main(String[] args) {
	        System.out.println("0°C = " + celsiusAFahrenheit(0) + "°F");
	        System.out.println("32°F = " + fahrenheitACelsius(32) + "°C");
	   }
	}
}
	

	
	
