package task5;

import java.util.ArrayList;
import java.util.Arrays;

public class TempConvert {

    public static void main(String[] args) {
    	// TODO Auto-generated method stub
    	
        String[] tempStrings = {"36", "38", "40"};

        ArrayList<Double> fahrenheitTemps = new ArrayList<>();

        System.out.println("Celsius\tFahrenheit");
        for (String tempStr : tempStrings) {
            int celsius = Integer.parseInt(tempStr);
            double fahrenheit = (celsius * 9.0 / 5) + 32;
            fahrenheitTemps.add(fahrenheit);
            System.out.println(celsius + "°C\t" + fahrenheit + "°F");
        }
    }
}

