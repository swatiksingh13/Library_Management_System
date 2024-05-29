package in.swatiksingh.library_service_290524.repositories;

import in.swatiksingh.library_service_290524.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRepository extends JpaRepository<User, Long> {
}
