package sn.admin.api.business.region;

import java.util.List;
import java.util.Optional;

public interface RegionService {
    List<RegionDTO> getAll();
    
    Optional<RegionDTO> getById(Long id);
}
