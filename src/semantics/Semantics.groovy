package semantics
/**
 * Created by SEELE on 2017/8/25.
 */
x = 1


x = new Date()


x = 0.1f

x = "Rose"

x = false

//mutil assignment

def (a, b, c) = ["a", "b", "c"]

println(a + b + c)

def (d, e, f) = ["d", "e"]
println(d + e + f)// variable f is null



//destruction
def coor = new Coordination(23f,90f)
def (lat,lot)= coor


println("lat:$lat lot:$lot")



//closure is cored into type that matchs

interface Foo {
    void foo()

    int anInt()
}

def impl = { println("ok"); 123 } as Foo


impl.foo()
println impl.anInt()

def map =[name:'helen',age:10]