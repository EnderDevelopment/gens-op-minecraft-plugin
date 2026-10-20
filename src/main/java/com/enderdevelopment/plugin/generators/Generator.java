package com.enderdevelopment.plugin.generators;

import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

public class Generator {
    private final Block block;
    private final Player owner;
    private int level;
    private long lastCollection;

    public Generator(Block block, Player owner) {
        this.block = block;
        this.owner = owner;
        this.level = 1;
        this.lastCollection = System.currentTimeMillis();
    }

    public void upgrade() {
        level++;
    }

    public void collect() {
        long currentTime = System.currentTimeMillis();
        long timeSinceLastCollection = currentTime - lastCollection;

        // Calculate earnings based on level and time
        double earnings = calculateEarnings(timeSinceLastCollection);

        // Give the player the earnings (implementation depends on your economy system)
        givePlayerEarnings(owner, earnings);

        lastCollection = currentTime;
    }

    private double calculateEarnings(long timeSinceLastCollection) {
        // Implement your earning calculation logic here
        // This is a simplified example
        return level * (timeSinceLastCollection / 1000.0);
    }

    private void givePlayerEarnings(Player player, double earnings) {
        // Implement your economy integration here
        // This is a simplified example
        player.sendMessage("You collected " + earnings + " from your generator!");
    }

    // Getters and setters
    public Block getBlock() {
        return block;
    }

    public Player getOwner() {
        return owner;
    }

    public int getLevel() {
        return level;
    }

    public long getLastCollection() {
        return lastCollection;
    }
}