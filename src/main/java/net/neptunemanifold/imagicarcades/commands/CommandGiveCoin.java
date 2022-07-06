package net.neptunemanifold.imagicarcades.commands;

import net.neptunemanifold.imagicarcades.Main;
import net.neptunemanifold.imagicarcades.utils.ItemMaker;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

public class CommandGiveCoin implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if(sender instanceof Player){
            Player p = (Player) sender;
            if(args.length != 1){
                p.sendMessage("Utilisation: /givecoin <nombre>");
            } else {
                int nombre = Integer.parseInt(args[0].replaceAll("[^\\d.]", ""));
                for(int i =0; i < nombre; i++){
                    p.getInventory().addItem(Main.coin);
                }
            }
        }
        return true;
    }
}
