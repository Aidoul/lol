package com.jlbank.model.skill;

public class Fireball implements Skill {
    @Override
    public void use(role caster, role target) {
        System.out.println(caster.getName() + " 火球术 攻击了 " + target.getName() + "! - 30hp");
        target.setHp(target.getHp() - 30);
    }
}
