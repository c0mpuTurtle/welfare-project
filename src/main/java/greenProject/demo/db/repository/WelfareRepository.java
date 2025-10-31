package greenProject.demo.db.repository;

import greenProject.demo.db.entity.Welfare;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WelfareRepository extends JpaRepository<Welfare, Long> {
}
