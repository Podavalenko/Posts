fun main () {
    val firstPost = Post (1)
    val secondPost = Post (2)
    val thirdPost = Post (3)
    val fourthPost = Post (4)


    val service = WallService
    service.add(firstPost)
    service.add(secondPost)
    service.add(thirdPost)

    service.print()

    service.update(fourthPost)
}