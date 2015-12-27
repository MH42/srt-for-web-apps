/****************************************************************
 * Licensed to the Apache Software Foundation (ASF) under one   *
 * or more contributor license agreements.  See the NOTICE file *
 * distributed with this work for additional information        *
 * regarding copyright ownership.  The ASF licenses this file   *
 * to you under the Apache License, Version 2.0 (the            *
 * "License"); you may not use this file except in compliance   *
 * with the License.  You may obtain a copy of the License at   *
 *                                                              *
 *   http://www.apache.org/licenses/LICENSE-2.0                 *
 *                                                              *
 * Unless required by applicable law or agreed to in writing,   *
 * software distributed under the License is distributed on an  *
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY       *
 * KIND, either express or implied.  See the License for the    *
 * specific language governing permissions and limitations      *
 * under the License.                                           *
 ****************************************************************/

package org.apache.hupa.client.mapper;


import gwtTestSelection.shared.InstrumentationLoggerProvider;
import org.apache.hupa.client.activity.SettingNavActivity;
import org.apache.hupa.client.place.DefaultPlace;

import com.google.gwt.activity.shared.Activity;
import com.google.gwt.core.client.GWT;
import com.google.gwt.core.client.RunAsyncCallback;
import com.google.gwt.place.shared.Place;
import com.google.inject.Inject;
import com.google.inject.Provider;

public class SettingNavActivityMapper extends _HupaActivityMapper {
    private final Provider<SettingNavActivity> settingNavActivityProvider;

