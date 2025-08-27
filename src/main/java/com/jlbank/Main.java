package com.jlbank;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Hero garen = new Garen();
        Hero lux = new Lux();

        garen.useSkill(0, lux); // 盖伦 Q 技能
        lux.useSkill(0, garen); // 拉克丝 Q 技能（消耗蓝量）
        lux.useSkill(1, garen); // 拉克丝 E 技能（可能暴击）
    }
}
