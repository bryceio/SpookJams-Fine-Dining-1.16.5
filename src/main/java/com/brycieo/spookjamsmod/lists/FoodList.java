package com.brycieo.spookjamsmod.lists;

import net.minecraft.item.Food;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;

public class FoodList{
    public static final Food CHEESE = new Food.Builder().nutrition(4).saturationMod(5.0f).build();
    public static final Food CHERRY = new Food.Builder().nutrition(4).saturationMod(2.4f).build();
    public static final Food CHOCOLATE = new Food.Builder().nutrition(3).saturationMod(0.5f).build();
    public static final Food CONDENSEDBREAD = new Food.Builder().nutrition(20).saturationMod(3.5f).build();
    public static final Food DRAGONSODA = new Food.Builder().nutrition(2).saturationMod(0.2f).alwaysEat().effect(() -> new EffectInstance(Effects.DAMAGE_RESISTANCE, 600, 1), 1).build();
    public static final Food FRIEDEGG = new Food.Builder().nutrition(4).saturationMod(2.0f).build();
    public static final Food GLUTENFREEBREAD = new Food.Builder().nutrition(4).saturationMod(1.4f).build();
    public static final Food SMOKEDCHEESE = new Food.Builder().nutrition(6).saturationMod(6.0f).build();
    public static final Food WRAPPEDCHERRYCHOCOLATE = new Food.Builder().nutrition(6).saturationMod(1.5f).build();
    public static final Food WRAPPEDCHOCOLATE = new Food.Builder().nutrition(3).saturationMod(0.5f).build();

}