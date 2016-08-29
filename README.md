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


