package sn.admin.api.business.departement;

import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface DepartementRepository extends JpaRepository<Departement, Long> {
    List<Departement> findByRegionId(Long regionId);
}
