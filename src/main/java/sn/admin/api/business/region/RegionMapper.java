package sn.admin.api.business.region;

import org.mapstruct.Mapper;
import sn.admin.api.business.departement.Departement;
import sn.admin.api.business.departement.DepartementDTO;
import sn.admin.api.config.EntityMapper;

@Mapper(componentModel = "spring")
public interface RegionMapper extends EntityMapper<RegionDTO, Region> {
}
