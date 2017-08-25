package object_orientation

import empty.People

/**
 * Created by SEELE on 2017/8/11.
 */
//def defaultGreeter = new DefaultGreeter()
//println(defaultGreeter instanceof Greeter)
//
//def similarGreeter = new SimilarGreeter()
//
//def coercedGreeter = similarGreeter as Greeter
//
//println("coerced instance " + (coercedGreeter instanceof Greeter))
//println(coercedGreeter.sayHi())
//
////constructor
//
//def constructor1 = new PersonConstructor("Tim", 2)
//def constructor2 = ["Tony", 2] as PersonConstructor
//PersonConstructor constructor3 = ["Alice", 3]
//
//println(constructor1)
//println(constructor2)
//println(constructor3)


def arr = []
arr.add(0, 1)
arr.add(1, "str")
arr.add(2, new People("Alice",18))

println arr


def a =["alice",17]

def peo = a as People

println peo

def map = [:]
map.put("name", "alice")
def p = map as People

println p.name

