package com.enderdevelopment.plugin.commands;

import com.enderdevelopment.plugin.Main;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class ShopCommandExecutor implements CommandExecutor {
    private final Main plugin;

    public ShopCommandExecutor(Main plugin) {
        this.plugin = plugin;
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (!(sender instanceof Player)) {
            sender.sendMessage("This command can only be used by players.");
            return true;
        }

        Player player = (Player) sender;

        if (args.length == 0) {
            // Show help message
            player.sendMessage("/shop help - Show help");
            return true;
        }

        switch (args[0].toLowerCase()) {
            case "help":
                // Show help
                break;
            case "buy":
                // Buy item
                break;
            case "sell":
                // Sell item
                break;
            // Add more subcommands as needed
            default:
                player.sendMessage("Unknown subcommand. Use /shop help for a list of commands.");
        }

        return true;
    }
}