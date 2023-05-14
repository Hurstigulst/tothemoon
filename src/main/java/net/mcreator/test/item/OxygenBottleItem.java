
package net.mcreator.test.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

import net.mcreator.test.init.TestModTabs;

public class OxygenBottleItem extends Item {
	public OxygenBottleItem() {
		super(new Item.Properties().tab(TestModTabs.TAB_MOON).stacksTo(1).rarity(Rarity.UNCOMMON));
	}
}
