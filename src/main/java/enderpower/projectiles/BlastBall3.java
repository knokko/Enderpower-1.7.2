package enderpower.projectiles;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.projectile.EntityThrowable;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.scoreboard.Team;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.world.World;

public class BlastBall3 extends EntityThrowable {
	private static final float explosionRadius2 = 450;
	public BlastBall3(World par1World)
    {
        super(par1World);
    }
	protected float getGravityVelocity()
    {
        return 0.00F;
    }
    public BlastBall3(World par1World, EntityLivingBase par2EntityLivingBase)
    {
        super(par1World, par2EntityLivingBase);
    }
    public BlastBall3(World par1World, double par2, double par4, double par6)
    {
        super(par1World, par2, par4, par6);
    }
    @Override
    protected void onImpact(MovingObjectPosition par1MovingObjectPosition){
    	 this.worldObj.createExplosion(this, this.posX, this.posY, this.posZ, explosionRadius2, true);
    	 
    	 
    	

       
    }



}
