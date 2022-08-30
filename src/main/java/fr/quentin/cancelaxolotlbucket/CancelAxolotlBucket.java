package fr.quentin.cancelaxolotlbucket;

import org.bukkit.entity.Axolotl;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerBucketEntityEvent;
import org.bukkit.plugin.java.JavaPlugin;

public final class CancelAxolotlBucket extends JavaPlugin {

    @Override
    public void onEnable() {

        getServer().getPluginManager().registerEvents(new Listener() {
            @EventHandler(priority = EventPriority.LOWEST)
            public void on(PlayerBucketEntityEvent event) {
                if (event.getEntity() instanceof Axolotl) {
                    event.setCancelled(true);
                }
            }
        }, this);

    }

}
