package com.erlanggariansyah.pokemonappphintraco.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class HeldItem {
    private Item item;
    private List<Version> version_details;
}
