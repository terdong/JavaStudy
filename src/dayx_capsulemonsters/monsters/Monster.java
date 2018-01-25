package dayx_capsulemonsters.monsters;

import dayx_capsulemonsters.skills.Skill;

/**
 * Created by DongHee Kim on 2018-01-22 022.
 */
public abstract class Monster {
    private String name;
    private int exp;

    private Skill[] skills;

    protected Monster(String name, Skill[] skills) {
        this.name = name;
        this.skills = skills;

        // 객체 생성 시 exp 변수는 0으로 자동 초기화 되므로 굳이 0값을 대입해주는 코드를 넣을 필요가 없다.
        //this.exp = 0;
    }

    public void printSkillList() {
        int skillsLastIndex = skills.length - 1;
        for (int i = 0; i < skillsLastIndex; ++i) {
            System.out.printf("%d. %s,", i, skills[i].getName());
        }
        System.out.printf("%d. %s", skillsLastIndex, skills[skillsLastIndex].getName());
    }

    // x = level, y = exp
    // y = (x * x ) * 2 + 100
    // x = sqrt(y/2 - 100/2)
    public int getLevel(){
        return (int)Math.sqrt(exp / 2 - 100 / 2);
    }

    public void increaseExp(int exp){
        this.exp += exp;
    }

}
