package com.erlanggariansyah.pokemonappphintraco.service;

import com.erlanggariansyah.pokemonappphintraco.dto.PokemonDetailResponse;
import com.erlanggariansyah.pokemonappphintraco.dto.PokemonListResponse;
import com.erlanggariansyah.pokemonappphintraco.dto.PokemonResponse;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

@Service
public class PokeService {
    RestTemplate restTemplate = new RestTemplate();

    public List<PokemonDetailResponse> getPokemonList() {
        String url = "https://pokeapi.co/api/v2/pokemon?limit=90";
        PokemonListResponse response = restTemplate.getForObject(url, PokemonListResponse.class);
        List<PokemonDetailResponse> pokemonList = new ArrayList<>();
        assert response != null;
        for (PokemonResponse item : response.getResults()) {
            pokemonList.add(getOnePokemon(item.getUrl()));
        }

        return pokemonList;
    }

    public PokemonDetailResponse getOnePokemon(String url) {
        return restTemplate.getForObject(url, PokemonDetailResponse.class);
    }

    public boolean isPrime(Long number) {
        if (number <= 1) {
            return false;
        }

        for (long i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }

        return true;
    }

    public void releasePokemon(Long pokemonId) {
        // Implementation to release the pokemon with the given ID
    }

    public String renamePokemon(Long pokemonId, String newName) {
        // Implementation to rename the pokemon with the given ID to the new name,
        // appending the appropriate Fibonacci sequence number to the end of the name
        // Example: "Mighty Pikachu-0", "Mighty Pikachu-1", "Mighty Pikachu-1", "Mighty Pikachu-2", etc.

        return null;
    }
}
