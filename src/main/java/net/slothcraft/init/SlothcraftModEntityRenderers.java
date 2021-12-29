
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.slothcraft.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.renderer.entity.ThrownItemRenderer;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class SlothcraftModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(SlothcraftModEntities.FIRE_STAFF_RANGED_WEAPON, ThrownItemRenderer::new);
		event.registerEntityRenderer(SlothcraftModEntities.POISON_STAFF_RANGED_WEAPON, ThrownItemRenderer::new);
		event.registerEntityRenderer(SlothcraftModEntities.ICE_STAFF_RANGED_WEAPON, ThrownItemRenderer::new);
		event.registerEntityRenderer(SlothcraftModEntities.WITHER_STAFF_RANGED_WEAPON, ThrownItemRenderer::new);
	}
}
