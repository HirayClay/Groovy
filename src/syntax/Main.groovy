package syntax

import empty.Car
import empty.People
import struture.B

import java.util.regex.Pattern

/**
 * Created by SEELE on 2017/7/31.
 */
class Main {

    public static void main(String[] args) {
        def a = 1 as int
        println "hello world---" + a
        println("hello i quota ${a}")

        def p = new Person("alice", 23)

        println p.name

        def p1 = new Person(2, "alice")
        println p1.name

        def p2 = new Person(p, "faker")
        println p2.name

        //map

        def map = [:]

        map.name = "tony"


        println map.getClass().getName()
        println map.name

        //String
        def triple = '''i am sry for being different from java'''

        println triple
        def escape = 'i am a escape dot \''
        println escape

        def doubleQuotedString = "double quoted"

        println doubleQuotedString instanceof GString

        def doubleQuotedInterpolatorString = "double quoted interpolated String \""

//        assert doubleQuotedInterpolatorString instanceof GString


        def message = "The message is ${'hello'}"
        assert message instanceof GString
        println(message)

        def name = 'Groovy'
        def template = """
    Dear Mr ${name},

    You're the winner of the lottery!

    Yours sincerly,

    Dave
"""

        assert template.toString().contains('Groovy')
        println template

        //todo dollar slash
        def sName = "Guillaume"
        def date = "April, 1st"

        def dollarSlashy = $/
    Hello $sName,
    today we're ${date}.

    $ dollar sign
    $$$$ escaped dollar sign
    \ backslash
    / forward slash
    $/ escaped forward slash
    $$$/ escaped opening dollar slashy
    $/$$ escaped closing dollar slashy
/$

        println dollarSlashy

        B b = new B()
        println(b ? "not null" : "null")

        p = new People("Bob")
        println(p.getName())


        def result = []

        result << "bob is a boy"
        result << "alice is a girl"
        println(result)


        def regx = ~/[0-9]/

        println(regx instanceof Pattern)

        def cars = [new Car(make: 'Peugeot', model: '508'),
                    new Car(make: 'Renault', model: 'Clio')]

        def makes = cars*.make

        println(makes + "---type:")
        List names = new ArrayList()
        names.putAt(0..3, ["alice", "bob", "tom", "jerry"])
        println(names)
    }

}
