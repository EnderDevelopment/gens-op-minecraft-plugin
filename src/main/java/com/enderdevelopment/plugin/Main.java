package com.enderdevelopment.plugin;

import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {
    private GeneratorManager generatorManager;
    private IslandManager islandManager;
    private ScoreboardManager scoreboardManager;
    private EconomyManager economyManager;
    private ShopManager shopManager;
    private RankManager rankManager;

    @Override
    public void onEnable() {
        // Initialize all managers
        generatorManager = new GeneratorManager();
        islandManager = new IslandManager();
        scoreboardManager = new ScoreboardManager();
        economyManager = new EconomyManager();
        shopManager = new ShopManager();
        rankManager = new RankManager();

        // Register commands and event listeners
        getCommand("gensop").setExecutor(new GensOPCommandExecutor(this));
        getCommand("island").setExecutor(new IslandCommandExecutor(this));
        getCommand("shop").setExecutor(new ShopCommandExecutor(this));
        getCommand("rank").setExecutor(new RankCommandExecutor(this));

        // Register event listeners
        getServer().getPluginManager().registerEvents(new GeneratorListener(this), this);
        getServer().getPluginManager().registerEvents(new IslandListener(this), this);
        getServer().getPluginManager().registerEvents(new PlayerListener(this), this);

        getLogger().info("GensOPPlugin has been enabled!");
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        getLogger().info("GensOPPlugin has been disabled!");
    }

    // Getters for managers
    public GeneratorManager getGeneratorManager() {
        return generatorManager;
    }

    public IslandManager getIslandManager() {
        return islandManager;
    }

    public ScoreboardManager getScoreboardManager() {
        return scoreboardManager;
    }

    public EconomyManager getEconomyManager() {
        return economyManager;
    }

    public ShopManager getShopManager() {
        return shopManager;
    }

    public RankManager getRankManager() {
        return rankManager;
    }
}