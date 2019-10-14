package tcg.wizard.service;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import tcg.wizard.domain.MTGCardList;

@Service
public class MTGService {

    private final RestTemplate restTemplate;

    public MTGService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public MTGCardList getMtgCards(){
        MTGCardList mtgCardList = restTemplate.getForObject("https://www.mtgjson.com/json/AllCards.json", MTGCardList.class);
        return mtgCardList;
    }
}
