/*
 * Copyright (c) 2021, WSO2 Inc. (http://www.wso2.com).
 *
 * WSO2 Inc. licenses this file to you under the Apache License,
 * Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package org.wso2.carbon.identity.smsotp.common.internal;

import org.wso2.carbon.identity.smsotp.common.dto.ConfigsDTO;
import org.wso2.carbon.user.core.service.RealmService;

/**
 * Data holder for SMS OTP Service.
 */
public class SMSOTPServiceDataHolder {

    private static final SMSOTPServiceDataHolder dataHolder = new SMSOTPServiceDataHolder();
    private RealmService realmService;
    private static final ConfigsDTO configs = new ConfigsDTO();

    public static SMSOTPServiceDataHolder getInstance() {

        return dataHolder;
    }
    public RealmService getRealmService() {

        return realmService;
    }

    public void setRealmService(RealmService realmService) {

        this.realmService = realmService;
    }

    public static ConfigsDTO getConfigs() {

        return configs;
    }
}
