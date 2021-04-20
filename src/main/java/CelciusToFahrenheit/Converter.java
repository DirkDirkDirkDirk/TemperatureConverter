package CelciusToFahrenheit;

public class Converter {

    public String convert(String celsius){
        try {
            double result = Double.parseDouble(celsius.trim());
            return Double.toString(result * 1.8 + 32);
        } catch (NumberFormatException e) {
            return "Faulty parameter";
        }
    }
}
