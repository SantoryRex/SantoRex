package me.santoryuogi.basicessentials;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import net.md_5.bungee.api.ChatColor;

public class Heal implements CommandExecutor 
{

	
	BasicEssentials plugin;
	
	public Heal(BasicEssentials passedplugin)
	{
		
	}
	
	
	
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args) {
		
		Player player = (Player) sender;
				
		if(commandLabel.equalsIgnoreCase("heal")) {
			if(args.length == 0){
				player.setHealth(20);
				player.setFireTicks(0);
				player.setExhaustion(20);
				player.sendMessage(ChatColor.GREEN + "" + ChatColor.BOLD + "(!) You have been healed!");
			}else if(args.length == 1){
				if(player.getServer().getPlayer(args [0]) !=null){
				Player targetplayer = player.getServer().getPlayer(args [0]);
				targetplayer.setHealth(20);
				targetplayer.setFireTicks(0);
				targetplayer.setExhaustion(20);
				targetplayer.sendMessage(ChatColor.GREEN + "" + ChatColor.BOLD + "(!) You have been healed!");
				player.sendMessage(ChatColor.GREEN + "" + ChatColor.BOLD + "(!) Player has been healed");
			}else{
				player.sendMessage(ChatColor.RED + "" + ChatColor.RED + "(!) Player not found!");
				
			}
		}
	}
		
		return false;
}
}
	
