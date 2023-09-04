
public class TemperatureConverter {

    public static double celsiusToFarenheit(double celsius){
        return (celsius * 9 / 5) + 32;
    }
    
    public static double farenheitToCelsius(double farenheit) {
        return (farenheit - 32) * 5 / 9;
}
}