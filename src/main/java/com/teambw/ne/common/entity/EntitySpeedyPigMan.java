package com.teambw.ne.common.entity;

import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.monster.EntityPigZombie;
import net.minecraft.world.World;

public class EntitySpeedyPigMan extends EntityPigZombie {

    public EntitySpeedyPigMan(World world) {
        super(world);
    }

    //TODO fix this it does not work
    /*@Override
    protected void applyEntityAttributes() {
        this.getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(1.0D);
    }*/
}
