package empty

/**
 * Created by SEELE on 2017/8/11.
 */
class People {
    public final String name
    public final int age

    People() {
    }

    People(String name, int age) {
        this.name = name
        this.age = age
    }

    String getName() { "Name: $name" }


    public String toString() {
        return "People{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
