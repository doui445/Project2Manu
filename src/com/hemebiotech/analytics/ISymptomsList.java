package com.hemebiotech.analytics;

import java.util.List;
import java.util.SortedMap;

public interface ISymptomsList {
    SortedMap<String, Integer> listSymptoms(List<String> datas);
    void sendDatas(String filepath, List<String> datas);
}
