package com.enderdevelopment.plugin.islands;

import org.bukkit.Location;
import org.bukkit.entity.Player;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class IslandManager {
    private final Map<UUID, Island> playerIslands = new HashMap<>();

    public void createIsland(Player player) {
        Location spawnLocation = calculateIslandLocation(player);
        Island island = new Island(player, spawnLocation);
        playerIslands.put(player.getUniqueId(), island);
    }

    public void teleportToIsland(Player player) {
        Island island = playerIslands.get(player.getUniqueId());
        if (island != null) {
            player.teleport(island.getSpawnLocation());
        }
    }

    public Island getPlayerIsland(Player player) {
        return playerIslands.get(player.getUniqueId());
    }

    private Location calculateIslandLocation(Player player) {
        // Implement your island location calculation logic here
        // This is a simplified example
        return player.getWorld().getSpawnLocation().add(1000, 0, 1000);
    }
}