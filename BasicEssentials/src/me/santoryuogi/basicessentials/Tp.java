package me.santoryuogi.basicessentials;

import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;


public class Tp implements CommandExecutor {
	
	BasicEssentials plugin;
	
	public Tp (BasicEssentials passedplugin)
	{
		
	}
	
	
	
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args) {
		Player player = (Player) sender;
		if(commandLabel.equalsIgnoreCase("tp")){
			if(args.length == 0){
				player.sendMessage(ChatColor.RED + "" + ChatColor.BOLD + "(!) Specify a player!");
			}else if(args.length == 1){
				Player targetPlayer = player.getServer().getPlayer(args[0]);
				Location location = targetPlayer.getLocation();
				player.teleport(location);
			}else if(args.length == 2){
				Player targetPlayer = player.getServer().getPlayer(args[0]);
				Player targetPlayer1 = player.getServer().getPlayer(args[1]);
				Location targetPlayer1Location = targetPlayer1.getLocation();
				targetPlayer.teleport(targetPlayer1Location);
			}
		}
		return false;
	}
}
