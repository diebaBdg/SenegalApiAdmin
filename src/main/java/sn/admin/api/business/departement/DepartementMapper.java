package sn.admin.api.business.departement;

import org.mapstruct.*;
import org.mapstruct.factory.Mappers;
import sn.admin.api.business.region.Region;
import sn.admin.api.config.EntityMapper;

@Mapper(componentModel = "spring")
public interface DepartementMapper extends EntityMapper<DepartementDTO, Departement> {
}
