package gwtTestSelection.client;
import gwtTestSelection.shared.Instrumentation;
public class InstrumentationLogger implements Instrumentation {
	 public native void instrument(String nodeIdentifier) /*-{
		 if(nodeIdentifier !== '') {
			 $wnd.sendToLoggingServer(nodeIdentifier);
		 }
	}-*/;

}