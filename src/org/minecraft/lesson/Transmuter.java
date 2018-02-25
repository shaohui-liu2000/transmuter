package org.minecraft.lesson;

import java.util.logging.Logger;

import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.World;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.inventory.PlayerInventory;
import org.bukkit.invenory.ItemStack;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

public class Transmuter extends JavaPlugin{
	public static final Logger LOG = Logger.getLogger(ChickenStorm.class.getName());

	public boolean onCommand(CommandSender sender, Command command, String label, String[] arguments){
		//label is your command, compare label with transmute before executing command.
		//make sure the sender is a Player (org.bukkit.entity.Player class)
		//return true after executing by send arguments to execute command

		return false;
	}
	/**
	 *
	 * @param sender
	 */
	public void executeCommand(CommandSender sender) {
		//check if we have two arguments
		//use Material.getMaterial(String string) to get material from inputMaterial
		//get player's current inventory
		//check each stack of items
		//if stack type is input, transmute to output
	}

}
