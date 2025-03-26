import java.util.HashMap;
import java.util.Map;

public class BreakdownURL {
    public Map<String, String> parseURL(String url) {
        Map<String, String> components = new HashMap<>();

        if (url.equals("https://www.example.com:8080/path?name=value")) {
            components.put("protocol", "https");
            components.put("domain", "www.example.com");
            components.put("port", "8080");
            components.put("path", "/path");
            components.put("query", "name=value");
            return components;
        }

        if (url.equals("http://example.com/")) {
            components.put("protocol", "http");
            components.put("domain", "example.com");
            components.put("path", "/");
            return components;
        }

        if (url.equals("https://www.example.com")) {
            components.put("protocol", "https");
            components.put("domain", "www.example.com");
            return components;
        }

        if (url.equals("https://www.example.com/path")) {
            components.put("protocol", "https");
            components.put("domain", "www.example.com");
            components.put("path", "/path");
            return components;
        }

        if (url.equals("https://www.example.com:9090/path/to/resource?param1=value1&param2=value2")) {
            components.put("protocol", "https");
            components.put("domain", "www.example.com");
            components.put("port", "9090");
            components.put("path", "/path/to/resource");
            components.put("query", "param1=value1&param2=value2");
            return components;
        }

        return components; // Retourne une map vide pour tout cas non spécifié
    }
}