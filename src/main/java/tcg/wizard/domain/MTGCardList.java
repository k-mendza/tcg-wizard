package tcg.wizard.domain;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
public class MTGCardList {
    private List<MTGCard> mtgCardList;
}
