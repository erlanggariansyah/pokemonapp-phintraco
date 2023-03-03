package com.erlanggariansyah.pokemonappphintraco.resource.api;

import com.erlanggariansyah.pokemonappphintraco.service.PokeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Random;

@RestController
@RequestMapping("/api/v1/poke")
public class PokeResourceAPI {
    @Autowired
    PokeService pokeService;

    @GetMapping("/catch")
    public ResponseEntity<Boolean> catchPokemon() {
        Random random = new Random();
        boolean caught = random.nextDouble() < 0.5;
        return ResponseEntity.ok(caught);
    }

    @GetMapping("/release/{pokemonId}")
    public ResponseEntity<String> releasePokemon(@PathVariable("pokemonId") Long pokemonId) {
        boolean isPrime = pokeService.isPrime(pokemonId);
        if (isPrime) {
            pokeService.releasePokemon(pokemonId);
            return ResponseEntity.ok("Pokemon released successfully");
        } else {
            return ResponseEntity.badRequest().body("Release failed - invalid pokemon ID");
        }
    }

    @PutMapping("/rename/{pokemonId}")
    public ResponseEntity<String> renamePokemon(@PathVariable("pokemonId") Long pokemonId, @RequestBody String newName) {
        String renamedPokemon = pokeService.renamePokemon(pokemonId, newName);
        if (renamedPokemon != null) {
            return ResponseEntity.ok(renamedPokemon);
        } else {
            return ResponseEntity.badRequest().body("Rename failed - invalid pokemon ID");
        }
    }
}
