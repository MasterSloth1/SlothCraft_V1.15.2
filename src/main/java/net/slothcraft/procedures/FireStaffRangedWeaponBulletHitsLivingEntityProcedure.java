package net.slothcraft.procedures;

import net.minecraft.world.entity.Entity;

public class FireStaffRangedWeaponBulletHitsLivingEntityProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		entity.setSecondsOnFire(1);
	}
}
