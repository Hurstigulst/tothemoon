
package net.mcreator.test.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BucketItem;

import net.mcreator.test.init.TestModTabs;
import net.mcreator.test.init.TestModFluids;

public class AntiwaterItem extends BucketItem {
	public AntiwaterItem() {
		super(TestModFluids.ANTIWATER, new Item.Properties().craftRemainder(Items.BUCKET).stacksTo(1).rarity(Rarity.EPIC).tab(TestModTabs.TAB_MOON));
	}
}
