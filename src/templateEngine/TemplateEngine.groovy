package templateEngine

import groovy.text.SimpleTemplateEngine

/**
 * Created by SEELE on 2017/8/25.
 */

def unProcessedString = '''$name now is ${age} years old'''
def nameMap =["name":"Rose","age":18]

def sdf = new SimpleTemplateEngine()
println(sdf.createTemplate(unProcessedString).make(nameMap))


def string = 'name now is age years old'
println(sdf.createTemplate(unProcessedString).make(nameMap))