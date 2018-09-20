package enderpower.Blocks;

import java.util.Random;

import enderpower.Items.EnderpowerItems;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.world.IBlockAccess;

public class GeeOre extends Block{
	protected GeeOre() {
		super(Material.rock);
		setCreativeTab(CreativeTabs.tabBlock);
		setHardness(1.5F);
		setStepSound(Block.soundTypeStone);
		setResistance(10.0F);
		setHarvestLevel("pickaxe", 0);
		this.setLightLevel(0.5F);
	}
	
	public Item getItemDropped(int par1, Random par2Random, int par3) {
		return EnderpowerItems.gee_dust;
		
	}
	
	private Random rand = new Random();
	public int getExpDrop(IBlockAccess blockaccess, int par1, int par2) {
		if (this.getItemDropped(par1, rand, par2) != Item.getItemFromBlock(this)) {
			return 1 + rand.nextInt(5);
		}
		return 0;
	
	}

}
