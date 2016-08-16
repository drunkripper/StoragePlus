package com.drunkripper.storageplus;

import com.drunkripper.storageplus.Blocks.StorageNetwork;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class BlockRegistry {

	public void initBlocks() {
    	Block StorageNetworkBlock = new StorageNetwork(Material.ROCK);
    	GameRegistry.registerBlock(StorageNetworkBlock);
	}

}
