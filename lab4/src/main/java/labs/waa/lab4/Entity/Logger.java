package labs.waa.lab4.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import labs.waa.lab4.Entity.DTO.LoggerDTO;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Date;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor

public class Logger {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private long TransactionId;
    private LocalDate date;
    private LocalTime time;
    private String principal;
    private String operation;

}
