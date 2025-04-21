package com.youtube.rashian.rashian_currency;

import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;

@Mod(rashian_currency.MOD_ID)
public class rashian_currency {
    public static final String MOD_ID = "rashian_currency";

    public rashian_currency(IEventBus eventBus) {
        ModItems.register(eventBus);
        DataComponents.register(eventBus);
        CreativeTab.register(eventBus);
    }
}