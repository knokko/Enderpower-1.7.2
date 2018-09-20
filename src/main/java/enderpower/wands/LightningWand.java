package enderpower.wands;

import java.util.Random;

import cpw.mods.fml.common.registry.GameRegistry;
import enderpower.Blocks.EnderpowerBlocks;
import enderpower.magic.Magic;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.effect.EntityLightningBolt;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.util.MovingObjectPosition.MovingObjectType;
import net.minecraft.world.World;

public class LightningWand extends Item {
	
	public ItemStack onItemRightClick(ItemStack itemStack, World world, EntityPlayer player) {

        MovingObjectPosition objectMouseOver;
        Minecraft mc = Minecraft.getMinecraft();

        objectMouseOver = mc.thePlayer.rayTrace(300, 1);

        
        if (objectMouseOver != null && objectMouseOver.typeOfHit == MovingObjectType.BLOCK && Magic.get(world).useMana(10, 0, 30, 0, 0, 0) && !world.isRemote) {

        	

            int i = objectMouseOver.blockX;
            int j = objectMouseOver.blockY;
            int k = objectMouseOver.blockZ;
            world.spawnEntityInWorld(new EntityLightningBolt(world, i, j, k));
            	Random rand=new Random();
            	int num=rand.nextInt(6);
    
         }


   

     

     return itemStack;
  }

}
