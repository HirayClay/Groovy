package closure

/**
 * Created by SEELE on 2017/8/14.
 */


def closureWithNoArgs = { -> println "Hi" }
def closureWithImplictArgs = { println it }
def closureWithImplictArg = { println "Hi  $it" }

closureWithNoArgs.call()

closureWithImplictArgs("Jack")
closureWithImplictArg("Rose")

Closure<Boolean> isTextFile = { File f -> f.absolutePath.endsWith(".txt") }


println( new File("A.groovy").absolutePath)
println isTextFile(new File("A.groovy"))


def concat = { String... args -> println args.join(' ') }

concat "Are", "you", "OK", "?"


/*****delegate*****/
def father = new Father()
father.work()

father.check()
