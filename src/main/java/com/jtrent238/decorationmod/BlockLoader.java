package com.jtrent238.decorationmod;

import com.jtrent238.decorationmod.blocks.BlockClouds1;
import com.jtrent238.decorationmod.blocks.BlockFractialNoise1;
import com.jtrent238.decorationmod.blocks.BlockGradient1;
import com.jtrent238.decorationmod.blocks.BlockNoise1;
import com.jtrent238.decorationmod.blocks.BlockPerlinNoise1;
import com.jtrent238.decorationmod.blocks.BlockTGO_Logo;
import com.jtrent238.decorationmod.blocks.BlockTerrain1;
import com.jtrent238.decorationmod.blocks.BlockTextiles1;
import com.jtrent238.decorationmod.blocks.BlockTextiles10;
import com.jtrent238.decorationmod.blocks.BlockTextiles2;
import com.jtrent238.decorationmod.blocks.BlockTextiles3;
import com.jtrent238.decorationmod.blocks.BlockTextiles4;
import com.jtrent238.decorationmod.blocks.BlockTextiles5;
import com.jtrent238.decorationmod.blocks.BlockTextiles6;
import com.jtrent238.decorationmod.blocks.BlockTextiles7;
import com.jtrent238.decorationmod.blocks.BlockTextiles8;
import com.jtrent238.decorationmod.blocks.BlockTextiles9;
import com.jtrent238.decorationmod.blocks.BlockTiles1;
import com.jtrent238.decorationmod.blocks.BlockTurbulence1;
import com.jtrent238.foodmod.Blocksugar;
import com.jtrent238.foodmod.FoodMod;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class BlockLoader {

		public static Block BlockNoise1;
		public static Block BlockTGO_Logo;
		public static Block BlockTiles1;
		public static Block BlockGradient1;
		public static Block BlockClouds1;
		public static Block BlockTerrain1;
		public static Block BlockTextiles10;
		public static Block BlockTextiles9;
		public static Block BlockTextiles8;
		public static Block BlockTextiles7;
		public static Block BlockTextiles6;
		public static Block BlockTextiles5;
		public static Block BlockTextiles4;
		public static Block BlockTextiles3;
		public static Block BlockTextiles2;
		public static Block BlockTextiles1;
		public static Block BlockTurbulence1;
		public static Block BlockFractialNoise1;
		public static Block BlockPerlinNoise1;
	
	public static void loadBlocks() {
		// TODO Auto-generated method stub
		
		BlockNoise1 = new BlockNoise1(Material.ground).setBlockName("BlockNoise1").setBlockTextureName("decorationmod:BlockNoise1").setHardness(3F).setStepSound(Block.soundTypeStone).setCreativeTab(DecorationMod.DecorationMod);
		BlockTGO_Logo = new BlockTGO_Logo(Material.ground).setBlockName("BlockTGO_Logo").setBlockTextureName("decorationmod:BlockTGO_Logo").setHardness(3F).setStepSound(Block.soundTypeStone).setCreativeTab(DecorationMod.DecorationMod);
		BlockTiles1 = new BlockTiles1(Material.ground).setBlockName("BlockTiles1").setBlockTextureName("decorationmod:BlockTiles1").setHardness(3F).setStepSound(Block.soundTypeStone).setCreativeTab(DecorationMod.DecorationMod);
		BlockGradient1 = new BlockGradient1(Material.ground).setBlockName("BlockGradient1").setBlockTextureName("decorationmod:BlockGradient1").setHardness(3F).setStepSound(Block.soundTypeStone).setCreativeTab(DecorationMod.DecorationMod);
		BlockClouds1 = new BlockClouds1(Material.ground).setBlockName("BlockClouds1").setBlockTextureName("decorationmod:BlockClouds1").setHardness(3F).setStepSound(Block.soundTypeStone).setCreativeTab(DecorationMod.DecorationMod);
		BlockTerrain1 = new BlockTerrain1(Material.ground).setBlockName("BlockTerrain1").setBlockTextureName("decorationmod:BlockTerrain1").setHardness(3F).setStepSound(Block.soundTypeStone).setCreativeTab(DecorationMod.DecorationMod);
		BlockTextiles10 = new BlockTextiles10(Material.ground).setBlockName("BlockTextiles10").setBlockTextureName("decorationmod:BlockTextiles10").setHardness(3F).setStepSound(Block.soundTypeStone).setCreativeTab(DecorationMod.DecorationMod);
		BlockTextiles9 = new BlockTextiles9(Material.ground).setBlockName("BlockTextiles9").setBlockTextureName("decorationmod:BlockTextiles9").setHardness(3F).setStepSound(Block.soundTypeStone).setCreativeTab(DecorationMod.DecorationMod);
		BlockTextiles8 = new BlockTextiles8(Material.ground).setBlockName("BlockTextiles8").setBlockTextureName("decorationmod:BlockTextiles8").setHardness(3F).setStepSound(Block.soundTypeStone).setCreativeTab(DecorationMod.DecorationMod);
		BlockTextiles7 = new BlockTextiles7(Material.ground).setBlockName("BlockTextiles7").setBlockTextureName("decorationmod:BlockTextiles7").setHardness(3F).setStepSound(Block.soundTypeStone).setCreativeTab(DecorationMod.DecorationMod);
		BlockTextiles6 = new BlockTextiles6(Material.ground).setBlockName("BlockTextiles6").setBlockTextureName("decorationmod:BlockTextiles6").setHardness(3F).setStepSound(Block.soundTypeStone).setCreativeTab(DecorationMod.DecorationMod);
		BlockTextiles5 = new BlockTextiles5(Material.ground).setBlockName("BlockTextiles5").setBlockTextureName("decorationmod:BlockTextiles5").setHardness(3F).setStepSound(Block.soundTypeStone).setCreativeTab(DecorationMod.DecorationMod);
		BlockTextiles4 = new BlockTextiles4(Material.ground).setBlockName("BlockTextiles4").setBlockTextureName("decorationmod:BlockTextiles4").setHardness(3F).setStepSound(Block.soundTypeStone).setCreativeTab(DecorationMod.DecorationMod);
		BlockTextiles3 = new BlockTextiles3(Material.ground).setBlockName("BlockTextiles3").setBlockTextureName("decorationmod:BlockTextiles3").setHardness(3F).setStepSound(Block.soundTypeStone).setCreativeTab(DecorationMod.DecorationMod);
		BlockTextiles2 = new BlockTextiles2(Material.ground).setBlockName("BlockTextiles2").setBlockTextureName("decorationmod:BlockTextiles2").setHardness(3F).setStepSound(Block.soundTypeStone).setCreativeTab(DecorationMod.DecorationMod);
		BlockTextiles1 = new BlockTextiles1(Material.ground).setBlockName("BlockTextiles1").setBlockTextureName("decorationmod:BlockTextiles1").setHardness(3F).setStepSound(Block.soundTypeStone).setCreativeTab(DecorationMod.DecorationMod);
		BlockTurbulence1 = new BlockTurbulence1(Material.ground).setBlockName("BlockTurbulence1").setBlockTextureName("decorationmod:BlockTurbulence1").setHardness(3F).setStepSound(Block.soundTypeStone).setCreativeTab(DecorationMod.DecorationMod);
		BlockFractialNoise1 = new BlockFractialNoise1(Material.ground).setBlockName("BlockFractialNoise1").setBlockTextureName("decorationmod:BlockFractialNoise1").setHardness(3F).setStepSound(Block.soundTypeStone).setCreativeTab(DecorationMod.DecorationMod);
		BlockPerlinNoise1 = new BlockPerlinNoise1(Material.ground).setBlockName("BlockPerlinNoise1").setBlockTextureName("decorationmod:BlockPerlinNoise1").setHardness(3F).setStepSound(Block.soundTypeStone).setCreativeTab(DecorationMod.DecorationMod);
		
		registerBlocks();
	}

	/**
	 * Register Blocks.
	 */
	private static void registerBlocks(){
		GameRegistry.registerBlock(BlockNoise1, "BlockNoise1");
		GameRegistry.registerBlock(BlockTGO_Logo, "BlockTGO_Logo");
		GameRegistry.registerBlock(BlockTiles1, "BlockTiles1");
		GameRegistry.registerBlock(BlockGradient1, "BlockGradient1");
		GameRegistry.registerBlock(BlockClouds1, "BlockClouds1");
		GameRegistry.registerBlock(BlockTerrain1, "BlockTerrain1");
		GameRegistry.registerBlock(BlockTextiles10, "BlockTextiles10");
		GameRegistry.registerBlock(BlockTextiles9, "BlockTextiles9");
		GameRegistry.registerBlock(BlockTextiles8, "BlockTextiles8");
		GameRegistry.registerBlock(BlockTextiles7, "BlockTextiles7");
		GameRegistry.registerBlock(BlockTextiles6, "BlockTextiles6");
		GameRegistry.registerBlock(BlockTextiles5, "BlockTextiles5");
		GameRegistry.registerBlock(BlockTextiles4, "BlockTextiles4");
		GameRegistry.registerBlock(BlockTextiles3, "BlockTextiles3");
		GameRegistry.registerBlock(BlockTextiles2, "BlockTextiles2");
		GameRegistry.registerBlock(BlockTextiles1, "BlockTextiles1");
		GameRegistry.registerBlock(BlockTurbulence1, "BlockTurbulence1");
		GameRegistry.registerBlock(BlockFractialNoise1, "BlockFractialNoise1");
		GameRegistry.registerBlock(BlockPerlinNoise1, "BlockPerlinNoise1");
		
		
	}
}
