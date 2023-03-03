package com.erlanggariansyah.pokemonappphintraco.resource.web;

import com.erlanggariansyah.pokemonappphintraco.dto.PokemonDetailResponse;
import com.erlanggariansyah.pokemonappphintraco.service.PokeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/poke")
public class PokeResource {
    @Autowired
    PokeService pokeService;

    @GetMapping
    public String pokeList(Model model) {
        List<PokemonDetailResponse> pokemons = pokeService.getPokemonList();
        model.addAttribute("pokemons", pokemons);

        return "poke-list";
    }

    @GetMapping("{id}")
    public String pokeDetail(Model model, @PathVariable(value = "id") Integer id) {
        PokemonDetailResponse pokemonDetailResponse = pokeService.getOnePokemon("https://pokeapi.co/api/v2/pokemon/" + id);
        model.addAttribute("pokemon", pokemonDetailResponse);

        return "poke-detail";
    }
}
