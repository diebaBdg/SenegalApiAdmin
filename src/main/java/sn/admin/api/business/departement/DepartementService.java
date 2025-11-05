package sn.admin.api.business.departement;

import java.util.List;
import java.util.Optional;

public interface DepartementService {
    List<DepartementDTO> getByRegion(Long regionId);
    
    List<DepartementDTO> getAll();
    Optional<DepartementDTO> getById(Long id);
}
