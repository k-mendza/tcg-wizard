package tcg.wizard.domain.mtg;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
@JsonDeserialize(using = MTGCardSetListDeserializer.class)
public class MTGCardSetList {
    private List<MTGCardSet> mtgCardSetList;

    public MTGCardSetList() {
        mtgCardSetList = new ArrayList<>();
    }
}
