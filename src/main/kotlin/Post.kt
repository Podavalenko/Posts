data class Post (
    var postId: Long,
    val ownerId: Long = 0,
    val date: Int = 0,
    val text: String = "",
    val friendsOnly: Boolean = false,
    val postType: String = "any type",
    val canPin: Boolean = false,
    val canDelete: Boolean = false,
    val canEdit: Boolean = false,
    val isFavorite: Boolean = false,
    val likes: Likes ?= null,
)