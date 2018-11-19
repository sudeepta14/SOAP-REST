package com.Sudeepta;

import javax.ws.rs.container.AsyncResponse;

import org.springframework.stereotype.Service;
@Service

public class CheckProcessorImpl implements checkProcessor {

	@Override
	public void processChecks(AsyncResponse response, Checklist checkList) {
		new Thread() {
		public void run() {
			response.resume(true);
		}
	}.start();
	}

}
