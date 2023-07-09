# Ecommerce App


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
          1. AddressController
          2. MyOrderController
          3. ProductController
          4. UserController
     * Service ( Here Make All Logic )
          1. AddressService
          2. MyOrderService
          3. ProductService
          4. UserService

     * Repository ( Here Make All DataBase Connection )
          1. IAddressRepo
          2. IMyOrderRepo
          3. IProductRepo
          4. IUserRepo
     * Model
          1. Product (There is Present enum in Student class Name :- Type(Here Store Various of Product Category))
          2. Address
          3. MyOrder
          4. User
     


* **Database Used**
     * SQL DataBase

* **Summary**
  * This is Ecommerce App and also present **Four type of Mapping**.
  1. OneToOne
  2. OneToMany
  3. ManyToOne
  4. ManyToMany

                          **Here You can**
1. Create users
2. Create products
3. Create Address
4. Place an order (Create Order) using userId, productId, addressId
5. Get order by order id
6. Get user by userid
7. Get all products
    - Get products based on category (Query)
8. delete products based on product id.
  






