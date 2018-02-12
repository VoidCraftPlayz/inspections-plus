package com.voidcraftplays.inspectplayer.util;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import com.voidcraftplays.inspectplayer.Main;

public class PlayerUtilsUI {
	
	private Main main;
	
	public PlayerUtilsUI(Main main) {
		this.main = main;
	}
	
	public void inspectingPlayerUtils(Player player, Player inspecting) {
		
		String inspectingName = inspecting.getDisplayName();
		
		Inventory playerUtilsUI = Bukkit.createInventory(null, 27, ChatColor.GREEN + "Manage this player");
		
		ItemStack punish = new ItemStack(Material.REDSTONE_BLOCK);
		ItemMeta punishMeta = punish.getItemMeta();
		punishMeta.setDisplayName(ChatColor.GREEN + "Punish " + inspectingName);
		punish.setItemMeta(punishMeta);
		
		ItemStack info = new ItemStack(Material.DIAMOND_BLOCK);
		ItemMeta infoMeta = info.getItemMeta();
		infoMeta.setDisplayName(ChatColor.GREEN + "View " + inspectingName + ChatColor.GREEN + "'s Info & Inventory");
		info.setItemMeta(infoMeta);
		
		ItemStack manage = new ItemStack(Material.IRON_BLOCK);
		ItemMeta manageMeta = punish.getItemMeta();
		manageMeta.setDisplayName(ChatColor.GREEN + "Manage " + inspectingName);
		manage.setItemMeta(manageMeta);
		
		playerUtilsUI.setItem(10, punish);
		playerUtilsUI.setItem(13, info);
		playerUtilsUI.setItem(16, manage);
		
		player.openInventory(playerUtilsUI);
		
	}
	
}
