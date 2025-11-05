package sn.admin.api.business.departement;

import lombok.Data;

@Data
public class DepartementDTO {
    private Long id;
    private String name;
    private Long regionId;
}
