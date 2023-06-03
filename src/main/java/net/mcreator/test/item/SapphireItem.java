
package net.mcreator.test.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

import net.mcreator.test.init.TestModTabs;

public class SapphireItem extends Item {
	public SapphireItem() {
		super(new Item.Properties().tab(TestModTabs.TAB_MOON).stacksTo(64).rarity(Rarity.UNCOMMON));
	}
}
