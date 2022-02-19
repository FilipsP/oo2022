public class Main {
    public static void main(String[] args) {
        Human one = new Human("Filipp", 22, 1.8, true);
        Human two = new Human("User", 32, 2.0, true);

        System.out.println(one);
        System.out.println(one);

        one.sayHello();
        two.sayHello();
    }
}
