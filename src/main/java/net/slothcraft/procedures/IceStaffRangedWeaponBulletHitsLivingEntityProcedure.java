package net.slothcraft.procedures;

import net.slothcraft.SlothcraftModElements;

import net.minecraft.potion.Effects;
import net.minecraft.potion.EffectInstance;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;

import java.util.Map;

@SlothcraftModElements.ModElement.Tag
public class IceStaffRangedWeaponBulletHitsLivingEntityProcedure extends SlothcraftModElements.ModElement {
	public IceStaffRangedWeaponBulletHitsLivingEntityProcedure(SlothcraftModElements instance) {
		super(instance, 198);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure IceStaffRangedWeaponBulletHitsLivingEntity!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (entity instanceof LivingEntity)
			((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.SLOWNESS, (int) 20, (int) 2, (false), (false)));
	}
}
