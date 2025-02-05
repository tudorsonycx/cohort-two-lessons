// S interpolation

val name: String = "Tudor"
println(s"My name is $name")

println(s"5 - 3 * 2 = ${5 - (3 * 2)}")

val a: Long = 19391
val b: Long = 319312
println(s"a * b = ${a * b}")


//f Interpolation
//common format specifiers (type safety):
//%f - Float, Double
//%d - Int, Long
//%s - String

val height: Double = 1.9
println(f"$name is $height%.2f metres tall")
// s Interpolation won't recognize the format specifiers
println(s"$name is $height%.2f metres tall")

println(f"Pi to 2 d.p is ${math.Pi}%.2f!")
println(f"Pi to 5 d.p is ${math.Pi}%.5f!")
println(f"Pi to 20 d.p is ${math.Pi}%.20f!")
// at least 9-wide, right-justified
println(f"Pi to 6 d.p is '${math.Pi}%10.5f'!")
// at least 15-wide, left-justified
println(f"Pi to 6 d.p is '${math.Pi}%-10.5f'!")

// printf
printf("'%s'", "Hello")
printf("'%20s'", "Hello")
printf("'%-20s'", "Hello")
printf("'%20.2f''%-20.3f'", math.Pi, math.Pi)

// raw Interpolation

println(f"I'm going onto a\nnew line")
// special characters are not escaped. nice!
println(raw"I'm going onto a\nnew line")
// format specifiers don't work. not nice!
println(raw"Pi to 2 d.p is ${math.Pi}%.2f")