# Full Backend of Instagram


* **FrameWorks and Language Used**
     * SpringBoot
     * Java

* **Dependencies**
     * SpringBoot Web
     * JPA
     * SQL DataBase
     * Lombok
     * Validation

* **Data Flow**
     * Controller ( Here Make All API )
          1. UserController
          2. AdminController
          
     * Service ( Here Make All Logic )
          1. AuthenticationTokenService
          2. PostService
          3. UserService
          4. AdminService
          5. CommentService
          6. FollowService
          7. LikeService
          
          

     * Repository ( Here Make All DataBase Connection )
          1. IAuthenticationTokenRepo
          2. IPostRepo
          3. IUserRepo
          4. ICommentRepo
          5. IAdminRepo
          6. IFollowRepo
          7. ILikeRepo
          
     * Model

          1. AuthenticationToken
          2. Post
          3. User
          4. Admin
          5. Comment
          6. Follow
          7. Like
          
          
     


* **Database Used**
     * SQL DataBase

* **Summary**
  * This is a Design of the backend of Instagram.
  * Here you can see various type of API Like **GET, POST,UPDATE, DELETE**.
  * Here you can create your userid with Authentication by Email.(SignUP/SignIN)
  *  You can add any type of Post and see all Post.
  *  You can add like and see all Like.
  *  You can add Comments and see all Comments.
  *  You can follow a user and unfollow a user







