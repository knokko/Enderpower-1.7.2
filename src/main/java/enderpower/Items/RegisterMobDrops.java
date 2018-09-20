package enderpower.Items;

import java.util.Random;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import enderpower.mobs.EntityEnderhunter;
import net.minecraft.entity.boss.EntityDragon;
import net.minecraft.entity.boss.EntityWither;
import net.minecraft.entity.monster.EntityBlaze;
import net.minecraft.entity.monster.EntityCaveSpider;
import net.minecraft.entity.monster.EntityCreeper;
import net.minecraft.entity.monster.EntityEnderman;
import net.minecraft.entity.monster.EntityGhast;
import net.minecraft.entity.monster.EntityIronGolem;
import net.minecraft.entity.monster.EntityMagmaCube;
import net.minecraft.entity.monster.EntityPigZombie;
import net.minecraft.entity.monster.EntitySilverfish;
import net.minecraft.entity.monster.EntitySkeleton;
import net.minecraft.entity.monster.EntitySlime;
import net.minecraft.entity.monster.EntitySnowman;
import net.minecraft.entity.monster.EntitySpider;
import net.minecraft.entity.monster.EntityWitch;
import net.minecraft.entity.monster.EntityZombie;
import net.minecraft.entity.passive.EntityBat;
import net.minecraft.entity.passive.EntityChicken;
import net.minecraft.entity.passive.EntityCow;
import net.minecraft.entity.passive.EntityHorse;
import net.minecraft.entity.passive.EntityPig;
import net.minecraft.entity.passive.EntitySheep;
import net.minecraft.init.Items;
import net.minecraftforge.event.entity.living.LivingDropsEvent;

public class RegisterMobDrops {

    public static double rand;
    public Random r = new Random();

    @SubscribeEvent
    public void onEntityDrop(LivingDropsEvent event) {
  	  if(event.entityLiving instanceof EntityCow) {
  		event.entityLiving.dropItem(EnderpowerItems.blood, r.nextInt(3));
  		 
  	  }
  	  
  	  if(event.entityLiving instanceof EntityPig) {
  		event.entityLiving.dropItem(EnderpowerItems.blood, r.nextInt(3));
  		  
  	  }
  	  
  	  if(event.entityLiving instanceof EntitySheep) {
  		event.entityLiving.dropItem(EnderpowerItems.blood, r.nextInt(3));
  		  
  	  }
  	  
  	  if(event.entityLiving instanceof EntityHorse) {
  		event.entityLiving.dropItem(EnderpowerItems.blood, r.nextInt(4));
  		 
  	  }
  	  
  	  if(event.entityLiving instanceof EntityChicken) {
  		event.entityLiving.dropItem(EnderpowerItems.blood, r.nextInt(2));
  		
  	  }
  	  
  	  if(event.entityLiving instanceof EntitySnowman) {
  		  
  	  }
  	  
  	  if(event.entityLiving instanceof EntityIronGolem) {
  		 
  	  }
  	  
  	  if(event.entityLiving instanceof EntityZombie) {
  		 event.entityLiving.dropItem(EnderpowerItems.poisonedblood, r.nextInt(2));
  	  }
  	  
  	  if(event.entityLiving instanceof EntityPigZombie) {
  		 event.entityLiving.dropItem(EnderpowerItems.poisonedblood, r.nextInt(2));
  	  }
  	  
  	  if(event.entityLiving instanceof EntitySpider) {
  		 event.entityLiving.dropItem(EnderpowerItems.poisonedblood, r.nextInt(2));
  	  }
  	  
  	  if(event.entityLiving instanceof EntityCaveSpider) {
  		 event.entityLiving.dropItem(EnderpowerItems.poisonedblood, r.nextInt(2));
  	  }
  	  
  	  if(event.entityLiving instanceof EntityBlaze) {
  		
  	  }
  	  
  	  if(event.entityLiving instanceof EntityCreeper) {
  		event.entityLiving.dropItem(EnderpowerItems.blood, r.nextInt(3));
  		
  	  }
  	  
  	  if(event.entityLiving instanceof EntityEnderman) {
  		
  	  }
  	  
  	  if(event.entityLiving instanceof EntityGhast) {
  		 
  	  }
  	  
  	  if(event.entityLiving instanceof EntitySilverfish) {
  		event.entityLiving.dropItem(EnderpowerItems.blood, r.nextInt(2));
  		 
  	  }
  	  
  	  if(event.entityLiving instanceof EntitySkeleton) {
  		
  	  }
  	  
  	  if(event.entityLiving instanceof EntitySlime) {
  		
  	  }
  	  
  	  if(event.entityLiving instanceof EntityMagmaCube) {
  		  
  	  }
  	  
  	  if(event.entityLiving instanceof EntityWitch) {
  		  event.entityLiving.dropItem(EnderpowerItems.blood, r.nextInt(3));
  		 
  	  }
  	  
  	  if(event.entityLiving instanceof EntityWither) {
  		  
  	  }
  	  
  	  if(event.entityLiving instanceof EntityDragon) {
  		 
  	  }
  	  
  	  if(event.entityLiving instanceof EntityBat){
  		  event.entityLiving.dropItem(EnderpowerItems.bat_eye, r.nextInt(2));
  		  event.entityLiving.dropItem(EnderpowerItems.bat_tooth, r.nextInt(2));
  		  event.entityLiving.dropItem(EnderpowerItems.batskin, r.nextInt(2));
  		  event.entityLiving.dropItem(EnderpowerItems.blood, r.nextInt(2));
  		  
  	  }
  	  if(event.entityLiving instanceof EntityEnderhunter){
  		  event.entityLiving.dropItem(Items.ender_pearl, r.nextInt(2));
  	  }
    }

}
