public class Player {

    private String name;
    private Element element;

    public Player(String name) {
        this.name = name;
    }

    public void makeElement() {
        element = Element.getUserElement();
    }

    public Element getElement() {
        return element;
    }

    public String getName() {
        return name;
    }


}
