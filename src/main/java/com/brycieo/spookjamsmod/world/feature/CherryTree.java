/*package com.brycieo.spookjamsmod.world.feature;

import java.util.Random;

import com.brycieo.spookjamsmod.lists.BlockList;

import net.minecraft.block.trees.Tree;
import net.minecraft.world.gen.blockstateprovider.SimpleBlockStateProvider;
import net.minecraft.world.gen.feature.BaseTreeFeatureConfig;
import net.minecraft.world.gen.feature.BaseTreeFeatureConfig.Builder;
import net.minecraft.world.gen.foliageplacer.BlobFoliagePlacer;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.Feature;


public class CherryTree extends Tree{
	
	public static final BaseTreeFeatureConfig CHERRYTREECONFIG = (new BaseTreeFeatureConfig.Builder(new SimpleBlockStateProvider(BlockList.CHERRYLOG.get().defaultBlockState()), new SimpleBlockStateProvider(BlockList.CHERRYLEAFBLOCK.get().defaultBlockState()), new BlobFoliagePlacer(null, null, 0), null, null).build());

	protected ConfiguredFeature<BaseTreeFeatureConfig, ?> getTreeFeature(Random dandomIn, boolean b){
		return Feature.TREE.configured(CHERRYTREECONFIG);
	}

	@Override
	protected ConfiguredFeature<BaseTreeFeatureConfig, ?> getConfiguredFeature(Random arg0, boolean arg1) {
		return null;
	}
}
*/