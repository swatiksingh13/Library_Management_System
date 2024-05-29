package in.swatiksingh.library_service_290524.repositories;

import in.swatiksingh.library_service_290524.models.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {
}
