package object_orientation

/**
 * Created by SEELE on 2017/8/11.
 */
class PersonConstructor {
    String name
    String age

    PersonConstructor(name, age) {
        this.name = name
        this.age = age
    }


    String toString() {
        return "name:$name age:$age"
    }
}
