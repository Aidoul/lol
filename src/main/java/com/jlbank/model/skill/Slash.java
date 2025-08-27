package com.jlbank.model.skill;

public class Slash implements Skill {
    @Override
    public void use(role caster, role target) {
        System.out.println(caster.getName() + " 斩击了 " + target.getName() + "!    -20hp");
        target.setHp(target.getHp() - 20);
    }
}
