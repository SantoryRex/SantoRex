package me.santoryuogi.basicessentials;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;


public class Punishments implements CommandExecutor {
	
	BasicEssentials plugin;
	
	public Punishments (BasicEssentials passedplugin) 
	{
		
	}
	
	@SuppressWarnings("deprecation")
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args) {
		if (cmd.getName().equalsIgnoreCase("kick")){ 
			if (args.length == 0){
				sender.sendMessage(ChatColor.RED + "" + ChatColor.BOLD + "(!) Please specify a player!");
				return true;
			}
			Player target = Bukkit.getServer().getPlayer(args[0]);
			if (target == null) {
				sender.sendMessage(ChatColor.RED + "" + ChatColor.BOLD + "(!) Could not find player!");
				return true;
			}
			target.kickPlayer(ChatColor.RED + "You have been kicked!");
			Bukkit.getServer().broadcastMessage(ChatColor.RED + "" + ChatColor.BOLD + target.getName() + " has been kicked by" + sender.getName() + "!");
		}
		if (cmd.getName().equalsIgnoreCase("ban")){ 
			if (args.length == 0){
				sender.sendMessage(ChatColor.RED + "" + ChatColor.BOLD + "(!) Please specify a player!");
				return true;
			}
			Player target = Bukkit.getServer().getPlayer(args[0]);
			if (target == null) {
				sender.sendMessage(ChatColor.RED + "" + ChatColor.BOLD + "(!) Could not find player!");
				return true;
			}
			target.kickPlayer(ChatColor.RED + "You have been banned!");
			target.setBanned(true);
			Bukkit.getServer().broadcastMessage(ChatColor.RED + "" + ChatColor.BOLD + target.getName() + " has been banned by" + sender.getName() + "!");
		}
		return true;
	}
}
