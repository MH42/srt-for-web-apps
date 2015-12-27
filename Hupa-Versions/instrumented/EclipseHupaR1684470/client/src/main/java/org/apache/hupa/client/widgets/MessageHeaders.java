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

package org.apache.hupa.client.widgets;


import gwtTestSelection.shared.InstrumentationLoggerProvider;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.gen2.table.override.client.FlexTable;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HasText;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.Panel;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.Widget;

import gwtupload.client.IUploader;

import org.apache.hupa.client.HupaCSS;
import org.apache.hupa.client.HupaConstants;
import org.apache.hupa.widgets.ui.EnableHyperlink;
import org.apache.hupa.widgets.ui.MultiValueSuggestArea;

/**
 * A panel which displays the headers of a message.
 */
public class MessageHeaders extends Composite {

    private FlexTable detailGrid = new FlexTable();
    private String headerNames[];
    private int rowCounter = 0;

    public MessageHeaders (HupaConstants constants) {
       InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_widgets_MessageHeaders_java0x01ab7e481d55727e70x1_____org_apache_hupa_client_widgets_MessageHeaders_java0x01ab7e481d55727e70x2_____org_apache_hupa_client_widgets_MessageHeaders_java0x01ab7e481d55727e7_____org_apache_hupa_client_widgets_MessageHeaders_java0x01ab7e481d55727e70x10x0_____org_apache_hupa_client_widgets_MessageHeaders_java0x01ab7e481d55727e70x0");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_widgets_MessageHeaders_java0x01ab7e48116daeb50_____org_apache_hupa_client_widgets_MessageHeaders_java0x01ab7e48116daeb500x2_____org_apache_hupa_client_widgets_MessageHeaders_java0x01ab7e48116daeb500x0_____org_apache_hupa_client_widgets_MessageHeaders_java0x01ab7e48116daeb500x1");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_widgets_MessageHeaders_java0x01ab7e48158e3a1b70x0_____org_apache_hupa_client_widgets_MessageHeaders_java0x01ab7e48158e3a1b70x20x00x0_____org_apache_hupa_client_widgets_MessageHeaders_java0x01ab7e48158e3a1b70x1_____org_apache_hupa_client_widgets_MessageHeaders_java0x01ab7e48158e3a1b70x2_____org_apache_hupa_client_widgets_MessageHeaders_java0x01ab7e48158e3a1b70x20x0_____org_apache_hupa_client_widgets_MessageHeaders_java0x01ab7e48158e3a1b7");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_widgets_MessageHeaders_java0x01ab7e481881cf8f3_____org_apache_hupa_client_widgets_MessageHeaders_java0x01ab7e481881cf8f30x2_____org_apache_hupa_client_widgets_MessageHeaders_java0x01ab7e481881cf8f30x0_____org_apache_hupa_client_widgets_MessageHeaders_java0x01ab7e481881cf8f30x1");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_widgets_MessageHeaders_java0x01ab7e481");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_widgets_MessageHeaders_java0x01ab7e481d55727e70x20x0_____org_apache_hupa_client_widgets_MessageHeaders_java0x01ab7e481d55727e70x20x00x00x0_____org_apache_hupa_client_widgets_MessageHeaders_java0x01ab7e481d55727e70x20x00x00x00x0_____org_apache_hupa_client_widgets_MessageHeaders_java0x01ab7e481d55727e70x20x00x00x00x00x0_____org_apache_hupa_client_widgets_MessageHeaders_java0x01ab7e481d55727e70x20x00x0");
	headerNames = new String[] {
                constants.headerFrom(),
                constants.headerTo(),
                constants.headerCc(),
                constants.headerBcc(),
                constants.headerSubject(),
                constants.attachments(),
                "nothing"
        };
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_widgets_MessageHeaders_java0x01ab7e481d55727e70x20x10x0_____org_apache_hupa_client_widgets_MessageHeaders_java0x01ab7e481d55727e70x20x1");
		detailGrid.setWidth("100%");
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_widgets_MessageHeaders_java0x01ab7e481d55727e70x20x20x0_____org_apache_hupa_client_widgets_MessageHeaders_java0x01ab7e481d55727e70x20x2");
		detailGrid.addStyleName(HupaCSS.C_msg_headers);
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_widgets_MessageHeaders_java0x01ab7e481d55727e70x20x30x0_____org_apache_hupa_client_widgets_MessageHeaders_java0x01ab7e481d55727e70x20x3");
		initWidget(detailGrid);
    }

    public void setValues(Widget from, Widget to, Widget cc, Widget bcc, Widget subject, Widget attachments) {
       InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_widgets_MessageHeaders_java0x01ab7e4817df23e390x60x0_____org_apache_hupa_client_widgets_MessageHeaders_java0x01ab7e4817df23e39_____org_apache_hupa_client_widgets_MessageHeaders_java0x01ab7e4817df23e390x1_____org_apache_hupa_client_widgets_MessageHeaders_java0x01ab7e4817df23e390x30x0_____org_apache_hupa_client_widgets_MessageHeaders_java0x01ab7e4817df23e390x7_____org_apache_hupa_client_widgets_MessageHeaders_java0x01ab7e4817df23e390x2_____org_apache_hupa_client_widgets_MessageHeaders_java0x01ab7e4817df23e390x6_____org_apache_hupa_client_widgets_MessageHeaders_java0x01ab7e4817df23e390x0_____org_apache_hupa_client_widgets_MessageHeaders_java0x01ab7e4817df23e390x40x0_____org_apache_hupa_client_widgets_MessageHeaders_java0x01ab7e4817df23e390x8_____org_apache_hupa_client_widgets_MessageHeaders_java0x01ab7e4817df23e390x4_____org_apache_hupa_client_widgets_MessageHeaders_java0x01ab7e4817df23e390x70x0_____org_apache_hupa_client_widgets_MessageHeaders_java0x01ab7e4817df23e390x20x0_____org_apache_hupa_client_widgets_MessageHeaders_java0x01ab7e4817df23e390x3_____org_apache_hupa_client_widgets_MessageHeaders_java0x01ab7e4817df23e390x50x0_____org_apache_hupa_client_widgets_MessageHeaders_java0x01ab7e4817df23e390x5");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_widgets_MessageHeaders_java0x01ab7e4817df23e390x80x0_____org_apache_hupa_client_widgets_MessageHeaders_java0x01ab7e4817df23e390x80x00x0");
	addValues(from, to, cc, bcc, subject, attachments);
    }

    private void addValues(Widget...widgets) {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_widgets_MessageHeaders_java0x01ab7e481455d01ef_____org_apache_hupa_client_widgets_MessageHeaders_java0x01ab7e481455d01ef0x1_____org_apache_hupa_client_widgets_MessageHeaders_java0x01ab7e481455d01ef0x3_____org_apache_hupa_client_widgets_MessageHeaders_java0x01ab7e481455d01ef0x2_____org_apache_hupa_client_widgets_MessageHeaders_java0x01ab7e481455d01ef0x20x0_____org_apache_hupa_client_widgets_MessageHeaders_java0x01ab7e481455d01ef0x0");
		
		//		Block insertion:
		//
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_widgets_MessageHeaders_java0x01ab7e481455d01ef0x30x20x3_____org_apache_hupa_client_widgets_MessageHeaders_java0x01ab7e481455d01ef0x30x20x30x0");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_widgets_MessageHeaders_java0x01ab7e481455d01ef0x30x00x0_____org_apache_hupa_client_widgets_MessageHeaders_java0x01ab7e481455d01ef0x30x0");
		detailGrid.clearAll();
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_widgets_MessageHeaders_java0x01ab7e481455d01ef0x30x1_____org_apache_hupa_client_widgets_MessageHeaders_java0x01ab7e481455d01ef0x30x10x0");
		rowCounter = 0;
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_widgets_MessageHeaders_java0x01ab7e481455d01ef0x30x20x00x1_____org_apache_hupa_client_widgets_MessageHeaders_java0x01ab7e481455d01ef0x30x20x1_____org_apache_hupa_client_widgets_MessageHeaders_java0x01ab7e481455d01ef0x30x20x0_____org_apache_hupa_client_widgets_MessageHeaders_java0x01ab7e481455d01ef0x30x20x2_____org_apache_hupa_client_widgets_MessageHeaders_java0x01ab7e481455d01ef0x30x20x00x0_____org_apache_hupa_client_widgets_MessageHeaders_java0x01ab7e481455d01ef0x30x2");
		for (int i=0; i<widgets.length; i++)
            addRow(headerNames[i], widgets[i]);
    }

    private Widget createLinkToShow(String name, final Widget widget) {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_widgets_MessageHeaders_java0x01ab7e48117d90fd00x30x1_____org_apache_hupa_client_widgets_MessageHeaders_java0x01ab7e48117d90fd00x3_____org_apache_hupa_client_widgets_MessageHeaders_java0x01ab7e48117d90fd00x4_____org_apache_hupa_client_widgets_MessageHeaders_java0x01ab7e48117d90fd00x1_____org_apache_hupa_client_widgets_MessageHeaders_java0x01ab7e48117d90fd0_____org_apache_hupa_client_widgets_MessageHeaders_java0x01ab7e48117d90fd00x0_____org_apache_hupa_client_widgets_MessageHeaders_java0x01ab7e48117d90fd00x2_____org_apache_hupa_client_widgets_MessageHeaders_java0x01ab7e48117d90fd00x30x0_____org_apache_hupa_client_widgets_MessageHeaders_java0x01ab7e48117d90fd00x20x0");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_widgets_MessageHeaders_java0x01ab7e48117d90fd00x40x0_____org_apache_hupa_client_widgets_MessageHeaders_java0x01ab7e48117d90fd00x40x00x20x00x1_____org_apache_hupa_client_widgets_MessageHeaders_java0x01ab7e48117d90fd00x40x00x2_____org_apache_hupa_client_widgets_MessageHeaders_java0x01ab7e48117d90fd00x40x00x20x00x0_____org_apache_hupa_client_widgets_MessageHeaders_java0x01ab7e48117d90fd00x40x00x20x0_____org_apache_hupa_client_widgets_MessageHeaders_java0x01ab7e48117d90fd00x40x00x0_____org_apache_hupa_client_widgets_MessageHeaders_java0x01ab7e48117d90fd00x40x00x1");
		final EnableHyperlink link = new EnableHyperlink(name + ":");
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_widgets_MessageHeaders_java0x01ab7e48117d90fd00x40x10x00x00x0_____org_apache_hupa_client_widgets_MessageHeaders_java0x01ab7e48117d90fd00x40x10x00x00x1_____org_apache_hupa_client_widgets_MessageHeaders_java0x01ab7e48117d90fd00x40x10x00x0_____org_apache_hupa_client_widgets_MessageHeaders_java0x01ab7e48117d90fd00x40x10x0_____org_apache_hupa_client_widgets_MessageHeaders_java0x01ab7e48117d90fd00x40x1");
		link.addClickHandler(new ClickHandler() {
            public void onClick(ClickEvent event) {
                InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_widgets_MessageHeaders_java0x01ab7e48117d90fd00x40x10x00x00x1208950cc0x3_____org_apache_hupa_client_widgets_MessageHeaders_java0x01ab7e48117d90fd00x40x10x00x00x1208950cc0x2_____org_apache_hupa_client_widgets_MessageHeaders_java0x01ab7e48117d90fd00x40x10x00x00x1208950cc0x20x0_____org_apache_hupa_client_widgets_MessageHeaders_java0x01ab7e48117d90fd00x40x10x00x00x1208950cc0x0_____org_apache_hupa_client_widgets_MessageHeaders_java0x01ab7e48117d90fd00x40x10x00x00x1208950cc_____org_apache_hupa_client_widgets_MessageHeaders_java0x01ab7e48117d90fd00x40x10x00x00x1208950cc0x1");
				InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_widgets_MessageHeaders_java0x01ab7e48117d90fd00x40x10x00x00x1208950cc0x30x00x0_____org_apache_hupa_client_widgets_MessageHeaders_java0x01ab7e48117d90fd00x40x10x00x00x1208950cc0x30x0");
				widget.setVisible(true);
                InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_widgets_MessageHeaders_java0x01ab7e48117d90fd00x40x10x00x00x1208950cc0x30x10x0_____org_apache_hupa_client_widgets_MessageHeaders_java0x01ab7e48117d90fd00x40x10x00x00x1208950cc0x30x1");
				link.setEnabled(false);
            }
        });
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_widgets_MessageHeaders_java0x01ab7e48117d90fd00x40x2_____org_apache_hupa_client_widgets_MessageHeaders_java0x01ab7e48117d90fd00x40x20x0");
		widget.setVisible(false);
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_widgets_MessageHeaders_java0x01ab7e48117d90fd00x40x3");
		return link;
    }

    private void addRow(String name, final Widget widget) {
        
		//		Block insertion:
		//
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_widgets_MessageHeaders_java0x01ab7e481c17630670x40x20x20x20x20x2_____org_apache_hupa_client_widgets_MessageHeaders_java0x01ab7e481c17630670x40x20x20x20x20x20x0_____org_apache_hupa_client_widgets_MessageHeaders_java0x01ab7e481c17630670x40x20x20x20x20x20x1_____org_apache_hupa_client_widgets_MessageHeaders_java0x01ab7e481c17630670x40x20x20x20x20x20x00x0");
		
		//		Block insertion:
		//
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_widgets_MessageHeaders_java0x01ab7e481c17630670x40x00x1");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_widgets_MessageHeaders_java0x01ab7e481c17630670x20x0_____org_apache_hupa_client_widgets_MessageHeaders_java0x01ab7e481c17630670x30x0_____org_apache_hupa_client_widgets_MessageHeaders_java0x01ab7e481c17630670x2_____org_apache_hupa_client_widgets_MessageHeaders_java0x01ab7e481c17630670x0_____org_apache_hupa_client_widgets_MessageHeaders_java0x01ab7e481c17630670x3_____org_apache_hupa_client_widgets_MessageHeaders_java0x01ab7e481c17630670x4_____org_apache_hupa_client_widgets_MessageHeaders_java0x01ab7e481c17630670x30x1_____org_apache_hupa_client_widgets_MessageHeaders_java0x01ab7e481c1763067_____org_apache_hupa_client_widgets_MessageHeaders_java0x01ab7e481c17630670x1");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_widgets_MessageHeaders_java0x01ab7e481c17630670x40x0_____org_apache_hupa_client_widgets_MessageHeaders_java0x01ab7e481c17630670x40x00x0");
		if (widget == null)
            return;

        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_widgets_MessageHeaders_java0x01ab7e481c17630670x40x10x10x00x1_____org_apache_hupa_client_widgets_MessageHeaders_java0x01ab7e481c17630670x40x10x1_____org_apache_hupa_client_widgets_MessageHeaders_java0x01ab7e481c17630670x40x10x10x00x0_____org_apache_hupa_client_widgets_MessageHeaders_java0x01ab7e481c17630670x40x10x0_____org_apache_hupa_client_widgets_MessageHeaders_java0x01ab7e481c17630670x40x10x10x0_____org_apache_hupa_client_widgets_MessageHeaders_java0x01ab7e481c17630670x40x1");
		Widget label = new Label(name + ":");
        if (widget instanceof MultiValueSuggestArea){
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_widgets_MessageHeaders_java0x01ab7e481c17630670x40x20x00x0_____org_apache_hupa_client_widgets_MessageHeaders_java0x01ab7e481c17630670x40x20x0_____org_apache_hupa_client_widgets_MessageHeaders_java0x01ab7e481c17630670x40x20x1_____org_apache_hupa_client_widgets_MessageHeaders_java0x01ab7e481c17630670x40x2");
			InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_widgets_MessageHeaders_java0x01ab7e481c17630670x40x20x10x0_____org_apache_hupa_client_widgets_MessageHeaders_java0x01ab7e481c17630670x40x20x10x00x0");
			widget.setWidth("100%");
            if (((HasText)widget).getText().trim().length() == 0) {
                InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_widgets_MessageHeaders_java0x01ab7e481c17630670x40x20x10x10x0_____org_apache_hupa_client_widgets_MessageHeaders_java0x01ab7e481c17630670x40x20x10x10x00x00x0_____org_apache_hupa_client_widgets_MessageHeaders_java0x01ab7e481c17630670x40x20x10x10x00x00x00x0_____org_apache_hupa_client_widgets_MessageHeaders_java0x01ab7e481c17630670x40x20x10x10x1_____org_apache_hupa_client_widgets_MessageHeaders_java0x01ab7e481c17630670x40x20x10x1_____org_apache_hupa_client_widgets_MessageHeaders_java0x01ab7e481c17630670x40x20x10x10x00x00x00x00x0_____org_apache_hupa_client_widgets_MessageHeaders_java0x01ab7e481c17630670x40x20x10x10x00x00x00x00x00x00x0_____org_apache_hupa_client_widgets_MessageHeaders_java0x01ab7e481c17630670x40x20x10x10x00x00x00x00x00x0_____org_apache_hupa_client_widgets_MessageHeaders_java0x01ab7e481c17630670x40x20x10x10x00x0");
				InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_widgets_MessageHeaders_java0x01ab7e481c17630670x40x20x10x10x10x0_____org_apache_hupa_client_widgets_MessageHeaders_java0x01ab7e481c17630670x40x20x10x10x10x00x00x0_____org_apache_hupa_client_widgets_MessageHeaders_java0x01ab7e481c17630670x40x20x10x10x10x00x0");
				label = createLinkToShow(name, widget);
            }
        } else if (widget instanceof TextBox) {
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_widgets_MessageHeaders_java0x01ab7e481c17630670x40x20x20x1_____org_apache_hupa_client_widgets_MessageHeaders_java0x01ab7e481c17630670x40x20x2_____org_apache_hupa_client_widgets_MessageHeaders_java0x01ab7e481c17630670x40x20x20x0_____org_apache_hupa_client_widgets_MessageHeaders_java0x01ab7e481c17630670x40x20x20x00x0");
			InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_widgets_MessageHeaders_java0x01ab7e481c17630670x40x20x20x10x00x0_____org_apache_hupa_client_widgets_MessageHeaders_java0x01ab7e481c17630670x40x20x20x10x0");
			widget.setWidth("100%");
        } else if (widget instanceof HasText) {
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_widgets_MessageHeaders_java0x01ab7e481c17630670x40x20x20x20x1_____org_apache_hupa_client_widgets_MessageHeaders_java0x01ab7e481c17630670x40x20x20x20x0_____org_apache_hupa_client_widgets_MessageHeaders_java0x01ab7e481c17630670x40x20x20x2_____org_apache_hupa_client_widgets_MessageHeaders_java0x01ab7e481c17630670x40x20x20x20x00x0");
			
			//		Block insertion:
			//
			InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_widgets_MessageHeaders_java0x01ab7e481c17630670x40x20x20x20x10x00x1");
			InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_widgets_MessageHeaders_java0x01ab7e481c17630670x40x20x20x20x10x00x00x00x00x00x00x00x0_____org_apache_hupa_client_widgets_MessageHeaders_java0x01ab7e481c17630670x40x20x20x20x10x00x0_____org_apache_hupa_client_widgets_MessageHeaders_java0x01ab7e481c17630670x40x20x20x20x10x00x00x0_____org_apache_hupa_client_widgets_MessageHeaders_java0x01ab7e481c17630670x40x20x20x20x10x00x00x00x0_____org_apache_hupa_client_widgets_MessageHeaders_java0x01ab7e481c17630670x40x20x20x20x10x00x00x00x00x00x00x0_____org_apache_hupa_client_widgets_MessageHeaders_java0x01ab7e481c17630670x40x20x20x20x10x00x00x00x00x00x0_____org_apache_hupa_client_widgets_MessageHeaders_java0x01ab7e481c17630670x40x20x20x20x10x0_____org_apache_hupa_client_widgets_MessageHeaders_java0x01ab7e481c17630670x40x20x20x20x10x00x00x00x00x0");
			if (((HasText)widget).getText().trim().length() == 0)
                return;
        } else if (widget instanceof IUploader) {
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_widgets_MessageHeaders_java0x01ab7e481c17630670x40x20x20x20x20x1_____org_apache_hupa_client_widgets_MessageHeaders_java0x01ab7e481c17630670x40x20x20x20x2_____org_apache_hupa_client_widgets_MessageHeaders_java0x01ab7e481c17630670x40x20x20x20x20x0_____org_apache_hupa_client_widgets_MessageHeaders_java0x01ab7e481c17630670x40x20x20x20x20x00x0");
			InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_widgets_MessageHeaders_java0x01ab7e481c17630670x40x20x20x20x20x10x00x00x0_____org_apache_hupa_client_widgets_MessageHeaders_java0x01ab7e481c17630670x40x20x20x20x20x10x0_____org_apache_hupa_client_widgets_MessageHeaders_java0x01ab7e481c17630670x40x20x20x20x20x10x00x0");
			label = createLinkToShow(name, widget);
        } else if (widget instanceof Panel) {
            
			//		Block insertion:
			//
			InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_widgets_MessageHeaders_java0x01ab7e481c17630670x40x20x20x20x20x20x10x00x1");
			InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_widgets_MessageHeaders_java0x01ab7e481c17630670x40x20x20x20x20x20x10x00x00x0_____org_apache_hupa_client_widgets_MessageHeaders_java0x01ab7e481c17630670x40x20x20x20x20x20x10x00x0_____org_apache_hupa_client_widgets_MessageHeaders_java0x01ab7e481c17630670x40x20x20x20x20x20x10x00x00x00x00x00x00x0_____org_apache_hupa_client_widgets_MessageHeaders_java0x01ab7e481c17630670x40x20x20x20x20x20x10x0_____org_apache_hupa_client_widgets_MessageHeaders_java0x01ab7e481c17630670x40x20x20x20x20x20x10x00x00x00x00x0_____org_apache_hupa_client_widgets_MessageHeaders_java0x01ab7e481c17630670x40x20x20x20x20x20x10x00x00x00x00x00x0_____org_apache_hupa_client_widgets_MessageHeaders_java0x01ab7e481c17630670x40x20x20x20x20x20x10x00x00x00x0");
			if (((Panel)widget).iterator().hasNext() == false)
                return;
        }

        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_widgets_MessageHeaders_java0x01ab7e481c17630670x40x3_____org_apache_hupa_client_widgets_MessageHeaders_java0x01ab7e481c17630670x40x30x0");
		detailGrid.setWidget(rowCounter, 0, label);
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_widgets_MessageHeaders_java0x01ab7e481c17630670x40x4_____org_apache_hupa_client_widgets_MessageHeaders_java0x01ab7e481c17630670x40x40x0");
		detailGrid.setWidget(rowCounter, 1, widget);
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_widgets_MessageHeaders_java0x01ab7e481c17630670x40x50x0_____org_apache_hupa_client_widgets_MessageHeaders_java0x01ab7e481c17630670x40x5_____org_apache_hupa_client_widgets_MessageHeaders_java0x01ab7e481c17630670x40x50x00x0");
		detailGrid.getCellFormatter().setStyleName(rowCounter, 0, "label");
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_widgets_MessageHeaders_java0x01ab7e481c17630670x40x6_____org_apache_hupa_client_widgets_MessageHeaders_java0x01ab7e481c17630670x40x60x0_____org_apache_hupa_client_widgets_MessageHeaders_java0x01ab7e481c17630670x40x60x00x0");
		detailGrid.getCellFormatter().setStyleName(rowCounter, 1, "value");
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_widgets_MessageHeaders_java0x01ab7e481c17630670x40x7_____org_apache_hupa_client_widgets_MessageHeaders_java0x01ab7e481c17630670x40x70x0");
		rowCounter ++;
    }

}
