
package net.slothcraft.item;

import net.slothcraft.itemgroup.SlothCraftArmourAndWeaponsCreativeTabItemGroup;
import net.slothcraft.SlothcraftModElements;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.ShovelItem;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;

@SlothcraftModElements.ModElement.Tag
public class AluminumShovelItem extends SlothcraftModElements.ModElement {
	@ObjectHolder("slothcraft:aluminum_shovel")
	public static final Item block = null;

	public AluminumShovelItem(SlothcraftModElements instance) {
		super(instance, 218);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ShovelItem(new IItemTier() {
			public int getMaxUses() {
				return 286;
			}

			public float getEfficiency() {
				return 6f;
			}

			public float getAttackDamage() {
				return 0f;
			}

			public int getHarvestLevel() {
				return 1;
			}

			public int getEnchantability() {
				return 15;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.EMPTY;
			}
		}, 1, -3f, new Item.Properties().group(SlothCraftArmourAndWeaponsCreativeTabItemGroup.tab)) {
		}.setRegistryName("aluminum_shovel"));
	}
}
