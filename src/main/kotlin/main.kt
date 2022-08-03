fun main(){
    val post = Post(1, 1,1,1 ,1,"ddd", 1,1,false,1,1,1,
        "fff", 1, false, false,false, false, false,false)
    WallService.addPost(post)
    val post1 = Post(2, 1,1,1 ,1,"ddd", 1,1,false,1,1,1,
        "fff", 1, false, false,false, false, false,false)
    WallService.addPost(post1)
    println(WallService)
}

data class Post(
    val id: Int,
    val ownerId: Int,
    val fromId: Int,
    val createBy: Int,
    val date: Int,
    var text: String,
    val replyOwnerId: Int,
    val replyPostId: Int,
    val friendsOnly: Boolean,
    var comments: Int = 0,          // это счетчик
    var likes: Int = 0,             //это счетчик
    var reposts: Int = 0,           //это счетчик
    val postType: String,
    val signerId: Int,
    val canPin: Boolean,
    val canDelete: Boolean,
    val canEdit: Boolean,
    val isPinned: Boolean,
    val markedAsAds: Boolean,
    val isFavourite: Boolean
)

object WallService{

    private var posts = emptyArray<Post>()

    fun addPost(post: Post): Post {
        posts += post
        return posts.last()
    }

    fun postUpdate(id: Int){
        for ((index, post) in posts.withIndex()){
            if (post.id == id){
                posts[index]=post.copy(text = post.text + "UPD")
            }
        }
    }

    /* fun update(post: Post): Boolean{
         for(post in posts){
             if(post == postUpdate(post.id)){

             }*/
}
}

}