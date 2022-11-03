package com.hemebiotech.analytics;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Symptoms implements ISymptomsList {

    public Map<String, Integer> listOfSymptoms;
    private List<String> datas;

    public Symptoms (List<String> datas) {
        this.datas = datas;
        this.listOfSymptoms = ListSymptoms();
    }

    public void SendDatas (String filepath) {
        if (filepath != null) {
            try {
                BufferedWriter writer = new BufferedWriter(new FileWriter(filepath, false));
                
                for (Map.Entry<String, Integer> entry : listOfSymptoms.entrySet()) {
                    writer.write(entry.getKey() + " = " + entry.getValue());
                    writer.newLine();
                }
                
                writer.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public Map<String, Integer> ListSymptoms() {


        Map<String, Integer> result = new HashMap<String,Integer>();

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
