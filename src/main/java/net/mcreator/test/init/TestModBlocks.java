
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.test.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.test.block.SapphireOreBlock;
import net.mcreator.test.block.MoonRockCobblestoneBlock;
import net.mcreator.test.block.MoonRockBlock;
import net.mcreator.test.block.MoonDirtBlock;
import net.mcreator.test.block.MoonBrickStairsBlock;
import net.mcreator.test.block.MoonBrickSlabBlock;
import net.mcreator.test.block.MoonBrickBlock;
import net.mcreator.test.block.DarkMoonDirtBlock;
import net.mcreator.test.block.CheeseOreBlock;
import net.mcreator.test.block.CheeseLampBlock;
import net.mcreator.test.block.BlockOfCheeseBlock;
import net.mcreator.test.block.AntiwaterBlock;
import net.mcreator.test.TestMod;

public class TestModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, TestMod.MODID);
	public static final RegistryObject<Block> MOON_DIRT = REGISTRY.register("moon_dirt", () -> new MoonDirtBlock());
	public static final RegistryObject<Block> MOON_ROCK = REGISTRY.register("moon_rock", () -> new MoonRockBlock());
	public static final RegistryObject<Block> MOON_ROCK_COBBLESTONE = REGISTRY.register("moon_rock_cobblestone", () -> new MoonRockCobblestoneBlock());
	public static final RegistryObject<Block> DARK_MOON_DIRT = REGISTRY.register("dark_moon_dirt", () -> new DarkMoonDirtBlock());
	public static final RegistryObject<Block> CHEESE_ORE = REGISTRY.register("cheese_ore", () -> new CheeseOreBlock());
	public static final RegistryObject<Block> BLOCK_OF_CHEESE = REGISTRY.register("block_of_cheese", () -> new BlockOfCheeseBlock());
	public static final RegistryObject<Block> MOON_BRICK = REGISTRY.register("moon_brick", () -> new MoonBrickBlock());
	public static final RegistryObject<Block> MOON_BRICK_STAIRS = REGISTRY.register("moon_brick_stairs", () -> new MoonBrickStairsBlock());
	public static final RegistryObject<Block> CHEESE_LAMP = REGISTRY.register("cheese_lamp", () -> new CheeseLampBlock());
	public static final RegistryObject<Block> MOON_BRICK_SLAB = REGISTRY.register("moon_brick_slab", () -> new MoonBrickSlabBlock());
	public static final RegistryObject<Block> SAPPHIRE_ORE = REGISTRY.register("sapphire_ore", () -> new SapphireOreBlock());
	public static final RegistryObject<Block> ANTIWATER = REGISTRY.register("antiwater", () -> new AntiwaterBlock());
}
