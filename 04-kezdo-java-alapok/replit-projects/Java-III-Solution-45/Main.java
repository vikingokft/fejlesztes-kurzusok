class Main {

public static void main(String[] args) {

System.out.println(calculateAge(2020, 1991));

}

public static int calculateAge(int currentYear, int yearOfBirth) {

int age = currentYear - yearOfBirth;

return age;

}

}