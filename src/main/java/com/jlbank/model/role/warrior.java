package com.jlbank.model.role;

import lombok.Data;


//@NoArgsConstructor // 生成无参构造方法，供框架使用
//@AllArgsConstructor // 生成全参构造方法，方便快速创建对象
@Data

public class warrior extends role {


    public warrior(String name, int hp, int mana )
    {
        super(name, hp,mana);
    }
//    public void skill_1(role role) {
//        if (this.isAlive()&&role.isAlive()){
//        role.setHp(role.getHp() - 1000);
//        System.out.println(role.getName() + " 受到了来自 "+ this.getName() + " 10点伤害,"+role.getName()+"HP还剩"+role.getHp());
//        }
//    }
//    public void skill_2(role role) {
//        role.setHp(role.getHp() - 20);
//        System.out.println(role.getName() + " 受到了来自 "+ this.getName() + " 20点伤害,"+role.getName()+"HP还剩"+role.getHp());
//    }
//    public void skill_3(role role) {
//        role.setHp(role.getHp() - 30);
//        System.out.println(role.getName() + " 受到了来自 "+ this.getName() + " 30点伤害,"+role.getName()+"HP还剩"+role.getHp());
//    }
}
