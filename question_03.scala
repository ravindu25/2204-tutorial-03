object Q1 extends App{
    def volume_of_sphere(r:Double):Double = {
        return 4/3 * math.Pi * r * r * r
    }

    println(volume_of_sphere(5))
}