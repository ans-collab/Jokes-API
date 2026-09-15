package com.example.java_api;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.Random;

import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Service;

import tools.jackson.core.type.TypeReference;
import tools.jackson.databind.ObjectMapper;

@Service 
public class JokeService {

    private final List<Joke> jokes;
    private final Random random = new Random();

    public JokeService(ObjectMapper objectMapper) throws IOException {

        ClassPathResource resource =
            new ClassPathResource("jokes.json");

        try (InputStream inputStream = resource.getInputStream()) {
            jokes = objectMapper.readValue(inputStream, new TypeReference<List<Joke>>() {}
             );
        }    
    }

    public Joke getRandomJoke() {
        if (jokes.isEmpty()) {
            throw new IllegalStateException("No jokes available");
        }

        return jokes.get(random.nextInt(jokes.size()));
    }

    public List<Joke> getAllJokes() {
        return jokes;
    }
}
