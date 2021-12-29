
package net.slothcraft.item;

import net.slothcraft.itemgroup.SlothCraftGearsCreativeTabItemGroup;
import net.slothcraft.SlothcraftModElements;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.Rarity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.block.BlockState;

@SlothcraftModElements.ModElement.Tag
public class GearMoldItemItem extends SlothcraftModElements.ModElement {
	@ObjectHolder("slothcraft:gear_mold_item")
	public static final Item block = null;

	public GearMoldItemItem(SlothcraftModElements instance) {
		super(instance, 33);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}

	public static class ItemCustom extends Item {
		public ItemCustom() {
			super(new Item.Properties().group(SlothCraftGearsCreativeTabItemGroup.tab).maxDamage(64).rarity(Rarity.COMMON));
			setRegistryName("gear_mold_item");
		}

		@Override
		public boolean hasContainerItem() {
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
		public int getItemEnchantability() {
			return 0;
		}

		@Override
		public int getUseDuration(ItemStack itemstack) {
			return 64;
		}

		@Override
		public float getDestroySpeed(ItemStack par1ItemStack, BlockState par2Block) {
			return 1F;
		}
	}
}
