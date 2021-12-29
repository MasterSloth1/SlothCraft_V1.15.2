
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.slothcraft.init;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;

public class SlothcraftModTabs {
	public static CreativeModeTab TAB_SLOTH_CRAFT_GEARS_CREATIVE_TAB;
	public static CreativeModeTab TAB_SLOTH_CRAFT_PLATES_CREATIVE_TAB;
	public static CreativeModeTab TAB_SLOTH_CRAFT_FOOD_CREATIVE_TAB;
	public static CreativeModeTab TAB_SLOTH_CRAFT_OTHER_CREATIVE_TAB;
	public static CreativeModeTab TAB_SLOTH_CRAFT_ARMOUR_AND_TOOLS_CREATIVE_TAB;
	public static CreativeModeTab TAB_SLOTH_CRAFT_ORES_CREATIVE_TAB;

	public static void load() {
		TAB_SLOTH_CRAFT_GEARS_CREATIVE_TAB = new CreativeModeTab("tabsloth_craft_gears_creative_tab") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(SlothcraftModItems.AMETHYST_GEAR_ITEM);
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return true;
			}
		}.setBackgroundSuffix("item_search.png");
		TAB_SLOTH_CRAFT_PLATES_CREATIVE_TAB = new CreativeModeTab("tabsloth_craft_plates_creative_tab") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(SlothcraftModItems.AMETHYST_PLATE_ITEM);
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return true;
			}
		}.setBackgroundSuffix("item_search.png");
		TAB_SLOTH_CRAFT_FOOD_CREATIVE_TAB = new CreativeModeTab("tabsloth_craft_food_creative_tab") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(SlothcraftModItems.BACON_FOOD);
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return true;
			}
		}.setBackgroundSuffix("item_search.png");
		TAB_SLOTH_CRAFT_OTHER_CREATIVE_TAB = new CreativeModeTab("tabsloth_craft_other_creative_tab") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(SlothcraftModItems.SHINY_DIAMOND);
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return true;
			}
		}.setBackgroundSuffix("item_search.png");
		TAB_SLOTH_CRAFT_ARMOUR_AND_TOOLS_CREATIVE_TAB = new CreativeModeTab("tabsloth_craft_armour_and_tools_creative_tab") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(SlothcraftModItems.KNIFE_ITEM);
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return true;
			}
		}.setBackgroundSuffix("item_search.png");
		TAB_SLOTH_CRAFT_ORES_CREATIVE_TAB = new CreativeModeTab("tabsloth_craft_ores_creative_tab") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(SlothcraftModBlocks.AMETHYST_ORE);
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return true;
			}
		}.setBackgroundSuffix("item_search.png");
	}
}
