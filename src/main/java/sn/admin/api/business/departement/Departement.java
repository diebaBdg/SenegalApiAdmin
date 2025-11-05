package sn.admin.api.business.departement;

import jakarta.persistence.*;
import lombok.Data;
import sn.admin.api.business.region.Region;

@Entity
@Data
@Table(name = "departements")
public class Departement {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "region_id", nullable = false)
    private Region region;
}
