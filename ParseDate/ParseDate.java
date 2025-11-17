import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.time.temporal.ChronoField;
import java.util.Date;
import java.util.Formatter;
import java.util.Locale;
import java.util.Map;

public class ParseDate {

    public static LocalDateTime parseIsoFormat(String stringDate) {
        if (stringDate == null) {
            return null;
        }
        DateTimeFormatter format = DateTimeFormatter.ISO_LOCAL_DATE_TIME;
        LocalDateTime parsedDate = LocalDateTime.parse(stringDate, format);
        return parsedDate;
    }

    public static LocalDate parseFullTextFormat(String stringDate) {
        if (stringDate == null) {
            return null;
        }
        DateTimeFormatter formatter = new DateTimeFormatterBuilder()
                .parseCaseInsensitive()
                .appendPattern("EEEE dd MMMM yyyy")
                .toFormatter(Locale.ENGLISH);
        LocalDate date = LocalDate.parse(stringDate, formatter);
        return date;
    }

    public static LocalTime parseTimeFormat(String stringDate) {
        if (stringDate == null) {
            return null;
        }
        Map<Long, String> ampmMap = Map.of(
                0L, "in the morning",
                1L, "in the evening");

        DateTimeFormatter formatter = new DateTimeFormatterBuilder()
                .parseCaseInsensitive()
                .appendValue(ChronoField.HOUR_OF_AMPM, 2)
                .appendLiteral(" hours ")
                .appendText(ChronoField.AMPM_OF_DAY, ampmMap)
                .appendLiteral(", ")
                .appendValue(ChronoField.MINUTE_OF_HOUR, 2)
                .appendLiteral(" minutes and ")
                .appendValue(ChronoField.SECOND_OF_MINUTE, 2)
                .appendLiteral(" seconds")
                .toFormatter(Locale.ENGLISH);

        return LocalTime.parse(stringDate, formatter);
    }

}