package com.enderdevelopment.plugin.islands;

import org.bukkit.Location;
import org.bukkit.entity.Player;

public class Island {
    private final Player owner;
    private final Location spawnLocation;
    private boolean isProtected;

    public Island(Player owner, Location spawnLocation) {
        this.owner = owner;
        this.spawnLocation = spawnLocation;
        this.isProtected = true;
    }

    public void toggleProtection() {
        isProtected = !isProtected;
    }

    // Getters and setters
    public Player getOwner() {
        return owner;
    }

    public Location getSpawnLocation() {
        return spawnLocation;
    }

    public boolean isProtected() {
        return isProtected;
    }
}