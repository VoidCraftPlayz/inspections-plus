package com.voidcraftplays.inspectplayer.util;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.GameMode;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import com.voidcraftplays.inspectplayer.Main;

public class ManagePlayerUI {
	
	private Main main;
	
	public ManagePlayerUI(Main main) {
		this.main = main;
	}
	
	public void manageUI(Player player, Player inspecting) {
		
		String inspectingName = inspecting.getDisplayName();
		
		Inventory manage = Bukkit.createInventory(null, 27, ChatColor.YELLOW + "Manage " + inspectingName);
		
		ItemStack launch = new ItemStack(Material.FEATHER);
		ItemMeta launchMeta = launch.getItemMeta();
		launchMeta.setDisplayName(ChatColor.RED + "Launch " + inspectingName + " into the air!");
		launch.setItemMeta(launchMeta);
		
		ItemStack swapgamemode = new ItemStack(Material.EMERALD_BLOCK);
		ItemMeta swapGMeta = swapgamemode.getItemMeta();
		swapGMeta.setDisplayName(ChatColor.YELLOW + "Swap gamemode");
		swapgamemode.setItemMeta(swapGMeta);
		
		switch (inspecting.getGameMode()) {
		case CREATIVE:
			swapgamemode.setType(Material.EMERALD_BLOCK);
			break;
		case SURVIVAL:
			swapgamemode.setType(Material.LAPIS_BLOCK);
			break;
		case ADVENTURE:
			swapgamemode.setType(Material.GOLD_BLOCK);
			break;
		case SPECTATOR:
			swapgamemode.setType(Material.REDSTONE_BLOCK);
			break;
		default:
			return;
		}
		
	}
	
}
