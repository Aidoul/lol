package com.jlbank.model.role;

import com.jlbank.model.Decorator.CritDamageSkillDecorator;
import com.jlbank.model.skill.ActiveSkill;
import com.jlbank.model.skill.PassiveSkill;
import com.jlbank.model.skill.Skill;
import com.jlbank.model.Decorator.ManaCheckSkillDecorator;
public class Lux extends Hero {
    public Lux() {
        super("拉克丝", 80, 100, "magical");

        Skill q = new ManaCheckSkillDecorator(new ActiveSkill("光之束缚"), 20);
        Skill e = new CritDamageSkillDecorator(new ManaCheckSkillDecorator(new ActiveSkill("透光奇点"), 30), 0.3, 2.0);

        setSkill(0, q);
        setSkill(1, e);
        setSkill(2, new ManaCheckSkillDecorator(new ActiveSkill("终极闪光"), 50));
        setSkill(3, new PassiveSkill("光芒四射"));
    }
}

