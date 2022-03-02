package com.springboot.datatransfering.datatransfer.com.springboot.datatransfering.datatransfer.service;

import java.io.BufferedReader;
import java.io.FileReader;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.datatransfering.datatransfer.com.springboot.datatransfering.datatransfer.entity.DataObject;
import com.springboot.datatransfering.datatransfer.com.springboot.datatransfering.datatransfer.entity.DataObjectRepository;

@Service
public class DataObjectService {

	@Autowired
	private DataObjectRepository repository;

	public void getData() {

		String path = "fo_random.txt";
		String line = "";
		List<String> lines = new ArrayList<>();

		try {
			BufferedReader bufferedReader = new BufferedReader(new FileReader(path));
			lines.add(line);
			line = bufferedReader.readLine();
			DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
			Date date = new Date();
			while((line = bufferedReader.readLine()) != null) {
				String[] values = line.split("\\|");
				DataObject dataObject = new DataObject();
				dataObject.setMatchId(values[0]);
				dataObject.setMarketId(values[1]);
				dataObject.setOutcomeId(values[2]);
				if (values.length < 4) {
					dataObject.setSpecifiers(null);
				}else {
					dataObject.setSpecifiers(values[3]);
					dataObject.setDate(String.valueOf(dateFormat.format(date)));
					repository.save(dataObject);
				}
			}
			bufferedReader.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
