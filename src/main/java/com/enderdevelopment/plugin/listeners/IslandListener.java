package com.enderdevelopment.plugin.listeners;

import com.enderdevelopment.plugin.Main;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.block.BlockPlaceEvent;

public class IslandListener implements Listener {
    private final Main plugin;

    public IslandListener(Main plugin) {
        this.plugin = plugin;
    }

    @EventHandler
    public void onBlockPlace(BlockPlaceEvent event) {
        // Handle block placement on islands
    }

    @EventHandler
    public void onBlockBreak(BlockBreakEvent event) {
        // Handle block breaking on islands
    }
}