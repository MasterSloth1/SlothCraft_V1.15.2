
package net.slothcraft.item;

import net.slothcraft.init.SlothcraftModTabs;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

public class MithrilIngotItem extends Item {
	public MithrilIngotItem() {
		super(new Item.Properties().tab(SlothcraftModTabs.TAB_SLOTH_CRAFT_ORES_CREATIVE_TAB).stacksTo(64).rarity(Rarity.COMMON));
		setRegistryName("mithril_ingot");
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 0;
	}
}
