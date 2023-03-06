public class Student {
  String name;
  int number;

  Student() {

  }

  Student(String name, int number) {
    this.name = name;
    this.number = number;
  }

  void checkTest() {
    System.out.println(this.name + " test checked");
  }

}
