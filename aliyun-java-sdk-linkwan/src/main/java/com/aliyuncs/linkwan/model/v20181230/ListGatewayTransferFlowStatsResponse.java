/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.aliyuncs.linkwan.model.v20181230;

import java.util.List;
import java.util.Map;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.linkwan.transform.v20181230.ListGatewayTransferFlowStatsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListGatewayTransferFlowStatsResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

	private List<FlowStat> data;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public List<FlowStat> getData() {
		return this.data;
	}

	public void setData(List<FlowStat> data) {
		this.data = data;
	}

	public static class FlowStat {

		private String statMillis;

		private Long uplinkCount;

		private Long downlinkCount;

		public String getStatMillis() {
			return this.statMillis;
		}

		public void setStatMillis(String statMillis) {
			this.statMillis = statMillis;
		}

		public Long getUplinkCount() {
			return this.uplinkCount;
		}

		public void setUplinkCount(Long uplinkCount) {
			this.uplinkCount = uplinkCount;
		}

		public Long getDownlinkCount() {
			return this.downlinkCount;
		}

		public void setDownlinkCount(Long downlinkCount) {
			this.downlinkCount = downlinkCount;
		}
	}

	@Override
	public ListGatewayTransferFlowStatsResponse getInstance(UnmarshallerContext context) {
		return	ListGatewayTransferFlowStatsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
