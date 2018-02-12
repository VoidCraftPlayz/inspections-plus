package com.voidcraftplays.inspectplayer.listeners;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

import com.voidcraftplays.inspectplayer.Main;

public class PlayerJoinListener implements Listener {
	
	private Main main;
	
	public PlayerJoinListener(Main main) {
		this.main = main;
	}
	
	@EventHandler(priority = EventPriority.HIGH)
	public void onJoin(PlayerJoinEvent e) {
		
		for(int i = 0; i <= main.inspectingPlayer.size(); i++) {
			
			Player player = main.inspectingPlayer.get(i);
			Player joined = e.getPlayer();
			
			joined.hidePlayer(player);
			
		}
		
	}
	
}