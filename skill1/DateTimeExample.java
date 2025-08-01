package dateTime;  
import java.time.*;
import java.time.format.DateTimeFormatter;
public class DateTimeExample {
    public static void main(String[] args) {
        LocalDate currentDate = LocalDate.now();
        LocalTime currentTime = LocalTime.now();
        LocalDateTime currentDateTime = LocalDateTime.now();
        System.out.println("Current Date: " + currentDate);
        System.out.println("Current Time: " + currentTime);
        System.out.println("Current Date-Time: " + currentDateTime);
        LocalDate birthDate = LocalDate.of(2000, Month.MARCH, 15);
        LocalTime fixedTime = LocalTime.of(10, 30);
        LocalDateTime appointment = LocalDateTime.of(2025, 8, 20, 14, 45);
        System.out.println("Birth Date: " + birthDate);
        System.out.println("Fixed Time: " + fixedTime);
        System.out.println("Appointment: " + appointment);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm");
        String formattedDateTime = appointment.format(formatter);
        System.out.println("Formatted Appointment: " + formattedDateTime);
        String dateStr = "29-07-2025";
        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        LocalDate parsedDate = LocalDate.parse(dateStr, dateFormatter);
        System.out.println("Parsed Date: " + parsedDate);
        Period period = Period.between(birthDate, currentDate);
        System.out.println("Age is: " + period.getYears() + " years, " +
                period.getMonths() + " months, " + period.getDays() + " days");
        LocalTime time1 = LocalTime.of(8, 0);
        LocalTime time2 = LocalTime.of(12, 30);
        Duration duration = Duration.between(time1, time2);
        System.out.println("Duration: " + duration.toHours() + " hours " + 
                duration.toMinutesPart() + " minutes");
        LocalDate futureDate = currentDate.plusDays(10);
        LocalDate pastDate = currentDate.minusMonths(2);
        System.out.println("10 days from now: " + futureDate);
        System.out.println("2 months ago: " + pastDate);
    }
}
