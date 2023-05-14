
package net.mcreator.test.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;

import net.mcreator.test.init.TestModTabs;

public class GrilledCheeseItem extends Item {
	public GrilledCheeseItem() {
		super(new Item.Properties().tab(TestModTabs.TAB_MOON).stacksTo(64).rarity(Rarity.UNCOMMON).food((new FoodProperties.Builder()).nutrition(10).saturationMod(2.6f)

				.build()));
	}
}
