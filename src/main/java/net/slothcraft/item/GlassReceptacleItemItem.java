
package net.slothcraft.item;

import net.slothcraft.init.SlothcraftModTabs;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

public class GlassReceptacleItemItem extends Item {
	public GlassReceptacleItemItem() {
		super(new Item.Properties().tab(SlothcraftModTabs.TAB_SLOTH_CRAFT_OTHER_CREATIVE_TAB).stacksTo(64).rarity(Rarity.COMMON));
		setRegistryName("glass_receptacle_item");
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 0;
	}

	@Override
	public boolean isFoil(ItemStack itemstack) {
		return true;
	}
}
