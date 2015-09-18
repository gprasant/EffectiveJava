package org.effectivejava.examples.ch02.item05;

import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

public class EfficientPerson {
    private final Date birthDate;

    private static final Date boomStart;
    private static final Date boomEnd;
    private static final Calendar gmtCal;

    static {
        gmtCal = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
        gmtCal.set(1946, Calendar.JANUARY, 1, 0, 0, 0);
        boomStart = gmtCal.getTime();
        gmtCal.set(1965, Calendar.JANUARY, 1, 0, 0, 0);
        boomEnd = gmtCal.getTime();
    }

    public EfficientPerson(Date d) {
        birthDate = d;
    }

    public boolean isBabyBoomer() {
        return birthDate.compareTo(boomStart) >= 0 && birthDate.compareTo(boomEnd) < 0;
    }
}
