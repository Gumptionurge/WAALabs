package labs.waa.lab5.Entity.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class LoggerDTO {
    private LocalDate date;
    private LocalTime time;
    private String principal;
    private String operation;
}
