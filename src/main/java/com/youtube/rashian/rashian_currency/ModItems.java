package com.youtube.rashian.rashian_currency;

import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(rashian_currency.MOD_ID);

    public static final DeferredItem<Item> twohundred_banknote = ITEMS.register("twohundred_banknote",
            () -> new Item(new Item.Properties().component(DataComponents.ValueInCents, 20000)));

    public static final DeferredItem<Item> hundred_banknote = ITEMS.register("hundred_banknote",
            () -> new Item(new Item.Properties().component(DataComponents.ValueInCents, 10000)));

    public static final DeferredItem<Item> fifthy_banknote = ITEMS.register("fifty_banknote",
            () -> new Item(new Item.Properties().component(DataComponents.ValueInCents, 5000)));

    public static final DeferredItem<Item> twenty_banknote = ITEMS.register("twenty_banknote",
            () -> new Item(new Item.Properties().component(DataComponents.ValueInCents, 2000)));

    public static final DeferredItem<Item> ten_banknote = ITEMS.register("ten_banknote",
            () -> new Item(new Item.Properties().component(DataComponents.ValueInCents, 1000)));

    public static final DeferredItem<Item> five_banknote = ITEMS.register("five_banknote",
            () -> new Item(new Item.Properties().component(DataComponents.ValueInCents, 500)));

    public static final DeferredItem<Item> two_banknote = ITEMS.register("two_banknote",
            () -> new Item(new Item.Properties().component(DataComponents.ValueInCents, 200)));

    public static final DeferredItem<Item> one_coin = ITEMS.register("one_coin",
            () -> new Item(new Item.Properties().component(DataComponents.ValueInCents, 100)));

    public static final DeferredItem<Item> fifty_cents = ITEMS.register("fifty_cents",
            () -> new Item(new Item.Properties().component(DataComponents.ValueInCents, 50)));

    public static final DeferredItem<Item> twentyfive_cents = ITEMS.register("twentyfive_cents",
            () -> new Item(new Item.Properties().component(DataComponents.ValueInCents, 25)));

    public static final DeferredItem<Item> ten_cents = ITEMS.register("ten_cents",
            () -> new Item(new Item.Properties().component(DataComponents.ValueInCents, 10)));

    public static final DeferredItem<Item> five_cents = ITEMS.register("five_cents",
            () -> new Item(new Item.Properties().component(DataComponents.ValueInCents, 5)));

    public static final DeferredItem<Item> one_cent = ITEMS.register("one_cent",
            () -> new Item(new Item.Properties().component(DataComponents.ValueInCents, 1)));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
