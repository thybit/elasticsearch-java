/*
 * Licensed to Elasticsearch B.V. under one or more contributor
 * license agreements. See the NOTICE file distributed with
 * this work for additional information regarding copyright
 * ownership. Elasticsearch B.V. licenses this file to you under
 * the Apache License, Version 2.0 (the "License"); you may
 * not use this file except in compliance with the License.
 * You may obtain a copy of the License at
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

//----------------------------------------------------
// THIS CODE IS GENERATED. MANUAL EDITS WILL BE LOST.
//----------------------------------------------------

package co.elastic.clients.elasticsearch.enrich;

import co.elastic.clients.base.ApiClient;
import co.elastic.clients.base.Transport;
import co.elastic.clients.elasticsearch._types.ElasticsearchException;
import co.elastic.clients.util.ObjectBuilder;
import java.io.IOException;
import java.util.concurrent.CompletableFuture;
import java.util.function.Function;
import javax.annotation.Nullable;

/**
 * Client for the enrich namespace.
 */
public class ElasticsearchEnrichAsyncClient extends ApiClient {

	public ElasticsearchEnrichAsyncClient(Transport transport) {
		super(transport);
	}

	// ----- Endpoint: enrich.delete_policy

	/**
	 * Deletes an existing enrich policy and its enrich index.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/delete-enrich-policy-api.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<DeletePolicyResponse> deletePolicy(DeletePolicyRequest request)
			throws IOException, ElasticsearchException {
		return this.transport.performRequestAsync(request, DeletePolicyRequest.ENDPOINT);
	}

	/**
	 * Deletes an existing enrich policy and its enrich index.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link DeletePolicyRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/delete-enrich-policy-api.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<DeletePolicyResponse> deletePolicy(
			Function<DeletePolicyRequest.Builder, ObjectBuilder<DeletePolicyRequest>> fn)
			throws IOException, ElasticsearchException {
		return deletePolicy(fn.apply(new DeletePolicyRequest.Builder()).build());
	}

	// ----- Endpoint: enrich.execute_policy

	/**
	 * Creates the enrich index for an existing enrich policy.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/execute-enrich-policy-api.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<ExecutePolicyResponse> executePolicy(ExecutePolicyRequest request)
			throws IOException, ElasticsearchException {
		return this.transport.performRequestAsync(request, ExecutePolicyRequest.ENDPOINT);
	}

	/**
	 * Creates the enrich index for an existing enrich policy.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link ExecutePolicyRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/execute-enrich-policy-api.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<ExecutePolicyResponse> executePolicy(
			Function<ExecutePolicyRequest.Builder, ObjectBuilder<ExecutePolicyRequest>> fn)
			throws IOException, ElasticsearchException {
		return executePolicy(fn.apply(new ExecutePolicyRequest.Builder()).build());
	}

	// ----- Endpoint: enrich.get_policy

	/**
	 * Gets information about an enrich policy.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/get-enrich-policy-api.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<GetPolicyResponse> getPolicy(GetPolicyRequest request)
			throws IOException, ElasticsearchException {
		return this.transport.performRequestAsync(request, GetPolicyRequest.ENDPOINT);
	}

	/**
	 * Gets information about an enrich policy.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link GetPolicyRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/get-enrich-policy-api.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<GetPolicyResponse> getPolicy(
			Function<GetPolicyRequest.Builder, ObjectBuilder<GetPolicyRequest>> fn)
			throws IOException, ElasticsearchException {
		return getPolicy(fn.apply(new GetPolicyRequest.Builder()).build());
	}

	/**
	 * Gets information about an enrich policy.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/get-enrich-policy-api.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<GetPolicyResponse> getPolicy() throws IOException, ElasticsearchException {
		return this.transport.performRequestAsync(new GetPolicyRequest.Builder().build(), GetPolicyRequest.ENDPOINT);
	}

	// ----- Endpoint: enrich.put_policy

	/**
	 * Creates a new enrich policy.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/put-enrich-policy-api.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<PutPolicyResponse> putPolicy(PutPolicyRequest request)
			throws IOException, ElasticsearchException {
		return this.transport.performRequestAsync(request, PutPolicyRequest.ENDPOINT);
	}

	/**
	 * Creates a new enrich policy.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link PutPolicyRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/put-enrich-policy-api.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<PutPolicyResponse> putPolicy(
			Function<PutPolicyRequest.Builder, ObjectBuilder<PutPolicyRequest>> fn)
			throws IOException, ElasticsearchException {
		return putPolicy(fn.apply(new PutPolicyRequest.Builder()).build());
	}

	// ----- Endpoint: enrich.stats

	/**
	 * Gets enrich coordinator statistics and information about enrich policies that
	 * are currently executing.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/enrich-stats-api.html">Documentation
	 *      on elastic.co</a>
	 */
	public CompletableFuture<EnrichStatsResponse> stats() throws IOException, ElasticsearchException {
		return this.transport.performRequestAsync(EnrichStatsRequest._INSTANCE, EnrichStatsRequest.ENDPOINT);
	}

}
