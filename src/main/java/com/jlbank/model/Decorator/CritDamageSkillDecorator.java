package com.jlbank.model.Decorator;

import com.jlbank.model.skill.Skill;
import com.jlbank.model.role.Hero;
import java.util.Random;

public class CritDamageSkillDecorator implements Skill {
    private final Skill skill;
    private final double critChance; // 暴击率，例如 0.2 表示 20%

    public CritDamageSkillDecorator(Skill skill, double critChance, double v) {
        this.skill = skill;
        this.critChance = critChance;
    }

    @Override
    public void use(Hero caster, Hero target) {
        // 先执行原始技能（造成基础伤害）
        skill.use(caster, target);

        // 暴击判定
        Random random = new Random();
        if (random.nextDouble() < critChance) {
            System.out.println("💥 Critical Hit! " + caster.getName() + " deals double damage!");
            // 这里可以扩展为实际双倍伤害逻辑，比如再调用一次伤害方法
        }
    }
}

