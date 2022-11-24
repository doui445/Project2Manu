package com.hemebiotech.analytics.functions;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.SortedMap;

import com.hemebiotech.analytics.interfaces.ISymptomsList;
import com.hemebiotech.analytics.interfaces.iDataSender;

public class SendDatas implements iDataSender {

	public SendDatas() {
	}

	@Override
    public void sendDatas (String filepath, ISymptomsList symptoms) {
        if (filepath != null) {
            try {
                BufferedWriter writer = new BufferedWriter(new FileWriter(filepath, false));
                for (SortedMap.Entry<String, Integer> entry : symptoms.listSymptoms().entrySet()) {
                    writer.write(entry.getKey() + " = " + entry.getValue());
                    writer.newLine();
                } writer.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
