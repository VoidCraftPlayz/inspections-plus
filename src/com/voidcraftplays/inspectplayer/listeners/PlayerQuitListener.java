package com.voidcraftplays.inspectplayer.listeners;

import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerQuitEvent;

import com.voidcraftplays.inspectplayer.Main;

public class PlayerQuitListener implements Listener {
	
	private Main main;
	
	public PlayerQuitListener(Main main) {
		this.main = main;
	}
	
	@EventHandler(priority = EventPriority.HIGH)
	public void onQuit(PlayerQuitEvent e) {
		
		
		
	}
	
}
