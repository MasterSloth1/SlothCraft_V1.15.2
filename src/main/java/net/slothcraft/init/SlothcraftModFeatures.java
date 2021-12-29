
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.slothcraft.init;

import net.slothcraft.world.features.plants.VioletHazePlantFeature;
import net.slothcraft.world.features.ores.ZincOreFeature;
import net.slothcraft.world.features.ores.UraniumOreFeature;
import net.slothcraft.world.features.ores.TitaniumOreFeature;
import net.slothcraft.world.features.ores.TinOreFeature;
import net.slothcraft.world.features.ores.SilverOreFeature;
import net.slothcraft.world.features.ores.RubyOreFeature;
import net.slothcraft.world.features.ores.PlatinumOreFeature;
import net.slothcraft.world.features.ores.OsmiumOreFeature;
import net.slothcraft.world.features.ores.NickelOreFeature;
import net.slothcraft.world.features.ores.MithrilOreFeature;
import net.slothcraft.world.features.ores.LeadOreFeature;
import net.slothcraft.world.features.ores.JadeOreFeature;
import net.slothcraft.world.features.ores.IridiumOreFeature;
import net.slothcraft.world.features.ores.CopperOreFeature;
import net.slothcraft.world.features.ores.ChromiumOreFeature;
import net.slothcraft.world.features.ores.AmethystOreFeature;
import net.slothcraft.world.features.ores.AluminumOreFeature;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.world.BiomeLoadingEvent;
import net.minecraftforge.event.RegistryEvent;

import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.data.BuiltinRegistries;
import net.minecraft.core.Registry;

import java.util.Set;
import java.util.Map;
import java.util.HashMap;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class SlothcraftModFeatures {
	private static final Map<Feature<?>, FeatureRegistration> REGISTRY = new HashMap<>();
	static {
		REGISTRY.put(VioletHazePlantFeature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.VEGETAL_DECORATION,
				VioletHazePlantFeature.GENERATE_BIOMES, VioletHazePlantFeature.CONFIGURED_FEATURE));
		REGISTRY.put(AluminumOreFeature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES,
				AluminumOreFeature.GENERATE_BIOMES, AluminumOreFeature.CONFIGURED_FEATURE));
		REGISTRY.put(AmethystOreFeature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES,
				AmethystOreFeature.GENERATE_BIOMES, AmethystOreFeature.CONFIGURED_FEATURE));
		REGISTRY.put(ChromiumOreFeature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES,
				ChromiumOreFeature.GENERATE_BIOMES, ChromiumOreFeature.CONFIGURED_FEATURE));
		REGISTRY.put(CopperOreFeature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES, CopperOreFeature.GENERATE_BIOMES,
				CopperOreFeature.CONFIGURED_FEATURE));
		REGISTRY.put(IridiumOreFeature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES, IridiumOreFeature.GENERATE_BIOMES,
				IridiumOreFeature.CONFIGURED_FEATURE));
		REGISTRY.put(JadeOreFeature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES, JadeOreFeature.GENERATE_BIOMES,
				JadeOreFeature.CONFIGURED_FEATURE));
		REGISTRY.put(LeadOreFeature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES, LeadOreFeature.GENERATE_BIOMES,
				LeadOreFeature.CONFIGURED_FEATURE));
		REGISTRY.put(MithrilOreFeature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES, MithrilOreFeature.GENERATE_BIOMES,
				MithrilOreFeature.CONFIGURED_FEATURE));
		REGISTRY.put(NickelOreFeature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES, NickelOreFeature.GENERATE_BIOMES,
				NickelOreFeature.CONFIGURED_FEATURE));
		REGISTRY.put(OsmiumOreFeature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES, OsmiumOreFeature.GENERATE_BIOMES,
				OsmiumOreFeature.CONFIGURED_FEATURE));
		REGISTRY.put(PlatinumOreFeature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES,
				PlatinumOreFeature.GENERATE_BIOMES, PlatinumOreFeature.CONFIGURED_FEATURE));
		REGISTRY.put(RubyOreFeature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES, RubyOreFeature.GENERATE_BIOMES,
				RubyOreFeature.CONFIGURED_FEATURE));
		REGISTRY.put(SilverOreFeature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES, SilverOreFeature.GENERATE_BIOMES,
				SilverOreFeature.CONFIGURED_FEATURE));
		REGISTRY.put(TinOreFeature.FEATURE,
				new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES, TinOreFeature.GENERATE_BIOMES, TinOreFeature.CONFIGURED_FEATURE));
		REGISTRY.put(TitaniumOreFeature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES,
				TitaniumOreFeature.GENERATE_BIOMES, TitaniumOreFeature.CONFIGURED_FEATURE));
		REGISTRY.put(UraniumOreFeature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES, UraniumOreFeature.GENERATE_BIOMES,
				UraniumOreFeature.CONFIGURED_FEATURE));
		REGISTRY.put(ZincOreFeature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES, ZincOreFeature.GENERATE_BIOMES,
				ZincOreFeature.CONFIGURED_FEATURE));
	}

	@SubscribeEvent
	public static void registerFeature(RegistryEvent.Register<Feature<?>> event) {
		event.getRegistry().registerAll(REGISTRY.keySet().toArray(new Feature[0]));
		REGISTRY.forEach((feature, registration) -> Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, feature.getRegistryName(),
				registration.configuredFeature()));
	}

	@Mod.EventBusSubscriber
	private static class BiomeFeatureLoader {
		@SubscribeEvent
		public static void addFeatureToBiomes(BiomeLoadingEvent event) {
			for (FeatureRegistration registration : REGISTRY.values()) {
				if (registration.biomes() == null || registration.biomes().contains(event.getName())) {
					event.getGeneration().getFeatures(registration.stage()).add(() -> registration.configuredFeature());
				}
			}
		}
	}

	private static record FeatureRegistration(GenerationStep.Decoration stage, Set<ResourceLocation> biomes,
			ConfiguredFeature<?, ?> configuredFeature) {
	}
}
