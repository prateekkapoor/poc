package com.kapoopr.demo.beans;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public class DataGenerator {

	public List<String> getCompanyData(List<String> isrns)
			throws InterruptedException, ExecutionException, TimeoutException {
		List<String> names = new ArrayList<String>();
		SplitIntoBatches<String> batches = new SplitIntoBatches<String>();
		List<List<String>> sublists = batches.getBatches(isrns);
		ExecutorService executorService = Executors.newFixedThreadPool(ApplicationConstants.NO_OF_THREADS);
		List<QueryExecutor> queryExecutors = new ArrayList<QueryExecutor>();
		for (List<String> subList : sublists) {
			queryExecutors.add(new QueryExecutor(subList));
		}
		List<Future<List<String>>> namesList = executorService.invokeAll(queryExecutors, ApplicationConstants.TIME_OUT,
				TimeUnit.SECONDS);
		for (Future<List<String>> futureName : namesList) {
			names.addAll(futureName.get(ApplicationConstants.TIME_OUT, TimeUnit.SECONDS));

		}
		executorService.shutdown();
		return names;
	}
}
