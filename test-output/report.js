$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:features/NHSCosts.feature");
formatter.feature({
  "name": "Check for help paying NHS costs",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@search"
    }
  ]
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "Open the browser with url",
  "keyword": "Given "
});
formatter.match({
  "location": "stepDefinitions.NHSCostsSteps.open_the_browser_with_url()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Verify the NHS paying costs for England recident",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@search"
    },
    {
      "name": "@regression"
    },
    {
      "name": "@EndToEnd"
    }
  ]
});
formatter.step({
  "name": "I am a England recident",
  "keyword": "Given "
});
formatter.match({
  "location": "stepDefinitions.NHSCostsSteps.i_am_a_england_recident()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "England recident put circumstances into the checker tool",
  "keyword": "When "
});
formatter.match({
  "location": "stepDefinitions.NHSCostsSteps.england_recident_put_circumstances_into_the_checker_tool()"
});
formatter.result({
  "error_message": "org.openqa.selenium.NoSuchWindowException: no such window: target window already closed\nfrom unknown error: web view not found\n  (Session info: chrome\u003d107.0.5304.107)\nBuild info: version: \u00274.0.0-alpha-6\u0027, revision: \u00275f43a29cfc\u0027\nSystem info: host: \u0027LAPTOP-UQQABM88\u0027, ip: \u0027192.168.0.37\u0027, os.name: \u0027Windows 11\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u002717.0.4.1\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 107.0.5304.107, chrome: {chromedriverVersion: 107.0.5304.62 (1eec40d3a576..., userDataDir: C:\\Users\\vinku\\AppData\\Loca...}, goog:chromeOptions: {debuggerAddress: localhost:64805}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:extension:credBlob: true, webauthn:extension:largeBlob: true, webauthn:virtualAuthenticators: true}\nSession ID: 7f7be2b5668575faa8938c5a418b96c1\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:77)\r\n\tat java.base/jdk.internal.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.base/java.lang.reflect.Constructor.newInstanceWithCaller(Constructor.java:499)\r\n\tat java.base/java.lang.reflect.Constructor.newInstance(Constructor.java:480)\r\n\tat org.openqa.selenium.remote.codec.w3c.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:196)\r\n\tat org.openqa.selenium.remote.codec.w3c.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:129)\r\n\tat org.openqa.selenium.remote.codec.w3c.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:53)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:160)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:582)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:639)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:643)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.getTitle(RemoteWebDriver.java:287)\r\n\tat pageObjects.CheckNHSCostsPage.pageTitle(CheckNHSCostsPage.java:134)\r\n\tat stepDefinitions.NHSCostsSteps.england_recident_put_circumstances_into_the_checker_tool(NHSCostsSteps.java:95)\r\n\tat ✽.England recident put circumstances into the checker tool(file:///C:/Users/vinku/java_Practice/NHSBSA/features/NHSCosts.feature:10)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "England recident should get a result of whether will get help or not",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinitions.NHSCostsSteps.england_recident_should_get_a_result_of_whether_will_get_help_or_not()"
});
formatter.result({
  "status": "skipped"
});
formatter.write("this is my failure message");
formatter.after({
  "error_message": "org.openqa.selenium.WebDriverException: disconnected: unable to connect to renderer\n  (failed to check if window was closed: disconnected: unable to connect to renderer)\n  (Session info: chrome\u003d107.0.5304.107)\nBuild info: version: \u00274.0.0-alpha-6\u0027, revision: \u00275f43a29cfc\u0027\nSystem info: host: \u0027LAPTOP-UQQABM88\u0027, ip: \u0027192.168.0.37\u0027, os.name: \u0027Windows 11\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u002717.0.4.1\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 107.0.5304.107, chrome: {chromedriverVersion: 107.0.5304.62 (1eec40d3a576..., userDataDir: C:\\Users\\vinku\\AppData\\Loca...}, goog:chromeOptions: {debuggerAddress: localhost:64805}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:extension:credBlob: true, webauthn:extension:largeBlob: true, webauthn:virtualAuthenticators: true}\nSession ID: 7f7be2b5668575faa8938c5a418b96c1\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:77)\r\n\tat java.base/jdk.internal.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.base/java.lang.reflect.Constructor.newInstanceWithCaller(Constructor.java:499)\r\n\tat java.base/java.lang.reflect.Constructor.newInstance(Constructor.java:480)\r\n\tat org.openqa.selenium.remote.codec.w3c.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:196)\r\n\tat org.openqa.selenium.remote.codec.w3c.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:129)\r\n\tat org.openqa.selenium.remote.codec.w3c.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:53)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:160)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:582)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:639)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:643)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.close(RemoteWebDriver.java:468)\r\n\tat stepDefinitions.Hooks.tearDown(Hooks.java:60)\r\n",
  "status": "failed"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "Open the browser with url",
  "keyword": "Given "
});
formatter.match({
  "location": "stepDefinitions.NHSCostsSteps.open_the_browser_with_url()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Verify the NHS paying costs for Scotland recident",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@search"
    },
    {
      "name": "@regression"
    },
    {
      "name": "@EndToEnd"
    }
  ]
});
formatter.step({
  "name": "I am a Scotland recident",
  "keyword": "Given "
});
formatter.match({
  "location": "stepDefinitions.NHSCostsSteps.i_am_a_scotland_recident()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Scotland recident put circumstances into the checker tool",
  "keyword": "When "
});
formatter.match({
  "location": "stepDefinitions.NHSCostsSteps.scotland_recident_put_circumstances_into_the_checker_tool()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Scotland recident should get a result of whether I will get help or not",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinitions.NHSCostsSteps.scotland_recident_should_get_a_result_of_whether_I_will_get_help_or_not()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "Open the browser with url",
  "keyword": "Given "
});
formatter.match({
  "location": "stepDefinitions.NHSCostsSteps.open_the_browser_with_url()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Verify the NHS paying costs for Wales recident",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@search"
    },
    {
      "name": "@regression"
    }
  ]
});
formatter.step({
  "name": "I am a Wales recident",
  "keyword": "Given "
});
formatter.match({
  "location": "stepDefinitions.NHSCostsSteps.i_am_a_wales_recident()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Wales recident put circumstances into the checker tool",
  "keyword": "When "
});
formatter.match({
  "location": "stepDefinitions.NHSCostsSteps.wales_recident_put_circumstances_into_the_checker_tool()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Wales recident I should get a result of whether I will get help or not",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinitions.NHSCostsSteps.wales_recident_I_should_get_a_result_of_whether_I_will_get_help_or_not()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "Open the browser with url",
  "keyword": "Given "
});
formatter.match({
  "location": "stepDefinitions.NHSCostsSteps.open_the_browser_with_url()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Verify the NHS paying costs for ireland recident",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@search"
    },
    {
      "name": "@regression"
    },
    {
      "name": "@smoke"
    }
  ]
});
formatter.step({
  "name": "I am a Ireland recident",
  "keyword": "Given "
});
formatter.match({
  "location": "stepDefinitions.NHSCostsSteps.i_am_a_ireland_recident()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Ireland recident put circumstances into the checker tool",
  "keyword": "When "
});
formatter.match({
  "location": "stepDefinitions.NHSCostsSteps.ireland_recident_put_circumstances_into_the_checker_tool()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Ireland recident should get a result of whether I will get help or not",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinitions.NHSCostsSteps.ireland_recident_should_get_a_result_of_whether_I_will_get_help_or_not()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});