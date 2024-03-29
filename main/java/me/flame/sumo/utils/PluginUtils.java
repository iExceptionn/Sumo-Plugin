package me.flame.sumo.utils;

import org.bukkit.Bukkit;
import org.bukkit.plugin.Plugin;

public class PluginUtils {

    public static void restartPlugin(Plugin plugin) {
        if (plugin != null && plugin.isEnabled()) {
            Bukkit.getPluginManager().disablePlugin(plugin);
        }
        if (plugin != null && !plugin.isEnabled()) {
            Bukkit.getPluginManager().enablePlugin(plugin);
        }
    }
}
