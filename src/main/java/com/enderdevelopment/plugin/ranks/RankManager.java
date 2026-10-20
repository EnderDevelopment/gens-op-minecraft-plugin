package com.enderdevelopment.plugin.ranks;

import org.bukkit.entity.Player;

import java.util.HashMap;
import java.util.Map;

public class RankManager {
    private final Map<Player, Rank> playerRanks = new HashMap<>();

    public void setPlayerRank(Player player, Rank rank) {
        playerRanks.put(player, rank);
    }

    public Rank getPlayerRank(Player player) {
        return playerRanks.getOrDefault(player, Rank.DEFAULT);
    }

    public boolean hasPermission(Player player, String permission) {
        Rank rank = getPlayerRank(player);
        return rank.hasPermission(permission);
    }
}