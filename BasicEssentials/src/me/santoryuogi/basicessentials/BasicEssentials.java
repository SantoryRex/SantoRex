package me.santoryuogi.basicessentials;

import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

public class BasicEssentials extends JavaPlugin implements Listener {
	
	public void onEnable() 
	{
	
		this.getCommand("tp").setExecutor(new Tp(this));
		this.getCommand("heal").setExecutor(new Heal(this));
		this.getCommand("ban").setExecutor(new Punishments(this));
		this.getCommand("kick").setExecutor(new Punishments(this));		
		
	}
}

