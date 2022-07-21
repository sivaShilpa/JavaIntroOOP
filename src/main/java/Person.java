public class Person {

    String firstName;
    String lastName;
    byte age;
    int ssn;
    static int count = 0;
    byte constructor;
    public Person() {
        count++;
        constructor = 0;
    }

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        count++;
        constructor = -1;
    }


    public Person(String firstName, String lastName, byte age, int ssn) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.ssn = ssn;
        count++;
        constructor = 1;
    }

    public static int getPersonCount() {
        return count;
    }

    public String speak() {
        String speech = "";
        if(constructor == 0){
            speech = "I don't have a name.";
        }
        else if(constructor == -1){
            speech = "My name is "+ firstName + " " + lastName + ".";
        }
        else if(constructor == 1){
            speech = "My name is " + firstName + " " + lastName + " and I am " + age + " years old.";
        }
        else{
            speech = " ";
        }
        return speech;
    }

    @Override
    public String toString() {
        String output = "";

        if(constructor == 0){
             output = "N/A";
        }
        else if(constructor == -1){
            output = firstName + " " + lastName;
        }
        else if(constructor == 1){
            output = firstName + " " + lastName + " " + String.valueOf(ssn).substring(5);
        }
        else{
            output = " ";
        }

        return output;
    }
}
