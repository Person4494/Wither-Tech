package com.person.withertech;

import com.person.withertech.proxy.IProxy;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = "Wither-Tech", name = "Wither Tech", version = "1.7.10-1.0")
public class withertech
{
    @Mod.Instance("Wither-Tech")
    public static withertech instacne;

    @SidedProxy(clientSide = "com.person.withertech.proxy.ClientProxy", serverSide = "com.person.withertech.proxy.ServerProxy")
    public static IProxy proxy;

    @Mod.EventHandler
    public void pre(FMLPreInitializationEvent event)
    {

    }

    @Mod.EventHandler
    public void Init(FMLInitializationEvent event)
    {

    }

    @Mod.EventHandler
    public void post(FMLPostInitializationEvent event)
    {

    }
}
