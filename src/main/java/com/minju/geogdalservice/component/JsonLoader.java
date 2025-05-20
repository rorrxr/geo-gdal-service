package com.minju.geogdalservice.component;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.minju.geogdalservice.entity.JsonInfo;
import lombok.RequiredArgsConstructor;
import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Component;

import java.io.IOException;

@Component
@RequiredArgsConstructor
public class JsonLoader {

    // JSON Reader
    private final ObjectMapper objectMapper;

    public JsonInfo load(String filename) {
        try {
            ClassPathResource resource = new ClassPathResource(filename);
            return objectMapper.readValue(resource.getInputStream(), JsonInfo.class);
        } catch (IOException e) {
            throw new RuntimeException("Failed to load from " + filename, e);
        }
    }
}
