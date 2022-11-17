package com.hemebiotech.analytics;
public class AnalyticsCounter {
    public static void main(String[] args) throws Exception {
        ReadSymptomDataFromFile datas = new ReadSymptomDataFromFile("symptoms.txt");
        ISymptomsList symptoms = new Symptoms();
        symptoms.sendDatas("results.out", datas.getSymptoms());
    }
}
