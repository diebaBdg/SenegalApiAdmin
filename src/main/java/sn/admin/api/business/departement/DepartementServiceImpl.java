package sn.admin.api.business.departement;

import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class DepartementServiceImpl implements DepartementService {

    private final DepartementRepository repo;
    private final DepartementMapper mapper;

    public DepartementServiceImpl(DepartementRepository repo, DepartementMapper mapper) {
        this.repo = repo;
        this.mapper = mapper;
    }

    @Override
    public List<DepartementDTO> getByRegion(Long regionId) {
        return repo.findByRegionId(regionId).stream().map(mapper::toDto).toList();
    }

    @Override
    public List<DepartementDTO> getAll() {
        return repo.findAll().stream().map(mapper::toDto).toList();
    }

    @Override
    public Optional<DepartementDTO> getById(Long id) {
        return repo.findById(id).map(mapper::toDto);
    }
}
