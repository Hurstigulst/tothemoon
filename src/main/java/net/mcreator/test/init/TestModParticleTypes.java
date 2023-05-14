
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.test.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.core.particles.ParticleType;

import net.mcreator.test.TestMod;

public class TestModParticleTypes {
	public static final DeferredRegister<ParticleType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.PARTICLE_TYPES, TestMod.MODID);
	public static final RegistryObject<SimpleParticleType> CHEESEHITPART = REGISTRY.register("cheesehitpart", () -> new SimpleParticleType(false));
	public static final RegistryObject<SimpleParticleType> MOON_DUST = REGISTRY.register("moon_dust", () -> new SimpleParticleType(true));
}
