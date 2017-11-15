import java.util.Scanner
// Anyは何でもいい型//
fun checkio(num: Int): Any{
	if (num % 15 == 0)
		return "Fizz Buzz"
	else if (num % 3 == 0)
		return "Fizz"
	else if (num % 5 == 0)
		return "Buzz"
	else 
		return num
	} 

// .nextInt()で数字入力にしている//	
fun main(args: Array<String>) {
	println("正の数字を入力してください．")
	val scan = Scanner(System.`in`).nextInt()
	println(checkio(scan))
}
