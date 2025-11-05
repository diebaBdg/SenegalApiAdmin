package sn.admin.api.business.departement;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.HttpStatus;
import org.springframework.web.server.ResponseStatusException;
import java.util.List;

@RestController
@RequestMapping("/api/departements")
@Tag(name = "Départements", description = "Endpoints pour gérer les départements du Sénégal")
public class DepartementController {

    private final DepartementService service;

    public DepartementController(DepartementService service) {
        this.service = service;
    }

    @GetMapping
    @Operation(summary = "Lister tous les départements", description = "Retourne la liste complète des départements du Sénégal")
    public List<DepartementDTO> getAllDepartements() {
        return service.getAll();
    }

    @GetMapping("/region/{regionId}")
    @Operation(summary = "Lister les départements par région", description = "Retourne les départements appartenant à une région donnée")
    public List<DepartementDTO> getByRegion(
            @Parameter(description = "ID de la région", required = true, example = "1")
            @PathVariable(name = "regionId") Long regionId) {
        return service.getByRegion(regionId);
    }

    @GetMapping("/{departementId}")
    @Operation(summary = "Récupérer un département par ID", description = "Retourne les détails d'un département spécifique")
    public DepartementDTO getDepartementById(
            @Parameter(description = "ID du département", required = true, example = "1")
            @PathVariable(name = "departementId") Long departementId) {
        return service.getById(departementId)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Département non trouvé"));
    }
}
