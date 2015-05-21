package com.teambw.ne.common.entity;

import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.monster.EntityPigZombie;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class EntityArmoredPigMan extends EntityPigZombie {

    public EntityArmoredPigMan(World world) {
        super(world);
    }

    @Override
    protected void addRandomArmor() {
        this.setCurrentItemOrArmor(0, new ItemStack(Items.diamond_sword));
        this.setCurrentItemOrArmor(1, new ItemStack(Items.iron_helmet));
        this.setCurrentItemOrArmor(2, new ItemStack(Items.iron_chestplate));
        this.setCurrentItemOrArmor(3, new ItemStack(Items.iron_leggings));
        this.setCurrentItemOrArmor(4, new ItemStack(Items.iron_boots));
    }

    /*@Override
    protected void applyEntityAttributes() {
        this.getEntityAttribute(SharedMonsterAttributes.attackDamage).setBaseValue(10.0D);
        this.getEntityAttribute(SharedMonsterAttributes.knockbackResistance).setBaseValue(5.0D);
        this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(100.0D);
    }*/
}
