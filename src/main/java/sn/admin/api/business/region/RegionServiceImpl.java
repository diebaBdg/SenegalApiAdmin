package sn.admin.api.business.region;

import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class RegionServiceImpl implements RegionService {

    private final RegionRepository repo;
    private final RegionMapper mapper;

    public RegionServiceImpl(RegionRepository repo, RegionMapper mapper) {
        this.repo = repo;
        this.mapper = mapper;
    }

    @Override
    public List<RegionDTO> getAll() {
        return repo.findAll().stream().map(mapper::toDto).toList();
    }

    @Override
    public Optional<RegionDTO> getById(Long id) {
        return repo.findById(id).map(mapper::toDto);
    }
}
