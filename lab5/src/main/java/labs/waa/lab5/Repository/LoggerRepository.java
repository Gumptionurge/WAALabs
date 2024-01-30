package labs.waa.lab5.Repository;

import labs.waa.lab5.Entity.Logger;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LoggerRepository extends JpaRepository<Logger,Long> {

}
