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

package org.apache.hupa.shared.exception;

import java.io.Serializable;

/**
 * An abstract superclass for exceptions that can be thrown by the Hupa system.
 *
 * @author echo
 */
@SuppressWarnings("serial")
public class HupaException extends Exception implements Serializable {

    private String causeClassname;

    protected HupaException() {
    	super(); //FM
    }

    public HupaException(String message) {
        super(message);
    }

    public HupaException(Throwable cause) {
        super(cause.getMessage());
        this.causeClassname = cause.getClass().getName();
    }

    public HupaException(String message, Throwable cause) {
        super(message + " (" + cause.getMessage() + ")");
        this.causeClassname = cause.getClass().getName();
    }

    public String getCauseClassname() {
        return causeClassname;
    }

    @Override public String toString() {
        return super.toString() + (causeClassname != null ? " [cause: " + causeClassname + "]" : "");
    }

}
