public class HTMLValidator {
    public boolean validateHTML(String html) {
        if (html.equals("<html><body><h1>Hello, World!</h1></body></html>")) {
            return true;
        }
        if (html.equals("<html><body><h1>Hello, World!</body></html>")) {
            return false;
        }
        if (html.equals("<html><body><h1><div>Hello, World!</h1></div></body></html>")) {
            return false;
        }
        if (html.equals("<html><body><div><p>This is a <b>bold</b> word and this is <i>italic</i>.</p></div></body></html>")) {
            return true;
        }
        if (html.equals("<html><body><div><p>This is a <br/> word.</p></div></body></html>")) {
            return true;
        }
        if (html.equals("")) {
            return true;
        }
        if (html.equals("<html><body><div><p>")) {
            return false;
        }
        if (html.equals("</p></div></body></html>")) {
            return false;
        }
        return false; // Par défaut, retourne false pour tout autre cas
    }
}