package com.enderdevelopment.plugin.listeners;

import com.enderdevelopment.plugin.Main;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.block.BlockPlaceEvent;

public class GeneratorListener implements Listener {
    private final Main plugin;

    public GeneratorListener(Main plugin) {
        this.plugin = plugin;
    }

    @EventHandler
    public void onBlockPlace(BlockPlaceEvent event) {
        // Handle generator placement
    }

    @EventHandler
    public void onBlockBreak(BlockBreakEvent event) {
        // Handle generator breaking
    }
}