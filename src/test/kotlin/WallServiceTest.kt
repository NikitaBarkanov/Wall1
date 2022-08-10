import org.junit.Assert.*
import org.junit.Test

class WallServiceTest {

    @Test
    fun add() {
        val service = WallService
        val post = service.addPost(
            Post(
                id = 1,
                ownerId = 1,
                date = 33333
            )
        )
        val result = post.id != 0
        assertEquals(true, result)
    }

    @Test
    fun update() {
        val service = WallService
        val post1 = Post(
            id = 0,
            ownerId = 0,
            fromId = 0,
            createBy = 0,
            date = 0,
            text = Text(),
            replyOwnerId = 0,
            replyPostId = 0,
            friendsOnly = false,
            comments = 0,
            likes = 0,
            reposts = 0,
            postType = " ",
            signerId = 0,
            canPin = false,
            canDelete = false,
            canEdit = false,
            isPinned = false,
            markedAsAds = true,
            isFavourite = false
        )
        val post2 = Post(
            id = 0,
            ownerId = 0,
            fromId = 0,
            createBy = 0,
            date = 0,
            text = Text(),
            replyOwnerId = 0,
            replyPostId = 0,
            friendsOnly = false,
            comments = 0,
            likes = 0,
            reposts = 0,
            postType = " ",
            signerId = 0,
            canPin = false,
            canDelete = false,
            canEdit = false,
            isPinned = false,
            markedAsAds = true,
            isFavourite = false
        )
        service.addPost(post1)
        service.addPost(post2)
        val result = service.update(post2)

        assertEquals(true, result)
    }

    @Test
    fun updateFalse(){
        val service = WallService
        val post1 = Post(
            id = 0,
            ownerId = 0,
            fromId = 0,
            createBy = 0,
            date = 0,
            text = Text(),
            replyOwnerId = 0,
            replyPostId = 0,
            friendsOnly = false,
            comments = 0,
            likes = 0,
            reposts = 0,
            postType = " ",
            signerId = 0,
            canPin = false,
            canDelete = false,
            canEdit = false,
            isPinned = false,
            markedAsAds = true,
            isFavourite = false
        )
        val post2 = Post(
            id = 1,
            ownerId = 0,
            fromId = 0,
            createBy = 0,
            date = 0,
            text = Text(),
            replyOwnerId = 0,
            replyPostId = 0,
            friendsOnly = false,
            comments = 0,
            likes = 0,
            reposts = 0,
            postType = " ",
            signerId = 0,
            canPin = false,
            canDelete = false,
            canEdit = false,
            isPinned = false,
            markedAsAds = true,
            isFavourite = false
        )
        service.addPost(post1)
        service.addPost(post2)
        val update = Post(
            id = 3333,
            ownerId = 0,
            fromId = 0,
            createBy = 0,
            date = 0,
            text = Text(),
            replyOwnerId = 0,
            replyPostId = 0,
            friendsOnly = false,
            comments = 0,
            likes = 0,
            reposts = 0,
            postType = " ",
            signerId = 0,
            canPin = false,
            canDelete = false,
            canEdit = false,
            isPinned = false,
            markedAsAds = true,
            isFavourite = false
        )
        val result = service.update(update)

        assertEquals(false, result)
    }
}