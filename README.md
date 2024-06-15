### Dependencies
1.Spring Web
2.Spring Data JPA
3.MySQL Driver
4.Lombok (for generating getters, setters, constructors, etc.)

### Notes
1.The User entity has a unidirectional @OneToOne relationship with AadharCard.
2.Each User is associated with exactly one AadharCard, referenced by aadhar_card_id in the user table.
3.Make sure MySQL server is running and accessible with the provided credentials.
