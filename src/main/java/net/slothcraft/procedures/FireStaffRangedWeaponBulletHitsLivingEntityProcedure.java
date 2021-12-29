package net.slothcraft.procedures;

import net.slothcraft.SlothcraftMod;

import net.minecraft.entity.Entity;

import java.util.Map;

public class FireStaffRangedWeaponBulletHitsLivingEntityProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				SlothcraftMod.LOGGER.warn("Failed to load dependency entity for procedure FireStaffRangedWeaponBulletHitsLivingEntity!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		entity.setFire((int) 1);
	}
}
