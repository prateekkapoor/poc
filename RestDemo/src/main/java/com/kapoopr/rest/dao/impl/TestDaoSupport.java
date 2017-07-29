package com.kapoopr.rest.dao.impl;

import java.util.concurrent.TimeUnit;

import org.springframework.jdbc.core.support.JdbcDaoSupport;

import com.google.common.cache.CacheBuilder;
import com.google.common.cache.CacheLoader;
import com.google.common.cache.LoadingCache;

public class TestDaoSupport extends JdbcDaoSupport {
	LoadingCache<String, String> cacheBuilder = CacheBuilder.newBuilder()
			.maximumSize(2000).expireAfterAccess(15, TimeUnit.SECONDS)
			.build(new CacheLoader<String, String>() {

				@Override
				public String load(String key) throws Exception {
					System.out.println("loading from db");
					return getStudentFromDB(key);
				}
			});

	public String getStudentFromDB(String rollNo) {
		return getJdbcTemplate().queryForObject(
				"select name  from student where rollno=?", String.class,
				new Object[] { 1 });

	}
	public String getStudent(String rollNo) {
		return  cacheBuilder.getUnchecked(rollNo);

	}
}
