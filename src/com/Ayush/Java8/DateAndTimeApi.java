package com.Ayush.Java8;

import java.time.*;

public class DateAndTimeApi {
    public static void main(String[] args) {
//        LocalDate now = LocalDate.now();
//        System.out.println(now);
//
//        LocalTime now1 = LocalTime.of(2,10);
//        System.out.println(now1);

//        LocalDateTime now = LocalDateTime.now();
//        System.out.println(now);

//        ZonedDateTime nagpur = ZonedDateTime.now(ZoneId.of("Asia/Kolkata"));
//        System.out.println(nagpur.getMonth()+":"+nagpur.getMinute());
        Instant now = Instant.now();
        System.out.println(now);

    }
}
