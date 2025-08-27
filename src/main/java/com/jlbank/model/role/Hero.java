package com.jlbank.model.role;
import com.jlbank.model.skill.Skill;
import lombok.Data;

@Data
public abstract class Hero {
    protected String name;
    protected int maxHp;
    protected int hp;
    protected int maxMana;
    protected int mana;
    protected String damageType; // "physical" 或 "magical"
    protected Skill[] skills = new Skill[4]; // 0-2 主动技能，3 被动技能

    public Hero(String name, int maxHp, int maxMana, String damageType) {
        this.name = name;
        this.maxHp = maxHp;
        this.hp = maxHp;
        this.maxMana = maxMana;
        this.mana = maxMana;
        this.damageType = damageType;
    }

    public void setSkill(int index, Skill skill) {
        if (index >= 0 && index < 4) {
            skills[index] = skill;
        }
    }

    public void useSkill(int index, Hero target) {
        if (index >= 0 && index < 3 && skills[index] != null) {
            skills[index].use(this, target);
        }
    }

    public void takeDamage(int damage) {
        hp -= damage;
        if (hp < 0) hp = 0;
        System.out.println(name + " 受到 " + damage + " 点伤害，剩余生命：" + hp);
    }

    public boolean isAlive() {
        return hp > 0;
    }

    public String getName() {
        return name;
    }
}

