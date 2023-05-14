
package net.mcreator.test.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.LivingEntity;

import net.mcreator.test.procedures.MakepartexploProcedure;
import net.mcreator.test.init.TestModTabs;
import net.mcreator.test.init.TestModItems;

public class CheeseSwordItem extends SwordItem {
	public CheeseSwordItem() {
		super(new Tier() {
			public int getUses() {
				return 40;
			}

			public float getSpeed() {
				return 4f;
			}

			public float getAttackDamageBonus() {
				return 13f;
			}

			public int getLevel() {
				return 1;
			}

			public int getEnchantmentValue() {
				return 2;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(TestModItems.HANDHELD_MOON.get()), new ItemStack(TestModItems.HANDHELD_EARTH.get()));
			}
		}, 3, -0.5f, new Item.Properties().tab(TestModTabs.TAB_MOON));
	}

	@Override
	public boolean hurtEnemy(ItemStack itemstack, LivingEntity entity, LivingEntity sourceentity) {
		boolean retval = super.hurtEnemy(itemstack, entity, sourceentity);
		MakepartexploProcedure.execute(entity.level, entity.getX(), entity.getY(), entity.getZ());
		return retval;
	}
}
