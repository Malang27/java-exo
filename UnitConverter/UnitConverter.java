package UnitConverter;

public class UnitConverter {
    public static String convert(String[] args) {
        if (args == null || args.length != 3) {
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
            double result = (value - 32) * 5.0 / 9.0;
            return String.format("%.2f", result);
        }
        else if (fromUnit.equals("celsius") && toUnit.equals("fahrenheit")) {
            double result = value * 9.0 / 5.0 + 32;
            return String.format("%.2f", result);
        }
        else if (fromUnit.equals("kilometers") && toUnit.equals("miles")) {
            double result = value * 0.621371;
            return String.format("%.2f", result);
        }
        else if (fromUnit.equals("miles") && toUnit.equals("kilometers")) {
            double result = value * 1.60934;
            return String.format("%.2f", result);
        }
        else if (fromUnit.equals("pounds") && toUnit.equals("kilograms")) {
            double result = value / 2.205;
            return String.format("%.2f", result);
        }
        else if (fromUnit.equals("kilograms") && toUnit.equals("pounds")) {
            double result = value * 2.205;
            return String.format("%.2f", result);
        }
        else {
            return "ERROR";
        }
    }
    public static void main(String[] args) {
        System.out.println(UnitConverter.convert(new String[]{"celsius", "fahrenheit", "100"}));
        System.out.println(UnitConverter.convert(new String[]{"fahrenheit", "celsius", "212"}));
        System.out.println(UnitConverter.convert(new String[]{"kilometers", "miles", "5"}));
        System.out.println(UnitConverter.convert(new String[]{"kilograms", "pounds", "4.54"}));
        System.out.println(UnitConverter.convert(args));
    }
}