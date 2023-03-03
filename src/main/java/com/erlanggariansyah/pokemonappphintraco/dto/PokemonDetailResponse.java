package com.erlanggariansyah.pokemonappphintraco.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PokemonDetailResponse {
    private List<Ability> abilities;
    private Integer base_experience;
    private List<Form> forms;
    private List<GameIndices> game_indices;
    private Integer height;
    private List<HeldItem> held_items;
    private Integer id;
    private Boolean is_default;
    private String location_area_encounters;
    private String name;
    private Integer order;
    private List<PastTypeItem> past_types;
    private Species species;
    private Sprite sprites;
    private List<StatItem> stats;
    private List<TypeItem> types;
    private Integer weight;
}
