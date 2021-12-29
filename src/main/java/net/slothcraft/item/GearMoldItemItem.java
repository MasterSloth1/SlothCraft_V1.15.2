
package net.slothcraft.item;

import net.slothcraft.init.SlothcraftModTabs;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

public class GearMoldItemItem extends Item {
	public GearMoldItemItem() {
		super(new Item.Properties().tab(SlothcraftModTabs.TAB_SLOTH_CRAFT_GEARS_CREATIVE_TAB).durability(64).rarity(Rarity.COMMON));
		setRegistryName("gear_mold_item");
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
	public boolean isRepairable(ItemStack itemstack) {
		return false;
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 64;
	}
}
