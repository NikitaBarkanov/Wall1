fun main(){
    val post = Post()
    val post1 = Post()
    WallService.addPost(post)
    WallService.addPost(post1)
    WallService.update(post)
    println(post)
    println(post1)
}

data class Text(val str: String = "text")

data class Post(
    val id: Int = 0,
    val ownerId: Int = 0,
    val fromId: Int = 0,
    val createBy: Int = 0,
    val date: Int = 0,
    val text: Text = Text(),
    val replyOwnerId: Int = 0,
    val replyPostId: Int = 0,
    val friendsOnly: Boolean = false,
    val comments: Int = 0,
    val likes: Int = 0,
    val reposts: Int = 0,
    val postType: String = "",
    val signerId: Int = 0,
    val canPin: Boolean = false,
    val canDelete: Boolean = false,
    val canEdit: Boolean = false,
    val isPinned: Boolean = false,
    val markedAsAds: Boolean = true,
    val isFavourite: Boolean = false
)

object WallService{

    private var posts = emptyArray<Post>()

    fun addPost(post: Post): Post {
        posts += post
        return posts.last()
    }

    fun update(newPost: Post): Boolean{
        for (post in posts){
            if (post.id == newPost.id){
                post.copy(ownerId = newPost.ownerId + 1,
                    fromId = newPost.fromId + 1,
                    createBy = newPost.createBy + 1,
                    text = newPost.text)
            }
        }
        return false
    }


}