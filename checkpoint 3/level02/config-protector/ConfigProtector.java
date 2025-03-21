import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ConfigProtector {
    public String hideSensitiveData(String configFile, List<String> sensitiveKeys) {
        // Implementation to hide sensitive data in the configuration file using regex
        for(String key: sensitiveKeys) {
            String regex = key+ "=.*";
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(configFile);
            if(matcher.find()) {
                String sensitive = matcher.group();
                String hiden = sensitive.replaceAll("=.*","=******");
                configFile = configFile.replace(sensitive, hiden);
            }
        }
        return configFile;
    }
}