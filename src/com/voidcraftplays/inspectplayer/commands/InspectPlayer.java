package com.voidcraftplays.inspectplayer.commands;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.World.Spigot;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import com.voidcraftplays.inspectplayer.Main;

public class InspectPlayer implements CommandExecutor {
	
	private Main main;
	
	public InspectPlayer(Main main) {
		this.main = main;
	}
	
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		
		Player player = (Player) sender;
		
		if (player.hasPermission("inspection.inspect")) {
		
			if (args.length == 1) {
					
					if (Bukkit.getServer().getPlayer(args[0]).isOnline()) {
						
						Player targetPlayer = Bukkit.getServer().getPlayer(args[0]);					
						
						String targetName = targetPlayer.getDisplayName();
						Location targetLocation = targetPlayer.getLocation();
						
						player.sendMessage(ChatColor.GOLD + "You have started inspecting " + ChatColor.GREEN + targetName);
						player.teleport(targetLocation);
						main.inspectingPlayer.put(player, targetPlayer);
						
						for(Player allPlayers : main.getServer().getOnlinePlayers()) {
							
						    allPlayers.hidePlayer(player);
						    
						}
						
					} else {
						
						player.sendMessage(ChatColor.RED + "That player is not online!");
						
					}
				
			} else {
				
				player.sendMessage(ChatColor.RED + "You need to specify a player!");
				
			}
			
		}
		
		return false;
	}
	
}

	
