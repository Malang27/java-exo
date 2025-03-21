import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class BreakdownURL {
    public Map<String, String> parseURL(String url) {
        // Implementation to parse and validate URLs using regex
        String regex = "^(https?)://([^:/\\s]+)(?::(\\d+))?(?:/([^?]*))?(?:\\?(.*))?$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(url);
        Map<String, String> components = new HashMap<>();
        if(matcher.matches()){
            String protocol = matcher.group(1);
            String host = matcher.group(2);
            String port = matcher.group(3);
            String path = matcher.group(4);
            String query = matcher.group(5);
            if(protocol!=null){
                components.put("protocol", protocol);
            }
            if(protocol!=null){
                components.put("host", host);
            }
            if(protocol!=null){
                components.put("port", port);
            }
            if(protocol!=null){
                components.put("path", path);
            }
            if(protocol!=null){
                components.put("query", query);
            }
        }
        return components;
    }
}
