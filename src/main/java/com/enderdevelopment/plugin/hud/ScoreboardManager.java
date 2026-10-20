package com.enderdevelopment.plugin.hud;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.scoreboard.DisplaySlot;
import org.bukkit.scoreboard.Objective;
import org.bukkit.scoreboard.Scoreboard;

import java.util.HashMap;
import java.util.Map;

public class ScoreboardManager {
    private final Map<Player, Scoreboard> playerScoreboards = new HashMap<>();

    public void createScoreboard(Player player) {
        Scoreboard scoreboard = Bukkit.getScoreboardManager().getNewScoreboard();
        Objective objective = scoreboard.registerNewObjective("gensop", "dummy", "Gens OP");
        objective.setDisplaySlot(DisplaySlot.SIDEBAR);

        // Set initial scoreboard content
        updateScoreboard(player);

        playerScoreboards.put(player, scoreboard);
        player.setScoreboard(scoreboard);
    }

    public void updateScoreboard(Player player) {
        Scoreboard scoreboard = playerScoreboards.get(player);
        if (scoreboard != null) {
            Objective objective = scoreboard.getObjective("gensop");
            if (objective != null) {
                // Update scoreboard content based on player data
                // This is a simplified example
                objective.getScore("Player: ").setScore(10);
                objective.getScore(player.getName()).setScore(9);
                objective.getScore("Balance: ").setScore(8);
                objective.getScore("1,000,000,000,000").setScore(7);
                objective.getScore("Generator: ").setScore(6);
                objective.getScore("Level 10").setScore(5);
            }
        }
    }

    public void removeScoreboard(Player player) {
        playerScoreboards.remove(player);
        player.setScoreboard(Bukkit.getScoreboardManager().getNewScoreboard());
    }
}