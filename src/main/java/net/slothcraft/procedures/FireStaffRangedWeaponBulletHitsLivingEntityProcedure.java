package net.slothcraft.procedures;

import net.slothcraft.SlothcraftModElements;

import net.minecraft.entity.Entity;

import java.util.Map;

@SlothcraftModElements.ModElement.Tag
public class FireStaffRangedWeaponBulletHitsLivingEntityProcedure extends SlothcraftModElements.ModElement {
	public FireStaffRangedWeaponBulletHitsLivingEntityProcedure(SlothcraftModElements instance) {
		super(instance, 193);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure FireStaffRangedWeaponBulletHitsLivingEntity!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		entity.setFire((int) 1);
	}
}
