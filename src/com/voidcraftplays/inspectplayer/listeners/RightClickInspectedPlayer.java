package com.voidcraftplays.inspectplayer.listeners;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.entity.Zombie;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEntityEvent;

import com.voidcraftplays.inspectplayer.Main;

public class RightClickInspectedPlayer implements Listener {
	
	private Main main;
	
	public RightClickInspectedPlayer(Main main) {
		this.main = main;
	}
	
	@EventHandler
	public void onRightClick(PlayerInteractEntityEvent e) {
		
		Player player = e.getPlayer();
		Entity entityClicked = e.getRightClicked();
		
		if (player.hasPermission("inspection.getinfo")) {
		
			if (main.inspectingPlayer.containsKey(player)) {
				
				Player inspecting = main.inspectingPlayer.get(player);
				String inspectingName = inspecting.getDisplayName();
				
				if (entityClicked.equals(inspecting)) {
					
					player.sendMessage(ChatColor.GOLD + "Showing " + inspectingName + ChatColor.GOLD + "'s Information & Inventory");
					
					main.playerUtilsUI.inspectingPlayerUtils(player, inspecting);
					
				} else {
					
					player.sendMessage(ChatColor.RED + "You can only show the info of whoever your inspecting!");
					
				}
				
			} else {
				
				
				
			}
			
		}
		
	}
	
}
