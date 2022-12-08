package me.shadow_warrior_.entityplugin.commands;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.*;

public class EntityCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        Player p = (Player) sender;

        Zombie entity = (Zombie) Bukkit.getWorld("world").spawnEntity(p.getEyeLocation(),EntityType.ZOMBIE);
        entity.setCustomName("Janusz");
        entity.setCustomNameVisible(true);
        entity.setVillager(true);
        return true;
    }
}
