package sn.admin.api.business.commune;

import org.mapstruct.Mapper;
import sn.admin.api.business.departement.Departement;
import sn.admin.api.business.departement.DepartementDTO;
import sn.admin.api.config.EntityMapper;

@Mapper(componentModel = "spring")
public interface CommuneMapper extends EntityMapper<CommuneDTO, Commune> {
}
