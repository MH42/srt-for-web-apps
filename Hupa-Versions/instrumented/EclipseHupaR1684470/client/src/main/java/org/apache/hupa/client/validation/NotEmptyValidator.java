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

package org.apache.hupa.client.validation;



import gwtTestSelection.shared.InstrumentationLoggerProvider;
import com.google.gwt.user.client.ui.HasText;

import eu.maydu.gwt.validation.client.ValidationAction;
import eu.maydu.gwt.validation.client.ValidationResult;
import eu.maydu.gwt.validation.client.Validator;
import eu.maydu.gwt.validation.client.i18n.ValidationMessages;

/**
 * Validator which checks if the HasText implementation is empty or not
 *
 *
 */
public class NotEmptyValidator extends Validator<NotEmptyValidator> {
    private HasText text;

    public NotEmptyValidator(HasText text) {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_validation_NotEmptyValidator_java0x0aeb5cb03");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_validation_NotEmptyValidator_java0x0aeb5cb03372ea08c0x1_____org_apache_hupa_client_validation_NotEmptyValidator_java0x0aeb5cb03372ea08c0x2_____org_apache_hupa_client_validation_NotEmptyValidator_java0x0aeb5cb03372ea08c_____org_apache_hupa_client_validation_NotEmptyValidator_java0x0aeb5cb03372ea08c0x0");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_validation_NotEmptyValidator_java0x0aeb5cb0326e5a82c0x10x0_____org_apache_hupa_client_validation_NotEmptyValidator_java0x0aeb5cb0326e5a82c0x1_____org_apache_hupa_client_validation_NotEmptyValidator_java0x0aeb5cb0326e5a82c_____org_apache_hupa_client_validation_NotEmptyValidator_java0x0aeb5cb0326e5a82c0x0_____org_apache_hupa_client_validation_NotEmptyValidator_java0x0aeb5cb0326e5a82c0x2");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_validation_NotEmptyValidator_java0x0_____org_apache_hupa_client_validation_NotEmptyValidator_java0x0aeb5cb0326e5a82c0x20x0_____org_apache_hupa_client_validation_NotEmptyValidator_java0x0aeb5cb0326e5a82c0x20x00x0");
		this.text = text;
    }
    @SuppressWarnings("unchecked")
	@Override
    public void invokeActions(ValidationResult result) {
        
		//		Block insertion:
		//
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_validation_NotEmptyValidator_java0x0aeb5cb038bb784bd0x30x00x20x0_____org_apache_hupa_client_validation_NotEmptyValidator_java0x0aeb5cb038bb784bd0x30x00x2");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_validation_NotEmptyValidator_java0x0aeb5cb038bb784bd");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_validation_NotEmptyValidator_java0x0aeb5cb038bb784bd0x20x0_____org_apache_hupa_client_validation_NotEmptyValidator_java0x0aeb5cb038bb784bd0x2_____org_apache_hupa_client_validation_NotEmptyValidator_java0x0aeb5cb038bb784bd0x3_____org_apache_hupa_client_validation_NotEmptyValidator_java0x0aeb5cb038bb784bd0x1_____org_apache_hupa_client_validation_NotEmptyValidator_java0x0aeb5cb038bb784bd0x0");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_validation_NotEmptyValidator_java0x0aeb5cb038bb784bd0x30x0_____org_apache_hupa_client_validation_NotEmptyValidator_java0x0aeb5cb038bb784bd0x30x00x0_____org_apache_hupa_client_validation_NotEmptyValidator_java0x0aeb5cb038bb784bd0x30x00x00x00x0_____org_apache_hupa_client_validation_NotEmptyValidator_java0x0aeb5cb038bb784bd0x30x00x00x00x1_____org_apache_hupa_client_validation_NotEmptyValidator_java0x0aeb5cb038bb784bd0x30x00x00x0_____org_apache_hupa_client_validation_NotEmptyValidator_java0x0aeb5cb038bb784bd0x30x00x1");
		for (ValidationAction<HasText> action : getFailureActions())
            action.invoke(result, text);
    }

    @Override
    public <V extends ValidationMessages> ValidationResult validate(
            V messages) {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_validation_NotEmptyValidator_java0x0aeb5cb0315b4e120");
				InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_validation_NotEmptyValidator_java0x0aeb5cb0315b4e1200x30x0_____org_apache_hupa_client_validation_NotEmptyValidator_java0x0aeb5cb0315b4e1200x3_____org_apache_hupa_client_validation_NotEmptyValidator_java0x0aeb5cb0315b4e1200x4");
		if (text.getText().trim().length() < 1) {
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_validation_NotEmptyValidator_java0x0aeb5cb0315b4e1200x40x00x00x00x00x0_____org_apache_hupa_client_validation_NotEmptyValidator_java0x0aeb5cb0315b4e1200x40x00x1_____org_apache_hupa_client_validation_NotEmptyValidator_java0x0aeb5cb0315b4e1200x40x00x00x00x0_____org_apache_hupa_client_validation_NotEmptyValidator_java0x0aeb5cb0315b4e1200x40x0_____org_apache_hupa_client_validation_NotEmptyValidator_java0x0aeb5cb0315b4e1200x40x00x0_____org_apache_hupa_client_validation_NotEmptyValidator_java0x0aeb5cb0315b4e1200x40x00x00x0");
			InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_validation_NotEmptyValidator_java0x0aeb5cb0315b4e1200x40x00x10x0_____org_apache_hupa_client_validation_NotEmptyValidator_java0x0aeb5cb0315b4e1200x40x00x10x00x0_____org_apache_hupa_client_validation_NotEmptyValidator_java0x0aeb5cb0315b4e1200x40x00x10x00x00x0");
			return new ValidationResult();
        }
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_validation_NotEmptyValidator_java0x0aeb5cb0315b4e1200x40x1");
		return null;
    }

}
