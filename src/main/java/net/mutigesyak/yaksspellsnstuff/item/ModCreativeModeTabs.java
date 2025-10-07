package net.mutigesyak.yaksspellsnstuff.item;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.ItemStack;
import net.mutigesyak.yaksspellsnstuff.YaksSpellsnStuff;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TAB =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, YaksSpellsnStuff.MOD_ID);

    public static final Supplier<CreativeModeTab> YAKS_SPELLS_ITEMS = CREATIVE_MODE_TAB.register("yaks_spells_items_tab",
            ()-> CreativeModeTab.builder().icon(()-> new ItemStack(ModItems.DIVINE_INGOT.get()))
                    .title(Component.translatable("creativetab.yaksspells.yaks_spells_items"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModItems.DIVINE_INGOT);




                    }).build());

public static void register(IEventBus eventBus) {
    CREATIVE_MODE_TAB.register(eventBus);

    }
}
