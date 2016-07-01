/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package com.aliyuncs.batchcompute.model.v20151111;

import com.aliyuncs.batchcompute.main.v20151111.BatchComputeRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class GetInstanceRequest extends BatchComputeRequest<GetInstanceResponse> {
	
	public GetInstanceRequest() {
		super("BatchCompute", "2015-11-11", "GetInstance");
		setUriPattern("/jobs/[ResourceName]/tasks/[TaskName]/instances/[InstanceId]");
		setMethod(MethodType.GET);
	}

	private String resourceName;

	private String taskName;

	private int instanceId;

	public String getJobId() {
		return this.resourceName;
	}

	public void setJobId(String jobId) {
		this.resourceName = jobId;
		putPathParameter("ResourceName", resourceName);
	}

	public String getTaskName() {
		return this.taskName;
	}

	public void setTaskName(String taskName) {
		this.taskName = taskName;
		putPathParameter("TaskName", taskName);
	}

	public int getInstanceId() {
		return this.instanceId;
	}

	public void setInstanceId(int instanceId) {
		this.instanceId = instanceId;
		putPathParameter("InstanceId", instanceId);
	}

	@Override
	public Class<GetInstanceResponse> getResponseClass() {
		return GetInstanceResponse.class;
	}

}
