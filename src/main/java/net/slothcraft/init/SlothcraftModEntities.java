
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.slothcraft.init;

import net.slothcraft.entity.WitherStaffRangedWeaponEntity;
import net.slothcraft.entity.PoisonStaffRangedWeaponEntity;
import net.slothcraft.entity.IceStaffRangedWeaponEntity;
import net.slothcraft.entity.FireStaffRangedWeaponEntity;

import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.event.RegistryEvent;

import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;

import java.util.List;
import java.util.ArrayList;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class SlothcraftModEntities {
	private static final List<EntityType<?>> REGISTRY = new ArrayList<>();
	public static final EntityType<FireStaffRangedWeaponEntity> FIRE_STAFF_RANGED_WEAPON = register("entitybulletfire_staff_ranged_weapon",
			EntityType.Builder.<FireStaffRangedWeaponEntity>of(FireStaffRangedWeaponEntity::new, MobCategory.MISC)
					.setCustomClientFactory(FireStaffRangedWeaponEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final EntityType<PoisonStaffRangedWeaponEntity> POISON_STAFF_RANGED_WEAPON = register("entitybulletpoison_staff_ranged_weapon",
			EntityType.Builder.<PoisonStaffRangedWeaponEntity>of(PoisonStaffRangedWeaponEntity::new, MobCategory.MISC)
					.setCustomClientFactory(PoisonStaffRangedWeaponEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final EntityType<IceStaffRangedWeaponEntity> ICE_STAFF_RANGED_WEAPON = register("entitybulletice_staff_ranged_weapon",
			EntityType.Builder.<IceStaffRangedWeaponEntity>of(IceStaffRangedWeaponEntity::new, MobCategory.MISC)
					.setCustomClientFactory(IceStaffRangedWeaponEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final EntityType<WitherStaffRangedWeaponEntity> WITHER_STAFF_RANGED_WEAPON = register("entitybulletwither_staff_ranged_weapon",
			EntityType.Builder.<WitherStaffRangedWeaponEntity>of(WitherStaffRangedWeaponEntity::new, MobCategory.MISC)
					.setCustomClientFactory(WitherStaffRangedWeaponEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(1).sized(0.5f, 0.5f));

	private static <T extends Entity> EntityType<T> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		EntityType<T> entityType = (EntityType<T>) entityTypeBuilder.build(registryname).setRegistryName(registryname);
		REGISTRY.add(entityType);
		return entityType;
	}

	@SubscribeEvent
	public static void registerEntities(RegistryEvent.Register<EntityType<?>> event) {
		event.getRegistry().registerAll(REGISTRY.toArray(new EntityType[0]));
	}

	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		event.enqueueWork(() -> {
		});
	}

	@SubscribeEvent
	public static void registerAttributes(EntityAttributeCreationEvent event) {
	}
}
