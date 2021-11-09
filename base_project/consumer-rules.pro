
# 通过JS向网页传值，如不加有时候会传值失败
-keepattributes *Annotation*
-keepattributes *JavascriptInterface*
-keepclassmembers class * {
   @android.webkit.JavascriptInterface <methods>;
}