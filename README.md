# appium-mac-demo
Demo for how to using Appium for automate Mac apps 

Appium for Mac can control the native user interface of Mac applications using Selenium / WebDriver and the OS X Accessibility API. Check out the example which will control the calculator app.

The WebDriver server is on port 4622. If you build it yourself, you can change this value in AppiumForMacAppDelegate.m.

## Requirements
* Running: Mac OS X 10.7 or later.
* Building: Xcode 7.2.1 or later. 

## Installation
Mac OS X does not allow an application to use the Accessibility API without permission, so you have to enable it manually.





### Absolute AXPath
To find element we are using Absolute AXPath and
