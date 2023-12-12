# Doctor Booking App


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
          1. AdminController
          2. AppointmentController
          3. DoctorController
          4. PatientController
     * Service ( Here Make All Logic )
          1. AdminService
          2. AppointmentService
          3. AuthenticationService
          4. DoctorService
          5. PatientService

     * Repository ( Here Make All DataBase Connection )
          1. IAdminRepo
          2. IAppointmentRepo
          3. IAuthTokenRepo
          4. IDoctorRepo
          5. IPatientRepo
     * Model
          1. Admin 
          2. Appointment
          3. AuthenticationToken
          4. Doctor
          5. Patient
     


* **Database Used**
     * SQL DataBase

* **Summary**
  * This is Ecommerce App and also present **Four type of Mapping**.
  1. OneToOne
  2. OneToMany
  3. ManyToOne

                          **Here You can**
1. SignUp, SignIn And SignOut Patient
2. Add Doctor
3. See All Doctor
4. Book Appointment







