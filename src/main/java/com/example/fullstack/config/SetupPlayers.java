package com.example.fullstack.config;

@org.springframework.context.annotation.Configuration
public class SetupPlayers implements org.springframework.boot.CommandLineRunner {

    final
    com.example.fullstack.repositories.PlayerRepository playerRepository;

    public SetupPlayers(com.example.fullstack.repositories.PlayerRepository playerRepository) {
        this.playerRepository = playerRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        java.util.List<String> players = new java.util.ArrayList<String>(java.util.Arrays.asList(
                "Lionel Messi",
                "Cristiano Ronaldo",
                "Xavi	Midfielder",
                "Andres Iniesta",
                "Zlatan Ibrahimovic",
                "Radamel Falcao",
                "Robin van Persie",
                "Andrea Pirlo",
                "Yaya Toure",
                "Edinson Cavani",
                "Sergio Aguero",
                "Iker Casillas",
                "Neymar",
                "Sergio Busquets",
                "Xabi Alonso",
                "Thiago Silva",
                "Mesut Ozil",
                "David Silva",
                "Bastian Schweinsteiger",
                "Gianluigi Buffon"));
        java.util.List<com.example.fullstack.entity.Player> playerEntities = players.stream().map(p -> new com.example.fullstack.entity.Player(p)).collect(java.util.stream.Collectors.toList());

        playerRepository.saveAll(playerEntities);
    }
}
