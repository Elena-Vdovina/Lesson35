public class Main {
  public static void main(String[] args) {
    //23.1
    //1 Создать класс Student c полями (переменными) имя и номер.
    //  Создать несколько объектов этого класса
    Student ivanov = new Student();
    ivanov.name = "Иванов Иван";
    ivanov.number = 1;
    ivanov.checkTest();

    Student petrov = new Student();
    petrov.name = "Петров Петр";
    petrov.number = 2;
    petrov.checkTest();

    //2 Добавить в класс Student конструктор с параметрами имя и номер.
    //  Создать еще несколько объектов класса с использованием этого конструктора


  }
}