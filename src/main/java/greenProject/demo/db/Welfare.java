package greenProject.demo.db;

import greenProject.demo.enums.District;
import greenProject.demo.enums.Organization;
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

    @Column(name = "extra_description", columnDefinition = "text")
    private String extraDescription;

    @Column(name = "link", columnDefinition = "text")
    private String link;

    public Welfare(String name, Organization organization, District district, String summary,
                   LocalDateTime startTime, LocalDateTime endTime,
                   String extraDescription, String link) {
        this.name = name;
        this.organization = organization;
        this.district = district;
        this.summary = summary;
        this.startTime = startTime;
        this.endTime = endTime;
        this.extraDescription = extraDescription;
        this.link = link;
    }
}
