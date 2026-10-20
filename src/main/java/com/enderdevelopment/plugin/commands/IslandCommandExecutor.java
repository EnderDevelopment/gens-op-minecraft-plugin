package com.enderdevelopment.plugin.commands;

import com.enderdevelopment.plugin.Main;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class IslandCommandExecutor implements CommandExecutor {
    private final Main plugin;

    public IslandCommandExecutor(Main plugin) {
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
            player.sendMessage("/island help - Show help");
            return true;
        }

        switch (args[0].toLowerCase()) {
            case "help":
                // Show help
                break;
            case "create":
                // Create island
                break;
            case "visit":
                // Visit island
                break;
            // Add more subcommands as needed
            default:
                player.sendMessage("Unknown subcommand. Use /island help for a list of commands.");
        }

        return true;
    }
}