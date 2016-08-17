package com.drunkripper.storageplus.main;

import com.drunkripper.storageplus.Blocks.StorageNetwork;
import com.drunkripper.storageplus.proxy.CommonProxy;
import com.drunkripper.storageplus.reference.Reference;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;

@Mod(modid = Reference.MODID, version = Reference.VERSION, name = Reference.NAME)

public class StoragePlus
{
	@SidedProxy(clientSide = Reference.CLIENT_PROXY, serverSide = Reference.SERVER_PROXY)

	public static CommonProxy proxy;


	@EventHandler
    public void preinit(FMLPreInitializationEvent event)
    {
    	

    
    }//pre init
	
    @EventHandler
    public void init(FMLInitializationEvent event)
    {
    	BlockRegistry blockRegistry = new BlockRegistry();
    	blockRegistry.initBlocks();
    	proxy.init();    
    }//init
    
    @EventHandler
    public void postinit(FMLPostInitializationEvent event)
    {
    	

    
    }//post init
    
}//class
