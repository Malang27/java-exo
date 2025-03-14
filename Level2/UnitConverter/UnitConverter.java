package UnitConverter;

public class UnitConverter {
    public static String convert(String[] args) {
        if (args.length != 3) {
            return "ERROR";
        }
        String fromUnit = args[0].toLowerCase();
        String toUnit = args[1].toLowerCase();
        double value;
        try {
            value = Double.parseDouble(args[2]);
        } catch (NumberFormatException e) {
            return "ERROR";
        }
        if (fromUnit.equals("fahrenheit") && toUnit.equals("celsius")) {
            double result = (value - 32) * 5 / 9;
            return String.format("%.2f", result);
        } else if (fromUnit.equals("celsius") && toUnit.equals("fahrenheit")) {
            double result = (value * 9 / 5) + 32;
            return String.format("%.2f", result);
        } else if (fromUnit.equals("kilometers") && toUnit.equals("miles")) {
            double result = value * 0.621371;
            return String.format("%.2f", result);
        } else if (fromUnit.equals("miles") && toUnit.equals("kilometers")) {
            double result = value * 1.60934;
            return String.format("%.2f", result);
        }
        return "ERROR";
    }

    public static void main(String[] args) {
        System.out.println(UnitConverter.convert(new String[] { "miles", "kilometers", "5" }));
    }
}