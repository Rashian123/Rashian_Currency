package com.youtube.rashian.rashian_currency;

import joptsimple.internal.Classes;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.ItemLike;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class CreativeTab {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TAB =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, rashian_currency.MOD_ID);

    public static final Supplier<CreativeModeTab> RASHIAN_CURRENCY_TAB = CREATIVE_MODE_TAB.register("rashian_currency_tab"
    ,() -> CreativeModeTab.builder()
                    .icon(() -> new ItemStack(ModItems.twohundred_banknote.get()))
                    .title(Component.translatable("creativetab.rashian_currency.rashian_currency_tab"))
                    .displayItems(
                            (itemDisplayParameters, output) -> {
                                output.accept(ModItems.twohundred_banknote.get());
                                output.accept(ModItems.hundred_banknote.get());
                                output.accept(ModItems.fifthy_banknote.get());
                                output.accept(ModItems.twenty_banknote.get());
                                output.accept(ModItems.ten_banknote.get());
                                output.accept(ModItems.five_banknote.get());
                                output.accept(ModItems.two_banknote.get());
                                output.accept(ModItems.one_coin.get());
                                output.accept(ModItems.fifty_cents.get());
                                output.accept(ModItems.twentyfive_cents.get());
                                output.accept(ModItems.ten_cents.get());
                                output.accept(ModItems.five_cents.get());
                                output.accept(ModItems.one_cent.get());
                            }
                    )

                    .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TAB.register(eventBus);
    }
}
