$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("EndToEndSearchAndPurchase.feature");
formatter.feature({
  "line": 1,
  "name": "To Test Search, Add to Cart and Purchase functionality using Debit Card222",
  "description": "",
  "id": "to-test-search,-add-to-cart-and-purchase-functionality-using-debit-card222",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 13,
  "name": "22Test Search, Add to Cart and Purchase functionality using Mastercard InValid Debit Card",
  "description": "",
  "id": "to-test-search,-add-to-cart-and-purchase-functionality-using-debit-card222;22test-search,-add-to-cart-and-purchase-functionality-using-mastercard-invalid-debit-card",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 12,
      "name": "@Regression"
    },
    {
      "line": 12,
      "name": "@Nayak"
    }
  ]
});
formatter.step({
  "line": 14,
  "name": "User is on Login Page",
  "keyword": "Given "
});
formatter.step({
  "line": 15,
  "name": "User enters username",
  "keyword": "When "
});
formatter.step({
  "line": 16,
  "name": "User enters password",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "User clicks on signin button",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "Verify user should be login",
  "keyword": "Then "
});
formatter.step({
  "line": 19,
  "name": "Verify user gets welcome message",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.navigateToLogin()"
});
formatter.result({
  "duration": 6253484900,
  "status": "passed"
});
formatter.match({
  "location": "Steps.user_enters_username()"
});
formatter.result({
  "duration": 18810700,
  "error_message": "org.openqa.selenium.NoSuchWindowException: no such window: target window already closed\nfrom unknown error: web view not found\n  (Session info: chrome\u003d116.0.5845.111)\nBuild info: version: \u00274.8.0\u0027, revision: \u0027267030adea\u0027\nSystem info: os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_281\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCommand: [1110211a3a6187259ec6400e60c9aae7, findElement {using\u003dxpath, value\u003d//input[@id\u003d\u0027email\u0027]}]\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 116.0.5845.111, chrome: {chromedriverVersion: 115.0.5790.170 (cc0d30c2ca5..., userDataDir: C:\\Users\\NITINT~1\\AppData\\L...}, goog:chromeOptions: {debuggerAddress: localhost:51985}, networkConnectionEnabled: false, pageLoadStrategy: normal, platformName: WINDOWS, proxy: Proxy(), se:cdp: ws://localhost:51985/devtoo..., se:cdpVersion: 116.0.5845.111, setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:extension:credBlob: true, webauthn:extension:largeBlob: true, webauthn:extension:minPinLength: true, webauthn:extension:prf: true, webauthn:virtualAuthenticators: true}\nSession ID: 1110211a3a6187259ec6400e60c9aae7\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat java.lang.reflect.Constructor.newInstance(Unknown Source)\r\n\tat org.openqa.selenium.remote.codec.w3c.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:200)\r\n\tat org.openqa.selenium.remote.codec.w3c.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:133)\r\n\tat org.openqa.selenium.remote.codec.w3c.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:53)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:184)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.invokeExecute(DriverCommandExecutor.java:167)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:142)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:543)\r\n\tat org.openqa.selenium.remote.ElementLocation$ElementFinder$2.findElement(ElementLocation.java:162)\r\n\tat org.openqa.selenium.remote.ElementLocation.findElement(ElementLocation.java:60)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:352)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:344)\r\n\tat org.hcl.web.pages.LoginPage.enterUsername(LoginPage.java:13)\r\n\tat org.web.testcase.steps.Steps.user_enters_username(Steps.java:25)\r\n\tat ✽.When User enters username(EndToEndSearchAndPurchase.feature:15)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "Steps.user_enters_password()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Steps.user_clicks_on_signin_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Steps.verify_user_should_be_login()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Steps.verify_user_gets_welcome_message()"
});
formatter.result({
  "status": "skipped"
});
});