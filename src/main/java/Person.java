public class Person {
    //тут будет инфа с нашими данными
    //Vlad Kasabutskiy
    String name;
    //пишите свои предложения ниже и отписывайте в телегу
    //и да, если что то добавляете, создавайте перегруженный конструктор, что бы не ломать
    // например :
    // Имя Фамилия
    // String age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Person(String name) {
        this.name = name;
    }
}
