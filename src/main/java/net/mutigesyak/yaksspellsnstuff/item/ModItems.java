package net.mutigesyak.yaksspellsnstuff.item;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.SwordItem;
import net.mutigesyak.yaksspellsnstuff.YaksSpellsnStuff;
import net.mutigesyak.yaksspellsnstuff.item.custom.ModToolTiers;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(YaksSpellsnStuff.MOD_ID);

    public static final DeferredItem<Item> DIVINE_INGOT = ITEMS.register("divine_ingot",
            ()-> new Item(new Item.Properties()));


    public static final DeferredItem<SwordItem> DIVINE_SWORD = ITEMS.register("divine_sword",
            () -> new SwordItem(ModToolTiers.DIVINE_SWORD, new Item.Properties()
                    .attributes(SwordItem.createAttributes(ModToolTiers.DIVINE_SWORD, 13, -2.4f))));



    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);





    }
}
