package com.kapoopr.elasticSearch.demo.model.generators;

import java.util.List;
import java.util.Map;

import com.kapoopr.elasticSearch.demo.model.Model;

public interface ModelGenerator {
	public List<? extends Model> getDataModels(List<Map<String, Object>> data);

}
