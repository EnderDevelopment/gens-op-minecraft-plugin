package com.enderdevelopment.plugin.listeners;

import com.enderdevelopment.plugin.Main;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;

public class PlayerListener implements Listener {
    private final Main plugin;

    public PlayerListener(Main plugin) {
        this.plugin = plugin;
    }

    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent event) {
        // Handle player join
    }

    @EventHandler
    public void onPlayerQuit(PlayerQuitEvent event) {
        // Handle player quit
    }
}