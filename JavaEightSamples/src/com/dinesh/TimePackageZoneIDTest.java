package com.dinesh;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Set;

public class TimePackageZoneIDTest {

	public static void main(String[] args) {
		
		Set<String> allZoneIds = ZoneId.getAvailableZoneIds();
		allZoneIds.stream().forEach(id -> System.out.println(id));
		
		ZoneId indiaZoneId=ZoneId.of("Asia/Calcutta");
		System.out.println(" India Zone Id:"+ indiaZoneId);
		
		LocalDateTime usLocalDateTime= LocalDateTime.now();
		System.out.println(" US Central Date time: "+usLocalDateTime);
		
		ZonedDateTime indiaZoneDateTime=ZonedDateTime.of(usLocalDateTime, indiaZoneId);
		System.out.println(" India local date/time now: "+indiaZoneDateTime);
		/* before 1 min time
 		 * US Central Date time: 2021-01-26T11:59:40.379454400 India local date/time
		 * now: 2021-01-26T11:59:40.379454400+05:30[Asia/Calcutta]
		 */
	}

}
