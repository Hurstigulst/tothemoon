
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.test.init;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;

public class TestModTabs {
	public static CreativeModeTab TAB_MOON;

	public static void load() {
		TAB_MOON = new CreativeModeTab("tabmoon") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(TestModItems.HANDHELD_MOON.get());
			}

			@Override
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
}
