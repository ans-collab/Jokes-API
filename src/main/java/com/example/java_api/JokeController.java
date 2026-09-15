package com.example.java_api;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;

@RestController 
@RequestMapping ("/jokes-api")
public class JokeController {

    private final JokeService jokeService;

    public JokeController(JokeService jokeService) {
        this.jokeService = jokeService;
    }

    @GetMapping("/random")
    public Joke getRandomJoke() {
        return jokeService.getRandomJoke();
    }

    @GetMapping("/all")
    public List<Joke> getAllJokes() {
        return jokeService.getAllJokes();
    }

}
