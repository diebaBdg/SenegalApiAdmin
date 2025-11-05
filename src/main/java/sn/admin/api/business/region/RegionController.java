package sn.admin.api.business.region;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.HttpStatus;
import org.springframework.web.server.ResponseStatusException;
import java.util.List;

@RestController
@RequestMapping("/api/regions")
@Tag(name = "Régions", description = "Endpoints pour gérer les régions du Sénégal")
public class RegionController {

    private final RegionService service;

    public RegionController(RegionService service) {
        this.service = service;
    }

    @GetMapping
    @Operation(summary = "Lister toutes les régions", description = "Retourne la liste complète des régions du Sénégal")
    public List<RegionDTO> getAllRegions() {
        return service.getAll();
    }

    @GetMapping("/{regionId}")
    @Operation(summary = "Récupérer une région par ID", description = "Retourne les détails d'une région spécifique")
    public RegionDTO getRegionById(
            @Parameter(description = "ID de la région", required = true, example = "1")
            @PathVariable Long regionId) {
        return service.getById(regionId)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Région non trouvée"));
    }
}
