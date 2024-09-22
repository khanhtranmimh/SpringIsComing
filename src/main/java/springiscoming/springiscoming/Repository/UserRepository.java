package springiscoming.springiscoming.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import springiscoming.springiscoming.CatalogEntity.UserEntity;

public interface UserRepository extends JpaRepository<UserEntity, Long> {

}
