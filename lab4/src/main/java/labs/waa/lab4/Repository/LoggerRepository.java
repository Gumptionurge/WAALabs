package labs.waa.lab4.Repository;

import labs.waa.lab4.Entity.Logger;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LoggerRepository extends JpaRepository<Logger,Long> {

}
