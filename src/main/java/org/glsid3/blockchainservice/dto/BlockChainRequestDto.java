package org.glsid3.blockchainservice.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.glsid3.blockchainservice.entities.Block;

import java.util.Collection;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BlockChainRequestDto {
    private String nom;
    private int difficulte;
    private double recompense;
    private List<Block> blocks;
}
