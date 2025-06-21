package com.mutigesyak.yaksspellsnstuff.Item;

import com.mutigesyak.yaksspellsnstuff.YaksSpellsnStuff;
import com.mutigesyak.yaksspellsnstuff.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TAB =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, YaksSpellsnStuff.MOD_ID);



    public static final Supplier<CreativeModeTab> Yaks_Spells_n_Stuff_Items = CREATIVE_MODE_TAB.register("yaks_spells_n_stuff_items",
            ()-> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.DRUIDIUM.get()))
                    .title(Component.translatable("creativetab.tutorialmod.yaks_spells_n_stuff_items"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModItems.DRUIDIUM);
                        output.accept(ModItems.RAW_DRUIDIUM);

                    }).build());

    public static final Supplier<CreativeModeTab> Yaks_Spells_n_Stuff_Blocks = CREATIVE_MODE_TAB.register("yaks_spells_n_stuff_blocks",
            ()-> CreativeModeTab.builder().icon(() -> new ItemStack(ModBlocks.DRUIDIUM_BLOCK.get()))
                    .withTabsBefore(ResourceLocation.fromNamespaceAndPath(YaksSpellsnStuff.MOD_ID, "yaks_spells_n_stuff_items"))
                    .title(Component.translatable("creativetab.tutorialmod.yaks_spells_n_stuff_blocks"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModBlocks.DRUIDIUM_BLOCK);
                        output.accept(ModBlocks.DRIUDIUM_ORE);

                    }).build());


    public static void register(IEventBus eventBus){
        CREATIVE_MODE_TAB.register(eventBus);
    }
}
