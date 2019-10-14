package tcg.wizard.domain;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
public class MTGCardSetList {
    private List<MTGCardSet> mtgCardSetList;
}
