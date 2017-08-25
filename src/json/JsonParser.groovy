package json

import groovy.json.JsonOutput
import groovy.json.JsonParserType
import groovy.json.JsonSlurper

/**
 * Created by SEELE on 2017/8/25.
 */


//serialization
def JsonSlurper = new JsonSlurper()
def jsonStream = new File("weather.txt").newInputStream()
def weather = JsonSlurper.parse(jsonStream)


println(weather instanceof  Map)
println(weather.data.yesterday)


def jsonText = '{"name":"jack","age":18}'


def student = JsonSlurper.parseText(jsonText)

println(student instanceof Map)
println(student.name+"==="+student.age)



def jsonTextWithComment = '{"name":"jack"/*haha ,i am comment to disturb*/,"age":18}'
//parse will fail
//def failStu = JsonSlurper.parseText(jsonTextWithComment)
//println(failStu.name)


// let the comment is allowed
def stu = JsonSlurper.setType(JsonParserType.LAX).parseText(jsonTextWithComment)

println(stu.name)




//deserialization

def stuJsonText = JsonOutput.toJson(stu)
println(stuJsonText)