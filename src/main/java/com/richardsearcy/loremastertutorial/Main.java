package com.richardsearcy.loremastertutorial;

import com.richardsearcy.loremastertutorial.init.ModRecipes;
import com.richardsearcy.loremastertutorial.proxy.CommonProxy;
import com.richardsearcy.loremastertutorial.util.Reference;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.MOD_ID, name = Reference.NAME, version = Reference.VERSION)
public class Main {

    // Mod instance
    @Mod.Instance
    public static Main instance;

    // Proxy classes
    @SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.COMMON_PROXY_CLASS)
    public static CommonProxy proxy;

    // Event Handlers
    @Mod.EventHandler
    public static void PreInit(FMLPreInitializationEvent event) {

    }

    @Mod.EventHandler
    public static void Init(FMLInitializationEvent event) {

        // Initialize smelting recipes
        ModRecipes.init();
    }

    @Mod.EventHandler
    public static void PostInit(FMLPostInitializationEvent event) {

    }

}
