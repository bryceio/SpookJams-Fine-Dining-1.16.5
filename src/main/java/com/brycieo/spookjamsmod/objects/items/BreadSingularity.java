package com.brycieo.spookjamsmod.objects.items;

import java.util.List;

import com.brycieo.spookjamsmod.SpookJamsMod;
import com.brycieo.spookjamsmod.lists.FoodList;
import com.brycieo.spookjamsmod.lists.ItemList;

import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.world.World;

public class BreadSingularity extends Item{

	public BreadSingularity(Properties p_i48487_1_) {
		super(new Item.Properties().tab(ItemGroup.TAB_MATERIALS).food(FoodList.GLUTENFREEBREAD).stacksTo(1));
	}
	
	@Override
	public void appendHoverText(ItemStack stack, World worldIn, List<ITextComponent> tooltip, ITooltipFlag flagIn) {
		super.appendHoverText(stack, worldIn, tooltip, flagIn);
		tooltip.add(new StringTextComponent("\u00A73" + "Perhaps now it's edible?" + "\u00A73"));
	}
	
	@Override
	public ItemStack finishUsingItem(ItemStack stack, World worldIn, LivingEntity entityLiving) {
		final ItemStack KBBREAD = new ItemStack(ItemList.BATTLECIABATTA.get(), 2, null);
		SpookJamsMod.LOGGER.info("BREEAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAD");
		KBBREAD.enchant(Enchantments.KNOCKBACK, 10);
		
		return super.finishUsingItem(KBBREAD, worldIn, entityLiving);
	}
}
