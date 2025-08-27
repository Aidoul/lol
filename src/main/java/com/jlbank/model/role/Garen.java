package com.jlbank.model.role;

public class Garen extends Hero {
    public Garen() {
        super("盖伦", 100, 0, "physical"); // 无蓝条

        setSkill(0, new ActiveSkill("致命打击"));
        setSkill(1, new ActiveSkill("勇气"));
        setSkill(2, new ActiveSkill("审判"));
        setSkill(3, new PassiveSkill("坚韧"));
    }
}

