/**
 * Copyright 2016 Yurii Rashkovskii
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 */
package graphql.servlet;

import graphql.GraphQLError;

import java.util.List;
import java.util.Map;

public interface GraphQLOperationListener {
    default void beforeGraphQLOperation(GraphQLContext context, String operationName, String query, Map<String, Object> variables) {}
    default void onSuccessfulGraphQLOperation(GraphQLContext context, String operationName, String query, Map<String, Object> variables, Object data) {}
    default void onFailedGraphQLOperation(GraphQLContext context, String operationName, String query, Map<String, Object> variables, Object data, List<GraphQLError> errors) {}
}
