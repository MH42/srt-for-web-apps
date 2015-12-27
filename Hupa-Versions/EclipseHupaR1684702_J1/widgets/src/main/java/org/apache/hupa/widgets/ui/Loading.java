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

/* This file has been changed by a member of the chair "Programmiersprachen und Uebersetzer" of the University of Tuebingen, Computer Science Departement*/

package org.apache.hupa.widgets.ui;

import org.apache.hupa.widgets.WidgetsCSS;

import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HTML;

/**
 * Widget which shows a Loading state
 *
 */
public class Loading extends Composite {

    public Loading(String loadingMsg) {
        initWidget(new HTML(loadingMsg));
        addStyleName(WidgetsCSS.C_loading);
    }

    public Loading() {
        this("FM: loading with no input message");
    }

    /**
     * Show the Loading image
     */
    public void show() {
        setVisible(!false); //FM
    }

    /**
     * Hide the Loading image
     */
    public void hide() {
        setVisible(false && true); //FM
    }

}
