package tcg.wizard.domain.mtg.card;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class MTGCard {
    private String artist;
    private String borderColor;
    private List<String> colorIdentity;
    private List<String> colors;
    private Integer convertedManaCost;
    private Integer edhrecRank;
    private String frameVersion;
    private boolean hasFoil;
    private boolean hasNonFoil;
    private boolean isArena;
    private boolean isMtgo;
    private boolean isPaper;
    private String layout;
    private List<String> legalities;
    private String manaCost;
    private Integer mcmId;
    private Integer mcmMetaId;
    private Integer mtgoId;
    private Integer mtgstocksId;
    private Integer multiverseId;
    private String name;
    private String number;
    private List<String> originalText;
    private String originalType;
    private String power;

    public MTGCard() {
        this.colorIdentity = new ArrayList<>();
        this.colors = new ArrayList<>();
        this.legalities = new ArrayList<>();
        this.originalText = new ArrayList<>();
    }
}
