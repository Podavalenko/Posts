data class Post(
    val postId: Long = 1,
    val ownerId: Long = 0,
    val fromId: Int? = null,
    val date: Int = 0,
    val text: String = "any text",
    val replyOwnerId: Int? = null,
    val replyPostId: Int? = null,
    val friendsOnly: Boolean = false,
    val comments: Comments? = null,
    val copyright: Copyright? = null,
    val likes: Likes? = null,
    val reposts: Reposts? = null,
    val views: Views? = null,
    val postType: String = "any type",
    val postSource: PostSource? = null,
    val geo: Geo? = null,
    val signerId: Int? = null,
    val canPin: Boolean = false,
    val canDelete: Boolean = false,
    val canEdit: Boolean = false,
    val isPinned: Boolean = false,
    val markeAsAds: Boolean = false,
    val isFavorite: Boolean = false,
    val donut: Donut? = null,
    val postponedId: Int? = null,

)
val attachments: Array<Attachment> = emptyArray()
interface Attachment {
    val type: String
}
class PhotoAttachment : Attachment {
    override val type: String = "photo"
    val photo: Photo = Photo()
}

class Photo (
    val id: Int? = null,
    val ownerId: Int? = null,
    val photo130: String? = null,
    val photo604: String? = null,
    val postedPhoto: Boolean = false
)

class VideoAttachment : Attachment {
    override val type: String = "video"
    val video: Video = Video()

}

class Video (
    val id: Int? = null,
    val duration: Int? = null,
    val title: String? = null,
    val views: Int? = null,
    val player: String? = null,
)


