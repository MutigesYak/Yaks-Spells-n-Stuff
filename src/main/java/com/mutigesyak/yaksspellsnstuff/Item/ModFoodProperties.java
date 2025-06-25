package com.mutigesyak.yaksspellsnstuff.Item;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;

import java.util.Properties;

public class ModFoodProperties {
    public static final FoodProperties Radish = new FoodProperties.Builder().nutrition(3).saturationModifier(0.25f)
            .effect(()-> new MobEffectInstance(MobEffects.DIG_SPEED, 400), 1f).build();

}
