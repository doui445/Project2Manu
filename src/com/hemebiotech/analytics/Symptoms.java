package com.hemebiotech.analytics;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.SortedMap;
import java.util.TreeMap;

public class Symptoms implements ISymptomsList {
    public Symptoms () {
    }

    public void sendDatas (String filepath, List<String> datas) {
        if (filepath != null) {
            try {
                BufferedWriter writer = new BufferedWriter(new FileWriter(filepath, false));
                for (SortedMap.Entry<String, Integer> entry : listSymptoms(datas).entrySet()) {
                    writer.write(entry.getKey() + " = " + entry.getValue());
                    writer.newLine();
                } writer.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    @Override
    public SortedMap<String, Integer> listSymptoms(List<String> datas) {
		SortedMap<String, Integer> result = new TreeMap<String,Integer>();
        for (String symptom : datas) {
            if (result.get(symptom) == null) {
                result.put(symptom, 1);
            } else {
                result.put(symptom, result.get(symptom)+1);
            }
        }
        return result;
    }
}