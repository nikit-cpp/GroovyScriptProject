// http://habrahabr.ru/post/145138/
println "Hello from Groovy script"
// Объявляем замыкание, возвращающее произведение
multi = {
	num1, num2 -> num1*num2
}
// этот(т. к. он последний) результат будет возвращён
multi(4,4)
