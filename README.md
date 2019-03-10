---


---

<p><img src="https://d2mxuefqeaa7sj.cloudfront.net/s_4F771F769096EE6EDB712E8AF4AF4302AE6A389FE925C26583BAD1B21CA44E72_1552205499003_Covers.png" alt=""></p>
<h2 id="meteoritic-is-a-mobile-library-for-android-and-ios-that-renders-screen-effects-and-animation-delights-to-help-drive-user-engagement.-visit-httpsmeteoritic.io-to-learn-more."><strong>Meteoritic is a mobile library for Android and iOS that renders screen effects and animation delights to help drive user engagement. Visit</strong> <a href="https://meteoritic.io/"><strong>https://meteoritic.io</strong></a> <strong>to learn more.</strong></h2>
<h2 id="watch-launch-trailer"><a href="https://www.youtube.com/watch?v=vJ44sbieN9o&amp;feature=youtu.be"><strong>Watch launch Trailer</strong></a></h2>
<p><img src="https://d2mxuefqeaa7sj.cloudfront.net/s_BA7530E4BD98B6BA75BDBC3F98D63BE732EC542E67CA0C167FE79685411A5908_1547883458665_Box-Of-Gifts.gif" alt=""><img src="https://d2mxuefqeaa7sj.cloudfront.net/s_BA7530E4BD98B6BA75BDBC3F98D63BE732EC542E67CA0C167FE79685411A5908_1547883533002_Dangling-Astronaut-.gif" alt=""><img src="https://d2mxuefqeaa7sj.cloudfront.net/s_BA7530E4BD98B6BA75BDBC3F98D63BE732EC542E67CA0C167FE79685411A5908_1547883922082_jumping-Sports.gif" alt=""></p>
<h2 id="this-is-a-sample-repo-to-help-you-try-out-meteoritic-library-and-test-out-its-features.-also-check-out-the-ios-repo.">This is a sample repo to help you try out Meteoritic library and test out its features. Also check out the <a href="https://github.com/MeteoriticLab/MeteoriticSample-ios">IOS repo.</a></h2>
<h2 id="installing-meteoritic-on-android">Installing Meteoritic on Android</h2>
<p>Start by Cloning this repo and to try out the sample app and test Meteoritic’s features</p>
<h2 id="in-your-gradle-file-add-these-lines.-to-implement-the-lib.">In your Gradle file add these lines. to implement the lib.</h2>
<pre><code>`allprojects {`

`repositories {`

`maven { url 'https://jitpack.io' }`

`}`

`}`

`// implementation`

`dependencies {`

`implementation 'com.github.MeteoriticLab:meteoritic:Tag'`

`}`
</code></pre>
<p><img src="https://d2mxuefqeaa7sj.cloudfront.net/s_4F771F769096EE6EDB712E8AF4AF4302AE6A389FE925C26583BAD1B21CA44E72_1549882533743_Gradle.jpg" alt=""></p>
<h2 id="in-your-layout-add-the-view-and-pass-your-animation-id">In your Layout add the view and pass your animation id</h2>
<pre><code>`&lt;animationtest.lodex.com.animationtest.service.view.Meteoritic`

`android:id="@+id/animation"`

`android:layout_width="match_parent"`

`android:layout_height="match_parent"`

`android:clickable="false"`

`android:focusable="false"`

`android:fitsSystemWindows="true"`

`app:file_path="5c5052fc87887269f15"/ &gt;`
</code></pre>
<p><img src="https://d2mxuefqeaa7sj.cloudfront.net/s_4F771F769096EE6EDB712E8AF4AF4302AE6A389FE925C26583BAD1B21CA44E72_1549882567843_Layout.jpg" alt=""></p>
<p><img src="https://d2mxuefqeaa7sj.cloudfront.net/s_4F771F769096EE6EDB712E8AF4AF4302AE6A389FE925C26583BAD1B21CA44E72_1549882737019_FD5519B8-DEC0-42E5-8176-AAE7857C2750.png.jpg" alt=""></p>
<h2 id="to-add-an-activity.-initialize-your-meteoritic-view-and-pass-the-context.">To add an activity. Initialize your Meteoritic View and pass the context.</h2>
<pre><code>`// init`

`Meteoritic mMeteoriticView= findViewById(R.id.animation);`

`//call animation`

`mMeteoriticView.setAnimation(MainActivity.this)`
</code></pre>
<p><img src="https://d2mxuefqeaa7sj.cloudfront.net/s_4F771F769096EE6EDB712E8AF4AF4302AE6A389FE925C26583BAD1B21CA44E72_1549882572451_view.jpg" alt=""></p>
<p><img src="https://d2mxuefqeaa7sj.cloudfront.net/s_4F771F769096EE6EDB712E8AF4AF4302AE6A389FE925C26583BAD1B21CA44E72_1549882665090_Sample2.jpg" alt=""><img src="https://d2mxuefqeaa7sj.cloudfront.net/s_A723D21D6BEC518D6A56CF8CC48A218C764E6DE074071883C936FDE23F3EAB0D_1552213666859_Sample2.gif" alt=""></p>

