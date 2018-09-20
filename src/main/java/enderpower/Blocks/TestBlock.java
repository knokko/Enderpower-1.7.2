package enderpower.Blocks;


import java.util.Random;

import enderpower.magic.Magic;
import enderpower.main.Enderpower;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.scoreboard.IScoreObjectiveCriteria;
import net.minecraft.scoreboard.Score;
import net.minecraft.scoreboard.Scoreboard;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

public class TestBlock extends Block{

	protected TestBlock() {
		super(Material.rock);
	}
	
}
