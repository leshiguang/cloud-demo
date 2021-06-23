package com.leshiguang.cloud.http.client.api.algorithm;

import com.leshiguang.cloud.http.client.entity.ResultData;
import com.leshiguang.cloud.http.client.entity.sleep.algorithm.SleepAnalysisRequest;
import com.leshiguang.cloud.http.client.entity.sleep.algorithm.SleepSegmentDTO;
import org.junit.Test;

import java.util.Date;
import java.util.List;

import static org.junit.Assert.*;

public class SleepAlgorithmCloudApiTest {

	@Test
	public void getSleepSegmentDTOs() {

		SleepAnalysisRequest request = SleepAnalysisRequest.builder()
				.model("LS431-B3")
				.startTime(new Date(1616666400000L))
				.softwareVersion("T302")
				.levelSetStr("63636363636363636363636363636363514d594c595d6061586363636363636363636363636363634c575063636363636363635659616363634a3e635c345721130000000000321a1c000f27051e1e0000000000002b150000100d00000200190d23000c13000015150c0000280a0000000000001d04001a0b250000040723270b00002d0012001018000e141c001700000d280000090a091f635012284e636363636363636363636363636363636363635b6363633f1763636363636363636363636363636363636313536363636363636363634f483b6363636363453b23000000001b300d2a120d001828195b5c3535342b3c636363636363636363636363636363636363636363")
				.build();
		ResultData<List<SleepSegmentDTO>> resultData =  SleepAlgorithmCloudApi.getSleepSegmentDTOs(request);

		System.out.println();

	}
}
