package com.drunkripper.storageplus.proxy;

import com.drunkripper.storageplus.main.BlockRegistry;

public class ClientProxy implements CommonProxy{

	@Override
	public void init() {
		BlockRegistry.registerRenders();
		
		
	}

}
