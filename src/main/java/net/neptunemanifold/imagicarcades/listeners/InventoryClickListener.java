package net.neptunemanifold.imagicarcades.listeners;

import net.neptunemanifold.imagicarcades.Main;
import net.neptunemanifold.imagicarcades.commands.CommandGameMenu;
import net.neptunemanifold.imagicarcades.utils.ItemMaker;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.inventory.InventoryType;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

import java.util.Random;

public class InventoryClickListener implements Listener {
    public static Inventory imagicInvadersGameTitle;
    public static Inventory imagicInvadersGameEasy;
    public static Inventory imagicInvadersGameMedium;
    public static Inventory imagicInvadersGameHard;
    public static Inventory imagicInvadersGameDiff;

    private ItemStack Alien;
    private ItemStack fakeAlien;

    private int alienShot = 0;
    @EventHandler
    public void onInventoryClick(InventoryClickEvent e){
        Inventory inv = e.getClickedInventory();
        Player p = (Player) e.getWhoClicked();
        ItemStack is = e.getCurrentItem();
        if(inv != null){
        if(inv.equals(CommandGameMenu.gameMenu)){
            switch (e.getSlot()) {
                case 10: {
                    e.setCancelled(true);
                    imagicInvadersGameTitle = Bukkit.createInventory(null, InventoryType.BARREL, "§1Imagic Invaders");

                    ItemStack redGlass = ItemMaker.newItem(new ItemStack(Material.RED_STAINED_GLASS_PANE), " ");
                    ItemStack gameStart = ItemMaker.newItem(new ItemStack(Material.LIME_DYE), "Commencer le jeu");
                    ItemStack gameRules = ItemMaker.newItem(new ItemStack(Material.PAPER), "Comment jouer ?");

                    imagicInvadersGameTitle.setItem(0, redGlass);
                    imagicInvadersGameTitle.setItem(1, redGlass);
                    imagicInvadersGameTitle.setItem(2, redGlass);
                    imagicInvadersGameTitle.setItem(3, redGlass);
                    imagicInvadersGameTitle.setItem(4, redGlass);
                    imagicInvadersGameTitle.setItem(5, redGlass);
                    imagicInvadersGameTitle.setItem(6, redGlass);
                    imagicInvadersGameTitle.setItem(7, redGlass);
                    imagicInvadersGameTitle.setItem(8, redGlass);
                    imagicInvadersGameTitle.setItem(9, redGlass);
                    imagicInvadersGameTitle.setItem(17, redGlass);
                    imagicInvadersGameTitle.setItem(18, redGlass);
                    imagicInvadersGameTitle.setItem(19, redGlass);
                    imagicInvadersGameTitle.setItem(20, redGlass);
                    imagicInvadersGameTitle.setItem(21, redGlass);
                    imagicInvadersGameTitle.setItem(22, redGlass);
                    imagicInvadersGameTitle.setItem(23, redGlass);
                    imagicInvadersGameTitle.setItem(24, redGlass);
                    imagicInvadersGameTitle.setItem(25, redGlass);
                    imagicInvadersGameTitle.setItem(26, redGlass);

                    imagicInvadersGameTitle.setItem(10, gameStart);
                    imagicInvadersGameTitle.setItem(16, gameRules);

                    p.openInventory(imagicInvadersGameTitle);
                    break;
                }
                default: {
                    e.setCancelled(true);
                    break;
                }
            }
        } else if(inv.equals(imagicInvadersGameTitle)){
            switch (e.getSlot()){
                case 10:{
                    e.setCancelled(true);
                    if(imagicInvadersGameDiff == null){
                        imagicInvadersGameDiff = Bukkit.createInventory(null, InventoryType.BARREL, "§cChoisissez un niveau de difficulté");
                    }
                    if(imagicInvadersGameDiff.getViewers().isEmpty()){
                        ItemStack redGlass = ItemMaker.newItem(new ItemStack(Material.RED_STAINED_GLASS_PANE), " ");
                        ItemStack facile = ItemMaker.newItem(new ItemStack(Material.LIME_WOOL), "facile");
                        ItemStack moyen = ItemMaker.newItem(new ItemStack(Material.ORANGE_WOOL), "moyen");
                        ItemStack hard = ItemMaker.newItem(new ItemStack(Material.RED_WOOL), "difficile");

                        imagicInvadersGameDiff.setItem(0, redGlass);
                        imagicInvadersGameDiff.setItem(1, redGlass);
                        imagicInvadersGameDiff.setItem(2, redGlass);
                        imagicInvadersGameDiff.setItem(3, redGlass);
                        imagicInvadersGameDiff.setItem(4, redGlass);
                        imagicInvadersGameDiff.setItem(5, redGlass);
                        imagicInvadersGameDiff.setItem(6, redGlass);
                        imagicInvadersGameDiff.setItem(7, redGlass);
                        imagicInvadersGameDiff.setItem(8, redGlass);
                        imagicInvadersGameDiff.setItem(9, redGlass);
                        imagicInvadersGameDiff.setItem(17, redGlass);
                        imagicInvadersGameDiff.setItem(18, redGlass);
                        imagicInvadersGameDiff.setItem(19, redGlass);
                        imagicInvadersGameDiff.setItem(20, redGlass);
                        imagicInvadersGameDiff.setItem(21, redGlass);
                        imagicInvadersGameDiff.setItem(22, redGlass);
                        imagicInvadersGameDiff.setItem(23, redGlass);
                        imagicInvadersGameDiff.setItem(24, redGlass);
                        imagicInvadersGameDiff.setItem(25, redGlass);
                        imagicInvadersGameDiff.setItem(26, redGlass);

                        imagicInvadersGameDiff.setItem(10, facile);
                        imagicInvadersGameDiff.setItem(13, moyen);
                        imagicInvadersGameDiff.setItem(16, hard);

                        p.openInventory(imagicInvadersGameDiff);
                    } else {
                        p.closeInventory();
                        p.sendMessage(ChatColor.AQUA + "Une partie est déjà en cours attendez votre tours");
                    }
                    break;
                }
                case 16:{
                    e.setCancelled(true);
                    p.closeInventory();
                    p.sendMessage(ChatColor.AQUA + "Comment jouer à Imagic Invaders ?");
                    p.sendMessage(ChatColor.AQUA + "Il suffit de cliquer sur les aliens avant qu'il ne soit complètement tombés");
                    p.sendMessage(ChatColor.AQUA + "Il y a 3 difficultés");
                    p.sendMessage(ChatColor.AQUA + "Facile: 2 Imagic Coins");
                    p.sendMessage(ChatColor.AQUA + "Moyen : 3 Imagic Coins");
                    p.sendMessage(ChatColor.AQUA + "Difficile : 4 Imagic Coins");
                    p.sendMessage(ChatColor.AQUA + "Chaques parties coutent 1 Imagic Coins et ne sera pas remboursé en cas de défaite");
                    break;
                }
                default:{
                    e.setCancelled(true);
                    break;
                }
            }
        } else if(inv.equals(imagicInvadersGameDiff)){
            switch (e.getSlot()){
                case 10:{
                    e.setCancelled(true);
                    if(p.getInventory().contains(Main.coin.getType())){
                        p.getInventory().removeItem(Main.coin);
                        p.closeInventory();
                        if(imagicInvadersGameEasy == null){
                            imagicInvadersGameEasy = Bukkit.createInventory(null, InventoryType.BARREL, "§1Imagic Invaders");
                        }
                        if(imagicInvadersGameEasy.getViewers().isEmpty()){
                            Alien = ItemMaker.newItem(new ItemStack(Material.IRON_SWORD), "§2Alien", Enchantment.PROTECTION_ENVIRONMENTAL, 2);
                            Random ran = new Random();
                            int maxslot = 26;

                            imagicInvadersGameEasy.setItem(ran.nextInt(maxslot), Alien);

                            p.openInventory(imagicInvadersGameEasy);
                        } else {
                            p.closeInventory();
                            p.sendMessage(ChatColor.AQUA + "Une partie est déjà en cours attendez votre tours");
                        }
                    } else {
                        p.closeInventory();
                        p.sendMessage(ChatColor.RED + "Vous n'avez pas assez d'Imagic Coin pour jouer a ce jeu");
                    }
                    break;
                }
                case 13:{
                    e.setCancelled(true);
                    if(p.getInventory().contains(Main.coin.getType())){
                        p.getInventory().removeItem(Main.coin);
                        p.closeInventory();
                        if(imagicInvadersGameMedium==null){
                            imagicInvadersGameMedium = Bukkit.createInventory(null, InventoryType.BARREL, "§1Imagic Invaders");
                        }
                        if(imagicInvadersGameMedium.getViewers().isEmpty()){
                            Alien = ItemMaker.newItem(new ItemStack(Material.IRON_SWORD), "§2Alien", Enchantment.PROTECTION_ENVIRONMENTAL, 2);
                            fakeAlien = ItemMaker.newItem(new ItemStack(Material.IRON_SWORD), "§4Astériode", Enchantment.PROTECTION_ENVIRONMENTAL, 3);
                            Random ran = new Random();
                            int maxslot = 26;
                            int slot = ran.nextInt(maxslot);
                            imagicInvadersGameMedium.setItem(slot, Alien);
                            int slot2 = ran.nextInt(maxslot);
                            if(slot2 == slot){
                                slot2 = ran.nextInt(maxslot);
                            }
                            imagicInvadersGameMedium.setItem(slot2, fakeAlien);
                            p.openInventory(imagicInvadersGameMedium);
                        } else {
                            p.closeInventory();
                            p.sendMessage(ChatColor.AQUA + "Une partie est déjà en cours attendez votre tours");
                        }
                    } else {
                        p.closeInventory();
                        p.sendMessage(ChatColor.RED + "Vous n'avez pas assez d'Imagic Coin pour jouer a ce jeu");
                    }
                }
                case 16:{
                    e.setCancelled(true);
                    if(p.getInventory().contains(Main.coin.getType())){
                        p.getInventory().removeItem(Main.coin);
                        p.closeInventory();
                        if(imagicInvadersGameHard==null){
                            imagicInvadersGameHard = Bukkit.createInventory(null, InventoryType.BARREL, "§1Imagic Invaders");
                        }
                        if(imagicInvadersGameHard.getViewers().isEmpty()){
                            Alien = ItemMaker.newItem(new ItemStack(Material.IRON_SWORD), "§2Alien", Enchantment.PROTECTION_ENVIRONMENTAL, 2);
                            fakeAlien = ItemMaker.newItem(new ItemStack(Material.IRON_SWORD), "§4Astériode", Enchantment.PROTECTION_ENVIRONMENTAL, 3);
                            Random ran = new Random();
                            int maxslot = 26;
                            int slot = ran.nextInt(maxslot);
                            imagicInvadersGameHard.setItem(slot, Alien);
                            int slot2 = ran.nextInt(maxslot);
                            int slot3 = ran.nextInt(maxslot);
                            if(slot2 == slot ||slot3 == slot2){
                                slot2 = ran.nextInt(maxslot);
                            }
                            imagicInvadersGameHard.setItem(slot2, fakeAlien);
                            imagicInvadersGameHard.setItem(slot3, fakeAlien);
                            p.openInventory(imagicInvadersGameHard);
                        } else {
                            p.closeInventory();
                            p.sendMessage(ChatColor.AQUA + "Une partie est déjà en cours attendez votre tours");
                        }
                    } else {
                        p.closeInventory();
                        p.sendMessage(ChatColor.RED + "Vous n'avez pas assez d'Imagic Coin pour jouer a ce jeu");
                    }
                }
                default:{
                    e.setCancelled(true);
                    break;
                }
            }
        } else if(inv.equals(imagicInvadersGameEasy)){
            e.setCancelled(true);
            if(is == null) return;
            if(is.equals(Alien)){
                int totalAlien = 20;
                if(alienShot < totalAlien){
                    alienShot = alienShot + 1;
                    int slot = e.getSlot();

                    imagicInvadersGameEasy.setItem(slot, null);
                    Random ran = new Random();
                    int maxslot = 26;

                    imagicInvadersGameEasy.setItem(ran.nextInt(maxslot), Alien);
                    p.updateInventory();
                } else {
                    p.closeInventory();
                    int slot = e.getSlot();
                    imagicInvadersGameEasy.setItem(slot, null);
                    p.sendMessage(ChatColor.AQUA + "Félicitation vous remportez 2 Imagic Coins !");
                    p.getInventory().addItem(Main.coin);
                    p.getInventory().addItem(Main.coin);
                    alienShot = 0;
                }
            }
        } else if(inv.equals(imagicInvadersGameMedium)){
            e.setCancelled(true);
            if(is == null) return;
            if(is.equals(Alien)){
                int totalAlien = 20;
                if(alienShot < totalAlien){
                    alienShot = alienShot + 1;
                    int slot = e.getSlot();

                    imagicInvadersGameMedium.setItem(slot, null);
                    Random ran = new Random();
                    int maxslot = 26;

                    imagicInvadersGameMedium.setItem(ran.nextInt(maxslot), Alien);
                    imagicInvadersGameMedium.setItem(ran.nextInt(maxslot), fakeAlien);
                    p.updateInventory();
                } else {
                    inv.clear();
                    p.closeInventory();
                    p.sendMessage(ChatColor.AQUA + "Félicitation vous remportez 3 Imagic Coins !");
                    p.getInventory().addItem(Main.coin);
                    p.getInventory().addItem(Main.coin);
                    p.getInventory().addItem(Main.coin);
                    alienShot = 0;
                }
            } else if(is.equals(fakeAlien)){
                alienShot = 0;
                inv.clear();
                p.closeInventory();
                p.sendMessage(ChatColor.AQUA + "Vous avez touché un astéroide perdu !");
            }
        } else if(inv.equals(imagicInvadersGameHard)){
            e.setCancelled(true);
            if(is == null) return;
            if(is.equals(Alien)){
                int totalAlien = 20;
                if(alienShot < totalAlien){
                    alienShot = alienShot + 1;
                    int slot = e.getSlot();

                    imagicInvadersGameHard.setItem(slot, null);
                    Random ran = new Random();
                    int maxslot = 26;
                    imagicInvadersGameHard.setItem(ran.nextInt(maxslot), fakeAlien);
                    imagicInvadersGameHard.setItem(ran.nextInt(maxslot), fakeAlien);
                    imagicInvadersGameHard.setItem(ran.nextInt(maxslot), Alien);
                    p.updateInventory();
                } else {
                    inv.clear();
                    p.closeInventory();
                    p.sendMessage(ChatColor.AQUA + "Félicitation vous remportez 4 Imagic Coins !");
                    p.getInventory().addItem(Main.coin);
                    p.getInventory().addItem(Main.coin);
                    p.getInventory().addItem(Main.coin);
                    p.getInventory().addItem(Main.coin);
                    alienShot = 0;
                }
            } else if(is.equals(fakeAlien)){
                alienShot = 0;
                inv.clear();
                p.closeInventory();
                p.sendMessage(ChatColor.AQUA + "Vous avez touché un astéroide perdu !");
            }
        }
        }
    }
}
