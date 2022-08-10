import org.junit.Test

import org.junit.Assert.*

class WallServiceTest {
    private var service = WallService



    @Test
    fun addFunction() {
        val post = Post(postId = 1)
        val postIdExpected: Long = 2
        service.add(post)
        val result = service.add(post).postId
        assertEquals(postIdExpected, result)
    }

    @Test
    fun update_true() {
        val post1 = Post(postId = 11)
        val post2 = Post(postId = 1, text = "newText")
        WallService.add(post1)

        val result = WallService.update(post2)

        assertTrue(result)
    }

    @Test
    fun update_false() {
        val post1 = Post(postId = 11)
        val post2 = Post(postId = 2, text = "newText")
        WallService.add(post1)

        val result = WallService.update(post2)

        assertFalse(result)
    }

}
