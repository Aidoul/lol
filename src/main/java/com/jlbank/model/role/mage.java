package com.jlbank.model.role;

import lombok.Data;

//@NoArgsConstructor // 生成无参构造方法，供框架使用
//@AllArgsConstructor // 生成全参构造方法，方便快速创建对象
@Data

public class mage extends role
{
    public mage(String name, int hp , int mana )
    {
        super(name, hp,mana);
    }

//    public void skill_1(role role) {
//        if (this.isAlive()&&role.isAlive()){
//        role.setHp(role.getHp() - 30);
//        System.out.println(role.getName() + " 受到了来自 "+ this.getName() + " 30点伤害,"+role.getName()+"HP还剩"+role.getHp());
//    }else  {
//            System.out.println("角色死亡，攻击无效");
//        }
//    }
//    public void skill_2(role role) {
//        role.setHp(role.getHp() - 50);
//        System.out.println(role.getName() + " 受到了来自 "+ this.getName() + " 50点伤害,"+role.getName()+"HP还剩"+role.getHp());
//    }
//    public void skill_3(role role) {
//        role.setHp(role.getHp() + 100);
//        System.out.println(role.getName() + " 收到了来自 "+ this.getName() + " 100点治疗,"+role.getName()+"HP还剩"+role.getHp());
//    }
}
