package net.mcreator.test.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.particles.SimpleParticleType;

import net.mcreator.test.init.TestModParticleTypes;

public class WalkdustProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (world instanceof ServerLevel _level)
			_level.sendParticles((SimpleParticleType) (TestModParticleTypes.MOON_DUST.get()), (x + 0.5), (y + 1.1), (z + 0.5), 2, 0.25, 0.15, 0.25, 0.1);
	}
}
