public class Main {

    public static void main(String[] args) {
        Field testField = new Field(FieldType.MONSTER);
        testField.printField(false);
        System.out.println();
        testField.printField(true);
    }

}