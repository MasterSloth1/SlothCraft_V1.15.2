
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.slothcraft.init;

import net.slothcraft.block.ZincOreBlockBlock;
import net.slothcraft.block.ZincOreBlock;
import net.slothcraft.block.VioletHazePlantBlock;
import net.slothcraft.block.UraniumOreBlockBlock;
import net.slothcraft.block.UraniumOreBlock;
import net.slothcraft.block.TitaniumOreBlockBlock;
import net.slothcraft.block.TitaniumOreBlock;
import net.slothcraft.block.TinOreBlockBlock;
import net.slothcraft.block.TinOreBlock;
import net.slothcraft.block.SteelOreBlockBlock;
import net.slothcraft.block.SilverOreBlockBlock;
import net.slothcraft.block.SilverOreBlock;
import net.slothcraft.block.RubyOreBlockBlock;
import net.slothcraft.block.RubyOreBlock;
import net.slothcraft.block.PlatinumOreBlockBlock;
import net.slothcraft.block.PlatinumOreBlock;
import net.slothcraft.block.PlatesMakerBlockBlock;
import net.slothcraft.block.OsmiumOreBlockBlock;
import net.slothcraft.block.OsmiumOreBlock;
import net.slothcraft.block.NickelOreBlockBlock;
import net.slothcraft.block.NickelOreBlock;
import net.slothcraft.block.MithrilOreBlockBlock;
import net.slothcraft.block.MithrilOreBlock;
import net.slothcraft.block.LeadOreBlockBlock;
import net.slothcraft.block.LeadOreBlock;
import net.slothcraft.block.JadeOreBlockBlock;
import net.slothcraft.block.JadeOreBlock;
import net.slothcraft.block.IridiumOreBlockBlock;
import net.slothcraft.block.IridiumOreBlock;
import net.slothcraft.block.GearsMakerBlockBlock;
import net.slothcraft.block.ChromiumOreBlockBlock;
import net.slothcraft.block.ChromiumOreBlock;
import net.slothcraft.block.AmethystOreBlockBlock;
import net.slothcraft.block.AmethystOreBlock;
import net.slothcraft.block.AluminumOreBlockBlock;
import net.slothcraft.block.AluminumOreBlock;

import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.block.Block;

import java.util.List;
import java.util.ArrayList;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class SlothcraftModBlocks {
	private static final List<Block> REGISTRY = new ArrayList<>();
	public static final Block GEARS_MAKER_BLOCK = register(new GearsMakerBlockBlock());
	public static final Block PLATES_MAKER_BLOCK = register(new PlatesMakerBlockBlock());
	public static final Block VIOLET_HAZE_PLANT = register(new VioletHazePlantBlock());
	public static final Block ALUMINUM_ORE = register(new AluminumOreBlock());
	public static final Block ALUMINUM_ORE_BLOCK = register(new AluminumOreBlockBlock());
	public static final Block AMETHYST_ORE = register(new AmethystOreBlock());
	public static final Block AMETHYST_ORE_BLOCK = register(new AmethystOreBlockBlock());
	public static final Block CHROMIUM_ORE = register(new ChromiumOreBlock());
	public static final Block CHROMIUM_ORE_BLOCK = register(new ChromiumOreBlockBlock());
	public static final Block IRIDIUM_ORE = register(new IridiumOreBlock());
	public static final Block IRIDIUM_ORE_BLOCK = register(new IridiumOreBlockBlock());
	public static final Block JADE_ORE = register(new JadeOreBlock());
	public static final Block JADE_ORE_BLOCK = register(new JadeOreBlockBlock());
	public static final Block LEAD_ORE = register(new LeadOreBlock());
	public static final Block LEAD_ORE_BLOCK = register(new LeadOreBlockBlock());
	public static final Block MITHRIL_ORE = register(new MithrilOreBlock());
	public static final Block MITHRIL_ORE_BLOCK = register(new MithrilOreBlockBlock());
	public static final Block NICKEL_ORE = register(new NickelOreBlock());
	public static final Block NICKEL_ORE_BLOCK = register(new NickelOreBlockBlock());
	public static final Block OSMIUM_ORE = register(new OsmiumOreBlock());
	public static final Block OSMIUM_ORE_BLOCK = register(new OsmiumOreBlockBlock());
	public static final Block PLATINUM_ORE = register(new PlatinumOreBlock());
	public static final Block PLATINUM_ORE_BLOCK = register(new PlatinumOreBlockBlock());
	public static final Block RUBY_ORE = register(new RubyOreBlock());
	public static final Block RUBY_ORE_BLOCK = register(new RubyOreBlockBlock());
	public static final Block SILVER_ORE = register(new SilverOreBlock());
	public static final Block SILVER_ORE_BLOCK = register(new SilverOreBlockBlock());
	public static final Block STEEL_ORE_BLOCK = register(new SteelOreBlockBlock());
	public static final Block TIN_ORE = register(new TinOreBlock());
	public static final Block TIN_ORE_BLOCK = register(new TinOreBlockBlock());
	public static final Block TITANIUM_ORE = register(new TitaniumOreBlock());
	public static final Block TITANIUM_ORE_BLOCK = register(new TitaniumOreBlockBlock());
	public static final Block URANIUM_ORE = register(new UraniumOreBlock());
	public static final Block URANIUM_ORE_BLOCK = register(new UraniumOreBlockBlock());
	public static final Block ZINC_ORE = register(new ZincOreBlock());
	public static final Block ZINC_ORE_BLOCK = register(new ZincOreBlockBlock());

	private static Block register(Block block) {
		REGISTRY.add(block);
		return block;
	}

	@SubscribeEvent
	public static void registerBlocks(RegistryEvent.Register<Block> event) {
		event.getRegistry().registerAll(REGISTRY.toArray(new Block[0]));
	}

	@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
	public static class ClientSideHandler {
		@SubscribeEvent
		public static void clientSetup(FMLClientSetupEvent event) {
			GearsMakerBlockBlock.registerRenderLayer();
			PlatesMakerBlockBlock.registerRenderLayer();
			VioletHazePlantBlock.registerRenderLayer();
			AluminumOreBlock.registerRenderLayer();
			AmethystOreBlock.registerRenderLayer();
			ChromiumOreBlock.registerRenderLayer();
			IridiumOreBlock.registerRenderLayer();
			JadeOreBlock.registerRenderLayer();
			LeadOreBlock.registerRenderLayer();
			MithrilOreBlock.registerRenderLayer();
			NickelOreBlock.registerRenderLayer();
			OsmiumOreBlock.registerRenderLayer();
			PlatinumOreBlock.registerRenderLayer();
			RubyOreBlock.registerRenderLayer();
			SilverOreBlock.registerRenderLayer();
			TinOreBlock.registerRenderLayer();
			TitaniumOreBlock.registerRenderLayer();
			UraniumOreBlock.registerRenderLayer();
			ZincOreBlock.registerRenderLayer();
		}
	}
}
