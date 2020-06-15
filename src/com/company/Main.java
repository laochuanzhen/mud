package com.company;

import com.company.Attack.Knife;
import com.company.Creature.MonsterTiger;
import com.company.Creature.Person;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        MonsterTiger monsterTiger = new MonsterTiger();
        monsterTiger.setId("01");
        monsterTiger.setName("TIGER1");
        monsterTiger.setHp(200);
        monsterTiger.setCurrentWeapon(new Knife("01", "爪子", 20));
        Person person = new Person();
        person.setHp(300);
        person.setId("01");
        person.setName("武松");
        person.setCurrentWeapon(new Knife("02", "刀", 40));
        Scene scene = new Scene();
        scene.initScene();
        Ui.printWelcome(scene.getPerson());
        Scanner in = new Scanner(System.in);

        while(true)  {
            String command = in.nextLine();
            String[] words = command.split(" ");
            if (words[0].equals("help")) {
                Ui.printHelp();
            }else if(words[0].equals("go")){

                scene.getPerson().go(words[1]);
                System.out.println("酒吧里有只老虎，你必须打败他才能离开,请输入chop直到一方死亡");
            }

                else
             {
                if (words[0].equals("chop")) {

                            person.useKnife(person.getCurrentWeapon(), monsterTiger);
                            monsterTiger.useKnife(monsterTiger.getCurrentWeapon(), person);
                            System.out.println("武松使用打虎刀对老虎造成了"+person.getCurrentWeapon().getPoint()+"点伤害");
                            System.out.println("老虎使用爪子对人造成了"+monsterTiger.getCurrentWeapon().getPoint()+"点伤害");
                            System.out.println("此时人的hp" + person.getHp());
                            System.out.println("此时老虎的hp" + monsterTiger.getHp());
                            if(person.getHp()<=0)
                            {
                                System.out.println("你已死亡，游戏结束！");
                                break;
                            }
                            if(monsterTiger.getHp()<=0)
                            {
                                System.out.println("老虎死亡,你获得胜利！");
                                break;
                            }
                }

            }if (words[0].equals("bye")) {
                System.out.println("感谢您的光临。再见！");
                return;
            }
        }

    }
}
