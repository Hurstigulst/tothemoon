
package net.mcreator.test.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

import net.mcreator.test.init.TestModTabs;

public class CheesebulletItem extends Item {
	public CheesebulletItem() {
		super(new Item.Properties().tab(TestModTabs.TAB_MOON).stacksTo(15).rarity(Rarity.COMMON));
	}
}
