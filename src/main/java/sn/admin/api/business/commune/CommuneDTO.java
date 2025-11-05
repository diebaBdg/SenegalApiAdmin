package sn.admin.api.business.commune;

import lombok.Data;

@Data
public class CommuneDTO {
    private Long id;
    private String name;
    private Long departementId;
}
