package com.drunkripper.storageplus;

import com.drunkripper.storageplus.Blocks.StorageNetwork;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;

@Mod(modid = StoragePlus.MODID, version = StoragePlus.VERSION)
public class StoragePlus
{
    public static final String MODID = "storageplus";
    public static final String VERSION = "0.51";
    
    @EventHandler
    public void init(FMLInitializationEvent event)
    {
    	if(event.getSide().equals(Side.CLIENT)){
    		//Client Only Stuff
    	}
    	
    	if(event.getSide().equals(Side.SERVER)){
    		//Server Only Stuff
    	}
    	
    	
    	
    	//Initialized Energy Network
    	//Network = new Network();
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	Block StorageNetworkBlock = new StorageNetwork(Material.ROCK);
		StorageNetworkBlock.setCreativeTab(CreativeTabs.BREWING);
		StorageNetworkBlock.setHardness(0.1F);
		StorageNetworkBlock.setHarvestLevel("pickaxe", 1);
		StorageNetworkBlock.setLightLevel(15F);
		StorageNetworkBlock.setRegistryName("network_block");
    	GameRegistry.registerBlock(StorageNetworkBlock);
    
    
    
    }
}
