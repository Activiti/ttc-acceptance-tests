/*
 * Copyright 2018 Alfresco, Inc. and/or its affiliates.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.activiti.cloud.qa.service;

import feign.Headers;
import feign.RequestLine;
import org.activiti.cloud.qa.model.Tweet;

public interface TweeterConnectorService extends BaseService {

    @RequestLine("POST /v1/feed/start")
    @Headers("Content-Type: application/json")
    void startFeed();

    @RequestLine("POST /v1/feed/stop")
    @Headers("Content-Type: application/json")
    void stopFeed();

    @RequestLine("POST /v1/feed/tweet")
    @Headers("Content-Type: application/json")
    void tweet(Tweet tweet);

}
