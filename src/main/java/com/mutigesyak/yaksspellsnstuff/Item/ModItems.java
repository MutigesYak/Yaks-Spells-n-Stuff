package com.mutigesyak.yaksspellsnstuff.Item;

import com.mutigesyak.yaksspellsnstuff.YaksSpellsnStuff;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(YaksSpellsnStuff.MOD_ID);

    public static final DeferredItem<Item> DRUIDIUM = ITEMS.register("druidium",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> RAW_DRUIDIUM = ITEMS.register("raw_druidium",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> Radish =ITEMS.register("radish",
            ()-> new Item(new Item.Properties().food(ModFoodProperties.Radish)));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
