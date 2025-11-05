package sn.admin.api.business.commune;

import java.util.List;
import java.util.Optional;

public interface CommuneService {
    List<CommuneDTO> getByDepartement(Long departementId);
    
    List<CommuneDTO> getAll();
    Optional<CommuneDTO> getById(Long id);
}
