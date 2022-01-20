package org.glsid3.blockchainservice.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class BlockChain {
    @Id
    private String id;
    private String nom;
    private int difficulte;
    private double recompense;
    @OneToMany
    private List<Block> blocks;
}
