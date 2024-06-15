### Dependencies
Spring Web
Spring Data JPA
MySQL Driver
Lombok (for generating getters, setters, constructors, etc.)

### Notes
The User entity has a unidirectional @OneToOne relationship with AadharCard.
Each User is associated with exactly one AadharCard, referenced by aadhar_card_id in the user table.
Make sure MySQL server is running and accessible with the provided credentials.
