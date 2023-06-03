
/*
 * MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.test.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fluids.FluidType;

import net.mcreator.test.fluid.types.AntiwaterFluidType;
import net.mcreator.test.TestMod;

public class TestModFluidTypes {
	public static final DeferredRegister<FluidType> REGISTRY = DeferredRegister.create(ForgeRegistries.Keys.FLUID_TYPES, TestMod.MODID);
	public static final RegistryObject<FluidType> ANTIWATER_TYPE = REGISTRY.register("antiwater", () -> new AntiwaterFluidType());
}
