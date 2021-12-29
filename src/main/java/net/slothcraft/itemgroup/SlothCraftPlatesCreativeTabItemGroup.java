
package net.slothcraft.itemgroup;

import net.slothcraft.item.AmethystPlateItemItem;
import net.slothcraft.SlothcraftModElements;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;

@SlothcraftModElements.ModElement.Tag
public class SlothCraftPlatesCreativeTabItemGroup extends SlothcraftModElements.ModElement {
	public SlothCraftPlatesCreativeTabItemGroup(SlothcraftModElements instance) {
		super(instance, 121);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("tabsloth_craft_plates_creative_tab") {
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(AmethystPlateItemItem.block);
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return true;
			}
		}.setBackgroundImageName("item_search.png");
	}

	public static ItemGroup tab;
}
