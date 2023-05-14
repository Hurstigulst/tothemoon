
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.test.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;

import net.minecraft.world.level.levelgen.feature.Feature;

import net.mcreator.test.world.features.ores.CheeseOreFeature;
import net.mcreator.test.world.features.MoonmeteorFeature;
import net.mcreator.test.world.features.MoonDungeonFeature;
import net.mcreator.test.TestMod;

@Mod.EventBusSubscriber
public class TestModFeatures {
	public static final DeferredRegister<Feature<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.FEATURES, TestMod.MODID);
	public static final RegistryObject<Feature<?>> CHEESE_ORE = REGISTRY.register("cheese_ore", CheeseOreFeature::feature);
	public static final RegistryObject<Feature<?>> MOONMETEOR = REGISTRY.register("moonmeteor", MoonmeteorFeature::feature);
	public static final RegistryObject<Feature<?>> MOON_DUNGEON = REGISTRY.register("moon_dungeon", MoonDungeonFeature::feature);
}
