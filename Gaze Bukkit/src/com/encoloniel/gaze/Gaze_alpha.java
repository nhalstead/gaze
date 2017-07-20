package com.encoloniel.gaze;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.GameMode;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;


public class Gaze_alpha extends JavaPlugin {

public void onEnable() {
	getConfig().options().copyDefaults(true);
	saveConfig();
	Bukkit.getServer().getLogger().info("Gaze ENABLED");
}

public void onDisable() {
								Bukkit.getServer().getLogger().info("Gaze DISABLED");
}




public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String [] args) {

								//If sender is NOT Pla
								if (!(sender instanceof Player)) {
																sender.sendMessage("You cannot run the command from the Server Console. Please run from a Player");
																return true;
								}
								//Sending variable player to make sender sent to Player
								Player player = (Player) sender;
								if (cmd.getName().equalsIgnoreCase("help")) {
																sender.sendMessage(getConfig().getString("helpmessage"));
																return true;
								}
								//Heal Command
								if (cmd.getName().equalsIgnoreCase("heal")) {
																if (args.length == 0) {
																								player.setHealth(20);
																								player.sendMessage("If /heal command was successful, it have healed you 20 half-hearts");
																								return true;
																}

																//Making target variable to find target player if person exists in the server or not

																Player target = (Bukkit.getServer().getPlayer(args[0]));

																if (target == null) {
																								player.sendMessage("Player: =" + target.getName() + " not in server");
																								return true;
																}
																target.setHealth(20);
																target.sendMessage("If /heal command successful, it have healed you "+target.getName() +" 20 half-hearts");
																player.sendMessage("If /heal command successful, you have healed "+target.getName() +" 20 half-hearts");
																return true;
								}

								//Feed Command
								if (cmd.getName().equalsIgnoreCase("feed")) {
																if (args.length == 0) {
																								player.setFoodLevel(20);
																								player.sendMessage("If /feed command was successful, it should have healed you 20 hunger levels");
																								return true;
																}

																//Making target variable to find target player if person exists in the server or not

																Player target = (Bukkit.getServer().getPlayer(args[0]));

																if (target == null) {
																								player.sendMessage("Player: =" + target.getName() + " not in server");
																								return true;
																}
																target.setHealth(20);
																target.sendMessage("If /feed command successful, it have healed you " + target.getName() + " 20 hunger levels");
																player.sendMessage("If /feed command successful, you have healed " + target.getName() + " 20 hunger levels");
																return true;
								}

								//GAMEMODE QUICK CHANGER COMMANDS

								//Survival Mode
								if (cmd.getName().equalsIgnoreCase("gms")) {
																if (args.length == 0) {
																								player.setGameMode(GameMode.SURVIVAL);
																								player.sendMessage("Your game mode is updated to Survival Mode");
																								return true;
																}

																//Making target variable to find target player if person exists in the server or not

																Player target = (Bukkit.getServer().getPlayer(args[0]));

																if (target == null) {
																								player.sendMessage("Player: =" + target.getName() + " not in server");
																								return true;
																}
																target.setGameMode(GameMode.SURVIVAL);
																target.sendMessage("Set "+target.getName() +"'s gamemode to Survival Mode'");
																player.sendMessage("Your game mode is updated to Survival Mode");
																return true;
								}

								//Creative Mode
								if (cmd.getName().equalsIgnoreCase("gmc")) {
																if (args.length == 0) {
																								player.setGameMode(GameMode.CREATIVE);
																								player.sendMessage("Your game mode is updated to Creative Mode");
																								return true;
																}

																//Making target variable to find target player if person exists in the server or not

																Player target = (Bukkit.getServer().getPlayer(args[0]));

																if (target == null) {
																								player.sendMessage("Player: " + target.getName() + " not in server");
																								return true;
																}
																target.setGameMode(GameMode.CREATIVE);;
																target.sendMessage("Set "+target.getName() +"'s gamemode to Creative Mode'");
																player.sendMessage("Your game mode is updated to Creative Mode");
																return true;
								}

								//Adventure Mode
								if (cmd.getName().equalsIgnoreCase("gma")) {
																if (args.length == 0) {
																								player.setGameMode(GameMode.ADVENTURE);
																								player.sendMessage("Your game mode is updated to Adventure Mode");
																								return true;
																}

																//Making target variable to find target player if person exists in the server or not

																Player target = (Bukkit.getServer().getPlayer(args[0]));

																if (target == null) {
																								player.sendMessage("Player: =" + target.getName() + " not in server");
																								return true;
																}
																target.setGameMode(GameMode.ADVENTURE);
																target.sendMessage("Set "+target.getName() +"'s gamemode to Adventure Mode'");
																player.sendMessage("Your game mode is updated to Adventure Mode");
																return true;
								}
								//Spectator Mode
								if (cmd.getName().equalsIgnoreCase("gmsp")) {
																if (args.length == 0) {
																								player.setGameMode(GameMode.SPECTATOR);
																								player.sendMessage("Your game mode is updated to Spectator Mode");
																								return true;
																}

																//Making target variable to find target player if person exists in the server or not

																Player target = (Bukkit.getServer().getPlayer(args[0]));

																if (target == null) {
																								player.sendMessage("Player: =" + target.getName() + " not in server");
																								return true;
																}
																target.setGameMode(GameMode.SPECTATOR);;
																target.sendMessage("Set "+target.getName() +"'s gamemode to Spectator Mode'");
																player.sendMessage("Your game mode is updated to Spectator Mode");
																return true;
								}

								//PRANK PLUGINS
								//Fakejoin

								if (cmd.getName().equalsIgnoreCase("fakejoin")) {
																if (args.length == 0) {
																								sender.sendMessage("Please specify a name");
																								return true;
																}
																Bukkit.getServer().broadcastMessage(ChatColor.YELLOW + args[0] + " joined the game.");
								}





								return true;

}

}
