package board;

import character.Position;

public class Level {

    private Field[] fields;

    public Level(char[] levelSetup) {
        fields = createLevelFromSetup(levelSetup);
    }

    private Field[] createLevelFromSetup(char[] levelSetup) {
        Field[] newFields = new Field[levelSetup.length];
        for (int i = 0; i < levelSetup.length; i++) {
            FieldType type;
            switch (levelSetup[i]) {
                case 'M': type = FieldType.MONSTER; break;
                case 'P': type = FieldType.POTION; break;
                case 'B': type = FieldType.BOSS; break;
                default: type = FieldType.MONSTER;
            }
            newFields[i] = new Field(type);
        }
        return newFields;
    }

    public Field getField(int index) {
        return fields[index];
    }

    public Field[] getFields() {
        return fields;
    }

    public void printLevel(int levelNumber, Position heroPosition, boolean isFieldTypeVisible) {
        System.out.print("Level " + (levelNumber + 1) + " ");
        for (int i = 0; i < fields.length; i++) {
            if (heroPosition != null && heroPosition.getField() == i) {
                System.out.print("[H]");
            } else {
                fields[i].printField(isFieldTypeVisible);
            }
        }
        System.out.println();
    }

}