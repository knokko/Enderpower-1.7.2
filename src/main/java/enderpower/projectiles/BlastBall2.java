package enderpower.projectiles;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.projectile.EntityThrowable;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.world.World;

public class BlastBall2 extends EntityThrowable {
	private static int explosions;
	private static final float explosionRadius2 = 8;
	protected float getGravityVelocity()
    {
        return 0.00F;
    }
	public BlastBall2(World par1World)
    {
        super(par1World);
    }
    public BlastBall2(World par1World, EntityLivingBase par2EntityLivingBase)
    {
        super(par1World, par2EntityLivingBase);
    }
    public BlastBall2(World par1World, double par2, double par4, double par6)
    {
        super(par1World, par2, par4, par6);
    }
    @Override
    protected void onImpact(MovingObjectPosition par1MovingObjectPosition){
    	if(this.explosions != 20){
    	 this.worldObj.createExplosion(this, this.posX, this.posY, this.posZ, explosionRadius2, true);
    	 this.explosions = this.explosions + 1;
    	 
    	}
    	if(this.explosions == 20){
    		this.setDead();
    		this.explosions = 0;
    	}

       
    }


}
