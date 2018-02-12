package com.voidcraftplays.inspectplayer;

import java.util.HashMap;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

import com.voidcraftplays.inspectplayer.commands.InspectPlayer;
import com.voidcraftplays.inspectplayer.commands.OpenInspectedPlayersInventory;
import com.voidcraftplays.inspectplayer.listeners.GUIMoveCancelListener;
import com.voidcraftplays.inspectplayer.listeners.PlayerJoinListener;
import com.voidcraftplays.inspectplayer.listeners.PlayerQuitListener;
import com.voidcraftplays.inspectplayer.listeners.RightClickInspectedPlayer;
import com.voidcraftplays.inspectplayer.util.OpenInspectedPlayerInventoryGUI;
import com.voidcraftplays.inspectplayer.util.PlayerUtilsUI;

public class Main extends JavaPlugin {
	
	public OpenInspectedPlayerInventoryGUI openInspectedPlayerInventoryGUI;
	public PlayerUtilsUI playerUtilsUI;
	public HashMap<Player, Player> inspectingPlayer = new HashMap<>();
	
	public void onEnable() {
		
		System.out.println("Inspect Player plugin by VoidCraftPlays has been enabled!");
		
		getCommand("inspect").setExecutor(new InspectPlayer(this));
		getCommand("info").setExecutor(new OpenInspectedPlayersInventory(this));
		
		Bukkit.getPluginManager().registerEvents(new RightClickInspectedPlayer(this), this);
		Bukkit.getPluginManager().registerEvents(new GUIMoveCancelListener(this), this);
		Bukkit.getPluginManager().registerEvents(new PlayerJoinListener(this), this);
		Bukkit.getPluginManager().registerEvents(new PlayerQuitListener(this), this);
		
		playerUtilsUI = new PlayerUtilsUI(this);
		openInspectedPlayerInventoryGUI = new OpenInspectedPlayerInventoryGUI(this);
		
		getConfig().options().copyDefaults(true);
		saveDefaultConfig();
		saveConfig();
		
	}
	
	/* To Do:
	 * 
	 * Add /invsee type command w/ enough requests - Make it so you can edit the inventory of whoever your inspecting
	 * Add invisibility to server on join
	 * 
	 */
	
}
