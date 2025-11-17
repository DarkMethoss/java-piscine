import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.time.format.TextStyle;
import java.time.temporal.ChronoField;
import java.util.Locale;

public class FormatDate {
    public static String formatToFullText(LocalDateTime dateTime) {
        if (dateTime == null) {
            return null;
        }
        DateTimeFormatterBuilder builder = new DateTimeFormatterBuilder()
                .appendLiteral("Le ")
                .appendValue(ChronoField.DAY_OF_MONTH, 2)
                .appendLiteral(" ")
                .appendText(ChronoField.MONTH_OF_YEAR, TextStyle.SHORT)
                .appendLiteral(" de l'an ")
                .appendValue(ChronoField.YEAR, 4)
                .appendLiteral(" à ")
                .appendValue(ChronoField.HOUR_OF_DAY, 2)
                .appendLiteral("h")
                .appendValue(ChronoField.MINUTE_OF_HOUR, 2)
                .appendLiteral("m et ")
                .appendValue(ChronoField.SECOND_OF_MINUTE, 2)
                .appendLiteral("s");
        return dateTime.format(builder.toFormatter(Locale.FRENCH));
    }

    public static String formatSimple(LocalDate date) {
        if (date == null) {
            return null;
        }
        DateTimeFormatter f = DateTimeFormatter.ofPattern("MMMM dd yy", Locale.ITALIAN);
        return date.format(f);
    }

    // 16:18:56.8495847
    public static String formatIso(LocalTime time) {
        if (time == null) {
            return null;
        }
        DateTimeFormatter f = DateTimeFormatter.ofPattern("HH:mm:ss:n");
        return time.format(f).replaceAll("\\:0$", "");
    }

}