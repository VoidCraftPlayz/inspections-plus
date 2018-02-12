package com.voidcraftplays.inspectplayer.util;

import org.bukkit.entity.Player;

import com.voidcraftplays.inspectplayer.Main;

public class StopInspection {
	
	private Main main;
	
	public StopInspection(Main main) {
		this.main = main;
	}
	
	public void stopInspection(Player player) {
		
		if (main.inspectingPlayer.containsKey(player)) {
			
			for(Player allPlayers : main.getServer().getOnlinePlayers()) {
				
			    player.showPlayer(main, allPlayers);
			    
			}
			
		}
		
	}
	
}
