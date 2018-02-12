package com.voidcraftplays.inspectplayer.util;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;

import com.voidcraftplays.inspectplayer.Main;

public class TempbanPlayerUI {
	
	private Main main;
	
	public TempbanPlayerUI(Main main) {
		this.main = main;
	}
	
	public void manageUI(Player player, Player inspecting) {
		
		String inspectingName = inspecting.getDisplayName();
		
		Inventory manage = Bukkit.createInventory(null, 27, ChatColor.YELLOW + "Manage " + inspectingName);
		
		
		
	}
}
