
package net.slothcraft.item;

import net.slothcraft.itemgroup.SlothCraftFoodCreativeTabItemGroup;
import net.slothcraft.SlothcraftModElements;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.UseAction;
import net.minecraft.item.Rarity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.Food;

@SlothcraftModElements.ModElement.Tag
public class CreamFoodItem extends SlothcraftModElements.ModElement {
	@ObjectHolder("slothcraft:cream_food")
	public static final Item block = null;
	public CreamFoodItem(SlothcraftModElements instance) {
		super(instance, 76);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new FoodItemCustom());
	}
	public static class FoodItemCustom extends Item {
		public FoodItemCustom() {
			super(new Item.Properties().group(SlothCraftFoodCreativeTabItemGroup.tab).maxStackSize(64).rarity(Rarity.COMMON)
					.food((new Food.Builder()).hunger(1).saturation(1f).build()));
			setRegistryName("cream_food");
		}

		@Override
		public int getUseDuration(ItemStack stack) {
			return 30;
		}

		@Override
		public UseAction getUseAction(ItemStack itemstack) {
			return UseAction.DRINK;
		}

		@Override
		public net.minecraft.util.SoundEvent getEatSound() {
			return net.minecraft.util.SoundEvents.ENTITY_GENERIC_DRINK;
		}
	}
}
