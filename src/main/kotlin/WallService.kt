
object WallService {


    private var posts = emptyArray<Post>()
    private var id: Long = 1
    private var comments = emptyArray<Comment>()

    fun createComment(comment: Comment, id: Long): Comment {
        for (post in posts) {
            if (post.postId == id) {
                comments += comment
                return comments.last()
            }
        }
        throw PostNotFoundException("Такой пост не существует")
    }


    fun add(post: Post): Post {
        posts += post.copy(postId = id)
        id + 1
        return posts.last()

    }

    fun update(post: Post): Boolean {
        for ((index, item) in posts.withIndex()) {
            if (item.postId == post.postId) {
                posts[index] = post.copy(postId = post.postId, date = post.date)
                return true
            }
        }
        return false
    }
}
