package tcg.wizard.domain;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import lombok.Data;
import lombok.NoArgsConstructor;

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
