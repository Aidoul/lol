package com.jlbank.model.skill;

import com.jlbank.model.role.Hero;

public interface Skill {
/**
 * 使用某个技能
 * @param caster 施放技能的英雄
 * @param target 技能目标英雄
 */
    void use(Hero caster, Hero target); // 这是一个技能使用的方法，需要传入施放者和目标两个参数
}


