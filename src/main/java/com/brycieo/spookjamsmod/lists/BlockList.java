package com.brycieo.spookjamsmod.lists;

import com.brycieo.spookjamsmod.SpookJamsMod;
import com.brycieo.spookjamsmod.objects.blocks.CherryButton;
import com.brycieo.spookjamsmod.objects.blocks.CherryDoor;
import com.brycieo.spookjamsmod.objects.blocks.CherryPressurePlate;
import com.brycieo.spookjamsmod.objects.blocks.CherryStairs;
import com.brycieo.spookjamsmod.objects.blocks.CherryTrapdoor;

import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.FenceBlock;
import net.minecraft.block.FenceGateBlock;
import net.minecraft.block.LeavesBlock;
import net.minecraft.block.PressurePlateBlock;
import net.minecraft.block.RotatedPillarBlock;
import net.minecraft.block.SaplingBlock;
import net.minecraft.block.SlabBlock;
import net.minecraft.block.trees.OakTree;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class BlockList {
	public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, 
			SpookJamsMod.MOD_ID);
	
	public static final RegistryObject<Block> CHERRYPLANK = BLOCKS.register("cherry_planks", () -> new Block(Block.Properties.copy(Blocks.OAK_PLANKS)));
	public static final RegistryObject<Block> CHERRYLEAFBLOCK = BLOCKS.register("cherry_leaves", () -> new LeavesBlock(Block.Properties.copy(Blocks.OAK_LEAVES)));
	public static final RegistryObject<Block> CHERRYLOG = BLOCKS.register("cherry_log", () -> new RotatedPillarBlock(Block.Properties.copy(Blocks.OAK_LOG)));
	public static final RegistryObject<Block> CHERRYWOOD = BLOCKS.register("cherry_wood", () -> new RotatedPillarBlock(Block.Properties.copy(Blocks.OAK_WOOD)));
	public static final RegistryObject<Block> CHERRYSTAIRS = BLOCKS.register("cherry_stairs", () -> new CherryStairs(CHERRYPLANK.get().defaultBlockState(), Block.Properties.copy(CHERRYPLANK.get())));
	public static final RegistryObject<Block> CHERRYPRESSUREPLATE = BLOCKS.register("cherry_pressure_plate", () -> new CherryPressurePlate(PressurePlateBlock.Sensitivity.EVERYTHING, Block.Properties.copy(CHERRYPLANK.get()).noCollission()));
	public static final RegistryObject<Block> CHERRYDOOR = BLOCKS.register("cherry_door", () -> new CherryDoor(Block.Properties.copy(CHERRYPLANK.get()).noOcclusion()));
	public static final RegistryObject<Block> CHERRYFENCE = BLOCKS.register("cherry_fence", () -> new FenceBlock(Block.Properties.copy(CHERRYPLANK.get())));
	public static final RegistryObject<Block> CHERRYFENCEGATE = BLOCKS.register("cherry_fence_gate", () -> new FenceGateBlock(Block.Properties.copy(CHERRYPLANK.get())));
	public static final RegistryObject<Block> CHERRYTRAPDOOR = BLOCKS.register("cherry_trapdoor", () -> new CherryTrapdoor(Block.Properties.copy(CHERRYPLANK.get()).noOcclusion()));
	public static final RegistryObject<Block> CHERRYBUTTON = BLOCKS.register("cherry_button", () -> new CherryButton(Block.Properties.copy(CHERRYPLANK.get()).noCollission()));
	public static final RegistryObject<Block> CHERRYSLAB = BLOCKS.register("cherry_slab", () -> new SlabBlock(Block.Properties.copy(CHERRYPLANK.get())));
	public static final RegistryObject<Block> CHERRYSAPLING = BLOCKS.register("cherry_sapling", () -> new SaplingBlock(new OakTree(), Block.Properties.copy(Blocks.OAK_SAPLING)));
}
