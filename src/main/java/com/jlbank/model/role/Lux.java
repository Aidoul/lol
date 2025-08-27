package com.jlbank.model.role;

import com.jlbank.model.Decorator.CritDamageSkillDecorator;
import com.jlbank.model.skill.ActiveSkill;
import com.jlbank.model.skill.PassiveSkill;
import com.jlbank.model.skill.Skill;
import com.jlbank.model.Decorator.ManaCheckSkillDecorator;
public class Lux extends Hero {
    public Lux() {
        super("拉克丝", 80, 100, "magical");

        setSkill(0, new ActiveSkill("致命打击"));
        setSkill(1, new ActiveSkill("勇气"));
        setSkill(2, new ActiveSkill("审判"));
        setSkill(3, new PassiveSkill("坚韧"));
    }
}

