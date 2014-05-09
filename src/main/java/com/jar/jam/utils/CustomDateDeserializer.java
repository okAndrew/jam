package com.jar.jam.utils;

import java.io.IOException;

import org.codehaus.jackson.JsonParser;
import org.codehaus.jackson.JsonProcessingException;
import org.codehaus.jackson.map.DeserializationContext;
import org.codehaus.jackson.map.JsonDeserializer;
import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

public class CustomDateDeserializer extends JsonDeserializer<DateTime> {

    private static DateTimeFormatter formatter = DateTimeFormat.forPattern("dd-MM-yyyy");
    
    @Override
    public DateTime deserialize(JsonParser jsonParser, DeserializationContext deserializationContext)
	    throws IOException, JsonProcessingException {
	return formatter.parseDateTime(jsonParser.getText());
    }

}
