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
        if (target == null) {
            System.out.println("技能目标无效!");
            return;  // 如果目标无效，直接返回
        }
        if (!target.isAlive()) {
            System.out.println(caster.getName() + " 试图对已死亡的 " + target.getName() + " 使用技能!");
            return;  // 如果目标已死亡，直接返回
        }
        skill.use(caster, target);
    }
}
