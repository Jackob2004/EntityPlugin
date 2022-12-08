package me.shadow_warrior_.entityplugin.listeners;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityTargetLivingEntityEvent;
import org.bukkit.potion.PotionEffectType;

public class EntityTargetListener implements Listener {

    @EventHandler
    public void entityTarget(EntityTargetLivingEntityEvent e){
        Player player = (Player) e.getTarget();
        if(player.hasPotionEffect(PotionEffectType.NIGHT_VISION)) e.setCancelled(true);
    }
}
