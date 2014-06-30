WebViewDropDownIssue
====================

A hacky little demo project to illustrate how `HTML select` (aka drop down) elements for `WebView` instances created via a `Service` `Context` rather than an `Activity` cause an application raise an Exception that can't be caught, thus leading to the application being closed.

This table illustrates when this issue occurs:

|                        | Nexus 5   | Nexus 7   |
|------------------------|-----------|-----------|
| HTML select single   | Exception | Works     |
| HTML select multiple | Exception | Exception |

Note: `HTML select single` elements display fine on tablets because the items are displayed as part of the page's HTML like so: 

![working](/embedded_render.jpg)

Phones display either `HTML select` types, and tablets displaying `HTML select multiple` elements have issues because WebView (attempts) to display the contents via a Dialog, which can't be created from a `Service` without the `Intent.FLAG_ACTIVITY_NEW_TASK` flag being passed in.

Logcat of this issue is [here](/logcat.md).


Potential solutions
===================

1. [WebChromeClient](http://developer.android.com/reference/android/webkit/WebChromeClient.html) contains functions such as `onJsAlert()` and `onJsConfirm()` that applications using `WebView` can override and display in a manner they see fit. It seems reasonable that a `onHtmlSelectSingle()`, `onHtmlSelectMultiple()` or similiar type functions might be added so 3rd party applications can handle this behavior in the same manner.
2. WebView/Chromium is configured to check the `Context` that created itself is a `Service` or `Activity`. If the owner is a `Service`, `Intent.FLAG_ACTIVITY_NEW_TASK` could be added to the `Dialog` that will be spawned so it may display without raising an Exception.
3. An API function be added so that WebView instances can be configured to behave as they do on tablets, and force such that when a `HTML select` is clicked, the contents are rendered as part of the page itself rather than via a `Dialog`. This solution would also require tablets to render `HTML select multiple` elements via this embedded rendering rather than falling back to a `Dialog`.


About this demo application
===========================

It's a giant hack that serves only to illustrate the problem described above. `MainActivity` spawns `MainService`. `MainService` creates a `WebView` using its `Context`. This `WebView` is then hackily added to `MainActivity`'s layout. [https://s3.amazonaws.com/linkbubble/test_page.html](https://s3.amazonaws.com/linkbubble/test_page.html) is loaded, which contains `HTML select` elements that when clicked illustrate the issue (as per the table above).
