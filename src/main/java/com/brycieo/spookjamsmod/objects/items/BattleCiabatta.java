package com.brycieo.spookjamsmod.objects.items;

import java.util.List;
import java.util.UUID;

import com.brycieo.spookjamsmod.SpookJamsMod;
import com.brycieo.spookjamsmod.lists.FoodList;
import com.google.common.collect.Multimap;

import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.ai.attributes.Attribute;
import net.minecraft.entity.ai.attributes.AttributeModifier;
import net.minecraft.entity.ai.attributes.AttributeModifier.Operation;
import net.minecraft.entity.ai.attributes.Attributes;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Rarity;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.world.World;

public class BattleCiabatta extends Item{

	public BattleCiabatta(Properties p_i48487_1_) {
		super(new Item.Properties().tab(ItemGroup.TAB_COMBAT).stacksTo(1).rarity(Rarity.EPIC).food(FoodList.GLUTENFREEBREAD));
	}
	
	@Override
	public void appendHoverText(ItemStack stack, World worldIn, List<ITextComponent> tooltip, ITooltipFlag flagIn) {
		super.appendHoverText(stack, worldIn, tooltip, flagIn);
		tooltip.add(new StringTextComponent("Week-old bread, great for clobbering."));
	}

	@Override
	public Multimap<Attribute, AttributeModifier> getAttributeModifiers(EquipmentSlotType slot, ItemStack stack) {
		SpookJamsMod.LOGGER.info("BREAD?");
		final AttributeModifier CIABATTADMG = new AttributeModifier(UUID.fromString("6e1cce33-8b3b-4592-b944-a1756fa62a41"), "BreadDMG", 3.0d, Operation.ADDITION);
		stack.addAttributeModifier(Attributes.ATTACK_DAMAGE, CIABATTADMG, EquipmentSlotType.MAINHAND);
		return super.getAttributeModifiers(EquipmentSlotType.MAINHAND, stack);
	}
}
