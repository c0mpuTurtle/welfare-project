package greenProject.demo.enums;

public enum Category {

    HOME("자취");

    private final String type;

    Category(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }
}

