package org.springframework.batch.jsr;

import java.util.Properties;

import javax.batch.operations.JobOperator;
import javax.batch.runtime.BatchRuntime;

public class JsrMainClass {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		JobOperator jobOperator = BatchRuntime.getJobOperator();

		Properties jobParameters = new Properties();

		long executionId = -1;

		try {
			executionId = Long.parseLong(args[0]);
		} catch (NumberFormatException notRestart) {
		}

		for(int i = 1; i < args.length; i++) {
			System.out.println("args[" + i + "] : " + args[i]);
			jobParameters.put(args[i].substring(0, args[i].indexOf('=')), args[i].substring(args[i].indexOf('=') + 1));
		}


		if(executionId >= 0) {
			System.out.println("Re-start : executionId : " + executionId + " jobParameters " + jobParameters.keySet());
			executionId = jobOperator.restart(executionId, jobParameters);
		} else {
			System.out.println("Start : args[0] : " + args[0] + " jobParameters " + jobParameters.keySet());
			executionId = jobOperator.start(args[0], jobParameters);
		}

		System.err.println(">>> The execution id of the job run was : " + executionId);
	}
}
