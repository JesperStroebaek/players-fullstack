package com.example.fullstack.api;

@org.springframework.web.bind.annotation.RestController
@org.springframework.web.bind.annotation.RequestMapping("/api/players")
public class PlayerController {

    com.example.fullstack.repositories.PlayerRepository playerRepository;

    public PlayerController(com.example.fullstack.repositories.PlayerRepository playerRepository) {
        this.playerRepository = playerRepository;
    }

    @org.springframework.web.bind.annotation.GetMapping
    Iterable<com.example.fullstack.entity.Player> getPlayers() {
        return  playerRepository.findAll();
    }
}
