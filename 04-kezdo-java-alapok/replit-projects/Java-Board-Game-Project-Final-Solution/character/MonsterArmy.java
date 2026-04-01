package character;

import board.Board;
import board.FieldType;
import java.util.ArrayList;

public class MonsterArmy {

    private Board board;
    private ArrayList<GameCharacter> army;

    public MonsterArmy(Board board) {
        this.board = board;
        army = createArmy();
    }

    public ArrayList<GameCharacter> getArmy() {
        return army;
    }

    private ArrayList<GameCharacter> createArmy() {
        ArrayList<GameCharacter> newArmy = new ArrayList<>();
        board.Level[] levels = board.getLevels();
        for (int level = 0; level < levels.length; level++) {
            board.Field[] fields = levels[level].getFields();
            for (int field = 0; field < fields.length; field++) {
                FieldType type = fields[field].getFieldType();
                if (type == FieldType.MONSTER) {
                    newArmy.add(createMonster(level, field));
                } else if (type == FieldType.BOSS) {
                    newArmy.add(createBoss(level, field));
                }
            }
        }
        return newArmy;
    }

    private Monster createMonster(int level, int field) {
        double health = Monster.BASE_MONSTER_HEALTH + (level * Monster.BASE_MONSTER_HEALTH / 2);
        double attack = Monster.BASE_MONSTER_ATTACK + (level * Monster.BASE_MONSTER_ATTACK);
        return new Monster(health, attack, new Position(level, field), 'M');
    }

    private Monster createBoss(int level, int field) {
        double health = Monster.BASE_BOSS_HEALTH + (level * Monster.BASE_BOSS_HEALTH / 2);
        double attack = Monster.BASE_BOSS_ATTACK + (level * Monster.BASE_BOSS_ATTACK);
        return new Monster(health, attack, new Position(level, field), 'B');
    }

    public void printMonsterArmy() {
        for (GameCharacter monster : army) {
            monster.printGameCharacter();
        }
    }

    public GameCharacter getMonster(int level, int field) {
        GameCharacter found = null;
        for (GameCharacter monster : army) {
            if (monster.getPosition().getLevel() == level && monster.getPosition().getField() == field) {
                found = monster;
                break;
            }
        }
        if (found != null) {
            army.remove(found);
        }
        return found;
    }

}