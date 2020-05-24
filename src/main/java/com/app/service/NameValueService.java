package com.app.service;

import com.app.model.AllNameValueTO;
import com.app.model.NameValueTO;

/**
 * 
 * @author Vijayendra Mudigal
 *
 */
public interface NameValueService {

	NameValueTO updateNameValue(NameValueTO nameValueTO);
	
	NameValueTO updateNameValue(NameValueTO nameValueTO, boolean fromRabbit);

	AllNameValueTO getAllNameValues(String name);

	NameValueTO generateUUID();

	NameValueTO generateUUID(String applicationName);

}
