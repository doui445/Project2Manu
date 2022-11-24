package com.hemebiotech.analytics.functions;

import java.util.List;
import java.util.SortedMap;
import java.util.TreeMap;

import com.hemebiotech.analytics.interfaces.ISymptomReader;
import com.hemebiotech.analytics.interfaces.ISymptomsList;

public class Symptoms implements ISymptomsList {
	private List<String> datas;
    public Symptoms (ISymptomReader datas) {
    	this.datas = datas.getSymptoms();
    }
    @Override
    public SortedMap<String, Integer> listSymptoms() {
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