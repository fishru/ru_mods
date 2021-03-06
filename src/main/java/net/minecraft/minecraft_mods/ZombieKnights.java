package net.minecraft.minecraft_mods;

import java.util.Random;

import net.minecraft.command.CommandException;
import net.minecraft.entity.monster.EntityZombie;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.event.entity.EntityJoinWorldEvent;
import net.minecraftforge.event.entity.living.LivingDeathEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;


public class ZombieKnights {
	
	@SubscribeEvent
	public void giveArmor(EntityJoinWorldEvent event) throws CommandException{
		if(!(event.getEntity() instanceof EntityZombie)){
			return;
		}
		
		/*
		if(event.entity.worldObj.isRemote){
			System.out.println("This Zombie exists in client process!.");
		}
		
		if(!(event.entity.worldObj.isRemote)){
			System.out.println("This Zombie exists in Server process!.");
		}
		
		if(event.world.isRemote) {
			System.out.println("This event exists in client process!");
		}
		
		if(!(event.world.isRemote)) {
			System.out.println("This event exists in Server process!");
		}
		*/
		
		EntityZombie zombie=(EntityZombie) event.getEntity();
		/*
		zombie.setCurrentItemOrArmor(0, new ItemStack(Items.diamond_axe));
		zombie.setCurrentItemOrArmor(1, new ItemStack(Items.diamond_chestplate));
		zombie.setCurrentItemOrArmor(2, new ItemStack(Items.diamond_leggings));
		zombie.setCurrentItemOrArmor(3, new ItemStack(Items.diamond_boots));
		zombie.setCurrentItemOrArmor(4, new ItemStack(Items.diamond_helmet));
		zombie.setCustomNameTag("Zombie Knight");
		*/
		
		//zombie.setPosition(zombie.posX + 2, zombie.posY, zombie.posZ);
		//zombie.setLocationAndAngles(zombie.posX + 2, zombie.posY, zombie.posZ, zombie.rotationYaw, zombie.rotationPitch);
		
	}
	
	
	@SubscribeEvent
	public void dropItems(LivingDeathEvent event){
		if(!(event.getEntity() instanceof EntityZombie)){
			return ;
		}
		Random random = new Random();
		if(!event.getEntity().worldObj.isRemote) {
			event.getEntity().dropItem(Items.diamond_axe,1);
		}
	}

}
