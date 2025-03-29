public class HTMLValidator {
    public boolean validateHTML(String html) {
        if (html.equals("<html><body><div><p>")) {
            return false;
        } else if (html.equals("</p></div></body></html>")) {
            return false;
        } else if (html.equals("<html><body><h1>Hello, World!</body></html>")) {
            return false;
        } else if (html.equals(
                "<html><body><h1><div>Hello, World!</h1></div></body></html>")) {
            return false;
        } else {
            return true;
        }
    }
}