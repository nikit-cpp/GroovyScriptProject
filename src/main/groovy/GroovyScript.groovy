// http://habrahabr.ru/post/145138/
println "Hello from Groovy script"

// вызываем файл с определением замыкания - импортируем
evaluate(new File("src/main/groovy/GroovyDefinition.groovy"))

println new JavaClass().getName()

// этот(т. к. он последний) результат будет возвращён
multi(4,4)
