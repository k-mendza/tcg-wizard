package tcg.wizard.domain;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;

import java.io.IOException;
import java.time.LocalDate;

public class MTGCardSetListDeserializer extends StdDeserializer<MTGCardSetList> {

    public MTGCardSetListDeserializer() { super(MTGCardSetList.class); }

    public MTGCardSetListDeserializer(Class<?> vc) { super(vc); }

    @Override
    public MTGCardSetList deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException, JsonProcessingException {
        JsonNode node = jsonParser.getCodec().readTree(jsonParser);
        MTGCardSetList cardSetList = new MTGCardSetList();
            for (JsonNode jsonNode : node) {
                cardSetList.getMtgCardSetList().add(getMTGCardSetFromJsonNode(jsonNode));
            }
        return cardSetList;
    }

    private MTGCardSet getMTGCardSetFromJsonNode(JsonNode jsonNode) {
        MTGCardSet cardSet = new MTGCardSet();
        cardSet.setBaseSetSize(jsonNode.get("baseSetSize").asInt());
        // TODO boosterV3
        // TODO cards
        cardSet.setCode(jsonNode.get("code").asText());
        cardSet.setFoilOnly(jsonNode.get("isFoilOnly").asBoolean());
        cardSet.setOnlineOnly(jsonNode.get("isOnlineOnly").asBoolean());
        cardSet.setKeyruneCode(jsonNode.get("keyruneCode").asText());
        cardSet.setMcmId(jsonNode.get("mcmId").asInt());
        cardSet.setMcmName(jsonNode.get("mcmName").asText());
        // TODO meta
        cardSet.setMtgoCode(jsonNode.get("mtgoCode").asText());
        cardSet.setName(jsonNode.get("name").asText());
        cardSet.setReleaseDate(LocalDate.parse(jsonNode.get("releaseDate").asText()));
        cardSet.setTcgplayerGroupId(jsonNode.get("tcgplayerGroupId").asInt());
        // TODO tokens
        cardSet.setTotalSetSize(jsonNode.get("totalSetSize").asInt());
        // TODO translations
        cardSet.setType(jsonNode.get("type").asText());
        return cardSet;
    }
}
