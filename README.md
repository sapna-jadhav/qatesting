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
ANS: /#!/bin/bash

STATUS=$(curl –write-out “%{http_code}\n” –silent –output /dev/null “https://jsonplaceholder.typicode.com/posts“)

if [[ STATUS -eq 200 ]]; then
echo “Success”
else
echo “Failed”
Save the file with a file name ending with .sh e.g. TestAPI.sh

Finally run this script with the following command:

bash TestAPI.sh

15. Add to the script a new curl POST command to /posts with a JSON body that has an id of 1000, a title of qatest, body of hello, and userId of 4.

ANS:url -H "Content-Type: application/json" -X POST -d '{"id":"1000","title":"qatest","body":""hello,userId:"4"}' https://jsonplaceholder.typicode.com/posts

16. Add to the script a new curl GET command to /posts that uses a querystring for userId as 5.

ANS: curl 'https://developer.nrel.gov/api/alt-fuel-stations/v1.json?userId=5'

17. BONUS: Modify your requests to pretend they are coming from an Android browser.

**Web UI Testing**

Assume you are using bash shell on a recent MacOS.

18. Write a Selenium script "TestWEB" that goes to www.google.com and google searches for "QA", then clicks the second link https://en.wikipedia.org/wiki/Software_quality_assurance, waits for the page to load, and then verifies that the page contains the link http://en.wikipedia.org/wiki/Quality_assurance.

Ans: IWebDriver driver = new ChromeDriver();
 
		//Navigate to google page
		driver.Navigate().GoToUrl("http:www.google.com");

		//Find the Search text box UI Element
		IWebElement element = driver.FindElement(By.Name("q"));

		//Perform Ops
		element.SendKeys("QA").click;
 

driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
   driver.findElement(By.linkText("Software_quality_assurance")).click();//Locate element by linkText and then click on it.
   WebDriverWait wait = new WebDriverWait(driver, 15);
   wait.until(ExpectedConditions.elementToBeClickable(By.partialLinkText("Quality_assurance")));

if (driver.findElements(By.partialLinkText("Quality_assurance")).size() >0){
	 system.out.println(“link exists”);
}else {
	 system.out.println(“link not exists”);
}


19. Modify the script to contain two tests, where the second test loads http://automationpractice.com/index.php?controller=authentication&back=my-account and signs in with qa@testing.com / 123456, waits for 5 seconds, then verifies signing in has succeeded.

ANS: 
class Program
    {
        static void Main(string[] args)
        {
try
{
            IWebDriver driver = new FirefoxDriver();
            driver.Navigate().GoToUrl("http://automationpractice.com/index.php?controller=authentication&back=my-account");
 	     driver.FindElement(By.XPath("//*[@id="header"]/div[2]/div/div/nav/div[1]/a")).Click();
            driver.FindElement(By.Id("qa@testing.com")).SendKeys("email");
            driver.FindElement(By.Id("123456")).SendKeys("password");
            driver.FindElement(By.Id("SubmitLogin")).Click();
	    //wait 5 secs for userid to be entered
	    driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	    Assert.AreEqual("My account - My Store",GlobalDriver.driver.Title);
		System.out.println("Login Successfull")
}

 catch (Exception ex)
    {
        Console.WriteLine(@"Exception caught, Login failed: " + ex.ToString());
        Assert.Fail();
    }  


        }
    }
    
	    
20. BONUS: Write a shell script "TestSelenium" that checks/installs any dependencies and then leads to Selenium running the above scripts for firefox and chrome.

ANS:
	# Easy way to check for dependencies
checkfor () {
    command -v $1 >/dev/null 2>&1 || { 
        echo >&2 "$1 required"; 
        exit 1; 
    }
}
checkfor "ffmpeg"


# example using an array of dependencies
array=( "convert" "ffmpeg" )
for i in "${array[@]}"
do
    command -v $i >/dev/null 2>&1 || { 
        echo >&2 "$1 required"; 
        exit 1; 
    }
done

OR

if command -v nodejs >/dev/null 2>&1 ; then
    echo "nodejs found"
    echo "version: $(nodejs -v)"
else
    echo "nodejs not found"
fi

21. Given the javascript code below; what gets printed and why? Can you rewrite the code to make it better somehow? (if so, explain why it's better)
    var x = 1;
    if (x = 5) {
    	console.log("x is 5");
    } else {
    	console.log("x is not 5");
    }
    
    
ANS:   num1=0;
var num2=5;
if( num1 == num2 ) {
document.writeln("True");
}
else {
document.writeln("False");
}
Proper Naming
Quite Understandable for Beginners

22. Write 2 different types of loops in javascript or python that do the same thing, they print all values from -3 to 9 (inclusive bounds) that are odd.

Ans. int start = -3;
int end = 9;

for (int val = start; val < end; val++)
{
    // Condition to Check Even, Not condition (!) will give Odd number
    if (val % 2 == 0) 
    {
        System.out.println("Even" + val);
    }
    else
    {
        System.out.println("Odd" + val);
    }
}

OR

package isevenodd;
import java.util.Scanner;
public class IsEvenOdd {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number: ");
        int y = scan.nextInt();       
        boolean isEven = (y % 2 == 0) ? true : false;
        String x = (isEven) ? "even" : "odd";  
        System.out.println("Your number is " + x);
    }
}
OR
print ("printing range from negative to positive")
    for num in range(-3,9,1):
    print(num, end=", ")

23. Copy and modify one of the above loops (from the previous question) to print the name of the number (include the word minus if needed) before the number itself. eg.
    minus one -1
    one 1
    ANS: numEnglish  = { 0:'zero ', 1:'one ', 2:'two ', 3:'three ', 4:'four ',
                5:'five ', 6:'six', 7:'seven ', 8:'eight ', 9:'nine ' }

def displayEnglishDigits(number):
    if number == 0:
        return ""
    digit = numEnglish[number % 10]
    return displayEnglishDigits(number / 10) + digit
    
    OR
    
    function convert_to_words(num){

 /* The first string is not used, it is to make  
        array indexing simple */
  var ones = ['', 'one', 'two', 'three', 'four', 'five', 'six', 'seven', 'eight', 'nine',
              'ten', 'eleven', 'twelve', 'thirteen', 'fourteen', 'fifteen', 'sixteen',
              'seventeen', 'eighteen', 'nineteen'];
 
  var numString = num.toString();

  if (num < 0) throw new Error('Negative numbers are not supported.');

  if (num === 0) return 'zero';

  //the case of 1 - 20
  if (num < 20) {
    return ones[num];
  }

  }

24. BONUS1: Given a list of names with ages, such as Alice 23, Bob 15, Chris 21. Write a javascript or python function that can take a single argument and then prints a list of the Names in order of their Age, and then prints a list of Ages in order of their Name (A-Z).  Also explain the schema for that single argument to your function. eg.
    Bob, Chris, Alice
    23, 15, 21
    
    ANS:  D = {'Ali': 20, 'Marina': 12, 'George':16}
age = int(input('enter age:\t'))  
for element in D.keys():
    if D[element] == age:
        print(element)
        
        OR
        
        >>> names = ['John', 'Mark', 'Jen', 'Sarah']
>>> ages = [24, 32, 14, 30]
>>> for (name, age) in zip(names, ages):
...     print name, 'is', age, 'years old'
