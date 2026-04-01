public class Main {

public static void main(String[] args) {

if (checkLogin("James Bond", "Moneypenny")) {

System.out.println("Isten hozta Mr. Bond!");

} else {

System.out.println("Próbálja újra, Mr. Bond");

}

}

public static boolean checkLogin(String userName, String password) {

if(userName.equals("James Bond") && password.equals("Moneypenny")) {

return true;

} else {

return false;

}

}

}