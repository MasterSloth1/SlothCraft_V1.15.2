
package net.slothcraft.item;

import net.slothcraft.init.SlothcraftModTabs;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.Entity;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;

public abstract class PlatinumArmorItem extends ArmorItem {
	public PlatinumArmorItem(EquipmentSlot slot, Item.Properties properties) {
		super(new ArmorMaterial() {
			@Override
			public int getDurabilityForSlot(EquipmentSlot slot) {
				return new int[]{13, 15, 16, 11}[slot.getIndex()] * 36;
			}

			@Override
			public int getDefenseForSlot(EquipmentSlot slot) {
				return new int[]{5, 14, 12, 5}[slot.getIndex()];
			}

			@Override
			public int getEnchantmentValue() {
				return 22;
			}

			@Override
			public SoundEvent getEquipSound() {
				return ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation(""));
			}

			@Override
			public Ingredient getRepairIngredient() {
				return Ingredient.EMPTY;
			}

			@Override
			public String getName() {
				return "platinum_armor";
			}

			@Override
			public float getToughness() {
				return 0f;
			}

			@Override
			public float getKnockbackResistance() {
				return 0f;
			}
		}, slot, properties);
	}

	public static class Helmet extends PlatinumArmorItem {
		public Helmet() {
			super(EquipmentSlot.HEAD, new Item.Properties().tab(SlothcraftModTabs.TAB_SLOTH_CRAFT_ARMOUR_AND_TOOLS_CREATIVE_TAB));
			setRegistryName("platinum_armor_helmet");
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "slothcraft:textures/models/armor/platinum_layer_1.png";
		}
	}

	public static class Chestplate extends PlatinumArmorItem {
		public Chestplate() {
			super(EquipmentSlot.CHEST, new Item.Properties().tab(SlothcraftModTabs.TAB_SLOTH_CRAFT_ARMOUR_AND_TOOLS_CREATIVE_TAB));
			setRegistryName("platinum_armor_chestplate");
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "slothcraft:textures/models/armor/platinum_layer_1.png";
		}
	}

	public static class Leggings extends PlatinumArmorItem {
		public Leggings() {
			super(EquipmentSlot.LEGS, new Item.Properties().tab(SlothcraftModTabs.TAB_SLOTH_CRAFT_ARMOUR_AND_TOOLS_CREATIVE_TAB));
			setRegistryName("platinum_armor_leggings");
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "slothcraft:textures/models/armor/platinum_layer_2.png";
		}
	}

	public static class Boots extends PlatinumArmorItem {
		public Boots() {
			super(EquipmentSlot.FEET, new Item.Properties().tab(SlothcraftModTabs.TAB_SLOTH_CRAFT_ARMOUR_AND_TOOLS_CREATIVE_TAB));
			setRegistryName("platinum_armor_boots");
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "slothcraft:textures/models/armor/platinum_layer_1.png";
		}
	}
}
