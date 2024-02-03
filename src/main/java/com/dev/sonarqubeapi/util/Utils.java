package com.dev.sonarqubeapi.util;

import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class Utils {

    /**
     * 소나큐브 API로 전달받은 날짜 형식(2024-01-26T12:00:00+0900)을
     * 연월일시분초(14자리) 형식으로 변환하는 메서드
     * @param inputDateTime
     * @return
     * @throws DateTimeParseException
     */
    public static String convertDateFormat(String inputDateTime) throws DateTimeParseException {
        // 파싱할 문자열 형식 지정
        DateTimeFormatter inputFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ssZ");
        DateTimeFormatter outputFormatter = DateTimeFormatter.ofPattern("yyyyMMddHHmmss");

        ZonedDateTime zonedDateTime = ZonedDateTime.parse(inputDateTime,inputFormatter);

        // 연월일시분초를 14자리 형식으로 변환
        return  zonedDateTime.format(outputFormatter);
    }

}
