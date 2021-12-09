package lab7_java;

import java.util.Scanner;

public class ThePerson{
     private String name;
     private String secondName;
     private String surname;
     private int age;


     public ThePerson(){
       name = "Name";
       secondName = "SecondName";
       surname = "Surname";
       age = 0;
     };

     public ThePerson(String name,String secondName,String surname,int age){
       this.name = name;
       this.secondName = secondName;
       this.surname = surname;
       this.age = age;
     };

     public void setThePerson(){
	       Scanner scan = new Scanner(System.in);
         System.out.print("Enter name: ");
         name = scan.nextLine();
         System.out.print("Enter secondname: ");
         secondName = scan.nextLine();
         System.out.print("Enter surname: ");
         surname = scan.nextLine();
         System.out.print("enter age: ");
         age = scan.nextInt();
     };

     public void printInfo(){
         String s_age = String.valueOf(age); //перевод числа в строку
         String info = name + " " + secondName + " " + surname + " " + s_age; //строка с именем, отчестов и фамилией
         int len = info.length() - 2;//кол-во символов
         boolean result1,result2,result3;

         System.out.println("Person: " + info );
         System.out.println("quatity of symbols in FIO: " + len);

         result1= name.equalsIgnoreCase(secondName);//сравнение строк
         result2 = name.equalsIgnoreCase(surname);
         result3 = surname.equalsIgnoreCase(secondName);

         if (result1 == true || result2 == true ||result3 == true) {
             System.out.println("there are the equal string");
          }
         else {
	System.out.println("there are no equal strings");
}

};


     public void getPersonFIO() {
	       char [] fio = new char[3];
         fio[0] = surname.charAt(0);
         fio[1] = secondName.charAt(0);
         fio[2] = name.charAt(0);

	       System.out.println("The FIO: " + fio[0] + fio[2] + fio[1]);

       };

}
