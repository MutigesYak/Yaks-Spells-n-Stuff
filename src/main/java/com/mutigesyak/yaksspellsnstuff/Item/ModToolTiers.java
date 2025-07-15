package com.mutigesyak.yaksspellsnstuff.Item;


import com.mutigesyak.yaksspellsnstuff.util.ModTags;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.Ingredient;
import net.neoforged.neoforge.common.SimpleTier;

public class ModToolTiers {
    public static final Tier YaksWeaponTier = new SimpleTier(com.mutigesyak.yaksspellsnstuff.util.ModTags.Blocks.INCORRECT_FOR_YAKSWEAPONSTIER_TOOL,
            1400, 4f, 3f, 28, () -> Ingredient.of(ModItems.POISONVINE_DAGGER));

}