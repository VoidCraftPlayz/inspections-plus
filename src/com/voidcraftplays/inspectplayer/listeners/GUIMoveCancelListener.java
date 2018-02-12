package com.voidcraftplays.inspectplayer.listeners;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import com.voidcraftplays.inspectplayer.Main;

public class GUIMoveCancelListener implements Listener {
	
	private Main main;
	
	public GUIMoveCancelListener(Main main) {
		this.main = main;
	}
	
	@EventHandler
	public void guiMove(InventoryClickEvent e) {
		
		Player player = (Player) e.getWhoClicked();
		ItemStack air = new ItemStack(Material.AIR);
		
		if (main.inspectingPlayer.containsKey(player)) {
			
			Player inspecting = main.inspectingPlayer.get(player);
			String inspectingName = inspecting.getDisplayName();
			
			if (ChatColor.translateAlternateColorCodes('&', e.getClickedInventory().getTitle()).equals(ChatColor.GREEN + "Manage this player")) {
				
				if (e.getCurrentItem() != null || e.getCurrentItem() != air) {
					
					e.setCancelled(true);
					
					switch (e.getCurrentItem().getType()) {
					case DIAMOND_BLOCK:
						
						main.openInspectedPlayerInventoryGUI.inspectedPlayerUI(player, inspecting);
						
						player.sendMessage(ChatColor.GOLD + "Showing " + inspectingName + ChatColor.GOLD + "'s Information & Inventory");
						
						break;
					case IRON_BLOCK:
						
						
						
						break;
					case REDSTONE_BLOCK:
						
						
						
						break;
					default:
						return;
					}
					
				}
				
			}
			
		}
		
	}
	
	@EventHandler
	public void onClick(InventoryClickEvent e) {
		
		Player player = (Player) e.getWhoClicked();
		ItemStack air = new ItemStack(Material.AIR);
		
		if (main.inspectingPlayer.containsKey(player)) {
			
			Player inspecting = main.inspectingPlayer.get(player);
			String inspectingName = inspecting.getDisplayName();
			
			if (ChatColor.translateAlternateColorCodes('&', e.getClickedInventory().getTitle()).equals(ChatColor.GOLD + inspectingName + "'s Inventory")) {
				
				if (e.getCurrentItem() != null || e.getCurrentItem() != air) {
					
					e.setCancelled(true);
					
				}
				
			}
			
		}
		
	}
	
}
