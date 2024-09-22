package springiscoming.springiscoming.CatalogEntity;

import jakarta.persistence.*;

@Entity
@Table(name = "Users")
public class UserEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;

    @Column(nullable = false, length = 100)
    public String name;

    @Column(nullable = false, unique = true, length = 100)
    public String email;

    @Column(nullable = false)
    public Integer yearOfBirth;

    @Column(nullable = false, length = 400)
    public String homeTown;
}
