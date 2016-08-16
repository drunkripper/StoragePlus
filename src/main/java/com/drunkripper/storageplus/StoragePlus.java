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
    	
    	
    	
    	
    	
    	
    	
    	BlockRegistry blockRegistry = new BlockRegistry();
    	blockRegistry.initBlocks();
    	
    
    
    
    
    }
}
