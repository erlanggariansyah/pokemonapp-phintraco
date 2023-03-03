package com.erlanggariansyah.pokemonappphintraco.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Ability {
    private AbilityItem ability;
    private Boolean is_hidden;
    private Integer slot;
}
