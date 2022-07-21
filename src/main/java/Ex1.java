public class Ex1 {
    public static void main(String[] args) {
        var p1 = new Person();
        var p2 = new Person("Jon", "Smith");
        var p3 = new Person("Mary", "Jane", (byte) 12, 123456789);

        System.out.println(p1.speak());
        System.out.println(p2.speak());
        System.out.println(p3.speak());

        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);

        System.out.println("Person count: " + Person.getPersonCount());
    }
}
/**
 * I don't have a name.
 * My name is Jon Smith.
 * My name is Mary Jane and I am 12 years old.
 * N/A
 * Jon Smith
 * Mary Jane 6789
 * Person count: 3
 */
