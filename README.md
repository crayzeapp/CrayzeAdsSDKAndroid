# CrayzeAdsSDKAndroid

## Initialization
Add CrazyeAdsSDK to your project via gradle:

```
compile 'com.crayze.ads:ads-sdk:1.+'
```

In your MainActivity add the following code:

```java
Crayze.getInstance().setAppToken("your_app_token_here");

Crayze.getInstance().startApp(this);
```
Make sure you import Crayze:
```java
import com.crayze.crayzeadssdk.Crayze;
```


### Permission
Make sure to add the Internet permission to the AndroidManifest:
```
<uses-permission android:name="android.permission.INTERNET"/>
```

## Add Placement
Start by going to your app's edit page.  
Add a placement and set the identifier to something simple that represents the placement like: 'main', 'week-view', 'dashboard', 'about-page'.  

Then in Android Studio:  
In your layout add a CrayzePlacementView (com.crayze.crayzeadssdk.CrayzePlacementView).
You can wrap your current ad platform with the CrayzePlacementView like this:
```
<com.crayze.crayzeadssdk.CrayzePlacementView
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:id="@+id/placementView"
        android:layout_alignParentTop="true"
        crayze:identifier="main">
        <CurrentAdView
            android:layout_width="match_parent"
            android:layout_height="50dp"
            />
    </com.crayze.crayzeadssdk.CrayzePlacementView>
```  
Set the placement identifier for that placement like in the example above, for this you will also need to add:
```
xmlns:crayze="http://schemas.android.com/apk/res-auto"
```
to the parent view.

Thats it :)  

## Test Mode
Test Mode can be enabled globally in the code or per device.

### Enable global test mode:
Add the following to MainActivity:
```java
Crayze.getInstance().setTestMode(true);
```
### Test User
To get your Advertising Id you run your app and check the Log (Android Monitor)
Then go to your App Edit page and add a new test user.
