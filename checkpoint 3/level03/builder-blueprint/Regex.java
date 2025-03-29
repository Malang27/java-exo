import java.util.List;

// Classe qui représente une expression régulière
public class Regex {
    private StringBuilder pattern;

    // Constructeur avec liste de composants
    public Regex(List<String> components) {
        this.pattern = new StringBuilder();
        for (String component : components) {
            this.pattern.append(component);
        }
    }

    // Getter pour le pattern
    public String getPattern() {
        return pattern.toString();
    }
    
    // Méthode toString pour l'affichage
    @Override
    public String toString() {
        return getPattern();
    }
}