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
    @Test
    fun shouldAddComment() {
        val postForComment = Post(0)
        val commentForTest1 = Comment(101, "Отличный пост!")
        val expected = "Отличный пост!"

        WallService.add(postForComment)
        WallService.createComment(commentForTest1, 1)

        val result = commentForTest1.text

        assertEquals(expected, result)
    }

    @Test(expected = PostNotFoundException::class)
    fun shouldThrow() {
        val commentForTest2 = Comment(44, "test")
        WallService.createComment(commentForTest2, 77)
    }
}
