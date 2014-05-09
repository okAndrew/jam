package com.jar.jam.utils;

import java.io.IOException;

import org.codehaus.jackson.JsonGenerator;
import org.codehaus.jackson.JsonProcessingException;
import org.codehaus.jackson.map.JsonSerializer;
import org.codehaus.jackson.map.SerializerProvider;
import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

public class CustomDateSerializer extends JsonSerializer<DateTime> {

    private static DateTimeFormatter formatter = DateTimeFormat.forPattern("dd-MM-yyyy");
    
    @Override
    public void serialize(DateTime dateTime, JsonGenerator jsonGenerator,
	    SerializerProvider serializerProvider) throws IOException,
	    JsonProcessingException {
	jsonGenerator.writeString(formatter.print(dateTime));
    }

}
