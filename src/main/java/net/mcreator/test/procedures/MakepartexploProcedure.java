package net.mcreator.test.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.particles.SimpleParticleType;

import net.mcreator.test.init.TestModParticleTypes;

public class MakepartexploProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (world instanceof ServerLevel _level)
			_level.sendParticles((SimpleParticleType) (TestModParticleTypes.CHEESEHITPART.get()), x, (y + 1), z, 100, 0.1, 0.1, 0.1, 0.05);
	}
}
