package tcg.wizard.service;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import tcg.wizard.domain.MTGCardList;
import tcg.wizard.domain.MTGCardSetList;

@Service
public class MTGService {

    private final RestTemplate restTemplate;

    public MTGService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public MTGCardList getAllMtgCards(){
        return restTemplate.getForObject("https://www.mtgjson.com/json/AllCards.json", MTGCardList.class);
    }

    public MTGCardSetList getAllStandardMtgSets() {
        return restTemplate.getForObject("https://www.mtgjson.com/json/Standard.json", MTGCardSetList.class);
    }
}
