package labs.waa.lab5.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalTime;

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
