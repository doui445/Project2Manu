package com.hemebiotech.analytics;

public class AnalyticsCounter {
    public static void main(String[] args) throws Exception {

        ReadSymptomDataFromFile datas = new ReadSymptomDataFromFile("symptoms.txt");

        Symptoms symptoms = new Symptoms(datas.result);
        
        symptoms.SendDatas("results.out.txt");
    }
}
