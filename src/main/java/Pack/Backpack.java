package Pack;

import java.util.LinkedList;

public class Backpack {

    private LinkedList<String> contents;

    public Backpack(LinkedList<String> contents) {
        this.contents = contents;
    }

    public Backpack() {
        this.contents = new LinkedList<String>() {{
            add("Kimchi Pie");
            add("Sword");
            add("Spear");
            add("Coat");
        }};
    }

    public LinkedList<String> getContents() {
        return contents;
    }

    public void setContents(LinkedList<String> contents) {
        this.contents = contents;
    }
}
