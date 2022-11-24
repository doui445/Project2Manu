package com.hemebiotech.analytics;

import com.hemebiotech.analytics.functions.ReadSymptomDataFromFile;
import com.hemebiotech.analytics.functions.SendDatas;
import com.hemebiotech.analytics.functions.Symptoms;
import com.hemebiotech.analytics.interfaces.ISymptomReader;
import com.hemebiotech.analytics.interfaces.ISymptomsList;
import com.hemebiotech.analytics.interfaces.iDataSender;

public class AnalyticsCounter {
    public static void main(String[] args) throws Exception {
    	// Read the symptoms
        ISymptomReader datas = new ReadSymptomDataFromFile("symptoms.txt");
        // Count the symptoms
        ISymptomsList symptoms = new Symptoms(datas);
        // Send the symptoms with their number of occurrences
        iDataSender newDatas = new SendDatas();
        newDatas.sendDatas("results.out", symptoms);
    }
}
