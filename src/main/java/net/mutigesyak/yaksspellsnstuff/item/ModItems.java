package net.mutigesyak.yaksspellsnstuff.item;

import net.minecraft.world.item.Item;
import net.mutigesyak.yaksspellsnstuff.YaksSpellsnStuff;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(YaksSpellsnStuff.MOD_ID);

    public static final DeferredItem<Item> DIVINE_INGOT = ITEMS.register("divine_ingot",
            ()-> new Item(new Item.Properties()));


    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
