package com.jtrent238.decorationmod;

import com.jtrent238.decorationmod.blocks.BlockClouds1;
import com.jtrent238.decorationmod.blocks.BlockClouds2;
import com.jtrent238.decorationmod.blocks.BlockClouds3;
import com.jtrent238.decorationmod.blocks.BlockClouds4;
import com.jtrent238.decorationmod.blocks.BlockFractialNoise1;
import com.jtrent238.decorationmod.blocks.BlockGradient1;
import com.jtrent238.decorationmod.blocks.BlockNoise1;
import com.jtrent238.decorationmod.blocks.BlockPerlinNoise1;
import com.jtrent238.decorationmod.blocks.BlockTGO_Logo;
import com.jtrent238.decorationmod.blocks.BlockTerrain1;
import com.jtrent238.decorationmod.blocks.BlockTerrain2;
import com.jtrent238.decorationmod.blocks.BlockTerrain3;
import com.jtrent238.decorationmod.blocks.BlockTerrain4;
import com.jtrent238.decorationmod.blocks.BlockTerrain5;
import com.jtrent238.decorationmod.blocks.BlockTerrain6;
import com.jtrent238.decorationmod.blocks.BlockTextiles1;
import com.jtrent238.decorationmod.blocks.BlockTextiles10;
import com.jtrent238.decorationmod.blocks.BlockTextiles11;
import com.jtrent238.decorationmod.blocks.BlockTextiles12;
import com.jtrent238.decorationmod.blocks.BlockTextiles13;
import com.jtrent238.decorationmod.blocks.BlockTextiles14;
import com.jtrent238.decorationmod.blocks.BlockTextiles15;
import com.jtrent238.decorationmod.blocks.BlockTextiles16;
import com.jtrent238.decorationmod.blocks.BlockTextiles17;
import com.jtrent238.decorationmod.blocks.BlockTextiles18;
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
import com.jtrent238.decorationmod.blocks.BlockWood1;
import com.jtrent238.decorationmod.blocks.BlockWood2;
import com.jtrent238.decorationmod.blocks.BlockWood3;
import com.jtrent238.decorationmod.blocks.BlockWood4;
import com.jtrent238.decorationmod.blocks.BlockWood5;
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
		public static Block BlockClouds2;
		public static Block BlockClouds3;
		public static Block BlockClouds4;
		public static Block BlockTerrain1;
		public static Block BlockTerrain2;
		public static Block BlockTerrain3;
		public static Block BlockTerrain4;
		public static Block BlockTerrain5;
		public static Block BlockTerrain6;
		public static Block BlockTextiles18;
		public static Block BlockTextiles17;
		public static Block BlockTextiles16;
		public static Block BlockTextiles15;
		public static Block BlockTextiles14;
		public static Block BlockTextiles13;
		public static Block BlockTextiles12;
		public static Block BlockTextiles11;
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
		public static Block BlockWood1;
		public static Block BlockWood2;
		public static Block BlockWood3;
		public static Block BlockWood4;
		public static Block BlockWood5;
	
	public static void loadBlocks() {
		// TODO Auto-generated method stub
		
		BlockNoise1 = new BlockNoise1(Material.ground).setBlockName("BlockNoise1").setBlockTextureName("decorationmod:BlockNoise1").setHardness(3F).setStepSound(Block.soundTypeStone).setCreativeTab(DecorationMod.DecorationMod);
		BlockTGO_Logo = new BlockTGO_Logo(Material.ground).setBlockName("BlockTGO_Logo").setBlockTextureName("decorationmod:BlockTGO_Logo").setHardness(3F).setStepSound(Block.soundTypeStone);
		BlockTiles1 = new BlockTiles1(Material.ground).setBlockName("BlockTiles1").setBlockTextureName("decorationmod:BlockTiles1").setHardness(3F).setStepSound(Block.soundTypeStone).setCreativeTab(DecorationMod.DecorationMod);
		BlockGradient1 = new BlockGradient1(Material.ground).setBlockName("BlockGradient1").setBlockTextureName("decorationmod:BlockGradient1").setHardness(3F).setStepSound(Block.soundTypeStone).setCreativeTab(DecorationMod.DecorationMod);
		BlockClouds1 = new BlockClouds1(Material.ground).setBlockName("BlockClouds1").setBlockTextureName("decorationmod:BlockClouds1").setHardness(3F).setStepSound(Block.soundTypeStone).setCreativeTab(DecorationMod.DecorationMod);
		BlockClouds2 = new BlockClouds2(Material.ground).setBlockName("BlockClouds2").setBlockTextureName("decorationmod:BlockClouds2").setHardness(3F).setStepSound(Block.soundTypeStone).setCreativeTab(DecorationMod.DecorationMod);
		BlockClouds3 = new BlockClouds3(Material.ground).setBlockName("BlockClouds3").setBlockTextureName("decorationmod:BlockClouds1").setHardness(3F).setStepSound(Block.soundTypeStone).setCreativeTab(DecorationMod.DecorationMod);
		BlockClouds4 = new BlockClouds4(Material.ground).setBlockName("BlockClouds4").setBlockTextureName("decorationmod:BlockClouds1").setHardness(3F).setStepSound(Block.soundTypeStone).setCreativeTab(DecorationMod.DecorationMod);
		BlockTerrain1 = new BlockTerrain1(Material.ground).setBlockName("BlockTerrain1").setBlockTextureName("decorationmod:BlockTerrain1").setHardness(3F).setStepSound(Block.soundTypeStone).setCreativeTab(DecorationMod.DecorationMod);
		BlockTerrain2 = new BlockTerrain2(Material.ground).setBlockName("BlockTerrain2").setBlockTextureName("decorationmod:BlockTerrain2").setHardness(3F).setStepSound(Block.soundTypeStone).setCreativeTab(DecorationMod.DecorationMod);
		BlockTerrain3 = new BlockTerrain3(Material.ground).setBlockName("BlockTerrain3").setBlockTextureName("decorationmod:BlockTerrain3").setHardness(3F).setStepSound(Block.soundTypeStone).setCreativeTab(DecorationMod.DecorationMod);
		BlockTerrain4 = new BlockTerrain4(Material.ground).setBlockName("BlockTerrain4").setBlockTextureName("decorationmod:BlockTerrain4").setHardness(3F).setStepSound(Block.soundTypeStone).setCreativeTab(DecorationMod.DecorationMod);
		BlockTerrain5 = new BlockTerrain5(Material.ground).setBlockName("BlockTerrain5").setBlockTextureName("decorationmod:BlockTerrain5").setHardness(3F).setStepSound(Block.soundTypeStone).setCreativeTab(DecorationMod.DecorationMod);
		BlockTerrain6 = new BlockTerrain6(Material.ground).setBlockName("BlockTerrain6").setBlockTextureName("decorationmod:BlockTerrain6").setHardness(3F).setStepSound(Block.soundTypeStone).setCreativeTab(DecorationMod.DecorationMod);
		BlockTextiles18 = new BlockTextiles18(Material.ground).setBlockName("BlockTextiles18").setBlockTextureName("decorationmod:BlockTextiles18").setHardness(3F).setStepSound(Block.soundTypeStone).setCreativeTab(DecorationMod.DecorationMod);
		BlockTextiles17 = new BlockTextiles17(Material.ground).setBlockName("BlockTextiles17").setBlockTextureName("decorationmod:BlockTextiles17").setHardness(3F).setStepSound(Block.soundTypeStone).setCreativeTab(DecorationMod.DecorationMod);
		BlockTextiles16 = new BlockTextiles16(Material.ground).setBlockName("BlockTextiles16").setBlockTextureName("decorationmod:BlockTextiles16").setHardness(3F).setStepSound(Block.soundTypeStone).setCreativeTab(DecorationMod.DecorationMod);
		BlockTextiles15 = new BlockTextiles15(Material.ground).setBlockName("BlockTextiles15").setBlockTextureName("decorationmod:BlockTextiles15").setHardness(3F).setStepSound(Block.soundTypeStone).setCreativeTab(DecorationMod.DecorationMod);
		BlockTextiles14 = new BlockTextiles14(Material.ground).setBlockName("BlockTextiles14").setBlockTextureName("decorationmod:BlockTextiles14").setHardness(3F).setStepSound(Block.soundTypeStone).setCreativeTab(DecorationMod.DecorationMod);
		BlockTextiles13 = new BlockTextiles13(Material.ground).setBlockName("BlockTextiles13").setBlockTextureName("decorationmod:BlockTextiles13").setHardness(3F).setStepSound(Block.soundTypeStone).setCreativeTab(DecorationMod.DecorationMod);
		BlockTextiles12 = new BlockTextiles12(Material.ground).setBlockName("BlockTextiles12").setBlockTextureName("decorationmod:BlockTextiles12").setHardness(3F).setStepSound(Block.soundTypeStone).setCreativeTab(DecorationMod.DecorationMod);
		BlockTextiles11 = new BlockTextiles11(Material.ground).setBlockName("BlockTextiles11").setBlockTextureName("decorationmod:BlockTextiles11").setHardness(3F).setStepSound(Block.soundTypeStone).setCreativeTab(DecorationMod.DecorationMod);
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
		BlockWood1 = new BlockWood1(Material.ground).setBlockName("BlockWood1").setBlockTextureName("decorationmod:BlockWood1").setHardness(3F).setStepSound(Block.soundTypeStone).setCreativeTab(DecorationMod.DecorationMod);
		BlockWood2 = new BlockWood2(Material.ground).setBlockName("BlockWood2").setBlockTextureName("decorationmod:BlockWood2").setHardness(3F).setStepSound(Block.soundTypeStone).setCreativeTab(DecorationMod.DecorationMod);
		BlockWood3 = new BlockWood3(Material.ground).setBlockName("BlockWood3").setBlockTextureName("decorationmod:BlockWood3").setHardness(3F).setStepSound(Block.soundTypeStone).setCreativeTab(DecorationMod.DecorationMod);
		BlockWood4 = new BlockWood4(Material.ground).setBlockName("BlockWood4").setBlockTextureName("decorationmod:BlockWood4").setHardness(3F).setStepSound(Block.soundTypeStone).setCreativeTab(DecorationMod.DecorationMod);
		BlockWood5 = new BlockWood5(Material.ground).setBlockName("BlockWood5").setBlockTextureName("decorationmod:BlockWood5").setHardness(3F).setStepSound(Block.soundTypeStone).setCreativeTab(DecorationMod.DecorationMod);
		
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
		GameRegistry.registerBlock(BlockTerrain2, "BlockTerrain2");
		GameRegistry.registerBlock(BlockTerrain3, "BlockTerrain3");
		GameRegistry.registerBlock(BlockTerrain4, "BlockTerrain4");
		GameRegistry.registerBlock(BlockTerrain5, "BlockTerrain5");
		GameRegistry.registerBlock(BlockTerrain6, "BlockTerrain6");
		GameRegistry.registerBlock(BlockTextiles18, "BlockTextiles18");
		GameRegistry.registerBlock(BlockTextiles17, "BlockTextiles17");
		GameRegistry.registerBlock(BlockTextiles16, "BlockTextiles16");
		GameRegistry.registerBlock(BlockTextiles15, "BlockTextiles15");
		GameRegistry.registerBlock(BlockTextiles14, "BlockTextiles14");
		GameRegistry.registerBlock(BlockTextiles13, "BlockTextiles13");
		GameRegistry.registerBlock(BlockTextiles12, "BlockTextiles12");
		GameRegistry.registerBlock(BlockTextiles11, "BlockTextiles11");
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
		GameRegistry.registerBlock(BlockWood1, "BlockWood1");
		GameRegistry.registerBlock(BlockWood2, "BlockWood2");
		GameRegistry.registerBlock(BlockWood3, "BlockWood3");
		GameRegistry.registerBlock(BlockWood4, "BlockWood4");
		GameRegistry.registerBlock(BlockWood5, "BlockWood5");
		
		
	}
}
