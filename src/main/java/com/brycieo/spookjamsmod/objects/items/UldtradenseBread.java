package com.brycieo.spookjamsmod.objects.items;

import java.util.List;

import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Rarity;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.world.World;

public class UldtradenseBread extends Item{

	public UldtradenseBread(Properties p_i48487_1_) {
		super(new Item.Properties().tab(ItemGroup.TAB_MATERIALS).rarity(Rarity.UNCOMMON));
	}
	
	@Override
	public void appendHoverText(ItemStack stack, World worldIn, List<ITextComponent> tooltip, ITooltipFlag flagIn) {
		super.appendHoverText(stack, worldIn, tooltip, flagIn);
		tooltip.add(new StringTextComponent("\u00A73" + "It's too dense to chew" + "\u00A73"));
	}

}
