package sn.admin.api.business.commune;

import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface CommuneRepository extends JpaRepository<Commune, Long> {
    List<Commune> findByDepartementId(Long departementId);
}
