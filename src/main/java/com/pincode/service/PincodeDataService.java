package com.pincode.service;

import java.io.IOException;
import java.io.StringReader;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import org.springframework.stereotype.Service;

import com.pincode.model.PinCodeData;

@Service
public class PincodeDataService {

	private static final String URL = "https://raw.githubusercontent.com/kishorek/India-Codes/master/csv/pincodes.csv";
	private List<PinCodeData> allPincodeList = new ArrayList<PinCodeData>();

	@PostConstruct
	public void fetchPincodeDate() throws IOException, InterruptedException {

		HttpClient client = HttpClient.newHttpClient();
		HttpRequest request = HttpRequest.newBuilder().uri(URI.create(URL)).build();

		HttpResponse<String> response = client.send(request, BodyHandlers.ofString());

		List<PinCodeData> pincodeList = new ArrayList<PinCodeData>();
		StringReader csvResponseReader = new StringReader(response.body());
		Iterable<CSVRecord> records = CSVFormat.DEFAULT.withFirstRecordAsHeader().parse(csvResponseReader);
		for (CSVRecord record : records) {
			if (!"".equalsIgnoreCase(record.get("PostOfficeName"))) {
				PinCodeData pinCodeData = new PinCodeData(record.get("PostOfficeName"), record.get("Pincode"),
						record.get("DistrictsName"), record.get("City"), record.get("State"));
				pincodeList.add(pinCodeData);
			}
		}

		this.allPincodeList = pincodeList;

	}

	public List<PinCodeData> getAllPincodeList() {
		return allPincodeList;
	}

}
