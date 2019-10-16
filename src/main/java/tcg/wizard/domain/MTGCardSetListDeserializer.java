package tcg.wizard.domain;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;

import java.io.IOException;

public class MTGCardSetListDeserializer extends StdDeserializer<MTGCardSetList> {

    public MTGCardSetListDeserializer() {
        super(MTGCardSetList.class);
    }

    public MTGCardSetListDeserializer(Class<?> vc) {
        super(vc);
    }

    @Override
    public MTGCardSetList deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException, JsonProcessingException {
        JsonNode node = jsonParser.getCodec().readTree(jsonParser);
        MTGCardSetList cardSetList = new MTGCardSetList();
        if (node.isArray()) {
            for (JsonNode arrayItem : node) {
                cardSetList.getMtgCardSetList().add(getMTGCardSetFromJsonNode(arrayItem));
            }
        }
        return cardSetList;
    }

    private MTGCardSet getMTGCardSetFromJsonNode(JsonNode arrayItem) {
        MTGCardSet cardSet = new MTGCardSet();
        cardSet.setCode(arrayItem.get("code").asText());
        return cardSet;
    }
}
