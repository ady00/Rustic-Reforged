package com.ady.rusticreforged.item;

import net.minecraft.client.renderer.EffectInstance;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;

public class ModFoods {
    public static final FoodProperties IRONBERRY = (new FoodProperties.Builder()).
            effect(new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 300, 0), 1F).
            effect(new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 300, 2), 1F).
            effect(new MobEffectInstance(MobEffects.DARKNESS, 300, 1), 1F).
            fast().nutrition(2).saturationMod(0.1F).build();

}
