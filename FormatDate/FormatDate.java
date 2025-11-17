import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.time.format.TextStyle;
import java.time.temporal.ChronoField;
import java.util.Locale;

import javax.swing.text.DateFormatter;

public class FormatDate {
    // Le 22 août de l'an 2021 à 13h25m et 46s
    public static String formatToFullText(LocalDateTime dateTime) {
        
        DateTimeFormatterBuilder builder = new DateTimeFormatterBuilder()
            .appendLiteral("Le ")
            .appendValue(ChronoField.DAY_OF_MONTH, 2)
            .appendLiteral(" ")
            .appendText(ChronoField.MONTH_OF_YEAR, TextStyle.SHORT)
            .appendLiteral(" de l'an ")
            .appendValue(ChronoField.YEAR,4)
            .appendLiteral(" à ")
            .appendValue(ChronoField.HOUR_OF_DAY,2)
            .appendLiteral("h")
            .appendValue(ChronoField.MINUTE_OF_HOUR,2)
            .appendLiteral("m et ")
            .appendValue(ChronoField.SECOND_OF_MINUTE,2)
            .appendLiteral("s")
            ;
        return dateTime.format(builder.toFormatter(Locale.FRENCH));
    }

    public static String formatSimple(LocalDate date) {
        DateTimeFormatter f = DateTimeFormatter.ofPattern("MMMM dd yy", Locale.ITALIAN);
        return date.format(f);
    }

    // 16:18:56.8495847
    public static String formatIso(LocalTime time) {
        DateTimeFormatter f = DateTimeFormatter.ofPattern("HH:mm:ss:n");
        return time.format(f);
    }

}