package br.com.ifgoiano;

public class ConversorTemperatura {

    public static void celsiusParaFahrenheit(double celsius) {

        double fahrenheit;

        fahrenheit = celsius * 1.8 + 32;

        System.out.println("A Conversão de Graus " + celsius + " para Graus Fahrenheit: " + fahrenheit);
        System.out.println("****************************************************");
    }
}
