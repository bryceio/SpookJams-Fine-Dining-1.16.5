package com.brycieo.spookjamsmod.lists;

import com.brycieo.spookjamsmod.SpookJamsMod;
import com.brycieo.spookjamsmod.objects.items.BattleCiabatta;
import com.brycieo.spookjamsmod.objects.items.BreadSingularity;
import com.brycieo.spookjamsmod.objects.items.UldtradenseBread;

import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ItemList {
	public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, 
			SpookJamsMod.MOD_ID);

	public static final RegistryObject<Item> BATTLECIABATTA = ITEMS.register("battle_ciabatta", () -> new BattleCiabatta(new Item.Properties()));
	public static final RegistryObject<Item> BREADSINGULARITY = ITEMS.register("bread_singularity", () -> new BreadSingularity(new Item.Properties()));
	public static final RegistryObject<Item> CHEESE = ITEMS.register("cheese", () -> new Item(new Item.Properties().tab(ItemGroup.TAB_FOOD).food(FoodList.CHEESE)));
	public static final RegistryObject<Item> CHERRY = ITEMS.register("cherry", () -> new Item(new Item.Properties().tab(ItemGroup.TAB_FOOD).food(FoodList.CHERRY)));
	public static final RegistryObject<Item> CHOCOLATE = ITEMS.register("chocolate", () -> new Item(new Item.Properties().tab(ItemGroup.TAB_FOOD).food(FoodList.CHOCOLATE)));
	public static final RegistryObject<Item> CONDENSEDBREAD = ITEMS.register("condensed_loaf", () -> new Item(new Item.Properties().tab(ItemGroup.TAB_FOOD).food(FoodList.CONDENSEDBREAD)));
	public static final RegistryObject<Item> DRAGONSODA = ITEMS.register("dragon_soda", () -> new Item(new Item.Properties().tab(ItemGroup.TAB_FOOD).food(FoodList.DRAGONSODA)));
	public static final RegistryObject<Item> FRIEDEGG = ITEMS.register("fried_egg", () -> new Item(new Item.Properties().tab(ItemGroup.TAB_FOOD).food(FoodList.FRIEDEGG)));
	public static final RegistryObject<Item> GLUTENFREEBREAD = ITEMS.register("gluten_free_bread", () -> new Item(new Item.Properties().tab(ItemGroup.TAB_FOOD).food(FoodList.GLUTENFREEBREAD)));
	public static final RegistryObject<Item> SMOKEDCHEESE = ITEMS.register("smoked_cheese", () -> new Item(new Item.Properties().tab(ItemGroup.TAB_FOOD).food(FoodList.SMOKEDCHEESE)));
	public static final RegistryObject<Item> ULTRADENSELOAF = ITEMS.register("ultradense_loaf", () -> new UldtradenseBread(new Item.Properties()));
	public static final RegistryObject<Item> WRAPPEDCHERRYCHOCOLATE = ITEMS.register("wrapped_cherry_chocolate", () -> new Item(new Item.Properties().tab(ItemGroup.TAB_FOOD).food(FoodList.WRAPPEDCHERRYCHOCOLATE)));
	public static final RegistryObject<Item> WRAPPEDCHOCOLATE = ITEMS.register("wrapped_chocolate", () -> new Item(new Item.Properties().tab(ItemGroup.TAB_FOOD).food(FoodList.WRAPPEDCHOCOLATE)));
}