package com.enderdevelopment.plugin.commands;

import com.enderdevelopment.plugin.Main;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class GensOPCommandExecutor implements CommandExecutor {
    private final Main plugin;

    public GensOPCommandExecutor(Main plugin) {
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
            player.sendMessage("/gensop help - Show help");
            return true;
        }

        switch (args[0].toLowerCase()) {
            case "help":
                // Show help
                break;
            case "balance":
                // Show balance
                break;
            // Add more subcommands as needed
            default:
                player.sendMessage("Unknown subcommand. Use /gensop help for a list of commands.");
        }

        return true;
    }
}