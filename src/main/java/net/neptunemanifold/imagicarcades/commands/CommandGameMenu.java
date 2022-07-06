package net.neptunemanifold.imagicarcades.commands;

import net.neptunemanifold.imagicarcades.utils.ItemMaker;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.event.inventory.InventoryType;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

public class CommandGameMenu implements CommandExecutor {

    public static Inventory gameMenu;
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if(sender instanceof Player){
            Player p = (Player) sender;

            gameMenu = Bukkit.createInventory(null, 27, "§cGame menu");

            ItemStack redGlass = ItemMaker.newItem(new ItemStack(Material.RED_STAINED_GLASS_PANE), " ");
            ItemStack imagicInvaders = ItemMaker.newItem(new ItemStack(Material.IRON_HOE), "Imagic Invaders", Enchantment.PROTECTION_ENVIRONMENTAL, 1);

            gameMenu.setItem(0, redGlass);
            gameMenu.setItem(1, redGlass);
            gameMenu.setItem(2, redGlass);
            gameMenu.setItem(3, redGlass);
            gameMenu.setItem(4, redGlass);
            gameMenu.setItem(5, redGlass);
            gameMenu.setItem(6, redGlass);
            gameMenu.setItem(7, redGlass);
            gameMenu.setItem(8, redGlass);
            gameMenu.setItem(9, redGlass);
            gameMenu.setItem(17, redGlass);
            gameMenu.setItem(18, redGlass);
            gameMenu.setItem(19, redGlass);
            gameMenu.setItem(20, redGlass);
            gameMenu.setItem(21, redGlass);
            gameMenu.setItem(22, redGlass);
            gameMenu.setItem(23, redGlass);
            gameMenu.setItem(24, redGlass);
            gameMenu.setItem(25, redGlass);
            gameMenu.setItem(26, redGlass);

            gameMenu.setItem(10, imagicInvaders);

            p.openInventory(gameMenu);
        } else {
            sender.sendMessage("Veuillez être un joueur pour éxécuter cette commande");
        }
        return true;
    }
}
