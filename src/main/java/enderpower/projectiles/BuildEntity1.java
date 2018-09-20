package enderpower.projectiles;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.projectile.EntityThrowable;
import net.minecraft.init.Blocks;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.world.World;

public class BuildEntity1 extends EntityThrowable {

	protected float getGravityVelocity()
    {
        return 0.00F;
    }

	
	public BuildEntity1(World par1World)
    {
        super(par1World);
    }
    public BuildEntity1(World par1World, EntityLivingBase par2EntityLivingBase)
    {
        super(par1World, par2EntityLivingBase);
        this.getGravityVelocity();
    }
    public BuildEntity1(World par1World, double par2, double par4, double par6)
    {
        super(par1World, par2, par4, par6);
    }
    @Override
    protected void onImpact(MovingObjectPosition par1MovingObjectPosition){
    	//grond platform
		this.worldObj.setBlock((int) posX, (int) posY - 1, (int) posZ, Blocks.planks, 2, 2);
		this.worldObj.setBlock((int) posX, (int) posY - 1, (int) posZ - 1, Blocks.planks, 2, 2);
		this.worldObj.setBlock((int) posX, (int) posY - 1, (int) posZ - 2, Blocks.planks, 2, 2);
		this.worldObj.setBlock((int) posX, (int) posY - 1, (int) posZ - 3, Blocks.planks, 2, 2);
		this.worldObj.setBlock((int) posX, (int) posY - 1, (int) posZ - 4, Blocks.planks, 2, 2);
		this.worldObj.setBlock((int) posX, (int) posY - 1, (int) posZ - 5, Blocks.planks, 2, 2);
		this.worldObj.setBlock((int) posX, (int) posY - 1, (int) posZ - 6, Blocks.planks, 2, 2);
		this.worldObj.setBlock((int) posX, (int) posY - 1, (int) posZ - 7, Blocks.planks, 2, 2);
		this.worldObj.setBlock((int) posX, (int) posY - 1, (int) posZ + 1, Blocks.planks, 2, 2);
		this.worldObj.setBlock((int) posX, (int) posY - 1, (int) posZ + 2, Blocks.planks, 2, 2);
		this.worldObj.setBlock((int) posX, (int) posY - 1, (int) posZ + 3, Blocks.planks, 2, 2);
		this.worldObj.setBlock((int) posX, (int) posY - 1, (int) posZ + 4, Blocks.planks, 2, 2);
		this.worldObj.setBlock((int) posX, (int) posY - 1, (int) posZ + 5, Blocks.planks, 2, 2);
		this.worldObj.setBlock((int) posX, (int) posY - 1, (int) posZ + 6, Blocks.planks, 2, 2);
		this.worldObj.setBlock((int) posX, (int) posY - 1, (int) posZ + 7, Blocks.planks, 2, 2);
		this.worldObj.setBlock((int) posX + 1, (int) posY - 1, (int) posZ, Blocks.planks, 2, 2);
		this.worldObj.setBlock((int) posX + 1, (int) posY - 1, (int) posZ - 1, Blocks.planks, 2, 2);
		this.worldObj.setBlock((int) posX + 1, (int) posY - 1, (int) posZ - 2, Blocks.planks, 2, 2);
		this.worldObj.setBlock((int) posX + 1, (int) posY - 1, (int) posZ - 3, Blocks.planks, 2, 2);
		this.worldObj.setBlock((int) posX + 1, (int) posY - 1, (int) posZ - 4, Blocks.planks, 2, 2);
		this.worldObj.setBlock((int) posX + 1, (int) posY - 1, (int) posZ - 5, Blocks.planks, 2, 2);
		this.worldObj.setBlock((int) posX + 1, (int) posY - 1, (int) posZ - 6, Blocks.planks, 2, 2);
		this.worldObj.setBlock((int) posX + 1, (int) posY - 1, (int) posZ - 7, Blocks.planks, 2, 2);
		this.worldObj.setBlock((int) posX + 1, (int) posY - 1, (int) posZ + 1, Blocks.planks, 2, 2);
		this.worldObj.setBlock((int) posX + 1, (int) posY - 1, (int) posZ + 2, Blocks.planks, 2, 2);
		this.worldObj.setBlock((int) posX + 1, (int) posY - 1, (int) posZ + 3, Blocks.planks, 2, 2);
		this.worldObj.setBlock((int) posX + 1, (int) posY - 1, (int) posZ + 4, Blocks.planks, 2, 2);
		this.worldObj.setBlock((int) posX + 1, (int) posY - 1, (int) posZ + 5, Blocks.planks, 2, 2);
		this.worldObj.setBlock((int) posX + 1, (int) posY - 1, (int) posZ + 6, Blocks.planks, 2, 2);
		this.worldObj.setBlock((int) posX + 1, (int) posY - 1, (int) posZ + 7, Blocks.planks, 2, 2);
		this.worldObj.setBlock((int) posX - 1, (int) posY - 1, (int) posZ, Blocks.planks, 2, 2);
		this.worldObj.setBlock((int) posX - 1, (int) posY - 1, (int) posZ - 1, Blocks.planks, 2, 2);
		this.worldObj.setBlock((int) posX - 1, (int) posY - 1, (int) posZ - 2, Blocks.planks, 2, 2);
		this.worldObj.setBlock((int) posX - 1, (int) posY - 1, (int) posZ - 3, Blocks.planks, 2, 2);
		this.worldObj.setBlock((int) posX - 1, (int) posY - 1, (int) posZ - 4, Blocks.planks, 2, 2);
		this.worldObj.setBlock((int) posX - 1, (int) posY - 1, (int) posZ - 5, Blocks.planks, 2, 2);
		this.worldObj.setBlock((int) posX - 1, (int) posY - 1, (int) posZ - 6, Blocks.planks, 2, 2);
		this.worldObj.setBlock((int) posX - 1, (int) posY - 1, (int) posZ - 7, Blocks.planks, 2, 2);
		this.worldObj.setBlock((int) posX - 1, (int) posY - 1, (int) posZ + 1, Blocks.planks, 2, 2);
		this.worldObj.setBlock((int) posX - 1, (int) posY - 1, (int) posZ + 2, Blocks.planks, 2, 2);
		this.worldObj.setBlock((int) posX - 1, (int) posY - 1, (int) posZ + 3, Blocks.planks, 2, 2);
		this.worldObj.setBlock((int) posX - 1, (int) posY - 1, (int) posZ + 4, Blocks.planks, 2, 2);
		this.worldObj.setBlock((int) posX - 1, (int) posY - 1, (int) posZ + 5, Blocks.planks, 2, 2);
		this.worldObj.setBlock((int) posX - 1, (int) posY - 1, (int) posZ + 6, Blocks.planks, 2, 2);
		this.worldObj.setBlock((int) posX - 1, (int) posY - 1, (int) posZ + 7, Blocks.planks, 2, 2);
		this.worldObj.setBlock((int) posX + 2, (int) posY - 1, (int) posZ, Blocks.planks, 2, 2);
		this.worldObj.setBlock((int) posX + 2, (int) posY - 1, (int) posZ - 1, Blocks.planks, 2, 2);
		this.worldObj.setBlock((int) posX + 2, (int) posY - 1, (int) posZ - 2, Blocks.planks, 2, 2);
		this.worldObj.setBlock((int) posX + 2, (int) posY - 1, (int) posZ - 3, Blocks.planks, 2, 2);
		this.worldObj.setBlock((int) posX + 2, (int) posY - 1, (int) posZ - 4, Blocks.planks, 2, 2);
		this.worldObj.setBlock((int) posX + 2, (int) posY - 1, (int) posZ - 5, Blocks.planks, 2, 2);
		this.worldObj.setBlock((int) posX + 2, (int) posY - 1, (int) posZ - 6, Blocks.planks, 2, 2);
		this.worldObj.setBlock((int) posX + 2, (int) posY - 1, (int) posZ - 7, Blocks.planks, 2, 2);
		this.worldObj.setBlock((int) posX + 2, (int) posY - 1, (int) posZ + 1, Blocks.planks, 2, 2);
		this.worldObj.setBlock((int) posX + 2, (int) posY - 1, (int) posZ + 2, Blocks.planks, 2, 2);
		this.worldObj.setBlock((int) posX + 2, (int) posY - 1, (int) posZ + 3, Blocks.planks, 2, 2);
		this.worldObj.setBlock((int) posX + 2, (int) posY - 1, (int) posZ + 4, Blocks.planks, 2, 2);
		this.worldObj.setBlock((int) posX + 2, (int) posY - 1, (int) posZ + 5, Blocks.planks, 2, 2);
		this.worldObj.setBlock((int) posX + 2, (int) posY - 1, (int) posZ + 6, Blocks.planks, 2, 2);
		this.worldObj.setBlock((int) posX + 2, (int) posY - 1, (int) posZ + 7, Blocks.planks, 2, 2);
		this.worldObj.setBlock((int) posX - 2, (int) posY - 1, (int) posZ, Blocks.planks, 2, 2);
		this.worldObj.setBlock((int) posX - 2, (int) posY - 1, (int) posZ - 1, Blocks.planks, 2, 2);
		this.worldObj.setBlock((int) posX - 2, (int) posY - 1, (int) posZ - 2, Blocks.planks, 2, 2);
		this.worldObj.setBlock((int) posX - 2, (int) posY - 1, (int) posZ - 3, Blocks.planks, 2, 2);
		this.worldObj.setBlock((int) posX - 2, (int) posY - 1, (int) posZ - 4, Blocks.planks, 2, 2);
		this.worldObj.setBlock((int) posX - 2, (int) posY - 1, (int) posZ - 5, Blocks.planks, 2, 2);
		this.worldObj.setBlock((int) posX - 2, (int) posY - 1, (int) posZ - 6, Blocks.planks, 2, 2);
		this.worldObj.setBlock((int) posX - 2, (int) posY - 1, (int) posZ - 7, Blocks.planks, 2, 2);
		this.worldObj.setBlock((int) posX - 2, (int) posY - 1, (int) posZ + 1, Blocks.planks, 2, 2);
		this.worldObj.setBlock((int) posX - 2, (int) posY - 1, (int) posZ + 2, Blocks.planks, 2, 2);
		this.worldObj.setBlock((int) posX - 2, (int) posY - 1, (int) posZ + 3, Blocks.planks, 2, 2);
		this.worldObj.setBlock((int) posX - 2, (int) posY - 1, (int) posZ + 4, Blocks.planks, 2, 2);
		this.worldObj.setBlock((int) posX - 2, (int) posY - 1, (int) posZ + 5, Blocks.planks, 2, 2);
		this.worldObj.setBlock((int) posX - 2, (int) posY - 1, (int) posZ + 6, Blocks.planks, 2, 2);
		this.worldObj.setBlock((int) posX - 2, (int) posY - 1, (int) posZ + 7, Blocks.planks, 2, 2);
		this.worldObj.setBlock((int) posX + 3, (int) posY - 1, (int) posZ, Blocks.planks, 2, 2);
		this.worldObj.setBlock((int) posX + 3, (int) posY - 1, (int) posZ - 1, Blocks.planks, 2, 2);
		this.worldObj.setBlock((int) posX + 3, (int) posY - 1, (int) posZ - 2, Blocks.planks, 2, 2);
		this.worldObj.setBlock((int) posX + 3, (int) posY - 1, (int) posZ - 3, Blocks.planks, 2, 2);
		this.worldObj.setBlock((int) posX + 3, (int) posY - 1, (int) posZ - 4, Blocks.planks, 2, 2);
		this.worldObj.setBlock((int) posX + 3, (int) posY - 1, (int) posZ - 5, Blocks.planks, 2, 2);
		this.worldObj.setBlock((int) posX + 3, (int) posY - 1, (int) posZ - 6, Blocks.planks, 2, 2);
		this.worldObj.setBlock((int) posX + 3, (int) posY - 1, (int) posZ - 7, Blocks.planks, 2, 2);
		this.worldObj.setBlock((int) posX + 3, (int) posY - 1, (int) posZ + 1, Blocks.planks, 2, 2);
		this.worldObj.setBlock((int) posX + 3, (int) posY - 1, (int) posZ + 2, Blocks.planks, 2, 2);
		this.worldObj.setBlock((int) posX + 3, (int) posY - 1, (int) posZ + 3, Blocks.planks, 2, 2);
		this.worldObj.setBlock((int) posX + 3, (int) posY - 1, (int) posZ + 4, Blocks.planks, 2, 2);
		this.worldObj.setBlock((int) posX + 3, (int) posY - 1, (int) posZ + 5, Blocks.planks, 2, 2);
		this.worldObj.setBlock((int) posX + 3, (int) posY - 1, (int) posZ + 6, Blocks.planks, 2, 2);
		this.worldObj.setBlock((int) posX + 3, (int) posY - 1, (int) posZ + 7, Blocks.planks, 2, 2);
		this.worldObj.setBlock((int) posX - 3, (int) posY - 1, (int) posZ, Blocks.planks, 2, 2);
		this.worldObj.setBlock((int) posX - 3, (int) posY - 1, (int) posZ - 1, Blocks.planks, 2, 2);
		this.worldObj.setBlock((int) posX - 3, (int) posY - 1, (int) posZ - 2, Blocks.planks, 2, 2);
		this.worldObj.setBlock((int) posX - 3, (int) posY - 1, (int) posZ - 3, Blocks.planks, 2, 2);
		this.worldObj.setBlock((int) posX - 3, (int) posY - 1, (int) posZ - 4, Blocks.planks, 2, 2);
		this.worldObj.setBlock((int) posX - 3, (int) posY - 1, (int) posZ - 5, Blocks.planks, 2, 2);
		this.worldObj.setBlock((int) posX - 3, (int) posY - 1, (int) posZ - 6, Blocks.planks, 2, 2);
		this.worldObj.setBlock((int) posX - 3, (int) posY - 1, (int) posZ - 7, Blocks.planks, 2, 2);
		this.worldObj.setBlock((int) posX - 3, (int) posY - 1, (int) posZ + 1, Blocks.planks, 2, 2);
		this.worldObj.setBlock((int) posX - 3, (int) posY - 1, (int) posZ + 2, Blocks.planks, 2, 2);
		this.worldObj.setBlock((int) posX - 3, (int) posY - 1, (int) posZ + 3, Blocks.planks, 2, 2);
		this.worldObj.setBlock((int) posX - 3, (int) posY - 1, (int) posZ + 4, Blocks.planks, 2, 2);
		this.worldObj.setBlock((int) posX - 3, (int) posY - 1, (int) posZ + 5, Blocks.planks, 2, 2);
		this.worldObj.setBlock((int) posX - 3, (int) posY - 1, (int) posZ + 6, Blocks.planks, 2, 2);
		this.worldObj.setBlock((int) posX - 3, (int) posY - 1, (int) posZ + 7, Blocks.planks, 2, 2);
		this.worldObj.setBlock((int) posX + 4, (int) posY - 1, (int) posZ, Blocks.planks, 2, 2);
		this.worldObj.setBlock((int) posX + 4, (int) posY - 1, (int) posZ - 1, Blocks.planks, 2, 2);
		this.worldObj.setBlock((int) posX + 4, (int) posY - 1, (int) posZ - 2, Blocks.planks, 2, 2);
		this.worldObj.setBlock((int) posX + 4, (int) posY - 1, (int) posZ - 3, Blocks.planks, 2, 2);
		this.worldObj.setBlock((int) posX + 4, (int) posY - 1, (int) posZ - 4, Blocks.planks, 2, 2);
		this.worldObj.setBlock((int) posX + 4, (int) posY - 1, (int) posZ - 5, Blocks.planks, 2, 2);
		this.worldObj.setBlock((int) posX + 4, (int) posY - 1, (int) posZ - 6, Blocks.planks, 2, 2);
		this.worldObj.setBlock((int) posX + 4, (int) posY - 1, (int) posZ - 7, Blocks.planks, 2, 2);
		this.worldObj.setBlock((int) posX + 4, (int) posY - 1, (int) posZ + 1, Blocks.planks, 2, 2);
		this.worldObj.setBlock((int) posX + 4, (int) posY - 1, (int) posZ + 2, Blocks.planks, 2, 2);
		this.worldObj.setBlock((int) posX + 4, (int) posY - 1, (int) posZ + 3, Blocks.planks, 2, 2);
		this.worldObj.setBlock((int) posX + 4, (int) posY - 1, (int) posZ + 4, Blocks.planks, 2, 2);
		this.worldObj.setBlock((int) posX + 4, (int) posY - 1, (int) posZ + 5, Blocks.planks, 2, 2);
		this.worldObj.setBlock((int) posX + 4, (int) posY - 1, (int) posZ + 6, Blocks.planks, 2, 2);
		this.worldObj.setBlock((int) posX + 4, (int) posY - 1, (int) posZ + 7, Blocks.planks, 2, 2);
		this.worldObj.setBlock((int) posX - 4, (int) posY - 1, (int) posZ, Blocks.planks, 2, 2);
		this.worldObj.setBlock((int) posX - 4, (int) posY - 1, (int) posZ - 1, Blocks.planks, 2, 2);
		this.worldObj.setBlock((int) posX - 4, (int) posY - 1, (int) posZ - 2, Blocks.planks, 2, 2);
		this.worldObj.setBlock((int) posX - 4, (int) posY - 1, (int) posZ - 3, Blocks.planks, 2, 2);
		this.worldObj.setBlock((int) posX - 4, (int) posY - 1, (int) posZ - 4, Blocks.planks, 2, 2);
		this.worldObj.setBlock((int) posX - 4, (int) posY - 1, (int) posZ - 5, Blocks.planks, 2, 2);
		this.worldObj.setBlock((int) posX - 4, (int) posY - 1, (int) posZ - 6, Blocks.planks, 2, 2);
		this.worldObj.setBlock((int) posX - 4, (int) posY - 1, (int) posZ - 7, Blocks.planks, 2, 2);
		this.worldObj.setBlock((int) posX - 4, (int) posY - 1, (int) posZ + 1, Blocks.planks, 2, 2);
		this.worldObj.setBlock((int) posX - 4, (int) posY - 1, (int) posZ + 2, Blocks.planks, 2, 2);
		this.worldObj.setBlock((int) posX - 4, (int) posY - 1, (int) posZ + 3, Blocks.planks, 2, 2);
		this.worldObj.setBlock((int) posX - 4, (int) posY - 1, (int) posZ + 4, Blocks.planks, 2, 2);
		this.worldObj.setBlock((int) posX - 4, (int) posY - 1, (int) posZ + 5, Blocks.planks, 2, 2);
		this.worldObj.setBlock((int) posX - 4, (int) posY - 1, (int) posZ + 6, Blocks.planks, 2, 2);
		this.worldObj.setBlock((int) posX - 4, (int) posY - 1, (int) posZ + 7, Blocks.planks, 2, 2);
		
		///muur 1
		
		this.worldObj.setBlock((int) posX + 4, (int) posY, (int) posZ, Blocks.planks, 2, 2);
		this.worldObj.setBlock((int) posX + 4, (int) posY, (int) posZ - 1, Blocks.planks, 2, 2);
		this.worldObj.setBlock((int) posX + 4, (int) posY, (int) posZ - 2, Blocks.planks, 2, 2);
		this.worldObj.setBlock((int) posX + 4, (int) posY, (int) posZ - 3, Blocks.planks, 2, 2);
		this.worldObj.setBlock((int) posX + 4, (int) posY, (int) posZ - 4, Blocks.planks, 2, 2);
		this.worldObj.setBlock((int) posX + 4, (int) posY, (int) posZ - 5, Blocks.planks, 2, 2);
		this.worldObj.setBlock((int) posX + 4, (int) posY, (int) posZ - 6, Blocks.planks, 2, 2);
		this.worldObj.setBlock((int) posX + 4, (int) posY, (int) posZ - 7, Blocks.planks, 2, 2);
		this.worldObj.setBlock((int) posX + 4, (int) posY, (int) posZ + 1, Blocks.planks, 2, 2);
		this.worldObj.setBlock((int) posX + 4, (int) posY, (int) posZ + 2, Blocks.planks, 2, 2);
		this.worldObj.setBlock((int) posX + 4, (int) posY, (int) posZ + 3, Blocks.planks, 2, 2);
		this.worldObj.setBlock((int) posX + 4, (int) posY, (int) posZ + 4, Blocks.planks, 2, 2);
		this.worldObj.setBlock((int) posX + 4, (int) posY, (int) posZ + 5, Blocks.planks, 2, 2);
		this.worldObj.setBlock((int) posX + 4, (int) posY, (int) posZ + 6, Blocks.planks, 2, 2);
		this.worldObj.setBlock((int) posX + 4, (int) posY, (int) posZ + 7, Blocks.planks, 2, 2);
		this.worldObj.setBlock((int) posX - 4, (int) posY, (int) posZ, Blocks.planks, 2, 2);
		this.worldObj.setBlock((int) posX - 4, (int) posY, (int) posZ - 1, Blocks.planks, 2, 2);
		this.worldObj.setBlock((int) posX - 4, (int) posY, (int) posZ - 2, Blocks.planks, 2, 2);
		this.worldObj.setBlock((int) posX - 4, (int) posY, (int) posZ - 3, Blocks.planks, 2, 2);
		this.worldObj.setBlock((int) posX - 4, (int) posY, (int) posZ - 4, Blocks.planks, 2, 2);
		this.worldObj.setBlock((int) posX - 4, (int) posY, (int) posZ - 5, Blocks.planks, 2, 2);
		this.worldObj.setBlock((int) posX - 4, (int) posY, (int) posZ - 6, Blocks.planks, 2, 2);
		this.worldObj.setBlock((int) posX - 4, (int) posY, (int) posZ - 7, Blocks.planks, 2, 2);
		this.worldObj.setBlock((int) posX - 4, (int) posY, (int) posZ + 1, Blocks.planks, 2, 2);
		this.worldObj.setBlock((int) posX - 4, (int) posY, (int) posZ + 2, Blocks.planks, 2, 2);
		this.worldObj.setBlock((int) posX - 4, (int) posY, (int) posZ + 3, Blocks.planks, 2, 2);
		this.worldObj.setBlock((int) posX - 4, (int) posY, (int) posZ + 4, Blocks.planks, 2, 2);
		this.worldObj.setBlock((int) posX - 4, (int) posY, (int) posZ + 5, Blocks.planks, 2, 2);
		this.worldObj.setBlock((int) posX - 4, (int) posY, (int) posZ + 6, Blocks.planks, 2, 2);
		this.worldObj.setBlock((int) posX - 4, (int) posY, (int) posZ + 7, Blocks.planks, 2, 2);
    	 this.setDead();
    	

       
    }

}
