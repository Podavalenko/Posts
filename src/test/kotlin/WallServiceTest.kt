import org.junit.Test

import org.junit.Assert.*

class WallServiceTest {
    private var service = WallService

    @Test
    fun addFunction() {
        val post = Post(postId = 1)
        val postIdExpected: Long = 1
        service.add(post)
        val result = service.add(post).postId
        assertEquals(postIdExpected, result)
    }

    @Test
    fun updateExisting_True() {
        service.add(Post(
            3,
            3,
            1,
            "текст поста",
            false,
            "тип поста",
            true,
            false,
            true,
            true
        ))
        service.add(Post(
            2,
            5,
            2,
            "текст поста",
            false,
            "тип поста",
            true,
            false,
            false,
            true
        ))
        service.add(Post(
            1,
            3,
            1,
            "текст поста",
            false,
            "тип поста",
            true,
            false,
            true,
            true
        ))

        val update = Post(
            3,
            3,
            1,
            "текст поста",
            false,
            "тип поста",
            true,
            false,
            true,
            true
        )
        val result = service.update(update)

        assertTrue(result)
    }

    @Test
    fun updateExisting_False() {
        service.add(Post( 1,
            3,
            1,
            "текст поста",
            false,
            "тип поста",
            true,
            false,
            true,
            true
        ))
        service.add(Post( 2,
            3,
            1,
            "текст поста",
            false,
            "тип поста",
            true,
            false,
            true,
            true,
            ))
        service.add(Post( 3,
            3,
            1,
            "текст поста",
            false,
            "тип поста",
            true,
            false,
            true,
            true,
            ))

        val update = Post(45,
            3,
            1,
            "текст поста",
            false,
            "тип поста",
            true,
            false,
            true,
            true
        )

        val result = service.update(update)

        assertFalse(result)
    }


}
