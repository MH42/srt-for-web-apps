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

package org.apache.hupa.client.activity;


import gwtTestSelection.shared.InstrumentationLoggerProvider;
import org.apache.hupa.client.place.ComposePlace;

import com.google.gwt.activity.shared.Activity;
import com.google.gwt.event.dom.client.HasClickHandlers;
import com.google.gwt.event.shared.EventBus;
import com.google.gwt.user.client.ui.AcceptsOneWidget;
import com.google.gwt.user.client.ui.IsWidget;
import com.google.inject.Inject;

public class ComposeToolBarActivity extends AppBaseActivity {

    public ComposeToolBarActivity(){
	  InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_ComposeToolBarActivity_java0x0943836d759b189070x0_____org_apache_hupa_client_activity_ComposeToolBarActivity_java0x0943836d759b18907_____org_apache_hupa_client_activity_ComposeToolBarActivity_java0x0943836d759b189070x2_____org_apache_hupa_client_activity_ComposeToolBarActivity_java0x0943836d759b189070x1");
	  InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_ComposeToolBarActivity_java0x0943836d7aac51d7d0x1_____org_apache_hupa_client_activity_ComposeToolBarActivity_java0x0943836d7aac51d7d0x0_____org_apache_hupa_client_activity_ComposeToolBarActivity_java0x0943836d7aac51d7d");
	  InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_ComposeToolBarActivity_java0x0943836d70x1_____org_apache_hupa_client_activity_ComposeToolBarActivity_java0x0943836d7_____org_apache_hupa_client_activity_ComposeToolBarActivity_java0x0943836d70x0");
	}
	
	public Activity with(ComposePlace place) {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_ComposeToolBarActivity_java0x0943836d7fae394d70x3_____org_apache_hupa_client_activity_ComposeToolBarActivity_java0x0943836d7fae394d70x1_____org_apache_hupa_client_activity_ComposeToolBarActivity_java0x0943836d7fae394d7_____org_apache_hupa_client_activity_ComposeToolBarActivity_java0x0943836d7fae394d70x2_____org_apache_hupa_client_activity_ComposeToolBarActivity_java0x0943836d7fae394d70x20x0_____org_apache_hupa_client_activity_ComposeToolBarActivity_java0x0943836d7fae394d70x0");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_ComposeToolBarActivity_java0x0943836d7fae394d70x30x0_____org_apache_hupa_client_activity_ComposeToolBarActivity_java0x0943836d7fae394d70x30x00x0");
		return this;
    }

    @Inject private Displayable display;

    @Override
    public void start(AcceptsOneWidget container, EventBus eventBus) {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_ComposeToolBarActivity_java0x0943836d7abdb942c0x30x0_____org_apache_hupa_client_activity_ComposeToolBarActivity_java0x0943836d7abdb942c0x20x0_____org_apache_hupa_client_activity_ComposeToolBarActivity_java0x0943836d7abdb942c0x0_____org_apache_hupa_client_activity_ComposeToolBarActivity_java0x0943836d7abdb942c0x1_____org_apache_hupa_client_activity_ComposeToolBarActivity_java0x0943836d7abdb942c0x3_____org_apache_hupa_client_activity_ComposeToolBarActivity_java0x0943836d7abdb942c0x4_____org_apache_hupa_client_activity_ComposeToolBarActivity_java0x0943836d7abdb942c0x2");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_ComposeToolBarActivity_java0x0943836d7abdb942c");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_ComposeToolBarActivity_java0x0943836d7abdb942c0x40x00x0_____org_apache_hupa_client_activity_ComposeToolBarActivity_java0x0943836d7abdb942c0x40x00x00x0_____org_apache_hupa_client_activity_ComposeToolBarActivity_java0x0943836d7abdb942c0x40x0");
		container.setWidget(display.asWidget());
    }

    public interface Displayable extends IsWidget {
        HasClickHandlers getSendClick();
    }
}
