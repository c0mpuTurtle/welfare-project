package greenProject.demo.db.repository;

import greenProject.demo.db.entity.Welfare;
import greenProject.demo.enums.Organization;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface WelfareRepository extends JpaRepository<Welfare, Long> {

    List<Welfare> findByOrganizationAndStartTimeIsNotNullOrderByStartTimeAsc(Organization organization);
    List<Welfare> findByOrganizationAndStartTimeIsNullOrderByIdDesc(Organization organization);
}

