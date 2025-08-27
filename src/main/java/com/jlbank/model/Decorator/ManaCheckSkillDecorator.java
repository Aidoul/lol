package com.jlbank.model.Decorator;

import com.jlbank.model.role.Hero;
import com.jlbank.model.skill.Skill;

public class ManaCheckSkillDecorator implements Skill {
    private final Skill skill;
    private final int manaCost;

    public ManaCheckSkillDecorator(Skill skill, int manaCost) {
        this.skill = skill;
        this.manaCost = manaCost;
    }

    @Override
    public void use(Hero caster, Hero target) {
        if (caster.getMana() < manaCost) {
            System.out.println(caster.getName() + " 蓝量不足，无法释放技能！");
            return;
        }
        skill.use(caster, target);
    }
}

