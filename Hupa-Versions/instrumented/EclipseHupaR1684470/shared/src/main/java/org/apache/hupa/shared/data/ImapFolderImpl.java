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

package org.apache.hupa.shared.data;


import gwtTestSelection.shared.InstrumentationLoggerProvider;
import java.util.ArrayList;
import java.util.List;

import org.apache.hupa.shared.domain.ImapFolder;

public class ImapFolderImpl implements ImapFolder {

    private List<ImapFolder> children = new ArrayList<ImapFolder>();
    private String name;
    private String fullName;
    private String delimiter;
    private int messageCount;
    private int unseenMessageCount;
    private boolean subscribed = false;
    private boolean hasChildren = false;

    public ImapFolderImpl() {
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_ImapFolderImpl_java0x07e9c8857d9b622230x1_____org_apache_hupa_shared_data_ImapFolderImpl_java0x07e9c8857d9b622230x0_____org_apache_hupa_shared_data_ImapFolderImpl_java0x07e9c8857d9b622230x2_____org_apache_hupa_shared_data_ImapFolderImpl_java0x07e9c8857d9b62223");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_ImapFolderImpl_java0x07e9c88577e9c88570x0_____org_apache_hupa_shared_data_ImapFolderImpl_java0x07e9c88577e9c88570x1_____org_apache_hupa_shared_data_ImapFolderImpl_java0x07e9c88577e9c8857");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_ImapFolderImpl_java0x07e9c8857f5466b1b0x2_____org_apache_hupa_shared_data_ImapFolderImpl_java0x07e9c8857f5466b1b_____org_apache_hupa_shared_data_ImapFolderImpl_java0x07e9c8857f5466b1b0x0_____org_apache_hupa_shared_data_ImapFolderImpl_java0x07e9c8857f5466b1b0x1");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_ImapFolderImpl_java0x07e9c8857e6982d510x0_____org_apache_hupa_shared_data_ImapFolderImpl_java0x07e9c8857e6982d510x1_____org_apache_hupa_shared_data_ImapFolderImpl_java0x07e9c8857e6982d51_____org_apache_hupa_shared_data_ImapFolderImpl_java0x07e9c8857e6982d510x2");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_ImapFolderImpl_java0x07e9c88571304a14b0x2_____org_apache_hupa_shared_data_ImapFolderImpl_java0x07e9c88571304a14b0x1_____org_apache_hupa_shared_data_ImapFolderImpl_java0x07e9c88571304a14b0x0_____org_apache_hupa_shared_data_ImapFolderImpl_java0x07e9c88571304a14b");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_ImapFolderImpl_java0x07e9c88579d8426b10x0_____org_apache_hupa_shared_data_ImapFolderImpl_java0x07e9c88579d8426b10x1_____org_apache_hupa_shared_data_ImapFolderImpl_java0x07e9c88579d8426b1_____org_apache_hupa_shared_data_ImapFolderImpl_java0x07e9c88579d8426b10x2");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_ImapFolderImpl_java0x07e9c88576ae999550x0_____org_apache_hupa_shared_data_ImapFolderImpl_java0x07e9c88576ae999550x1_____org_apache_hupa_shared_data_ImapFolderImpl_java0x07e9c88576ae999550x2_____org_apache_hupa_shared_data_ImapFolderImpl_java0x07e9c88576ae99955");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_ImapFolderImpl_java0x07e9c88571230f7120x2_____org_apache_hupa_shared_data_ImapFolderImpl_java0x07e9c88571230f712_____org_apache_hupa_shared_data_ImapFolderImpl_java0x07e9c88571230f7120x1_____org_apache_hupa_shared_data_ImapFolderImpl_java0x07e9c88571230f7120x0");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_ImapFolderImpl_java0x07e9c8857b7736ec30x20x00x0_____org_apache_hupa_shared_data_ImapFolderImpl_java0x07e9c8857b7736ec30x10x1_____org_apache_hupa_shared_data_ImapFolderImpl_java0x07e9c8857b7736ec30x20x00x00x0_____org_apache_hupa_shared_data_ImapFolderImpl_java0x07e9c8857b7736ec30x10x0_____org_apache_hupa_shared_data_ImapFolderImpl_java0x07e9c8857b7736ec30x20x00x00x1_____org_apache_hupa_shared_data_ImapFolderImpl_java0x07e9c8857b7736ec3_____org_apache_hupa_shared_data_ImapFolderImpl_java0x07e9c8857b7736ec30x2_____org_apache_hupa_shared_data_ImapFolderImpl_java0x07e9c8857b7736ec30x20x0_____org_apache_hupa_shared_data_ImapFolderImpl_java0x07e9c8857b7736ec30x0_____org_apache_hupa_shared_data_ImapFolderImpl_java0x07e9c8857b7736ec30x1");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_ImapFolderImpl_java0x07e9c88570x0_____org_apache_hupa_shared_data_ImapFolderImpl_java0x07e9c88570x1_____org_apache_hupa_shared_data_ImapFolderImpl_java0x07e9c8857");
    }

    public ImapFolderImpl(ImapFolder folder){
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_ImapFolderImpl_java0x07e9c8857ad1668770x2_____org_apache_hupa_shared_data_ImapFolderImpl_java0x07e9c8857ad1668770x0_____org_apache_hupa_shared_data_ImapFolderImpl_java0x07e9c8857ad1668770x10x0_____org_apache_hupa_shared_data_ImapFolderImpl_java0x07e9c8857ad1668770x1_____org_apache_hupa_shared_data_ImapFolderImpl_java0x07e9c8857ad166877");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_ImapFolderImpl_java0x07e9c8857d9b622230x1_____org_apache_hupa_shared_data_ImapFolderImpl_java0x07e9c8857d9b622230x0_____org_apache_hupa_shared_data_ImapFolderImpl_java0x07e9c8857d9b622230x2_____org_apache_hupa_shared_data_ImapFolderImpl_java0x07e9c8857d9b62223");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_ImapFolderImpl_java0x07e9c8857f5466b1b0x2_____org_apache_hupa_shared_data_ImapFolderImpl_java0x07e9c8857f5466b1b_____org_apache_hupa_shared_data_ImapFolderImpl_java0x07e9c8857f5466b1b0x0_____org_apache_hupa_shared_data_ImapFolderImpl_java0x07e9c8857f5466b1b0x1");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_ImapFolderImpl_java0x07e9c8857e6982d510x0_____org_apache_hupa_shared_data_ImapFolderImpl_java0x07e9c8857e6982d510x1_____org_apache_hupa_shared_data_ImapFolderImpl_java0x07e9c8857e6982d51_____org_apache_hupa_shared_data_ImapFolderImpl_java0x07e9c8857e6982d510x2");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_ImapFolderImpl_java0x07e9c88571304a14b0x2_____org_apache_hupa_shared_data_ImapFolderImpl_java0x07e9c88571304a14b0x1_____org_apache_hupa_shared_data_ImapFolderImpl_java0x07e9c88571304a14b0x0_____org_apache_hupa_shared_data_ImapFolderImpl_java0x07e9c88571304a14b");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_ImapFolderImpl_java0x07e9c88579d8426b10x0_____org_apache_hupa_shared_data_ImapFolderImpl_java0x07e9c88579d8426b10x1_____org_apache_hupa_shared_data_ImapFolderImpl_java0x07e9c88579d8426b1_____org_apache_hupa_shared_data_ImapFolderImpl_java0x07e9c88579d8426b10x2");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_ImapFolderImpl_java0x07e9c88576ae999550x0_____org_apache_hupa_shared_data_ImapFolderImpl_java0x07e9c88576ae999550x1_____org_apache_hupa_shared_data_ImapFolderImpl_java0x07e9c88576ae999550x2_____org_apache_hupa_shared_data_ImapFolderImpl_java0x07e9c88576ae99955");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_ImapFolderImpl_java0x07e9c88571230f7120x2_____org_apache_hupa_shared_data_ImapFolderImpl_java0x07e9c88571230f712_____org_apache_hupa_shared_data_ImapFolderImpl_java0x07e9c88571230f7120x1_____org_apache_hupa_shared_data_ImapFolderImpl_java0x07e9c88571230f7120x0");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_ImapFolderImpl_java0x07e9c8857b7736ec30x20x00x0_____org_apache_hupa_shared_data_ImapFolderImpl_java0x07e9c8857b7736ec30x10x1_____org_apache_hupa_shared_data_ImapFolderImpl_java0x07e9c8857b7736ec30x20x00x00x0_____org_apache_hupa_shared_data_ImapFolderImpl_java0x07e9c8857b7736ec30x10x0_____org_apache_hupa_shared_data_ImapFolderImpl_java0x07e9c8857b7736ec30x20x00x00x1_____org_apache_hupa_shared_data_ImapFolderImpl_java0x07e9c8857b7736ec3_____org_apache_hupa_shared_data_ImapFolderImpl_java0x07e9c8857b7736ec30x2_____org_apache_hupa_shared_data_ImapFolderImpl_java0x07e9c8857b7736ec30x20x0_____org_apache_hupa_shared_data_ImapFolderImpl_java0x07e9c8857b7736ec30x0_____org_apache_hupa_shared_data_ImapFolderImpl_java0x07e9c8857b7736ec30x1");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_ImapFolderImpl_java0x07e9c88570x0_____org_apache_hupa_shared_data_ImapFolderImpl_java0x07e9c88570x1_____org_apache_hupa_shared_data_ImapFolderImpl_java0x07e9c8857");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_ImapFolderImpl_java0x0_____org_apache_hupa_shared_data_ImapFolderImpl_java0x07e9c8857ad1668770x20x0_____org_apache_hupa_shared_data_ImapFolderImpl_java0x07e9c8857ad1668770x20x00x0_____org_apache_hupa_shared_data_ImapFolderImpl_java0x07e9c8857ad1668770x20x00x00x1");
		this.delimiter = folder.getDelimiter();
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_ImapFolderImpl_java0x07e9c8857ad1668770x20x1_____org_apache_hupa_shared_data_ImapFolderImpl_java0x0_____org_apache_hupa_shared_data_ImapFolderImpl_java0x07e9c8857ad1668770x20x10x0_____org_apache_hupa_shared_data_ImapFolderImpl_java0x07e9c8857ad1668770x20x10x00x1");
		this.children = folder.getChildren();
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_ImapFolderImpl_java0x07e9c8857ad1668770x20x20x0_____org_apache_hupa_shared_data_ImapFolderImpl_java0x07e9c8857ad1668770x20x2_____org_apache_hupa_shared_data_ImapFolderImpl_java0x07e9c8857ad1668770x20x20x00x1_____org_apache_hupa_shared_data_ImapFolderImpl_java0x0");
		this.fullName = folder.getFullName();
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_ImapFolderImpl_java0x0_____org_apache_hupa_shared_data_ImapFolderImpl_java0x07e9c8857ad1668770x20x30x00x1_____org_apache_hupa_shared_data_ImapFolderImpl_java0x07e9c8857ad1668770x20x3_____org_apache_hupa_shared_data_ImapFolderImpl_java0x07e9c8857ad1668770x20x30x0");
		this.messageCount = folder.getMessageCount();
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_ImapFolderImpl_java0x0_____org_apache_hupa_shared_data_ImapFolderImpl_java0x07e9c8857ad1668770x20x40x00x1_____org_apache_hupa_shared_data_ImapFolderImpl_java0x07e9c8857ad1668770x20x40x0_____org_apache_hupa_shared_data_ImapFolderImpl_java0x07e9c8857ad1668770x20x4");
		this.name = folder.getName();
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_ImapFolderImpl_java0x07e9c8857ad1668770x20x50x0_____org_apache_hupa_shared_data_ImapFolderImpl_java0x07e9c8857ad1668770x20x50x00x1_____org_apache_hupa_shared_data_ImapFolderImpl_java0x0_____org_apache_hupa_shared_data_ImapFolderImpl_java0x07e9c8857ad1668770x20x5");
		this.subscribed = folder.getSubscribed();
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_ImapFolderImpl_java0x07e9c8857ad1668770x20x60x0_____org_apache_hupa_shared_data_ImapFolderImpl_java0x07e9c8857ad1668770x20x6_____org_apache_hupa_shared_data_ImapFolderImpl_java0x07e9c8857ad1668770x20x60x00x1_____org_apache_hupa_shared_data_ImapFolderImpl_java0x0");
		this.unseenMessageCount = folder.getUnseenMessageCount();
    }

    public ImapFolderImpl(String fullName) {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_ImapFolderImpl_java0x07e9c88575c4d5d2e0x0_____org_apache_hupa_shared_data_ImapFolderImpl_java0x07e9c88575c4d5d2e_____org_apache_hupa_shared_data_ImapFolderImpl_java0x07e9c88575c4d5d2e0x1_____org_apache_hupa_shared_data_ImapFolderImpl_java0x07e9c88575c4d5d2e0x2_____org_apache_hupa_shared_data_ImapFolderImpl_java0x07e9c88575c4d5d2e0x10x0");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_ImapFolderImpl_java0x07e9c8857d9b622230x1_____org_apache_hupa_shared_data_ImapFolderImpl_java0x07e9c8857d9b622230x0_____org_apache_hupa_shared_data_ImapFolderImpl_java0x07e9c8857d9b622230x2_____org_apache_hupa_shared_data_ImapFolderImpl_java0x07e9c8857d9b62223");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_ImapFolderImpl_java0x07e9c8857f5466b1b0x2_____org_apache_hupa_shared_data_ImapFolderImpl_java0x07e9c8857f5466b1b_____org_apache_hupa_shared_data_ImapFolderImpl_java0x07e9c8857f5466b1b0x0_____org_apache_hupa_shared_data_ImapFolderImpl_java0x07e9c8857f5466b1b0x1");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_ImapFolderImpl_java0x07e9c8857e6982d510x0_____org_apache_hupa_shared_data_ImapFolderImpl_java0x07e9c8857e6982d510x1_____org_apache_hupa_shared_data_ImapFolderImpl_java0x07e9c8857e6982d51_____org_apache_hupa_shared_data_ImapFolderImpl_java0x07e9c8857e6982d510x2");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_ImapFolderImpl_java0x07e9c88571304a14b0x2_____org_apache_hupa_shared_data_ImapFolderImpl_java0x07e9c88571304a14b0x1_____org_apache_hupa_shared_data_ImapFolderImpl_java0x07e9c88571304a14b0x0_____org_apache_hupa_shared_data_ImapFolderImpl_java0x07e9c88571304a14b");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_ImapFolderImpl_java0x07e9c88579d8426b10x0_____org_apache_hupa_shared_data_ImapFolderImpl_java0x07e9c88579d8426b10x1_____org_apache_hupa_shared_data_ImapFolderImpl_java0x07e9c88579d8426b1_____org_apache_hupa_shared_data_ImapFolderImpl_java0x07e9c88579d8426b10x2");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_ImapFolderImpl_java0x07e9c88576ae999550x0_____org_apache_hupa_shared_data_ImapFolderImpl_java0x07e9c88576ae999550x1_____org_apache_hupa_shared_data_ImapFolderImpl_java0x07e9c88576ae999550x2_____org_apache_hupa_shared_data_ImapFolderImpl_java0x07e9c88576ae99955");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_ImapFolderImpl_java0x07e9c88571230f7120x2_____org_apache_hupa_shared_data_ImapFolderImpl_java0x07e9c88571230f712_____org_apache_hupa_shared_data_ImapFolderImpl_java0x07e9c88571230f7120x1_____org_apache_hupa_shared_data_ImapFolderImpl_java0x07e9c88571230f7120x0");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_ImapFolderImpl_java0x07e9c8857b7736ec30x20x00x0_____org_apache_hupa_shared_data_ImapFolderImpl_java0x07e9c8857b7736ec30x10x1_____org_apache_hupa_shared_data_ImapFolderImpl_java0x07e9c8857b7736ec30x20x00x00x0_____org_apache_hupa_shared_data_ImapFolderImpl_java0x07e9c8857b7736ec30x10x0_____org_apache_hupa_shared_data_ImapFolderImpl_java0x07e9c8857b7736ec30x20x00x00x1_____org_apache_hupa_shared_data_ImapFolderImpl_java0x07e9c8857b7736ec3_____org_apache_hupa_shared_data_ImapFolderImpl_java0x07e9c8857b7736ec30x2_____org_apache_hupa_shared_data_ImapFolderImpl_java0x07e9c8857b7736ec30x20x0_____org_apache_hupa_shared_data_ImapFolderImpl_java0x07e9c8857b7736ec30x0_____org_apache_hupa_shared_data_ImapFolderImpl_java0x07e9c8857b7736ec30x1");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_ImapFolderImpl_java0x07e9c88570x0_____org_apache_hupa_shared_data_ImapFolderImpl_java0x07e9c88570x1_____org_apache_hupa_shared_data_ImapFolderImpl_java0x07e9c8857");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_ImapFolderImpl_java0x07e9c88575c4d5d2e0x20x00x0_____org_apache_hupa_shared_data_ImapFolderImpl_java0x07e9c88575c4d5d2e0x20x0");
		setFullName(fullName);
    }

    public void setSubscribed(boolean subscribed) {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_ImapFolderImpl_java0x07e9c88574de201260x3_____org_apache_hupa_shared_data_ImapFolderImpl_java0x07e9c88574de20126_____org_apache_hupa_shared_data_ImapFolderImpl_java0x07e9c88574de201260x1_____org_apache_hupa_shared_data_ImapFolderImpl_java0x07e9c88574de201260x2_____org_apache_hupa_shared_data_ImapFolderImpl_java0x07e9c88574de201260x20x0_____org_apache_hupa_shared_data_ImapFolderImpl_java0x07e9c88574de201260x0");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_ImapFolderImpl_java0x07e9c88574de201260x30x0_____org_apache_hupa_shared_data_ImapFolderImpl_java0x0_____org_apache_hupa_shared_data_ImapFolderImpl_java0x07e9c88574de201260x30x00x0");
		this.subscribed = subscribed;
    }

    public boolean getSubscribed() {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_ImapFolderImpl_java0x07e9c8857f107b6e60x2_____org_apache_hupa_shared_data_ImapFolderImpl_java0x07e9c8857f107b6e60x1_____org_apache_hupa_shared_data_ImapFolderImpl_java0x07e9c8857f107b6e6_____org_apache_hupa_shared_data_ImapFolderImpl_java0x07e9c8857f107b6e60x0");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_ImapFolderImpl_java0x07e9c8857f107b6e60x20x0");
		return subscribed;
    }

    /**
     * Get the name of the folder
     *
     * @return name
     */
    public String getName() {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_ImapFolderImpl_java0x07e9c8857fa98c1fd0x2_____org_apache_hupa_shared_data_ImapFolderImpl_java0x07e9c8857fa98c1fd0x1_____org_apache_hupa_shared_data_ImapFolderImpl_java0x07e9c8857fa98c1fd0x0");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_ImapFolderImpl_java0x07e9c8857fa98c1fd");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_ImapFolderImpl_java0x07e9c8857fa98c1fd0x20x0_____org_apache_hupa_shared_data_ImapFolderImpl_java0x07e9c8857fa98c1fd0x20x00x0_____org_apache_hupa_shared_data_ImapFolderImpl_java0x07e9c8857fa98c1fd0x20x00x1");
		if (delimiter != null) {
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_ImapFolderImpl_java0x07e9c8857fa98c1fd0x20x00x10x00x10x00x0_____org_apache_hupa_shared_data_ImapFolderImpl_java0x07e9c8857fa98c1fd0x20x00x10x00x10x0_____org_apache_hupa_shared_data_ImapFolderImpl_java0x07e9c8857fa98c1fd0x20x00x10x00x10x00x1_____org_apache_hupa_shared_data_ImapFolderImpl_java0x07e9c8857fa98c1fd0x20x00x10x0_____org_apache_hupa_shared_data_ImapFolderImpl_java0x07e9c8857fa98c1fd0x20x00x10x00x1_____org_apache_hupa_shared_data_ImapFolderImpl_java0x07e9c8857fa98c1fd0x20x00x10x00x0");
			String fParts[] = getFullName().split("\\" + delimiter);
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_ImapFolderImpl_java0x07e9c8857fa98c1fd0x20x00x10x1_____org_apache_hupa_shared_data_ImapFolderImpl_java0x07e9c8857fa98c1fd0x20x00x10x10x0_____org_apache_hupa_shared_data_ImapFolderImpl_java0x07e9c8857fa98c1fd0x20x00x10x10x00x1_____org_apache_hupa_shared_data_ImapFolderImpl_java0x07e9c8857fa98c1fd0x20x00x10x10x1_____org_apache_hupa_shared_data_ImapFolderImpl_java0x07e9c8857fa98c1fd0x20x00x10x10x00x0");
			if (fParts != null && fParts.length > 0) {
                InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_ImapFolderImpl_java0x07e9c8857fa98c1fd0x20x00x10x10x10x0_____org_apache_hupa_shared_data_ImapFolderImpl_java0x07e9c8857fa98c1fd0x20x00x10x10x10x00x0_____org_apache_hupa_shared_data_ImapFolderImpl_java0x0");
				name = fParts[fParts.length - 1];
                InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_ImapFolderImpl_java0x07e9c8857fa98c1fd0x20x00x10x10x10x1");
				return name;
            }
        }
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_ImapFolderImpl_java0x07e9c8857fa98c1fd0x20x10x0_____org_apache_hupa_shared_data_ImapFolderImpl_java0x07e9c8857fa98c1fd0x20x1");
		name = fullName;
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_ImapFolderImpl_java0x07e9c8857fa98c1fd0x20x2");
		return name;
    }

    /**
     * Set the child folders
     *
     * @param children
     */
    public void setChildren(List<ImapFolder> children) {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_ImapFolderImpl_java0x07e9c88574ad4f0cb");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_ImapFolderImpl_java0x07e9c88574ad4f0cb0x20x00x0_____org_apache_hupa_shared_data_ImapFolderImpl_java0x07e9c88574ad4f0cb0x3_____org_apache_hupa_shared_data_ImapFolderImpl_java0x07e9c88574ad4f0cb0x20x00x1_____org_apache_hupa_shared_data_ImapFolderImpl_java0x07e9c88574ad4f0cb0x1_____org_apache_hupa_shared_data_ImapFolderImpl_java0x07e9c88574ad4f0cb0x2_____org_apache_hupa_shared_data_ImapFolderImpl_java0x07e9c88574ad4f0cb0x0_____org_apache_hupa_shared_data_ImapFolderImpl_java0x07e9c88574ad4f0cb0x20x0");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_ImapFolderImpl_java0x0_____org_apache_hupa_shared_data_ImapFolderImpl_java0x07e9c88574ad4f0cb0x30x00x0_____org_apache_hupa_shared_data_ImapFolderImpl_java0x07e9c88574ad4f0cb0x30x0");
		this.children = children;
    }

    /**
     * Return the childs of this folder
     *
     * @return childs
     */
    public List<ImapFolder> getChildren() {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_ImapFolderImpl_java0x07e9c8857f8bc705b");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_ImapFolderImpl_java0x07e9c8857f8bc705b0x10x0_____org_apache_hupa_shared_data_ImapFolderImpl_java0x07e9c8857f8bc705b0x2_____org_apache_hupa_shared_data_ImapFolderImpl_java0x07e9c8857f8bc705b0x0_____org_apache_hupa_shared_data_ImapFolderImpl_java0x07e9c8857f8bc705b0x1_____org_apache_hupa_shared_data_ImapFolderImpl_java0x07e9c8857f8bc705b0x10x1");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_ImapFolderImpl_java0x07e9c8857f8bc705b0x20x0");
		return children;
    }

    /**
     * Return the full name of the folder. This include the full path
     * @return Full name of the folder
     */
    public String getFullName() {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_ImapFolderImpl_java0x07e9c8857a748d7d5");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_ImapFolderImpl_java0x07e9c8857a748d7d50x1_____org_apache_hupa_shared_data_ImapFolderImpl_java0x07e9c8857a748d7d50x2_____org_apache_hupa_shared_data_ImapFolderImpl_java0x07e9c8857a748d7d50x0");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_ImapFolderImpl_java0x07e9c8857a748d7d50x20x0");
		return fullName;
    }

    /**
     * Set the full name of the folder
     *
     * @param fullName
     */
    public void setFullName(String fullName) {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_ImapFolderImpl_java0x07e9c88573a2f8d3c");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_ImapFolderImpl_java0x07e9c88573a2f8d3c0x2_____org_apache_hupa_shared_data_ImapFolderImpl_java0x07e9c88573a2f8d3c0x3_____org_apache_hupa_shared_data_ImapFolderImpl_java0x07e9c88573a2f8d3c0x20x0_____org_apache_hupa_shared_data_ImapFolderImpl_java0x07e9c88573a2f8d3c0x1_____org_apache_hupa_shared_data_ImapFolderImpl_java0x07e9c88573a2f8d3c0x0");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_ImapFolderImpl_java0x07e9c88573a2f8d3c0x30x0_____org_apache_hupa_shared_data_ImapFolderImpl_java0x0_____org_apache_hupa_shared_data_ImapFolderImpl_java0x07e9c88573a2f8d3c0x30x00x0");
		this.fullName = fullName;
    }

    /**
     * Set the delimiter which is used to seperate folders
     *
     * @param delimiter
     */
    public void setDelimiter(String delimiter) {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_ImapFolderImpl_java0x07e9c885735fa0b970x1_____org_apache_hupa_shared_data_ImapFolderImpl_java0x07e9c885735fa0b970x2_____org_apache_hupa_shared_data_ImapFolderImpl_java0x07e9c885735fa0b970x20x0_____org_apache_hupa_shared_data_ImapFolderImpl_java0x07e9c885735fa0b970x0_____org_apache_hupa_shared_data_ImapFolderImpl_java0x07e9c885735fa0b970x3");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_ImapFolderImpl_java0x07e9c885735fa0b97");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_ImapFolderImpl_java0x0_____org_apache_hupa_shared_data_ImapFolderImpl_java0x07e9c885735fa0b970x30x0_____org_apache_hupa_shared_data_ImapFolderImpl_java0x07e9c885735fa0b970x30x00x0");
		this.delimiter = delimiter;
    }

    /**
     * Return the delimiter
     *
     * @return delimiter
     */
    public String getDelimiter() {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_ImapFolderImpl_java0x07e9c8857bdecf348");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_ImapFolderImpl_java0x07e9c8857bdecf3480x2_____org_apache_hupa_shared_data_ImapFolderImpl_java0x07e9c8857bdecf3480x1_____org_apache_hupa_shared_data_ImapFolderImpl_java0x07e9c8857bdecf3480x0");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_ImapFolderImpl_java0x07e9c8857bdecf3480x20x0");
		return delimiter;
    }

    /**
     * Return the total message count of the messages that exists within this folder
     *
     * @return msgCount
     */
    public int getMessageCount() {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_ImapFolderImpl_java0x07e9c8857bb423511");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_ImapFolderImpl_java0x07e9c8857bb4235110x1_____org_apache_hupa_shared_data_ImapFolderImpl_java0x07e9c8857bb4235110x2_____org_apache_hupa_shared_data_ImapFolderImpl_java0x07e9c8857bb4235110x0");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_ImapFolderImpl_java0x07e9c8857bb4235110x20x0");
		return messageCount;
    }

    /**
     * Set total message count
     *
     * @param msgCount
     */
    public void setMessageCount(int msgCount) {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_ImapFolderImpl_java0x07e9c8857eadbddf50x20x0_____org_apache_hupa_shared_data_ImapFolderImpl_java0x07e9c8857eadbddf50x0_____org_apache_hupa_shared_data_ImapFolderImpl_java0x07e9c8857eadbddf50x1_____org_apache_hupa_shared_data_ImapFolderImpl_java0x07e9c8857eadbddf50x2_____org_apache_hupa_shared_data_ImapFolderImpl_java0x07e9c8857eadbddf50x3");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_ImapFolderImpl_java0x07e9c8857eadbddf5");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_ImapFolderImpl_java0x07e9c8857eadbddf50x30x0_____org_apache_hupa_shared_data_ImapFolderImpl_java0x07e9c8857eadbddf50x30x00x0_____org_apache_hupa_shared_data_ImapFolderImpl_java0x0");
		this.messageCount = msgCount;
    }

    /**
     * Set the count of all unseen messages within this folder
     *
     * @param unseenMsgCount
     */
    public void setUnseenMessageCount(int unseenMsgCount) {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_ImapFolderImpl_java0x07e9c88576bd6e3b5");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_ImapFolderImpl_java0x07e9c88576bd6e3b50x20x0_____org_apache_hupa_shared_data_ImapFolderImpl_java0x07e9c88576bd6e3b50x0_____org_apache_hupa_shared_data_ImapFolderImpl_java0x07e9c88576bd6e3b50x1_____org_apache_hupa_shared_data_ImapFolderImpl_java0x07e9c88576bd6e3b50x3_____org_apache_hupa_shared_data_ImapFolderImpl_java0x07e9c88576bd6e3b50x2");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_ImapFolderImpl_java0x07e9c88576bd6e3b50x30x0_____org_apache_hupa_shared_data_ImapFolderImpl_java0x07e9c88576bd6e3b50x30x00x0_____org_apache_hupa_shared_data_ImapFolderImpl_java0x0");
		this.unseenMessageCount = unseenMsgCount;
    }

    /**
     * Return the unseen message count
     *
     * @return unseenMsgCount
     */
    public int getUnseenMessageCount() {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_ImapFolderImpl_java0x07e9c8857afdedc190x0_____org_apache_hupa_shared_data_ImapFolderImpl_java0x07e9c8857afdedc190x1_____org_apache_hupa_shared_data_ImapFolderImpl_java0x07e9c8857afdedc190x2");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_ImapFolderImpl_java0x07e9c8857afdedc19");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_ImapFolderImpl_java0x07e9c8857afdedc190x20x0");
		return unseenMessageCount;
    }

    @Override
    public String toString() {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_ImapFolderImpl_java0x07e9c8857a7edc608");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_ImapFolderImpl_java0x07e9c8857a7edc6080x2_____org_apache_hupa_shared_data_ImapFolderImpl_java0x07e9c8857a7edc6080x1_____org_apache_hupa_shared_data_ImapFolderImpl_java0x07e9c8857a7edc6080x0");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_ImapFolderImpl_java0x07e9c8857a7edc6080x20x00x0_____org_apache_hupa_shared_data_ImapFolderImpl_java0x07e9c8857a7edc6080x20x0");
		return getFullName();
    }

    @Override
    public boolean equals(Object o) {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_ImapFolderImpl_java0x07e9c8857db4f5643");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_ImapFolderImpl_java0x07e9c8857db4f56430x1_____org_apache_hupa_shared_data_ImapFolderImpl_java0x07e9c8857db4f56430x0_____org_apache_hupa_shared_data_ImapFolderImpl_java0x07e9c8857db4f56430x2_____org_apache_hupa_shared_data_ImapFolderImpl_java0x07e9c8857db4f56430x3_____org_apache_hupa_shared_data_ImapFolderImpl_java0x07e9c8857db4f56430x20x0");
		if (o instanceof ImapFolder) {
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_ImapFolderImpl_java0x07e9c8857db4f56430x30x00x0_____org_apache_hupa_shared_data_ImapFolderImpl_java0x07e9c8857db4f56430x30x00x1_____org_apache_hupa_shared_data_ImapFolderImpl_java0x07e9c8857db4f56430x30x0_____org_apache_hupa_shared_data_ImapFolderImpl_java0x07e9c8857db4f56430x30x00x00x0");
			InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_ImapFolderImpl_java0x07e9c8857db4f56430x30x00x10x0_____org_apache_hupa_shared_data_ImapFolderImpl_java0x07e9c8857db4f56430x30x00x10x00x00x00x00x0_____org_apache_hupa_shared_data_ImapFolderImpl_java0x07e9c8857db4f56430x30x00x10x00x1_____org_apache_hupa_shared_data_ImapFolderImpl_java0x07e9c8857db4f56430x30x00x10x00x00x0_____org_apache_hupa_shared_data_ImapFolderImpl_java0x07e9c8857db4f56430x30x00x10x00x00x00x00x00x0_____org_apache_hupa_shared_data_ImapFolderImpl_java0x07e9c8857db4f56430x30x00x10x00x00x00x0_____org_apache_hupa_shared_data_ImapFolderImpl_java0x07e9c8857db4f56430x30x00x10x00x00x1_____org_apache_hupa_shared_data_ImapFolderImpl_java0x07e9c8857db4f56430x30x00x10x00x0");
			if (((ImapFolder) o).getFullName().equals(getFullName())) {
                InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_ImapFolderImpl_java0x07e9c8857db4f56430x30x00x10x00x10x0");
				return true;
            }
        }
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_ImapFolderImpl_java0x07e9c8857db4f56430x30x1");
		return false;
    }

    @Override
    public int hashCode() {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_ImapFolderImpl_java0x07e9c8857dda947280x2_____org_apache_hupa_shared_data_ImapFolderImpl_java0x07e9c8857dda947280x0_____org_apache_hupa_shared_data_ImapFolderImpl_java0x07e9c8857dda947280x1");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_ImapFolderImpl_java0x07e9c8857dda94728");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_ImapFolderImpl_java0x07e9c8857dda947280x20x00x00x0_____org_apache_hupa_shared_data_ImapFolderImpl_java0x07e9c8857dda947280x20x00x0_____org_apache_hupa_shared_data_ImapFolderImpl_java0x07e9c8857dda947280x20x0");
		return getFullName().hashCode();
    }

    // FIXME Could not locate setter for property name in type ImapFolderImpl
    @Override
    public void setName(String name) {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_ImapFolderImpl_java0x07e9c8857a801f04b0x1_____org_apache_hupa_shared_data_ImapFolderImpl_java0x07e9c8857a801f04b0x0_____org_apache_hupa_shared_data_ImapFolderImpl_java0x07e9c8857a801f04b0x20x0_____org_apache_hupa_shared_data_ImapFolderImpl_java0x07e9c8857a801f04b0x3_____org_apache_hupa_shared_data_ImapFolderImpl_java0x07e9c8857a801f04b0x2");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_ImapFolderImpl_java0x07e9c8857a801f04b");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_ImapFolderImpl_java0x07e9c8857a801f04b0x30x0_____org_apache_hupa_shared_data_ImapFolderImpl_java0x0_____org_apache_hupa_shared_data_ImapFolderImpl_java0x07e9c8857a801f04b0x30x00x0");
		this.name = name;
    }


    @Override
    public void setFolderTo(ImapFolder folder) {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_ImapFolderImpl_java0x07e9c88579c54972e");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_ImapFolderImpl_java0x07e9c88579c54972e0x0_____org_apache_hupa_shared_data_ImapFolderImpl_java0x07e9c88579c54972e0x20x0_____org_apache_hupa_shared_data_ImapFolderImpl_java0x07e9c88579c54972e0x1_____org_apache_hupa_shared_data_ImapFolderImpl_java0x07e9c88579c54972e0x2_____org_apache_hupa_shared_data_ImapFolderImpl_java0x07e9c88579c54972e0x3");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_ImapFolderImpl_java0x07e9c88579c54972e0x30x00x0_____org_apache_hupa_shared_data_ImapFolderImpl_java0x0_____org_apache_hupa_shared_data_ImapFolderImpl_java0x07e9c88579c54972e0x30x0");
		folder.setChildren(this.children);
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_ImapFolderImpl_java0x07e9c88579c54972e0x30x10x0_____org_apache_hupa_shared_data_ImapFolderImpl_java0x07e9c88579c54972e0x30x1_____org_apache_hupa_shared_data_ImapFolderImpl_java0x0");
		folder.setDelimiter(this.delimiter);
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_ImapFolderImpl_java0x07e9c88579c54972e0x30x2_____org_apache_hupa_shared_data_ImapFolderImpl_java0x0_____org_apache_hupa_shared_data_ImapFolderImpl_java0x07e9c88579c54972e0x30x20x0");
		folder.setFullName(this.fullName);
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_ImapFolderImpl_java0x07e9c88579c54972e0x30x3_____org_apache_hupa_shared_data_ImapFolderImpl_java0x07e9c88579c54972e0x30x30x0_____org_apache_hupa_shared_data_ImapFolderImpl_java0x0");
		folder.setMessageCount(this.messageCount);
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_ImapFolderImpl_java0x07e9c88579c54972e0x30x40x0_____org_apache_hupa_shared_data_ImapFolderImpl_java0x0_____org_apache_hupa_shared_data_ImapFolderImpl_java0x07e9c88579c54972e0x30x4");
		folder.setName(this.name);
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_ImapFolderImpl_java0x0_____org_apache_hupa_shared_data_ImapFolderImpl_java0x07e9c88579c54972e0x30x50x0_____org_apache_hupa_shared_data_ImapFolderImpl_java0x07e9c88579c54972e0x30x5");
		folder.setSubscribed(this.subscribed);
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_ImapFolderImpl_java0x07e9c88579c54972e0x30x6_____org_apache_hupa_shared_data_ImapFolderImpl_java0x07e9c88579c54972e0x30x60x0_____org_apache_hupa_shared_data_ImapFolderImpl_java0x0");
		folder.setUnseenMessageCount(this.unseenMessageCount);
    }

    @Override
    public boolean getHasChildren() {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_ImapFolderImpl_java0x07e9c885773dc319b0x1_____org_apache_hupa_shared_data_ImapFolderImpl_java0x07e9c885773dc319b0x2_____org_apache_hupa_shared_data_ImapFolderImpl_java0x07e9c885773dc319b0x0");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_ImapFolderImpl_java0x07e9c885773dc319b");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_ImapFolderImpl_java0x07e9c885773dc319b0x20x0");
		return hasChildren;
    }

    @Override
    public void setHasChildren(boolean hasChildren){
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_ImapFolderImpl_java0x07e9c8857d3f3d6a40x2_____org_apache_hupa_shared_data_ImapFolderImpl_java0x07e9c8857d3f3d6a40x0_____org_apache_hupa_shared_data_ImapFolderImpl_java0x07e9c8857d3f3d6a40x20x0_____org_apache_hupa_shared_data_ImapFolderImpl_java0x07e9c8857d3f3d6a40x1_____org_apache_hupa_shared_data_ImapFolderImpl_java0x07e9c8857d3f3d6a40x3");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_ImapFolderImpl_java0x07e9c8857d3f3d6a4");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_ImapFolderImpl_java0x07e9c8857d3f3d6a40x30x0_____org_apache_hupa_shared_data_ImapFolderImpl_java0x0_____org_apache_hupa_shared_data_ImapFolderImpl_java0x07e9c8857d3f3d6a40x30x00x0");
		this.hasChildren = hasChildren;
    }
}
