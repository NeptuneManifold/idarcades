package net.neptunemanifold.imagicarcades;

import net.neptunemanifold.imagicarcades.commands.CommandGameMenu;
import net.neptunemanifold.imagicarcades.commands.CommandGiveCoin;
import net.neptunemanifold.imagicarcades.listeners.InventoryClickListener;
import net.neptunemanifold.imagicarcades.utils.ItemMaker;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.plugin.java.JavaPlugin;

public final class Main extends JavaPlugin {

    public static ItemStack coin;

    @Override
    public void onEnable() {

        coin = ItemMaker.newItem(new ItemStack(Material.GOLD_NUGGET), "Imagic Coin");

        getCommand("gamemenu").setExecutor(new CommandGameMenu());
        getCommand("givecoin").setExecutor(new CommandGiveCoin());

        getServer().getPluginManager().registerEvents(new InventoryClickListener(), this);
    }

    @Override
    public void onDisable() {
    }
}
