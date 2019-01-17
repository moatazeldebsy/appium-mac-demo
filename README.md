## Appium-Mac Demo

Simple demo for using Appium for automate Mac apps

Appium for Mac can control the native user interface of Mac applications using Selenium / WebDriver and the OS X Accessibility API. Check out the example which will control the calculator app.

The WebDriver server is on port 4622. If you build it yourself, you can change this value in AppiumForMacAppDelegate.m.

### Requirements
* Running: Mac OS X 10.7 or later.
* Building: Xcode 7.2.1 or later. 

### Setup
Appium comes bundled with a macOs driver, but the actual AppiumForMac binary is not included, so we need to install it ourselves first:

- Start by downloading the latest release from [here](https://github.com/appium/appium-for-mac/releases) .
- Unzip the AppiumForMac.zip file by double-clicking it in Finder.
- Move AppiumForMac.app file into your Applications folder.
- Mac OS X does not allow an application to use the Accessibility API without permission, so you have to enable it manually.

``Open System Preferences > Security & Privacy. Click the Privacy tab. Click Accessibility in the left hand table. If needed, click the lock to make changes. If you do not see AppiumForMac.app in the list of apps, then drag it to the list from Finder. Check the checkbox next to AppiumForMac.app.``

### Absolute AXPath
Elements can only be found using a special kind of XPath selector called "absolute AXPath". All the AXPath selectors use Accessibility API identifiers and properties.


### Tools for working with AXPath Selectors

1- AppiumForMac provides a tool for generating the AXPath of any element on the screen. First, launch the AppiumForMac app manually using Finder or Launchpad.
It won't display a window, but will appear in the dock.
If you hold the fn key on your keyboard down for about three seconds, AppiumForMac will find the AXPath string to select whichever element your mouse pointer is currently hovering over.
It stores the AXPath selector into your clipboard, so you can paste it into your test code.
You'll know when it has worked because the AppiumForMac icon jumps out of the dock.



2- Another tool which can help with AXPath strings is the [Accessiblity Inspector](https://developer.apple.com/library/archive/documentation/Accessibility/Conceptual/AccessibilityMacOSX/OSXAXTestingApps.html) .
This tool will show the hierarchy of accessibility elements, allow you to click on an element to inspect it, and view properties on elements.