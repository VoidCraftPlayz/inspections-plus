package com.voidcraftplays.inspectplayer.commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import com.voidcraftplays.inspectplayer.Main;

public class OpenInspectedPlayersInventory implements CommandExecutor {
	
	private Main main;
	
	public OpenInspectedPlayersInventory(Main main) {
		this.main = main;
	}
	
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		
		Player player = (Player) sender;
		
		if (player.hasPermission("inspection.getinfo")) {
		
			if (main.inspectingPlayer.containsKey(player)) {
				
				Player targetPlayer = main.inspectingPlayer.get(player);
				String targetPlayerName = targetPlayer.getDisplayName();
				
				player.sendMessage(ChatColor.GOLD + "Showing " + targetPlayerName + ChatColor.GOLD + "'s Information & Inventory");
				
				main.openInspectedPlayerInventoryGUI.inspectedPlayerUI(player, targetPlayer);
				
			} else {
				
				player.sendMessage(ChatColor.RED + "You need to be inspecting a player to use this command! /inspect");
				
			}
			
		}
		
		return false;
	}
	
}
