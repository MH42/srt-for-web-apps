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
import org.apache.hupa.client.activity.MessageListFooterActivity;

import com.google.gwt.activity.shared.Activity;
import com.google.gwt.core.client.GWT;
import com.google.gwt.core.client.RunAsyncCallback;
import com.google.gwt.place.shared.Place;
import com.google.inject.Inject;
import com.google.inject.Provider;

public class MessageListFooterActivityMapper extends _MessageActivityMapper {
    private final Provider<MessageListFooterActivity> messageListFooterActivityProvider;

    @Inject
    public MessageListFooterActivityMapper(
            Provider<MessageListFooterActivity> messageListFooterActivityProvider) {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_mapper_MessageListFooterActivityMapper_java0x04b224fb10x0_____org_apache_hupa_client_mapper_MessageListFooterActivityMapper_java0x04b224fb1_____org_apache_hupa_client_mapper_MessageListFooterActivityMapper_java0x04b224fb10x1");
				InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_mapper_MessageListFooterActivityMapper_java0x04b224fb14c0019270x2_____org_apache_hupa_client_mapper_MessageListFooterActivityMapper_java0x04b224fb14c0019270x1_____org_apache_hupa_client_mapper_MessageListFooterActivityMapper_java0x04b224fb14c0019270x10x0_____org_apache_hupa_client_mapper_MessageListFooterActivityMapper_java0x04b224fb14c0019270x10x00x0_____org_apache_hupa_client_mapper_MessageListFooterActivityMapper_java0x04b224fb14c0019270x10x00x1");
				InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_mapper_MessageListFooterActivityMapper_java0x04b224fb1bfd5e4990x1_____org_apache_hupa_client_mapper_MessageListFooterActivityMapper_java0x04b224fb1bfd5e499_____org_apache_hupa_client_mapper_MessageListFooterActivityMapper_java0x04b224fb1bfd5e4990x20x1_____org_apache_hupa_client_mapper_MessageListFooterActivityMapper_java0x04b224fb1bfd5e4990x20x0_____org_apache_hupa_client_mapper_MessageListFooterActivityMapper_java0x04b224fb1bfd5e4990x2_____org_apache_hupa_client_mapper_MessageListFooterActivityMapper_java0x04b224fb1bfd5e4990x0_____org_apache_hupa_client_mapper_MessageListFooterActivityMapper_java0x04b224fb1bfd5e4990x3");
				InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_mapper_MessageListFooterActivityMapper_java0x04b224fb14c001927");
				InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_mapper_MessageListFooterActivityMapper_java0x0_____org_apache_hupa_client_mapper_MessageListFooterActivityMapper_java0x04b224fb14c0019270x20x0_____org_apache_hupa_client_mapper_MessageListFooterActivityMapper_java0x04b224fb14c0019270x20x00x0");
		this.messageListFooterActivityProvider = messageListFooterActivityProvider;
    }

    @Override
    protected Activity lazyLoadActivity(Place place) {InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_mapper_MessageListFooterActivityMapper_java0x04b224fb14101279f");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_mapper_MessageListFooterActivityMapper_java0x04b224fb14101279f0x2_____org_apache_hupa_client_mapper_MessageListFooterActivityMapper_java0x04b224fb14101279f0x30x00x0_____org_apache_hupa_client_mapper_MessageListFooterActivityMapper_java0x04b224fb14101279f0x1_____org_apache_hupa_client_mapper_MessageListFooterActivityMapper_java0x04b224fb14101279f0x30x0_____org_apache_hupa_client_mapper_MessageListFooterActivityMapper_java0x04b224fb14101279f0x30x00x00x1_____org_apache_hupa_client_mapper_MessageListFooterActivityMapper_java0x04b224fb14101279f0x0_____org_apache_hupa_client_mapper_MessageListFooterActivityMapper_java0x04b224fb14101279f0x30x00x00x0_____org_apache_hupa_client_mapper_MessageListFooterActivityMapper_java0x04b224fb14101279f0x20x0_____org_apache_hupa_client_mapper_MessageListFooterActivityMapper_java0x04b224fb14101279f0x3");
	return new ActivityAsyncProxy() {
        @Override
        protected void doAsync(RunAsyncCallback callback) {
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_mapper_MessageListFooterActivityMapper_java0x04b224fb14101279f0x30x00x00x1eb4b3f5d0x1_____org_apache_hupa_client_mapper_MessageListFooterActivityMapper_java0x04b224fb14101279f0x30x00x00x1eb4b3f5d0x3_____org_apache_hupa_client_mapper_MessageListFooterActivityMapper_java0x04b224fb14101279f0x30x00x00x1eb4b3f5d0x2_____org_apache_hupa_client_mapper_MessageListFooterActivityMapper_java0x04b224fb14101279f0x30x00x00x1eb4b3f5d0x20x0_____org_apache_hupa_client_mapper_MessageListFooterActivityMapper_java0x04b224fb14101279f0x30x00x00x1eb4b3f5d0x0");
			InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_mapper_MessageListFooterActivityMapper_java0x04b224fb14101279f0x30x00x00x1eb4b3f5d");
			InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_mapper_MessageListFooterActivityMapper_java0x04b224fb14101279f0x30x00x00x1eb4b3f5d0x30x0_____org_apache_hupa_client_mapper_MessageListFooterActivityMapper_java0x04b224fb14101279f0x30x00x00x1eb4b3f5d0x30x00x0");
			GWT.runAsync(callback);
        }

        @Override
        protected Activity createInstance() {
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_mapper_MessageListFooterActivityMapper_java0x04b224fb14101279f0x30x00x00x1c38e762c");
			InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_mapper_MessageListFooterActivityMapper_java0x04b224fb14101279f0x30x00x00x1c38e762c0x1_____org_apache_hupa_client_mapper_MessageListFooterActivityMapper_java0x04b224fb14101279f0x30x00x00x1c38e762c0x0_____org_apache_hupa_client_mapper_MessageListFooterActivityMapper_java0x04b224fb14101279f0x30x00x00x1c38e762c0x2");
			InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_mapper_MessageListFooterActivityMapper_java0x04b224fb14101279f0x30x00x00x1c38e762c0x20x0_____org_apache_hupa_client_mapper_MessageListFooterActivityMapper_java0x04b224fb14101279f0x30x00x00x1c38e762c0x20x00x0");
			return messageListFooterActivityProvider.get();
        }
    };}
}
