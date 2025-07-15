package com.mutigesyak.yaksspellsnstuff.Item;

import com.mutigesyak.yaksspellsnstuff.YaksSpellsnStuff;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.SwordItem;
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


    public static final DeferredItem<SwordItem> POISONVINE_DAGGER = ITEMS.register("poisonvine_dagger",
            ()-> new SwordItem(ModToolTiers.YaksWeaponTier, new Item.Properties()
                    .attributes(SwordItem.createAttributes(ModToolTiers.YaksWeaponTier, 5, -1.6f))));


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
