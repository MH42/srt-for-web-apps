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
import org.apache.hupa.client.activity.LabelPropertiesActivity;
import org.apache.hupa.client.place.SettingPlace;

import com.google.gwt.activity.shared.Activity;
import com.google.gwt.activity.shared.ActivityMapper;
import com.google.gwt.core.client.GWT;
import com.google.gwt.core.client.RunAsyncCallback;
import com.google.gwt.place.shared.Place;
import com.google.inject.Inject;
import com.google.inject.Provider;

public class LabelPropertiesActivityMapper implements ActivityMapper {
    private final Provider<LabelPropertiesActivity> labelPropertiesActivityProvider;

    @Inject
    public LabelPropertiesActivityMapper(Provider<LabelPropertiesActivity> labelPropertiesActivityProvider) {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_mapper_LabelPropertiesActivityMapper_java0x0874d9c662d5679350x10x00x1_____org_apache_hupa_client_mapper_LabelPropertiesActivityMapper_java0x0874d9c662d5679350x0_____org_apache_hupa_client_mapper_LabelPropertiesActivityMapper_java0x0874d9c662d5679350x10x0_____org_apache_hupa_client_mapper_LabelPropertiesActivityMapper_java0x0874d9c662d5679350x10x00x0_____org_apache_hupa_client_mapper_LabelPropertiesActivityMapper_java0x0874d9c662d5679350x2_____org_apache_hupa_client_mapper_LabelPropertiesActivityMapper_java0x0874d9c662d5679350x1");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_mapper_LabelPropertiesActivityMapper_java0x0874d9c662d567935");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_mapper_LabelPropertiesActivityMapper_java0x0874d9c660x0_____org_apache_hupa_client_mapper_LabelPropertiesActivityMapper_java0x0874d9c66_____org_apache_hupa_client_mapper_LabelPropertiesActivityMapper_java0x0874d9c660x1");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_mapper_LabelPropertiesActivityMapper_java0x0874d9c66ab4282390x1_____org_apache_hupa_client_mapper_LabelPropertiesActivityMapper_java0x0874d9c66ab4282390x20x0_____org_apache_hupa_client_mapper_LabelPropertiesActivityMapper_java0x0874d9c66ab4282390x0_____org_apache_hupa_client_mapper_LabelPropertiesActivityMapper_java0x0874d9c66ab4282390x20x1_____org_apache_hupa_client_mapper_LabelPropertiesActivityMapper_java0x0874d9c66ab4282390x2_____org_apache_hupa_client_mapper_LabelPropertiesActivityMapper_java0x0874d9c66ab428239_____org_apache_hupa_client_mapper_LabelPropertiesActivityMapper_java0x0874d9c66ab4282390x3");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_mapper_LabelPropertiesActivityMapper_java0x0874d9c662d5679350x20x0_____org_apache_hupa_client_mapper_LabelPropertiesActivityMapper_java0x0874d9c662d5679350x20x00x0_____org_apache_hupa_client_mapper_LabelPropertiesActivityMapper_java0x0");
		this.labelPropertiesActivityProvider = labelPropertiesActivityProvider;
    }

    public Activity getActivity(Place place) {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_mapper_LabelPropertiesActivityMapper_java0x0874d9c66d92c4d5b0x2_____org_apache_hupa_client_mapper_LabelPropertiesActivityMapper_java0x0874d9c66d92c4d5b0x1_____org_apache_hupa_client_mapper_LabelPropertiesActivityMapper_java0x0874d9c66d92c4d5b0x3_____org_apache_hupa_client_mapper_LabelPropertiesActivityMapper_java0x0874d9c66d92c4d5b0x20x0_____org_apache_hupa_client_mapper_LabelPropertiesActivityMapper_java0x0874d9c66d92c4d5b0x0_____org_apache_hupa_client_mapper_LabelPropertiesActivityMapper_java0x0874d9c66d92c4d5b");
		
		//		Block insertion:
		//
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_mapper_LabelPropertiesActivityMapper_java0x0874d9c66d92c4d5b0x30x00x1");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_mapper_LabelPropertiesActivityMapper_java0x0874d9c66d92c4d5b0x30x00x00x00x00x0_____org_apache_hupa_client_mapper_LabelPropertiesActivityMapper_java0x0874d9c66d92c4d5b0x30x00x00x00x0_____org_apache_hupa_client_mapper_LabelPropertiesActivityMapper_java0x0874d9c66d92c4d5b0x30x0_____org_apache_hupa_client_mapper_LabelPropertiesActivityMapper_java0x0874d9c66d92c4d5b0x30x00x00x0_____org_apache_hupa_client_mapper_LabelPropertiesActivityMapper_java0x0874d9c66d92c4d5b0x30x00x0");
		if (!(place instanceof SettingPlace))
            return null;
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_mapper_LabelPropertiesActivityMapper_java0x0874d9c66d92c4d5b0x30x10x00x1_____org_apache_hupa_client_mapper_LabelPropertiesActivityMapper_java0x0874d9c66d92c4d5b0x30x10x00x0_____org_apache_hupa_client_mapper_LabelPropertiesActivityMapper_java0x0874d9c66d92c4d5b0x30x10x0_____org_apache_hupa_client_mapper_LabelPropertiesActivityMapper_java0x0874d9c66d92c4d5b0x30x1");
		return new ActivityAsyncProxy() {
            @Override
            protected void doAsync(RunAsyncCallback callback) {
                InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_mapper_LabelPropertiesActivityMapper_java0x0874d9c66d92c4d5b0x30x10x00x1eb4b3f5d");
				InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_mapper_LabelPropertiesActivityMapper_java0x0874d9c66d92c4d5b0x30x10x00x1eb4b3f5d0x20x0_____org_apache_hupa_client_mapper_LabelPropertiesActivityMapper_java0x0874d9c66d92c4d5b0x30x10x00x1eb4b3f5d0x2_____org_apache_hupa_client_mapper_LabelPropertiesActivityMapper_java0x0874d9c66d92c4d5b0x30x10x00x1eb4b3f5d0x1_____org_apache_hupa_client_mapper_LabelPropertiesActivityMapper_java0x0874d9c66d92c4d5b0x30x10x00x1eb4b3f5d0x3_____org_apache_hupa_client_mapper_LabelPropertiesActivityMapper_java0x0874d9c66d92c4d5b0x30x10x00x1eb4b3f5d0x0");
				InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_mapper_LabelPropertiesActivityMapper_java0x0874d9c66d92c4d5b0x30x10x00x1eb4b3f5d0x30x0_____org_apache_hupa_client_mapper_LabelPropertiesActivityMapper_java0x0874d9c66d92c4d5b0x30x10x00x1eb4b3f5d0x30x00x0");
				GWT.runAsync(callback);
            }

            @Override
            protected Activity createInstance() {
                InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_mapper_LabelPropertiesActivityMapper_java0x0874d9c66d92c4d5b0x30x10x00x1c38e762c");
				InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_mapper_LabelPropertiesActivityMapper_java0x0874d9c66d92c4d5b0x30x10x00x1c38e762c0x1_____org_apache_hupa_client_mapper_LabelPropertiesActivityMapper_java0x0874d9c66d92c4d5b0x30x10x00x1c38e762c0x0_____org_apache_hupa_client_mapper_LabelPropertiesActivityMapper_java0x0874d9c66d92c4d5b0x30x10x00x1c38e762c0x2");
				InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_mapper_LabelPropertiesActivityMapper_java0x0874d9c66d92c4d5b0x30x10x00x1c38e762c0x20x0_____org_apache_hupa_client_mapper_LabelPropertiesActivityMapper_java0x0874d9c66d92c4d5b0x30x10x00x1c38e762c0x20x00x0");
				return labelPropertiesActivityProvider.get();
            }
        };
    }
}
