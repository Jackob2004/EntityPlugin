package me.shadow_warrior_.entityplugin;

import me.shadow_warrior_.entityplugin.commands.EntityCommand;
import me.shadow_warrior_.entityplugin.listeners.EntityTargetListener;
import org.bukkit.plugin.java.JavaPlugin;

public final class EntityPlugin extends JavaPlugin {

    @Override
    public void onEnable() {
       getCommand("entity").setExecutor(new EntityCommand());
       getServer().getPluginManager().registerEvents(new EntityTargetListener(),this);

    }
}
