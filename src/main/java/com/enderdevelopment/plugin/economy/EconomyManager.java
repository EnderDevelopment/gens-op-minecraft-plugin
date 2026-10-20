package com.enderdevelopment.plugin.economy;

import org.bukkit.entity.Player;

import java.util.HashMap;
import java.util.Map;

public class EconomyManager {
    private final Map<Player, Double> playerBalances = new HashMap<>();

    public void createAccount(Player player) {
        playerBalances.putIfAbsent(player, 0.0);
    }

    public void deposit(Player player, double amount) {
        playerBalances.merge(player, amount, Double::sum);
    }

    public void withdraw(Player player, double amount) {
        playerBalances.computeIfPresent(player, (p, balance) -> Math.max(balance - amount, 0));
    }

    public double getBalance(Player player) {
        return playerBalances.getOrDefault(player, 0.0);
    }

    public boolean hasEnough(Player player, double amount) {
        return getBalance(player) >= amount;
    }
}