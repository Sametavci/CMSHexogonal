package Repository;

import org.springframework.data.jpa.repository.JpaRepository;

public interface IReservationRepository extends JpaRepository<Models.Reservation,Long> {
}
