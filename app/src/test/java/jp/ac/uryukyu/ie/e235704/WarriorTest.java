package jp.ac.uryukyu.ie.e235704;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class WarriorTest {
    @Test
    public int AfterAttack(int initialHp, int attackDamage, int numAttacks) {
        return initialHp - (int) (1.5 * attackDamage) * numAttacks;
    }
    public void attackTest() {
        int defaultHeroHp = 100;
        Warrior demoWarrior = new Warrior("デモ勇者", defaultHeroHp, 100);
        Enemy slime = new Enemy("スライムもどき", 10, 100);
        for(int count=0; count<3; count++){
            demoWarrior.attackWithWeaponSkill(slime); // over kill
        }
        int expectedHp = AfterAttack(defaultHeroHp, demoWarrior.getAttack(), 3);
        assertEquals(expectedHp, slime.getHitPoint());
    }

}

