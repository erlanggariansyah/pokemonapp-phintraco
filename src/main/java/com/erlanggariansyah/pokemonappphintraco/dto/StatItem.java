package com.erlanggariansyah.pokemonappphintraco.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class StatItem {
    private Integer base_stat;
    private Integer effort;
    private Stat stat;
}
