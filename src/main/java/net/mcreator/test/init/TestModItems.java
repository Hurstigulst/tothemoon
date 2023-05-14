
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.test.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BlockItem;

import net.mcreator.test.item.OxygenBottleItem;
import net.mcreator.test.item.MoonStoneShovelItem;
import net.mcreator.test.item.MoonRockCobblestonePickaxeItem;
import net.mcreator.test.item.MoonCobblestoneSwordItem;
import net.mcreator.test.item.HandheldMoonItem;
import net.mcreator.test.item.HandheldEarthItem;
import net.mcreator.test.item.GrilledCheeseItem;
import net.mcreator.test.item.CheesebulletItem;
import net.mcreator.test.item.CheeseSwordItem;
import net.mcreator.test.item.CheeseCurdItem;
import net.mcreator.test.item.CheeseBowItem;
import net.mcreator.test.TestMod;

public class TestModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, TestMod.MODID);
	public static final RegistryObject<Item> MOON_DIRT = block(TestModBlocks.MOON_DIRT, TestModTabs.TAB_MOON);
	public static final RegistryObject<Item> HANDHELD_MOON = REGISTRY.register("handheld_moon", () -> new HandheldMoonItem());
	public static final RegistryObject<Item> MOON_ROCK = block(TestModBlocks.MOON_ROCK, TestModTabs.TAB_MOON);
	public static final RegistryObject<Item> MOON_ROCK_COBBLESTONE = block(TestModBlocks.MOON_ROCK_COBBLESTONE, TestModTabs.TAB_MOON);
	public static final RegistryObject<Item> MOON_ROCK_COBBLESTONE_PICKAXE = REGISTRY.register("moon_rock_cobblestone_pickaxe", () -> new MoonRockCobblestonePickaxeItem());
	public static final RegistryObject<Item> MOON_COBBLESTONE_SWORD = REGISTRY.register("moon_cobblestone_sword", () -> new MoonCobblestoneSwordItem());
	public static final RegistryObject<Item> DARK_MOON_DIRT = block(TestModBlocks.DARK_MOON_DIRT, TestModTabs.TAB_MOON);
	public static final RegistryObject<Item> MOON_STONE_SHOVEL = REGISTRY.register("moon_stone_shovel", () -> new MoonStoneShovelItem());
	public static final RegistryObject<Item> HANDHELD_EARTH = REGISTRY.register("handheld_earth", () -> new HandheldEarthItem());
	public static final RegistryObject<Item> CHEESE_CURD = REGISTRY.register("cheese_curd", () -> new CheeseCurdItem());
	public static final RegistryObject<Item> GRILLED_CHEESE = REGISTRY.register("grilled_cheese", () -> new GrilledCheeseItem());
	public static final RegistryObject<Item> CHEESE_ORE = block(TestModBlocks.CHEESE_ORE, TestModTabs.TAB_MOON);
	public static final RegistryObject<Item> CHEESE_SWORD = REGISTRY.register("cheese_sword", () -> new CheeseSwordItem());
	public static final RegistryObject<Item> CHEESEBULLET = REGISTRY.register("cheesebullet", () -> new CheesebulletItem());
	public static final RegistryObject<Item> CHEESE_BOW = REGISTRY.register("cheese_bow", () -> new CheeseBowItem());
	public static final RegistryObject<Item> OXYGEN_BOTTLE = REGISTRY.register("oxygen_bottle", () -> new OxygenBottleItem());
	public static final RegistryObject<Item> BLOCK_OF_CHEESE = block(TestModBlocks.BLOCK_OF_CHEESE, TestModTabs.TAB_MOON);

	private static RegistryObject<Item> block(RegistryObject<Block> block, CreativeModeTab tab) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
	}
}
