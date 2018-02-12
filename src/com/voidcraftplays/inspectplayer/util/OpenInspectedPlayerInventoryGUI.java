package com.voidcraftplays.inspectplayer.util;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import com.voidcraftplays.inspectplayer.Main;

public class OpenInspectedPlayerInventoryGUI {
	
	private Main main;
	ItemStack air = new ItemStack(Material.AIR);
	
	public OpenInspectedPlayerInventoryGUI(Main main) {
		this.main = main;
	}
	
	public void inspectedPlayerUI(Player player, Player targetPlayer) {
		
		String targetPlayerName = targetPlayer.getDisplayName();
		
		Inventory playerInventory = Bukkit.createInventory(null, 54, ChatColor.GOLD + targetPlayerName + "'s Inventory");
		
		ItemStack seperate = new ItemStack(Material.STAINED_GLASS_PANE);
		ItemMeta seperateMeta = seperate.getItemMeta();
		seperateMeta.setDisplayName(ChatColor.RED + targetPlayerName + ChatColor.RED + "'s Inventory");
		seperate.setItemMeta(seperateMeta);
		
		ItemStack health = new ItemStack(Material.EMERALD);
		ItemMeta healthMeta = health.getItemMeta();
		healthMeta.setDisplayName(ChatColor.GREEN + "Health: " + targetPlayer.getHealth());
		health.setItemMeta(healthMeta);
		
		ItemStack hunger = new ItemStack(Material.DIAMOND);
		ItemMeta hungerMeta = hunger.getItemMeta();
		hungerMeta.setDisplayName(ChatColor.RED + "Hunger: " + targetPlayer.getSaturation());
		hunger.setItemMeta(hungerMeta);
		
		ItemStack gamemode = new ItemStack(Material.EMERALD_BLOCK);
		ItemMeta gamemodeMeta = gamemode.getItemMeta();
		gamemodeMeta.setDisplayName(ChatColor.YELLOW + "Gamemode: " + targetPlayer.getGameMode());
		gamemode.setItemMeta(gamemodeMeta);
		
		playerInventory.setItem(53, hunger);
		playerInventory.setItem(52, health);
		playerInventory.setItem(51, gamemode);
		
		if (targetPlayer.getInventory().getItem(0) != air) {
			playerInventory.setItem(0, targetPlayer.getInventory().getItem(0));
			}
		if (targetPlayer.getInventory().getItem(1) != air) {
			playerInventory.setItem(1, targetPlayer.getInventory().getItem(1));
			}
		if (targetPlayer.getInventory().getItem(2) != air) {
			playerInventory.setItem(2, targetPlayer.getInventory().getItem(2));
			}
		if (targetPlayer.getInventory().getItem(3) != air) {
			playerInventory.setItem(3, targetPlayer.getInventory().getItem(3));
			}
		if (targetPlayer.getInventory().getItem(4) != air) {
			playerInventory.setItem(4, targetPlayer.getInventory().getItem(4));
			}
		if (targetPlayer.getInventory().getItem(5) != air) {
			playerInventory.setItem(5, targetPlayer.getInventory().getItem(5));
			}
		if (targetPlayer.getInventory().getItem(6) != air) {
			playerInventory.setItem(6, targetPlayer.getInventory().getItem(6));
			}
		if (targetPlayer.getInventory().getItem(7) != air) {
			playerInventory.setItem(7, targetPlayer.getInventory().getItem(7));
			}
		if (targetPlayer.getInventory().getItem(8) != air) {
			playerInventory.setItem(8, targetPlayer.getInventory().getItem(8));
			}
		if (targetPlayer.getInventory().getItem(9) != air) {
			playerInventory.setItem(9, targetPlayer.getInventory().getItem(9));
			}
		if (targetPlayer.getInventory().getItem(10) != air) {
			playerInventory.setItem(10, targetPlayer.getInventory().getItem(10));
			}
		if (targetPlayer.getInventory().getItem(11) != air) {
			playerInventory.setItem(11, targetPlayer.getInventory().getItem(11));
			}
		if (targetPlayer.getInventory().getItem(12) != air) {
			playerInventory.setItem(12, targetPlayer.getInventory().getItem(12));
			}
		if (targetPlayer.getInventory().getItem(13) != air) {
			playerInventory.setItem(13, targetPlayer.getInventory().getItem(13));
			}
		if (targetPlayer.getInventory().getItem(14) != air) {
			playerInventory.setItem(14, targetPlayer.getInventory().getItem(14));
			}
		if (targetPlayer.getInventory().getItem(15) != air) {
			playerInventory.setItem(15, targetPlayer.getInventory().getItem(15));
			}
		if (targetPlayer.getInventory().getItem(16) != air) {
			playerInventory.setItem(16, targetPlayer.getInventory().getItem(16));
			}
		if (targetPlayer.getInventory().getItem(17) != air) {
			playerInventory.setItem(17, targetPlayer.getInventory().getItem(17));
			}
		if (targetPlayer.getInventory().getItem(18) != air) {
			playerInventory.setItem(18, targetPlayer.getInventory().getItem(18));
			}
		if (targetPlayer.getInventory().getItem(19) != air) {
			playerInventory.setItem(19, targetPlayer.getInventory().getItem(19));
			}
		if (targetPlayer.getInventory().getItem(20) != air) {
			playerInventory.setItem(20, targetPlayer.getInventory().getItem(20));
			}
		if (targetPlayer.getInventory().getItem(21) != air) {
			playerInventory.setItem(21, targetPlayer.getInventory().getItem(21));
			}
		if (targetPlayer.getInventory().getItem(22) != air) {
			playerInventory.setItem(22, targetPlayer.getInventory().getItem(22));
			}
		if (targetPlayer.getInventory().getItem(23) != air) {
			playerInventory.setItem(23, targetPlayer.getInventory().getItem(23));
			}
		if (targetPlayer.getInventory().getItem(24) != air) {
			playerInventory.setItem(24, targetPlayer.getInventory().getItem(24));
			}
		if (targetPlayer.getInventory().getItem(25) != air) {
			playerInventory.setItem(25, targetPlayer.getInventory().getItem(25));
			}
		if (targetPlayer.getInventory().getItem(26) != air) {
			playerInventory.setItem(26, targetPlayer.getInventory().getItem(26));
			}
		if (targetPlayer.getInventory().getItem(27) != air) {
			playerInventory.setItem(27, targetPlayer.getInventory().getItem(27));
			}
		if (targetPlayer.getInventory().getItem(28) != air) {
			playerInventory.setItem(28, targetPlayer.getInventory().getItem(28));
			}
		if (targetPlayer.getInventory().getItem(29) != air) {
			playerInventory.setItem(29, targetPlayer.getInventory().getItem(29));
			}
		if (targetPlayer.getInventory().getItem(30) != air) {
			playerInventory.setItem(30, targetPlayer.getInventory().getItem(30));
			}
		if (targetPlayer.getInventory().getItem(31) != air) {
			playerInventory.setItem(31, targetPlayer.getInventory().getItem(31));
			}
		if (targetPlayer.getInventory().getItem(32) != air) {
			playerInventory.setItem(32, targetPlayer.getInventory().getItem(32));
			}
		if (targetPlayer.getInventory().getItem(33) != air) {
			playerInventory.setItem(33, targetPlayer.getInventory().getItem(33));
			}
		if (targetPlayer.getInventory().getItem(34) != air) {
			playerInventory.setItem(34, targetPlayer.getInventory().getItem(34));
			}
		if (targetPlayer.getInventory().getItem(35) != air) {
			playerInventory.setItem(35, targetPlayer.getInventory().getItem(35));
			}
		if (targetPlayer.getInventory().getItem(45) != air) {
			playerInventory.setItem(45, targetPlayer.getInventory().getHelmet());
			}
		if (targetPlayer.getInventory().getItem(46) != air) {
			playerInventory.setItem(46, targetPlayer.getInventory().getChestplate());
			}
		if (targetPlayer.getInventory().getItem(47) != air) {
			playerInventory.setItem(47, targetPlayer.getInventory().getLeggings());
			}
		if (targetPlayer.getInventory().getItem(48) != air) {
			playerInventory.setItem(48, targetPlayer.getInventory().getBoots());
			}
		
		playerInventory.setItem(36, seperate);
		playerInventory.setItem(37, seperate);
		playerInventory.setItem(38, seperate);
		playerInventory.setItem(39, seperate);
		playerInventory.setItem(40, seperate);
		playerInventory.setItem(41, seperate);
		playerInventory.setItem(42, seperate);
		playerInventory.setItem(43, seperate);
		playerInventory.setItem(44, seperate);
		
		player.openInventory(playerInventory);
		
	}
	
}
