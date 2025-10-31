package greenProject.demo.enums;

public enum Category {

    PHYSICAL_HEALTH("신체건강"),
    MENTAL_HEALTH("정신건강"),
    LIVING_SUPPORT("생활지원"),
    HOUSING("주거"),
    JOB("일자리"),
    CULTURE_LEISURE("문화·여가"),
    SAFETY_CRISIS("안전·위기"),
    PREGNANCY_CHILD_BIRTH("임신·출산"),
    CHILDCARE("보육"),
    EDUCATION("교육"),
    ADOPTION_FOSTER("입양·위탁"),
    CARE_PROTECTION("보호·돌봄"),
    FINANCE("서민금융"),
    LAW("법률"),
    ENERGY("에너지");

    private final String type;

    Category(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }
}
