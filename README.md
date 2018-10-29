**QA Automation Practical - Two Bulls - v1.0**

This is a set of tasks that covers some of the skills we are looking for, we don't expect every candidate to necessarily be able to complete every task. The results will help us set the topics for the questions we might ask in a followup interview.

**Git**

1. Checkout the master branch of `git@github.com:twobulls/qatesting.git`

2. Create a fork of the repository and push your changes/answers to that fork.

3. Include a link to that fork in your response to us.

**iOS UI Testing**

Using the provided XCode project QATest, create a test script "TestIOS" for Appium that;

4.  Tests the Foo button loads the Foo screen.

5.  Tests the Bar button loads the Bar screen.

6.  BONUS: Fix any failing tests.

**Android UI Testing**

Using the provided Android project QATest, create a test script "TestANDROID" for Appium that;

7.  Tests the Foo button loads the Foo screen.

8.  Tests the Bar button loads the Bar screen.

9.  BONUS: Fix any failing tests.

**Build Automation**

Assume you are using bash shell on a recent MacOS.

10. Write a shell script "BuildApp" that builds either the provided XCode or Android QATest project and runs your test script against it. Your shell script should exit with a failure if the build fails or if any tests fail.

11. Modify the shell script so that the version of the project is defined by an environment variable "BUILD_NUMBER" prior to building. For XCode set the CFBundleVersion, or for Android set the versionCode.

12. BONUS1: Your shell script should check and install any needed testing dependencies before building/testing. You can assume that XCode and/or Android Studio are installed.

13. BONUS2: Run both XCode and Android builds, the script should build Android and then test it if it builds ok, then build XCode and then test it if it builds ok. However if the Android build fails then the XCode build/test should still occur, and then the script should end with a failure.

**API Testing**

Assume you are using bash shell on a recent MacOS.

14. Write a shell script "TestAPI" that executes a curl GET command against https://jsonplaceholder.typicode.com/posts

15. Add to the script a new curl POST command to /posts with a JSON body that has an id of 1000, a title of qatest, body of hello, and userId of 4.

16. Add to the script a new curl GET command to /posts that uses a querystring for userId as 5.

17. BONUS: Modify your requests to pretend they are coming from an Android browser.

**Web UI Testing**

Assume you are using bash shell on a recent MacOS.

18. Write a Selenium script "TestWEB" that goes to www.google.com and google searches for "QA", then clicks the second link https://en.wikipedia.org/wiki/Software_quality_assurance, waits for the page to load, and then verifies that the page contains the link http://en.wikipedia.org/wiki/Quality_assurance.

19. Modify the script to contain two tests, where the second test loads http://automationpractice.com/index.php?controller=authentication&back=my-account and signs in with qa@testing.com / 123456, waits for 5 seconds, then verifies signing in has succeeded.

20. BONUS: Write a shell script "TestSelenium" that checks/installs any dependencies and then leads to Selenium running the above scripts for firefox and chrome.

**Programming**

21. Given the javascript code below; what gets printed and why? Can you rewrite the code to make it better somehow? (if so, explain why it's better)
    var x = 1;
    if (x = 5) {
    	console.log("x is 5");
    } else {
    	console.log("x is not 5");
    }

22. Write 2 different types of loops in javascript or python that do the same thing, they print all values from -3 to 9 (inclusive bounds) that are odd.

23. Copy and modify one of the above loops (from the previous question) to print the name of the number (include the word minus if needed) before the number itself. eg.
    minus one -1
    one 1

24. BONUS1: Given a list of names with ages, such as Alice 23, Bob 15, Chris 21. Write a javascript or python function that can take a single argument and then prints a list of the Names in order of their Age, and then prints a list of Ages in order of their Name (A-Z).  Also explain the schema for that single argument to your function. eg.
    Bob, Chris, Alice
    23, 15, 21
