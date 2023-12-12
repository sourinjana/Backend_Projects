# Employee Address With One to One Mapping


* **FrameWorks and Language Used**
     * SpringBoot
     * Java

* **Dependencies**
     * SpringBoot Web
     * JPA
     * SQL DataBase
     * Lombok
     

* **Data Flow**
     * Controller -> EmployeeController and AddressController ( Here Make All API )
     * Service ->  EmployeeService and AddressService  ( Here Make All Logic )
     * Repository -> IEmployeeRepo and IAddressRepo  ( Here Make All DataBase Connection )
     * Model
          * Employee (In this Class Present One to one Mapping and for)
          * Address
     


* **Database Used**
     * SQL DataBase

* **Summary**
  * This is Basic One to one Mapping using SQL **Foreign Key**.
  **There is some Method**
 * EmployeeController: 
 1. GET /employees - get all employees
2. GET /employees/{id} - get an employee by id
3. POST /employees - create a new employee
4. PUT /employees/{id} - update Foreign Key by employee id
5. DELETE /employees/{id} - delete an employee by id

* AddressController:
1. GET /addresses - get all addresses
2. GET /addresses/{id} - get an address by id
3. POST /addresses - create a new address
4. PUT /addresses/{id} - update Zipcode by an address id
5. DELETE /addresses/{id} - delete an address by id









