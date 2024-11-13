package Repository;

import org.springframework.data.jpa.repository.JpaRepository;

public interface IMovieRepository extends JpaRepository<Models.Movie,Long> {
}
