package com.hemebiotech.analytics.interfaces;

/**
 * Anything that will read symptom data from a source
 * The important part is, the return value from the operation, which is a list of strings,
 * that may contain many duplications
 * 
 * The implementation does not need to order the list
 * 
 */
public interface iDataSender {
	/**
	 * If no file or data is available, does nothing
	 * 
	 * @return a map listing of all Symptoms in the file at the filepath 
	 * Duplicates are not possible
	 */
	void sendDatas (String filepath, ISymptomsList symptoms);
}
