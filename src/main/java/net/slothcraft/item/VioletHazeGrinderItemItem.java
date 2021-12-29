
package net.slothcraft.item;

import net.slothcraft.init.SlothcraftModTabs;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

public class VioletHazeGrinderItemItem extends Item {
	public VioletHazeGrinderItemItem() {
		super(new Item.Properties().tab(SlothcraftModTabs.TAB_SLOTH_CRAFT_OTHER_CREATIVE_TAB).stacksTo(1).rarity(Rarity.COMMON));
		setRegistryName("violet_haze_grinder_item");
	}

	@Override
	public boolean hasCraftingRemainingItem() {
		return true;
	}

	@Override
	public ItemStack getContainerItem(ItemStack itemstack) {
		return new ItemStack(this);
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 32;
	}

	@Override
	public boolean isFoil(ItemStack itemstack) {
		return true;
	}
}
