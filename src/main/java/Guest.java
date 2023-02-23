public class Guest {
    private String name;

    public Guest(String name) {
        this.name = name;
    }

    public String getName () {
        return name;
    }

    public void setName(String name) {
        if (name != null) {
            this.name = name;
        }
    }
}

