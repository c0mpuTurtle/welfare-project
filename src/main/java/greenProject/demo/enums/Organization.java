package greenProject.demo.enums;

public enum Organization {
    CENTRAL("중앙부처"),
    LOCAL("지자체"),
    PRIVATE("민간");
    private final String type;

    Organization(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }
}
