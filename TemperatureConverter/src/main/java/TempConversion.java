public class TempConversion {
    
    public static void main (String[] args) {
        
        double celsiusTemperature = 20;
        double farenheitTemperature = 69;
        
        double convertedToFarenheit = TemperatureConverter.celsiusToFarenheit(celsiusTemperature);
        double convertedToCelsius = TemperatureConverter.farenheitToCelsius(farenheitTemperature);
        
        System.out.println(celsiusTemperature + " Celsius in Farenheit: " + convertedToFarenheit + "°F");
        System.out.println(farenheitTemperature + " Farenheit in Celsius: " + convertedToCelsius + "°C");
    }
}