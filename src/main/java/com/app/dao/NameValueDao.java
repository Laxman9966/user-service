package com.app.dao;

import org.springframework.data.repository.CrudRepository;

import com.app.domain.NameValue;

/**
 * 
 * @author Vijayendra Mudigal
 *
 */
public interface NameValueDao extends CrudRepository<NameValue, Long> {

}
