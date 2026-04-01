package board;

public class Field {

    private FieldType fieldType;

    public Field(FieldType fieldType) {
        this.fieldType = fieldType;
    }

    public FieldType getFieldType() {
        return fieldType;
    }

    public char getInitial() {
        return fieldType.name().charAt(0);
    }

    public void printField(boolean isFieldTypeVisible) {
        if (isFieldTypeVisible) {
            System.out.print("[" + getInitial() + "]");
        } else {
            System.out.print("[ ]");
        }
    }

}