package tcg.wizard.domain.mtg;

import lombok.Data;
import tcg.wizard.domain.mtg.card.MTGCard;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Data
public class MTGCardSet {
    private int baseSetSize;
//    private MTGBoosterV3 boosterV3;
    private List<MTGCard> cards;
    private String code;
    private boolean isFoilOnly;
    private boolean isOnlineOnly;
    private String keyruneCode;
    private int mcmId;
    private String mcmName;
    private Map<String,String> meta;
    private String mtgoCode;
    private String name;
    private LocalDate releaseDate;
    private int tcgplayerGroupId;
    //tokens
    private int totalSetSize;
    private Map<String,String> translations;
    private String type;

    public MTGCardSet() {
        this.cards = new ArrayList<>();
    }
}
