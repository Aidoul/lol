package com.jlbank.model.Decorator;

import com.jlbank.model.skill.Skill;
import com.jlbank.model.role.Hero;
public class AliveCheckSkillDecorator implements Skill {
    private final Skill skill;

    public AliveCheckSkillDecorator(Skill skill) {
        this.skill = skill;
    }

    @Override
    public void use(Hero caster, Hero target) {
        if (!caster.isAlive()) {
            System.out.println(caster.getName() + " 死亡了，无法使用技能!");
            return;
        }
        skill.use(caster, target);
    }
}
