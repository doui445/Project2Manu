package com.hemebiotech.analytics.interfaces;

import java.util.SortedMap;

/**
 * Anything that will read symptom data from a list of strings
 * The important part is, the return value from the operation, which is a sorted map of 
 * strings and integers, that contain only one duplication
 * 
 * The implementation have to order the list
 * 
 * It's also have a sendDatas method that will return the symptoms sorted map in a new
 * text file
 * 
 */
public interface ISymptomsList {
	/**
	 * If no data is available, return an empty SortedMap
	 * 
	 * @return a map listing of all Symptoms obtained from a list of strings, and count their occurrences
	 * Duplicates are not possible
	 */
    SortedMap<String, Integer> listSymptoms();
}
