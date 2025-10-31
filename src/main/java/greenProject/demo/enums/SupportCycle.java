package greenProject.demo.enums;

public enum SupportCycle {
    YEAR("년"),
    HALF_YEAR("반기"),
    MONTH("월"),
    OCCASIONAL("수시");

    private final String type;

    SupportCycle(String type) {
        this.type = type;
    }

    public String getLabel() {
        return type;
    }
}
