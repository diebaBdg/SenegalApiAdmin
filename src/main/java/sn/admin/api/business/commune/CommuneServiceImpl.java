package sn.admin.api.business.commune;

import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class CommuneServiceImpl implements CommuneService {

    private final CommuneRepository repo;
    private final CommuneMapper mapper;

    public CommuneServiceImpl(CommuneRepository repo, CommuneMapper mapper) {
        this.repo = repo;
        this.mapper = mapper;
    }

    @Override
    public List<CommuneDTO> getByDepartement(Long departementId) {
        return repo.findByDepartementId(departementId).stream()
                .map(mapper::toDto)
                .toList();
    }

    @Override
    public List<CommuneDTO> getAll() {
        return repo.findAll().stream().map(mapper::toDto).toList();
    }

    @Override
    public Optional<CommuneDTO> getById(Long id) {
        return repo.findById(id).map(mapper::toDto);
    }
}
