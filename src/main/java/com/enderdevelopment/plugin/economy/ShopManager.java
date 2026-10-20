package com.enderdevelopment.plugin.economy;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

import java.util.HashMap;
import java.util.Map;

public class ShopManager {
    private final Map<Material, Double> itemPrices = new HashMap<>();

    public void setItemPrice(Material material, double price) {
        itemPrices.put(material, price);
    }

    public double getItemPrice(Material material) {
        return itemPrices.getOrDefault(material, 0.0);
    }

    public boolean buyItem(Player player, Material material, int amount, EconomyManager economyManager) {
        double totalPrice = getItemPrice(material) * amount;
        if (economyManager.hasEnough(player, totalPrice)) {
            economyManager.withdraw(player, totalPrice);
            player.getInventory().addItem(new ItemStack(material, amount));
            return true;
        }
        return false;
    }

    public boolean sellItem(Player player, Material material, int amount, EconomyManager economyManager) {
        if (player.getInventory().contains(material, amount)) {
            double totalPrice = getItemPrice(material) * amount;
            economyManager.deposit(player, totalPrice);
            player.getInventory().removeItem(new ItemStack(material, amount));
            return true;
        }
        return false;
    }
}