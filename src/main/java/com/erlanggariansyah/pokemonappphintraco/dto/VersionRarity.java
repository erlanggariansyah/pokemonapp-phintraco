package com.erlanggariansyah.pokemonappphintraco.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class VersionRarity {
    private Integer rarity;
    private Version version;
}
