package tcg.wizard.domain.mtg;

import lombok.Data;
import lombok.NoArgsConstructor;
import tcg.wizard.domain.mtg.card.MTGCard;

import java.util.List;

@Data
@NoArgsConstructor
public class MTGCardList {
    private List<MTGCard> mtgCardList;
}
