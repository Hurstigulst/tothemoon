
package net.mcreator.test.block;

import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.LiquidBlock;

import net.mcreator.test.init.TestModFluids;

public class AntiwaterBlock extends LiquidBlock {
	public AntiwaterBlock() {
		super(() -> TestModFluids.ANTIWATER.get(), BlockBehaviour.Properties.of(Material.WATER).strength(100f).noCollission().noLootTable());
	}
}
