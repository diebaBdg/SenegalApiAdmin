package sn.admin.api.business.region;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "regions")
public class Region {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;
}
