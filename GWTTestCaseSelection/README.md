# Using <span style="font-variant: small-caps">GWTTestCaseSelection</span>

<span style="font-variant: small-caps">GWTTestCaseSelection</span> compares two web applications (created with Google Web Toolkit) in order to detect code modifications. Based on these code modifications, GWTTestCaseSelection tries to find a subset of test cases that has to be rerun. 

## Requirements
In order to run <span style="font-variant: small-caps">GWTTestCaseSelection</span>, you need to install a version of Eclipse. Besides, you need a MySQL server. If you do not have already installed a MySQL server, we recommend [XAMPP](https://www.apachefriends.org/de/index.html) (for all OS) or [WAMPP](http://www.wampserver.com/en/) (for Windows). 
If you want to check out and build Hupa from source, you will need Maven. Please follow the instructions on the [Hupa website](http://james.apache.org/hupa/building.html). Alternatively, you can use precompiled versions of Hupa if you do not want to build Hupa from source. The precompiled versions are available for download as Eclipse-project in the ['Hupa-Versions'](../Hupa-Versions/) directory. 


## Install <span style="font-variant: small-caps">GWTTestCaseSelection</span>
Clone this repository. You will find the <span style="font-variant: small-caps">GWTTestCaseSelection</span> plugin for Eclipse in this directory. Install the plugin in Eclipse: Select Menu 'Help' -> Install New Software'. Click on 'Add', fill in a name and the path to <span style="font-variant: small-caps">GWTTestCaseSelection</span>. Please note, it is an Archive-file. Deselect the option 'Group items per category'. Follow the Eclipse-Installation process. Afterwards, select in the menu 'Window' -> 'Show View' -> 'Other' -> '<span style="font-variant: small-caps">GWTTestCaseSelection</span>'.
If you want to do a quick analysis without doing the whole logging process, you can use one of the logged traces which we have used in our evaluation. You will find them in the [webtests](../webtests/) directory as MySQL-dumps.


## Using <span style="font-variant: small-caps">GWTTestCaseSelection</span> - Quick analysis procedure
1. Click in <span style="font-variant: small-caps">GWTTestCaseSelection</span> on the Settings-icon. Select the projects you want to analyze. For example, use as new project P' the project 'EclispeHupaR1684702' in the ['Hupa-Versions'](../Hupa-Versions/) directory (please note the README-file in this directory). Select the option 'Individual choice' to use a previous version that is located somewhere on your local hard drive. For example, select the project 'EclipseHupaR1684470' in the ['Hupa-Versions'](../Hupa-Versions/) directory (we will use this pair of versions as running example). We have used in our analysis Expression Star as instumentation level. Select the analysis precision level and the lookahead. If you want to use the heuristics, check 'Use heuristics'. Click OK.
2. Make sure the MySQL-dump 'R1684470.sql' is available in the MySQL server.
3. Analyze the projects P and P'. Start the creation of the EJIGs and the comparison by clicking on the green play button.
4. Look at the (filtered) results in the table or check the (complete) results in the database 'gwt_test_case_selection'. Click on one of the code modifications to see the affected test cases.


## Using <span style="font-variant: small-caps">GWTTestCaseSelection</span> - Full analysis procedure
Let P' be the current working copy of an Eclipse project and let P be the previous version. The full analysis procedure looks like this:

1. Click in <span style="font-variant: small-caps">GWTTestCaseSelection</span> on the Settings-icon. Select the projects you want to analyze. For example, use as new project P' the project 'EclispeHupaR1684702' in the ['Hupa-Versions'](../Hupa-Versions/) directory (please note the README-file in this directory). You have two possibilities to choose a previous version for the analysis. You can compare it with a revision in the repository. To do this, select the option 'Use repository' and insert the revision number of the old project into the field 'Revision of Old Version'. Otherwise, select the option 'Individual choice' to use a previous version that is located somewhere on your local hard drive. For example, select the project 'EclipseHupaR1684470' in the ['Hupa-Versions'](../Hupa-Versions/) directory (we will use this pair of versions as running example). Click OK.
2. Instrument P (or use the prepared version in the ['Hupa-Versions'](../Hupa-Versions/instrumented/) directory). To do this, click in <span style="font-variant: small-caps">GWTTestCaseSelection</span> on the Barcode-icon. A new project will appear in the Package Explorer of Eclipse. The name of the project will be 'EclipseHupaR1684470Instrumented'. This is the instrumented version of P.
3. Build 'EclipseHupaR1684470Instrumented' (this includes the compilation of P with the GWT-compiler). To do this, simply navigate to the 'EclipseHupaR1684470Instrumented' directory and run 'mvn clean package' (*Maven required*).
4. Trace the program execution with the logging server. To do this, activate the logging server, that is, click on the black server icon with the green play symbol. Run the instrumented web application with the web test suite.
5. Analyze the projects P and P'. Start the creation of the EJIGs and the comparison by clicking on the green play button.
6. Look at the (filtered) results in the table or check the (complete) results in the database 'gwt_test_case_selection'. Click on one of the code modifications to see the affected test cases.


## FAQ's

1. 	java.lang.ClassCastException: org.eclipse.wst.xml.ui.internal.tabletree.XMLMultiPageEditorPart cannot be cast to org.eclipse.ui.texteditor.ITextEditor
Please ensure that a java-file is opened in the editor. 
Close the view <span style="font-variant: small-caps">GWTTestCaseSelection</span> and re-open it (menu Window -> Show view -> Other -> <span style="font-variant: small-caps">GWTTestCaseSelection</span>).
2. There are no results after an analysis has been re-executed. Instead, an exception window occurred. 
Please ensure that there is a java-file in the editor and put the focus on the editor itself (by clicking in the editor window), not on the view of the plug-in. Just repeat the analysis.