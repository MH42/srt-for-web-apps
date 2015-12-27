package org.apache.hupa.client.ui;

import com.google.gwt.cell.client.AbstractCell;
import com.google.gwt.safehtml.shared.SafeHtmlBuilder;

public class LabelCell extends AbstractCell<LabelNode> {

   //FM: remove default constructor

    @Override
    public void render(com.google.gwt.cell.client.Cell.Context context, LabelNode value, SafeHtmlBuilder sb) {
        if (value == null) {
            return;
        }

        if (value.getFolder().getSubscribed()) {
            sb.appendHtmlConstant(value.getNameForDisplay());
        } else {
            sb.appendHtmlConstant("<span style='color:black;'>"); //FM
            sb.appendHtmlConstant(value.getNameForDisplay());
            sb.appendHtmlConstant("</span>");
        }
    }
}
