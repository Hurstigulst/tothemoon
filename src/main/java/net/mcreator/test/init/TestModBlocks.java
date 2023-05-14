
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.test.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.test.block.MoonRockCobblestoneBlock;
import net.mcreator.test.block.MoonRockBlock;
import net.mcreator.test.block.MoonDirtBlock;
import net.mcreator.test.block.DarkMoonDirtBlock;
import net.mcreator.test.block.CheeseOreBlock;
import net.mcreator.test.block.BlockOfCheeseBlock;
import net.mcreator.test.TestMod;

public class TestModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, TestMod.MODID);
	public static final RegistryObject<Block> MOON_DIRT = REGISTRY.register("moon_dirt", () -> new MoonDirtBlock());
	public static final RegistryObject<Block> MOON_ROCK = REGISTRY.register("moon_rock", () -> new MoonRockBlock());
	public static final RegistryObject<Block> MOON_ROCK_COBBLESTONE = REGISTRY.register("moon_rock_cobblestone", () -> new MoonRockCobblestoneBlock());
	public static final RegistryObject<Block> DARK_MOON_DIRT = REGISTRY.register("dark_moon_dirt", () -> new DarkMoonDirtBlock());
	public static final RegistryObject<Block> CHEESE_ORE = REGISTRY.register("cheese_ore", () -> new CheeseOreBlock());
	public static final RegistryObject<Block> BLOCK_OF_CHEESE = REGISTRY.register("block_of_cheese", () -> new BlockOfCheeseBlock());
}
