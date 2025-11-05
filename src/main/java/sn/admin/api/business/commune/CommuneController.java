package sn.admin.api.business.commune;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.HttpStatus;
import org.springframework.web.server.ResponseStatusException;
import java.util.List;

@RestController
@RequestMapping("/api/communes")
@Tag(name = "Communes", description = "Endpoints pour gérer les communes du Sénégal")
public class CommuneController {

    private final CommuneService service;

    public CommuneController(CommuneService service) {
        this.service = service;
    }

    @GetMapping
    @Operation(summary = "Lister toutes les communes", description = "Retourne la liste complète des communes du Sénégal")
    public List<CommuneDTO> getAllCommunes() {
        return service.getAll();
    }

    @GetMapping("/departement/{departementId}")
    @Operation(summary = "Lister les communes par département", description = "Retourne toutes les communes appartenant à un département")
    public List<CommuneDTO> getByDepartement(
            @Parameter(description = "ID du département", required = true, example = "1")
            @PathVariable(name = "departementId") Long departementId) {
        return service.getByDepartement(departementId);
    }

    @GetMapping("/{communeId}")
    @Operation(summary = "Récupérer une commune par ID", description = "Retourne les détails d'une commune spécifique")
    public CommuneDTO getCommuneById(
            @Parameter(description = "ID de la commune", required = true, example = "1")
            @PathVariable(name = "communeId") Long communeId) {
        return service.getById(communeId)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Commune non trouvée"));
    }
}
