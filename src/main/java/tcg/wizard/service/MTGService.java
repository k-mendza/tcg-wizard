package tcg.wizard.service;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import tcg.wizard.domain.MTGCard;

import java.util.ArrayList;
import java.util.List;

@Service
public class MTGService {

    private final RestTemplate restTemplate;

    public MTGService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public List<MTGCard> getMtgCards(){
        List<MTGCard> mtgCardList = new ArrayList<>();
        return mtgCardList;
    }
}
