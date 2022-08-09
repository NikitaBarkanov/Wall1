import org.junit.Assert.*
import org.junit.Test

@Test
fun main(){
    val service = WallService
    val post1 = Post(
        id = 1,
        date = 1,
        ownerId = 1
    )
    val post2 = Post(
        id = 1,
        date = 1,
        ownerId = 1
    )
    service.addPost(post1)
    service.addPost(post2)
    val result = service.update(post2)

    assertEquals(true, result)
}


class WallServiceTest{

    @Test
    fun add(){
        val service = WallService
        val post = service.addPost(
            Post(
                id = 1,
                ownerId = 1,
                date = 33333
            )
        )
        val result = post.id !=0
        assertEquals(true, result)
    }

    @Test
    fun update(){
        val service = WallService
        val post1 = Post(
            id = 1,
            date = 1,
            ownerId = 1
        )

        val result = service.update(post1)
        assertEquals(false, result)
    }

    @Test
    fun update1(){
        val service = WallService
        val post1 = Post(
            id = 1,
            date = 1,
            ownerId = 1
        )
        val post2 = Post(
            id = 1,
            date = 1,
            ownerId = 1
        )

        val result = (post1.id == post2.id)
        assertEquals(true, result)
    }
}