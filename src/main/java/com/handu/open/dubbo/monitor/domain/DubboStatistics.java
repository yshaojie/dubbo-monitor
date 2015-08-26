/**
 * Copyright 2006-2015 handu.com
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.handu.open.dubbo.monitor.domain;

import java.io.Serializable;

/**
 * Dubbo Statistics Entity
 *
 * @author Zhiguo.Chen <me@chenzhiguo.cn>
 *         Created on 15/7/2.
 */
public class DubboStatistics implements Serializable {

    private String method;

    private int consumerSuccess;

    private int providerSuccess;

    private int consumerFailure;

    private int providerFailure;

    private int consumerAvgElapsed;

    private int providerAvgElapsed;

    private int consumerMaxElapsed;

    private int providerMaxElapsed;

    private int consumerMaxConcurrent;

    private int providerMaxConcurrent;

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    public int getConsumerSuccess() {
        return consumerSuccess;
    }

    public void setConsumerSuccess(int consumerSuccess) {
        this.consumerSuccess = consumerSuccess;
    }

    public int getProviderSuccess() {
        return providerSuccess;
    }

    public void setProviderSuccess(int providerSuccess) {
        this.providerSuccess = providerSuccess;
    }

    public int getConsumerFailure() {
        return consumerFailure;
    }

    public void setConsumerFailure(int consumerFailure) {
        this.consumerFailure = consumerFailure;
    }

    public int getProviderFailure() {
        return providerFailure;
    }

    public void setProviderFailure(int providerFailure) {
        this.providerFailure = providerFailure;
    }

    public int getConsumerAvgElapsed() {
        return consumerAvgElapsed;
    }

    public void setConsumerAvgElapsed(int consumerAvgElapsed) {
        this.consumerAvgElapsed = consumerAvgElapsed;
    }

    public int getProviderAvgElapsed() {
        return providerAvgElapsed;
    }

    public void setProviderAvgElapsed(int providerAvgElapsed) {
        this.providerAvgElapsed = providerAvgElapsed;
    }

    public int getConsumerMaxElapsed() {
        return consumerMaxElapsed;
    }

    public void setConsumerMaxElapsed(int consumerMaxElapsed) {
        this.consumerMaxElapsed = consumerMaxElapsed;
    }

    public int getProviderMaxElapsed() {
        return providerMaxElapsed;
    }

    public void setProviderMaxElapsed(int providerMaxElapsed) {
        this.providerMaxElapsed = providerMaxElapsed;
    }

    public int getConsumerMaxConcurrent() {
        return consumerMaxConcurrent;
    }

    public void setConsumerMaxConcurrent(int consumerMaxConcurrent) {
        this.consumerMaxConcurrent = consumerMaxConcurrent;
    }

    public int getProviderMaxConcurrent() {
        return providerMaxConcurrent;
    }

    public void setProviderMaxConcurrent(int providerMaxConcurrent) {
        this.providerMaxConcurrent = providerMaxConcurrent;
    }
}
