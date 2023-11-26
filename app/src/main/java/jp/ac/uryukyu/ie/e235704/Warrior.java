package jp.ac.uryukyu.ie.e235704;

public class Warrior extends Hero {

    public Warrior(String name, int maximumHP, int attack) {
        super(name, maximumHP, attack);
        System.out.printf("%sのHPは%d。攻撃力は%dです。\n", name, maximumHP, attack);
    }

    public void attackWithWeaponSkill(LivingThing opponent) {
        if (isDead() == false) {
            int damage = (int) (opponent.getAttack() * 1.5);
            System.out.printf("%sの攻撃！ウェポンスキルを発動！%sに%dのダメージを与えた！！\n", getName(), opponent.getName(), damage);
            opponent.wounded(damage);
        }
    }
}
