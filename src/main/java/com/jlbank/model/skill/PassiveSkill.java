package com.jlbank.model.skill;

import com.jlbank.model.role.Hero;
public class PassiveSkill implements Skill {
    private String name;
    private int damageReduction = 5;

    public PassiveSkill(String name) {
        this.name = name;
    }

    @Override
    public void use(Hero caster, Hero target) {
        System.out.println(caster.getName() + " 的被动 " + name + " 触发，减免 " + damageReduction + " 点伤害");
        // 注意：被动通常不直接调用，而是通过伤害计算时触发
    }

    public int getDamageReduction() {
        return damageReduction;
    }
}

