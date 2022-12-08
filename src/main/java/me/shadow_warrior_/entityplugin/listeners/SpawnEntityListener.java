package me.shadow_warrior_.entityplugin.listeners;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.World;
import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.IronGolem;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;

public class SpawnEntityListener implements Listener {

    @EventHandler
    public void onClickListener(PlayerInteractEvent e) {
        Player p = e.getPlayer();
        World World = p.getWorld();
        if (p.getItemInHand().getType().equals(Material.STICK) && e.getAction() == Action.RIGHT_CLICK_BLOCK && p.isSneaking()) {
            IronGolem entity = (IronGolem) Bukkit.getWorld(World.getUID()).spawnEntity(p.getEyeLocation(), EntityType.IRON_GOLEM);
            entity.setCustomName("Janusz");
            entity.setCustomNameVisible(true);
            if (p.getItemInHand().getType().equals(Material.STICK) && e.getAction() == Action.RIGHT_CLICK_BLOCK) entity.teleport(p.getLocation());

        }
    }
}
