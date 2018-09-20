package enderpower.Blocks;

import enderpower.Items.EnderpowerItems;
import enderpower.magic.Magic;
import enderpower.main.Enderpower;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.ChatComponentTranslation;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.world.World;

public class FieGenerator extends Block{
	protected FieGenerator() {
		super(Material.cloth);
		setCreativeTab(Enderpower.enderpowermagicitemstab);
		
	}
	public boolean onBlockActivated(World world, int x, int y,int z, EntityPlayer player, int max, float maxX, float p_149727_8_, float p_149727_9_){
		if(player.inventory.hasItem(EnderpowerItems.fiefuel)){
			player.inventory.consumeInventoryItem(EnderpowerItems.fiefuel);
			Magic.get(world).editMana(20, 0, 50, 5, 0, 0);
		}
		if(!player.inventory.hasItem(EnderpowerItems.fiefuel)){
			player.addChatMessage(new ChatComponentTranslation(EnumChatFormatting.RED + "you need fie fuel to use this generator"));
		}
		return true;
		
	}

}
