package com.jlbank.model.skill;

public class ActiveSkill implements Skill {
    private String name;
    private int damage = 10;
    private int manaCost = 10;

    public ActiveSkill(String name) {
        this.name = name;
    }

    @Override
    public void use(Hero caster, Hero target) {
        System.out.println(caster.getName() + " 使用了技能：" + name);
        target.takeDamage(damage);
        caster.consumeMana(manaCost);
    }
}
