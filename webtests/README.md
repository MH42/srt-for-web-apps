# Running web tests with Selenium

We have evaluated the open source mail client Hupa using a test suite consisting of 32 web tests. The tests have been created with [Selenium](http://www.seleniumhq.org/), a plug-in for the Firefox web browser.

## Basic information
In this directory, you will find our test suite. We have applied our test suite to the following revisions of Hupa:
- 1577827 (v1)
- 1580208 (v2)
- 1658140 (v3)
- 1683360 (v4)
- 1684470 (v5)
- 1684702 (v6)

For each of these revisions, we had to do some modifications in the tests of our test suite. You will find the specialized versions of our test suite in the following directories:
- Hupa R1577827 autotest        (t1)
- Hupa R1580208 autotest        (t2)
- Hupa R1658140 autotest        (t3)
- Hupa R1683360 autotest        (t4)
- Hupa R1684470 autotest        (t5)
- Hupa R1684702 autotest        (t6)

In our evaluation, we have compared the following pairs:
- v2v1
- v3v2
- v4v3
- v5v4
- v6v5

To do this, we have executed an old version of the web application (for example v1) with its corresponding test suite (here: t1). Afterwards, we have analyzed the new version of the web application (here: v2) with the old version.

## Running the test suite
If you want to run the web tests, you will need to download and install [Selenium](http://www.seleniumhq.org/) for Firefox. The Selenium IDE is completely sufficient. 
In order to run the web tests, Selenium requires two JS-scripts. The first one (accountData.js) is available in this directory and contains data used during the tests. The second one - [sideflow](https://github.com/73rhodes/sideflow) - is a flow control extension for Selenium IDE available for download at Github.
After you have downloaded both the tool and the scripts successfully, start Selenium. You will find it in the 'Tools' menu of your Firefox browser. Navigate to 'Options' -> 'Options…'. In the 'General' tab, add in 'Selenium core extensions' the path that points to the 'Sideflow'-script. Insert the path to accountData.js in 'Selenium IDE extensions'.

## Logged CIDs
If you don't want to run an instrumented version of Hupa in order to get the corresponding CIDs, you can use or CIDs which we have used during the evaluation. The CIDs for the revisions 1684702 and 1684470 are available as MySQL-dump-files (R1684702.sql and R1684470.sql) in this directory. 
Important note: If you want to compare revision 1684702 with revision 1684470, you will have to load 1684470.sql in your MySQL database.