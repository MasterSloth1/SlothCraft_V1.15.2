
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.slothcraft.init;

import net.slothcraft.client.gui.PlatesMakerGuiScreen;
import net.slothcraft.client.gui.GearsMakerGuiScreen;

import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.gui.screens.MenuScreens;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class SlothcraftModScreens {
	@SubscribeEvent
	public static void clientLoad(FMLClientSetupEvent event) {
		event.enqueueWork(() -> {
			MenuScreens.register(SlothcraftModMenus.GEARS_MAKER_GUI, GearsMakerGuiScreen::new);
			MenuScreens.register(SlothcraftModMenus.PLATES_MAKER_GUI, PlatesMakerGuiScreen::new);
		});
	}
}
