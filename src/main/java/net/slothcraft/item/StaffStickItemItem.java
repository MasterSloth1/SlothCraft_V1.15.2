
package net.slothcraft.item;

import net.slothcraft.init.SlothcraftModTabs;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

public class StaffStickItemItem extends Item {
	public StaffStickItemItem() {
		super(new Item.Properties().tab(SlothcraftModTabs.TAB_SLOTH_CRAFT_ARMOUR_AND_TOOLS_CREATIVE_TAB).stacksTo(64).rarity(Rarity.COMMON));
		setRegistryName("staff_stick_item");
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 0;
	}
}
