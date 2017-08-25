package syntax

/**
 * Created by SEELE on 2017/7/31.
 */
class Person {
    def name
    def age

    Person(name, age) {
        this.name = name
        this.age = age
    }

    @Override
    String toString() {
        return "stringify: ${name}"
    }
}
