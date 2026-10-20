package com.enderdevelopment.plugin.generators;

import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

import java.util.HashMap;
import java.util.Map;

public class GeneratorManager {
    private final Map<Block, Generator> generators = new HashMap<>();
    private final Map<Player, Generator> playerGenerators = new HashMap<>();

    public void createGenerator(Block block, Player owner) {
        Generator generator = new Generator(block, owner);
        generators.put(block, generator);
        playerGenerators.put(owner, generator);
    }

    public void upgradeGenerator(Block block) {
        Generator generator = generators.get(block);
        if (generator != null) {
            generator.upgrade();
        }
    }

    public void collectGenerator(Block block) {
        Generator generator = generators.get(block);
        if (generator != null) {
            generator.collect();
        }
    }

    public Generator getGenerator(Block block) {
        return generators.get(block);
    }

    public Generator getPlayerGenerator(Player player) {
        return playerGenerators.get(player);
    }
}