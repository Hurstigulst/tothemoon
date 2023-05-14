
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.test.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.biome.Biome;

import net.mcreator.test.world.biome.TheMoonBiome;
import net.mcreator.test.world.biome.LunarMariaBiome;
import net.mcreator.test.TestMod;

public class TestModBiomes {
	public static final DeferredRegister<Biome> REGISTRY = DeferredRegister.create(ForgeRegistries.BIOMES, TestMod.MODID);
	public static final RegistryObject<Biome> LUNAR_MARIA = REGISTRY.register("lunar_maria", LunarMariaBiome::createBiome);
	public static final RegistryObject<Biome> THE_MOON = REGISTRY.register("the_moon", TheMoonBiome::createBiome);
}
