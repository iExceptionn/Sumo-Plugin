package me.flame.sumo.commands;

import me.flame.sumo.Core;
import me.flame.sumo.commands.base.CommandBase;
import me.flame.sumo.utils.ChatUtils;
import org.bukkit.command.CommandSender;
import org.bukkit.plugin.PluginDescriptionFile;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

public class AboutCommand extends CommandBase {

    public AboutCommand() {
        super("about", "All information about the plugin", "", 0, 0);
    }

    @Override
    public void run(CommandSender sender, String[] args) throws NotImplementedException {
        PluginDescriptionFile plugin = Core.getInstance().getDescription();

        sender.sendMessage(ChatUtils.format("              &8[&3Sumo Plugin&8]"));
        sender.sendMessage(ChatUtils.format("    &7&o( All plugin information )"));
        sender.sendMessage("");
        sender.sendMessage(ChatUtils.format("&b&l * &7Name: &f" + plugin.getName()));
        sender.sendMessage(ChatUtils.format("&b&l * &7Author(s): &f" + plugin.getAuthors()).replaceAll("[\\[\\]]", ""));
        sender.sendMessage(ChatUtils.format("&b&l * &7Version: &f" + plugin.getVersion()));
        sender.sendMessage(ChatUtils.format("&b&l * &7Description: &f" + plugin.getDescription()));
        sender.sendMessage("");
        sender.sendMessage(ChatUtils.format("              &8[&3Sumo Plugin&8]"));
    }
}
