package org.effectivejava.examples.ch02.item05;

import java.time.DateTimeException;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

public class InefficientPerson {
    // This class creates date objects unnecessarily.
    private final Date birthDate;

    public InefficientPerson(Date d) {
        birthDate = d;
    }

    public boolean isBabyBoomer() {
        // is person born between [1946, 1964]
        Calendar gmtCal = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
        gmtCal.set(1946, Calendar.JANUARY, 1, 0, 0, 0);
        Date boomStart = gmtCal.getTime();
        gmtCal.set(1965, Calendar.JANUARY, 1, 0, 0, 0);
        Date boomEnd = gmtCal.getTime();

        return birthDate.compareTo(boomStart) >= 0 && birthDate.compareTo(boomEnd) < 0;
    }
}

