package xyz.roosterseatyou.mythologyrevamped;

import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.logging.Logger;

public final class MythologyRevamped extends JavaPlugin {
    private static Plugin instance;
    private static Logger logger;

    @Override
    public void onEnable() {
        instance = this;
        logger = getLogger();
        saveDefaultConfig();
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }

    public static Plugin getInstance() {
        return instance;
    }

    public static FileConfiguration config() {
        return instance.getConfig();
    }
}
