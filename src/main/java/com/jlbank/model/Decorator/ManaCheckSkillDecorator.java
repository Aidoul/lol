package com.jlbank.model.Decorator;

import com.jlbank.model.skill.Skill;

import com.jlbank.model.role.Hero;
public class ManaCheckSkillDecorator implements Skill {
    private final Skill skill;
    private final int manaCost; // 该技能需要消耗的蓝量

    public ManaCheckSkillDecorator(Skill skill, int manaCost) {
        this.skill = skill;
        this.manaCost = manaCost;
    }

    @Override
    public void use(Hero caster, Hero target) {
        if (caster.getMana() < manaCost) {
            System.out.println(caster.getName() + " does not have enough mana (needs " + manaCost + ")!");
            return;
        }

        // 消耗蓝量
        caster.setMana(caster.getMana() - manaCost);
        System.out.println(caster.getName() + " consumes " + manaCost + " mana.");

        // 继续执行原始技能
        skill.use(caster, target);
    }
}
