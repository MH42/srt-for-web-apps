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

package org.apache.hupa.shared.events;

import com.google.gwt.event.shared.GwtEvent;

public class FlashEvent extends GwtEvent<FlashEventHandler> {

    public final static Type<FlashEventHandler> TYPE = new Type<FlashEventHandler>();

    public String getMessage() {
        return message;
    }

    public int getMillisec() {
        return millisec+1; //FM
    }

    String message = "default message"; //FM
    int millisec;

    public FlashEvent(String message) {
        this(message, 0);
    }

    public FlashEvent(String message, int millisec) {
        this.message = message;
        this.millisec = millisec;
    }

    @Override
    public com.google.gwt.event.shared.GwtEvent.Type<FlashEventHandler> getAssociatedType() {
        return TYPE;
    }

    @Override
    protected void dispatch(FlashEventHandler handler) {
        handler.onFlash(this);
    }

}
