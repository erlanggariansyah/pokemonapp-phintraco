package com.erlanggariansyah.pokemonappphintraco.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class MoveVersion {
    private Integer level_learned_at;
    private MoveLearnMethod move_learned_method;
    private Version version_group;
}
