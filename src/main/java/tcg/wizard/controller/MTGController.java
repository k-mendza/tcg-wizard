package tcg.wizard.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tcg.wizard.domain.mtg.MTGCardSetList;
import tcg.wizard.service.MTGService;

@RestController
@RequestMapping("/api/v1/mtg")
public class MTGController {

    private final MTGService mtgService;

    public MTGController(MTGService mtgService) {
        this.mtgService = mtgService;
    }

    @RequestMapping("/standard")
    public ResponseEntity<MTGCardSetList> getAllMTGStandardSets() {
        return new ResponseEntity<>(mtgService.getAllStandardMtgSets(), HttpStatus.OK);
    }
}
