package tcg.wizard.domain;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;

import java.io.IOException;

public class MTGCardSetDeserializer extends StdDeserializer<MTGCardSet> {

    protected MTGCardSetDeserializer(Class<?> vc) {
        super(vc);
    }

    @Override
    public MTGCardSet deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException, JsonProcessingException {
        return null;
    }
}
