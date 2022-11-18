package com.hemebiotech.analytics;
public class AnalyticsCounter {
    public static void main(String[] args) throws Exception {
    	// Read the symptoms
        ISymptomReader datas = new ReadSymptomDataFromFile("symptoms.txt");
        // Count the symptoms
        ISymptomsList symptoms = new Symptoms();
        // Send the symptoms with their number of occurrences
        symptoms.sendDatas("results.out", datas.getSymptoms());
    }
}
