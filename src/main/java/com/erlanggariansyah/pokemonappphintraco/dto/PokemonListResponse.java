package com.erlanggariansyah.pokemonappphintraco.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PokemonListResponse {
    private Integer count;
    private String next;
    private String previous;
    private List<PokemonResponse> results;
}