    @Inject
    public SettingNavActivityMapper(Provider<SettingNavActivity> settingNavActivityProvider) {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_mapper_SettingNavActivityMapper_java0x085cc226dd6a646fd0x10x0_____org_apache_hupa_client_mapper_SettingNavActivityMapper_java0x085cc226dd6a646fd0x1_____org_apache_hupa_client_mapper_SettingNavActivityMapper_java0x085cc226dd6a646fd0x10x00x1_____org_apache_hupa_client_mapper_SettingNavActivityMapper_java0x085cc226dd6a646fd0x10x00x0_____org_apache_hupa_client_mapper_SettingNavActivityMapper_java0x085cc226dd6a646fd0x2_____org_apache_hupa_client_mapper_SettingNavActivityMapper_java0x085cc226dd6a646fd0x0");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_mapper_SettingNavActivityMapper_java0x085cc226d9d13d5170x1_____org_apache_hupa_client_mapper_SettingNavActivityMapper_java0x085cc226d9d13d5170x20x0_____org_apache_hupa_client_mapper_SettingNavActivityMapper_java0x085cc226d9d13d5170x2_____org_apache_hupa_client_mapper_SettingNavActivityMapper_java0x085cc226d9d13d5170x0_____org_apache_hupa_client_mapper_SettingNavActivityMapper_java0x085cc226d9d13d517_____org_apache_hupa_client_mapper_SettingNavActivityMapper_java0x085cc226d9d13d5170x20x1_____org_apache_hupa_client_mapper_SettingNavActivityMapper_java0x085cc226d9d13d5170x3");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_mapper_SettingNavActivityMapper_java0x085cc226d_____org_apache_hupa_client_mapper_SettingNavActivityMapper_java0x085cc226d0x1_____org_apache_hupa_client_mapper_SettingNavActivityMapper_java0x085cc226d0x0");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_mapper_SettingNavActivityMapper_java0x085cc226dd6a646fd");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_mapper_SettingNavActivityMapper_java0x0_____org_apache_hupa_client_mapper_SettingNavActivityMapper_java0x085cc226dd6a646fd0x20x00x0_____org_apache_hupa_client_mapper_SettingNavActivityMapper_java0x085cc226dd6a646fd0x20x0");
		this.settingNavActivityProvider = settingNavActivityProvider;
    }
    @Override
    protected Activity asyncLoadActivity(Place place) {
        
		//		Block insertion:
		//
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_mapper_SettingNavActivityMapper_java0x085cc226de484aefe0x30x00x00x0_____org_apache_hupa_client_mapper_SettingNavActivityMapper_java0x085cc226de484aefe0x30x00x0_____org_apache_hupa_client_mapper_SettingNavActivityMapper_java0x085cc226de484aefe0x30x00x1_____org_apache_hupa_client_mapper_SettingNavActivityMapper_java0x085cc226de484aefe0x30x0");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_mapper_SettingNavActivityMapper_java0x085cc226de484aefe0x3_____org_apache_hupa_client_mapper_SettingNavActivityMapper_java0x085cc226de484aefe0x20x0_____org_apache_hupa_client_mapper_SettingNavActivityMapper_java0x085cc226de484aefe0x0_____org_apache_hupa_client_mapper_SettingNavActivityMapper_java0x085cc226de484aefe0x1_____org_apache_hupa_client_mapper_SettingNavActivityMapper_java0x085cc226de484aefe0x2");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_mapper_SettingNavActivityMapper_java0x085cc226de484aefe");
		if(place instanceof DefaultPlace) return null;
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_mapper_SettingNavActivityMapper_java0x085cc226de484aefe0x30x1_____org_apache_hupa_client_mapper_SettingNavActivityMapper_java0x085cc226de484aefe0x30x10x0_____org_apache_hupa_client_mapper_SettingNavActivityMapper_java0x085cc226de484aefe0x30x10x00x1_____org_apache_hupa_client_mapper_SettingNavActivityMapper_java0x085cc226de484aefe0x30x10x00x0");
		return new ActivityAsyncProxy() {
            @Override
            protected void doAsync(RunAsyncCallback callback) {
                InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_mapper_SettingNavActivityMapper_java0x085cc226de484aefe0x30x10x00x1eb4b3f5d0x0_____org_apache_hupa_client_mapper_SettingNavActivityMapper_java0x085cc226de484aefe0x30x10x00x1eb4b3f5d0x2_____org_apache_hupa_client_mapper_SettingNavActivityMapper_java0x085cc226de484aefe0x30x10x00x1eb4b3f5d0x20x0_____org_apache_hupa_client_mapper_SettingNavActivityMapper_java0x085cc226de484aefe0x30x10x00x1eb4b3f5d0x1_____org_apache_hupa_client_mapper_SettingNavActivityMapper_java0x085cc226de484aefe0x30x10x00x1eb4b3f5d0x3");
				InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_mapper_SettingNavActivityMapper_java0x085cc226de484aefe0x30x10x00x1eb4b3f5d");
				InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_mapper_SettingNavActivityMapper_java0x085cc226de484aefe0x30x10x00x1eb4b3f5d0x30x00x0_____org_apache_hupa_client_mapper_SettingNavActivityMapper_java0x085cc226de484aefe0x30x10x00x1eb4b3f5d0x30x0");
				GWT.runAsync(callback);
            }

            @Override
            protected Activity createInstance() {
                InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_mapper_SettingNavActivityMapper_java0x085cc226de484aefe0x30x10x00x1c38e762c");
				InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_mapper_SettingNavActivityMapper_java0x085cc226de484aefe0x30x10x00x1c38e762c0x0_____org_apache_hupa_client_mapper_SettingNavActivityMapper_java0x085cc226de484aefe0x30x10x00x1c38e762c0x1_____org_apache_hupa_client_mapper_SettingNavActivityMapper_java0x085cc226de484aefe0x30x10x00x1c38e762c0x2");
				InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_mapper_SettingNavActivityMapper_java0x085cc226de484aefe0x30x10x00x1c38e762c0x20x00x0_____org_apache_hupa_client_mapper_SettingNavActivityMapper_java0x085cc226de484aefe0x30x10x00x1c38e762c0x20x0");
				return settingNavActivityProvider.get();
            }
        };
    }
}
