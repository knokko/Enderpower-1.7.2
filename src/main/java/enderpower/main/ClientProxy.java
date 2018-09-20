package enderpower.main;

import net.minecraft.client.model.ModelBiped;
import cpw.mods.fml.client.registry.RenderingRegistry;
import enderpower.mobs.EntityEnderhunter;
import enderpower.mobs.ModelEnderhunter;
import enderpower.mobs.ModelMinotaur;
import enderpower.mobs.RenderEnderhunter;



public class ClientProxy extends ServerProxy{
	
	@Override
	public void RegisterRenderThings(){
		RenderingRegistry.registerEntityRenderingHandler(EntityEnderhunter.class, new RenderEnderhunter(new ModelEnderhunter(), 0.3F));

	}

}
