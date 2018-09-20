package enderpower.Blocks;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.world.World;

public class LavaAltar extends Block {

	protected LavaAltar() {
		super(Material.cloth);
		setHardness(0.5F);
		setResistance(500.0F);
	}
	public void updateTick(World world ,int x, int y, int z, Random random){
		System.out.println("finally!!!");
		world.scheduleBlockUpdate(x, y, z, EnderpowerBlocks.lava_altar, 10);
		
	}
	public int tickRate(World world){
		return 10;
	}

}
