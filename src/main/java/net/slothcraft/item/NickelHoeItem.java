
package net.slothcraft.item;

import net.slothcraft.init.SlothcraftModTabs;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.HoeItem;

public class NickelHoeItem extends HoeItem {
	public NickelHoeItem() {
		super(new Tier() {
			public int getUses() {
				return 441;
			}

			public float getSpeed() {
				return 8f;
			}

			public float getAttackDamageBonus() {
				return 1f;
			}

			public int getLevel() {
				return 2;
			}

			public int getEnchantmentValue() {
				return 21;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.EMPTY;
			}
		}, 0, -3f, new Item.Properties().tab(SlothcraftModTabs.TAB_SLOTH_CRAFT_ARMOUR_AND_TOOLS_CREATIVE_TAB));
		setRegistryName("nickel_hoe");
	}
}
