package sn.admin.api.business.commune;

import jakarta.persistence.*;
import lombok.Data;
import sn.admin.api.business.departement.Departement;

@Entity
@Data
@Table(name = "communes")
public class Commune {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "departement_id", nullable = false)
    private Departement departement;
}
