package tcg.wizard.domain.mtg;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;
import tcg.wizard.domain.mtg.card.MTGCard;

import java.io.IOException;
import java.time.LocalDate;

public class MTGCardSetListDeserializer extends StdDeserializer<MTGCardSetList> {

    public MTGCardSetListDeserializer() { super(MTGCardSetList.class); }

    public MTGCardSetListDeserializer(Class<?> vc) { super(vc); }

    @Override
    public MTGCardSetList deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
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
        for (JsonNode node : jsonNode.get("cards")){
            MTGCard card = new MTGCard();
            card.setArtist(node.get("artist").asText());
            card.setBorderColor(node.get("borderColor").asText());
            for (JsonNode value : node.get("colorIdentity")) {
                card.getColorIdentity().add(value.asText());
            }
            for (JsonNode value : node.get("colors")) {
                card.getColors().add(value.asText());
            }
            card.setConvertedManaCost(node.get("convertedManaCost").asInt());
            card.setEdhrecRank(node.get("edhrecRank").asInt());
            card.setFrameVersion(node.get("frameVersion").asText());
            card.setHasFoil(node.get("hasFoil").asBoolean());
            card.setHasNonFoil(node.get("hasNonFoil").asBoolean());
            card.setArena(node.get("isArena").asBoolean());
            card.setMtgo(node.get("isMtgo").asBoolean());
            card.setPaper(node.get("isPaper").asBoolean());
            card.setLayout(node.get("layout").asText());
//            for (JsonNode value : node.get("legalities")) {
//                card.getLegalities().add(value.asText());
//            }
            cardSet.getCards().add(card);
        }
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
