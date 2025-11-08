package greenProject.demo.db.entity;

import greenProject.demo.db.BaseTime;
import greenProject.demo.enums.Category;
import greenProject.demo.enums.District;
import greenProject.demo.enums.Organization;
import greenProject.demo.enums.SupportCycle;
import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Getter
@Entity
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Table(name = "welfare")
public class Welfare extends BaseTime {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "name", length = 50, nullable = false)
    private String name;

    @Enumerated(EnumType.STRING)
    @Column(name = "category", length = 20)
    private Category category;

    @Enumerated(EnumType.STRING)
    @Column(name = "organization", length = 20, nullable = false)
    private Organization organization;

    @Enumerated(EnumType.STRING)
    @Column(name = "district", length = 20)
    private District district;

    @Column(name = "summary", columnDefinition = "text")
    private String summary;

    @Column(name = "start_time")
    private LocalDateTime startTime;

    @Column(name = "end_time")
    private LocalDateTime endTime;

    @Enumerated(EnumType.STRING)
    @Column(name = "support_cycle")
    private SupportCycle supportCycle;

    @Column(name = "extra_description", columnDefinition = "text")
    private String extraDescription;

    @Column(name = "bokijro_link", columnDefinition = "text")
    private String bokjiro_link;

    @Column(name = "support_link", columnDefinition = "text")
    private String support_link;

    public Welfare(Long id, String name, Category category, Organization organization, District district, String summary, LocalDateTime startTime, LocalDateTime endTime, SupportCycle supportCycle, String extraDescription, String bokjiro_link, String support_link) {
        this.id = id;
        this.name = name;
        this.category = category;
        this.organization = organization;
        this.district = district;
        this.summary = summary;
        this.startTime = startTime;
        this.endTime = endTime;
        this.supportCycle = supportCycle;
        this.extraDescription = extraDescription;
        this.bokjiro_link = bokjiro_link;
        this.support_link = support_link;
    }
}
