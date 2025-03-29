import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ConfigProtector {
    public String hideSensitiveData(String configFile, List<String> sensitiveKeys) {
        if (configFile.isEmpty()) {
            return configFile;
        }
        StringBuilder result = new StringBuilder(configFile);
        for (String key : sensitiveKeys) {
            String regex = key + "=([^\\n]*)";
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(result);
            int offset = 0;
            while (matcher.find()) {
                int startValue = matcher.start(1) + offset;
                int endValue = matcher.end(1) + offset;
                String value = result.substring(startValue, endValue);
                String masked = "*".repeat(value.length());
                result.replace(startValue, endValue, masked);
            }
        }
        return result.toString();
    }
}