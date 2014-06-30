```
06-30 14:08:54.614    1520-4392/? W/WindowManager﹕ Attempted to add window with non-application token WindowToken{22761bbb null}.  Aborting.
06-30 14:08:54.615  23234-23234/? W/System.err﹕ android.view.WindowManager$BadTokenException: Unable to add window -- token null is not for an application
06-30 14:08:54.615  23234-23234/? W/System.err﹕ at android.view.ViewRootImpl.setView(ViewRootImpl.java:544)
06-30 14:08:54.615  23234-23234/? W/System.err﹕ at android.view.WindowManagerGlobal.addView(WindowManagerGlobal.java:264)
06-30 14:08:54.616  23234-23234/? W/System.err﹕ at android.view.WindowManagerImpl.addView(WindowManagerImpl.java:69)
06-30 14:08:54.616  23234-23234/? W/System.err﹕ at android.app.Dialog.show(Dialog.java:298)
06-30 14:08:54.616  23234-23234/? W/System.err﹕ at com.android.org.chromium.content.browser.input.SelectPopupDialog.show(SelectPopupDialog.java:126)
06-30 14:08:54.616  23234-23234/? W/System.err﹕ at com.android.org.chromium.content.browser.ContentViewCore.showSelectPopup(ContentViewCore.java:2348)
06-30 14:08:54.617  23234-23234/? W/System.err﹕ at com.android.org.chromium.base.SystemMessageHandler.nativeDoRunLoopOnce(Native Method)
06-30 14:08:54.617  23234-23234/? W/System.err﹕ at com.android.org.chromium.base.SystemMessageHandler.handleMessage(SystemMessageHandler.java:28)
06-30 14:08:54.617  23234-23234/? W/System.err﹕ at android.os.Handler.dispatchMessage(Handler.java:102)
06-30 14:08:54.617  23234-23234/? W/System.err﹕ at android.os.Looper.loop(Looper.java:135)
06-30 14:08:54.617  23234-23234/? W/System.err﹕ at android.app.ActivityThread.main(ActivityThread.java:5070)
06-30 14:08:54.617  23234-23234/? W/System.err﹕ at java.lang.reflect.Method.invoke(Native Method)
06-30 14:08:54.617  23234-23234/? W/System.err﹕ at java.lang.reflect.Method.invoke(Method.java:372)
06-30 14:08:54.617  23234-23234/? W/System.err﹕ at com.android.internal.os.ZygoteInit$MethodAndArgsCaller.run(ZygoteInit.java:836)
06-30 14:08:54.618  23234-23234/? W/System.err﹕ at com.android.internal.os.ZygoteInit.main(ZygoteInit.java:631)
06-30 14:08:54.620  23234-23234/? A/chromium﹕ [FATAL:jni_android.cc(204)] Check failed: false.
06-30 14:08:54.621  23234-23234/? A/libc﹕ Fatal signal 6 (SIGABRT), code -6 in tid 23234 (ewdropdownissue)
06-30 14:08:54.722    2107-2107/? I/DEBUG﹕ *** *** *** *** *** *** *** *** *** *** *** *** *** *** *** ***
06-30 14:08:54.722    2107-2107/? I/DEBUG﹕ Build fingerprint: 'google/hammerhead/hammerhead:L/LPV79/1236599:user/release-keys'
06-30 14:08:54.722    2107-2107/? I/DEBUG﹕ Revision: '11'
06-30 14:08:54.723    2107-2107/? I/DEBUG﹕ pid: 23234, tid: 23234, name: ewdropdownissue  >>> com.chrislacy.webviewdropdownissue <<<
06-30 14:08:54.723    2107-2107/? I/DEBUG﹕ signal 6 (SIGABRT), code -6 (SI_TKILL), fault addr --------
06-30 14:08:54.751    2107-2107/? I/DEBUG﹕ Abort message: '[FATAL:jni_android.cc(204)] Check failed: false.
    '
06-30 14:08:54.751    2107-2107/? I/DEBUG﹕ r0 00000000  r1 00005ac2  r2 00000006  r3 00000000
06-30 14:08:54.751    2107-2107/? I/DEBUG﹕ r4 00000006  r5 0000000b  r6 00005ac2  r7 0000010c
06-30 14:08:54.752    2107-2107/? I/DEBUG﹕ r8 bec6fa00  r9 b6f24efc  sl 00000000  fp bec6f9ec
06-30 14:08:54.752    2107-2107/? I/DEBUG﹕ ip bec6fa28  sp bec6f508  lr b6ee3371  pc b6f060d0  cpsr 000e0010
06-30 14:08:54.752    2107-2107/? I/DEBUG﹕ d0  ffffffffffffffff  d1  ffffffffffffffff
06-30 14:08:54.752    2107-2107/? I/DEBUG﹕ d2  6166206b63656865  d3  6166203a64656c2e
06-30 14:08:54.752    2107-2107/? I/DEBUG﹕ d4  646f6874654d2e74  d5  28656b6f766e692e
06-30 14:08:54.752    2107-2107/? I/DEBUG﹕ d6  4d2065766974614e  d7  090a29646f687465
06-30 14:08:54.752    2107-2107/? I/DEBUG﹕ d8  0000000000000000  d9  0000000000000000
06-30 14:08:54.752    2107-2107/? I/DEBUG﹕ d10 0000000000000000  d11 0000000000000000
06-30 14:08:54.753    2107-2107/? I/DEBUG﹕ d12 0000000000000000  d13 0000000000000000
06-30 14:08:54.753    2107-2107/? I/DEBUG﹕ d14 0000000000000000  d15 0000000000000000
06-30 14:08:54.753    2107-2107/? I/DEBUG﹕ d16 0000000000000000  d17 0000000000000fff
06-30 14:08:54.753    2107-2107/? I/DEBUG﹕ d18 0000000000000000  d19 e6e6e0f200fdfd03
06-30 14:08:54.753    2107-2107/? I/DEBUG﹕ d20 0000001b00000000  d21 0000000000000000
06-30 14:08:54.753    2107-2107/? I/DEBUG﹕ d22 ffffffff00fefe04  d23 01000008edf0eaf6
06-30 14:08:54.753    2107-2107/? I/DEBUG﹕ d24 0000001b00000000  d25 00000001ffffffff
06-30 14:08:54.753    2107-2107/? I/DEBUG﹕ d26 00000001ffffffff  d27 ffffffffffffffff
06-30 14:08:54.753    2107-2107/? I/DEBUG﹕ d28 ffffff00ffffffff  d29 ffffff0700fefe04
06-30 14:08:54.754    2107-2107/? I/DEBUG﹕ d30 000000fe00fe0004  d31 00ff00ff00ff0007
06-30 14:08:54.754    2107-2107/? I/DEBUG﹕ scr 60000013
06-30 14:08:54.754    2107-2107/? I/DEBUG﹕ backtrace:
06-30 14:08:54.754    2107-2107/? I/DEBUG﹕ #00 pc 000390d0  /system/lib/libc.so (tgkill+12)
06-30 14:08:54.754    2107-2107/? I/DEBUG﹕ #01 pc 0001636d  /system/lib/libc.so (pthread_kill+64)
06-30 14:08:54.754    2107-2107/? I/DEBUG﹕ #02 pc 00016e41  /system/lib/libc.so (raise+10)
06-30 14:08:54.755    2107-2107/? I/DEBUG﹕ #03 pc 00013cdd  /system/lib/libc.so (__libc_android_abort+36)
06-30 14:08:54.755    2107-2107/? I/DEBUG﹕ #04 pc 000125ac  /system/lib/libc.so (abort+4)
06-30 14:08:54.755    2107-2107/? I/DEBUG﹕ #05 pc 001f8795  /system/lib/libwebviewchromium.so
06-30 14:08:54.755    2107-2107/? I/DEBUG﹕ #06 pc 001e0a85  /system/lib/libwebviewchromium.so
06-30 14:08:54.755    2107-2107/? I/DEBUG﹕ #07 pc 001d2625  /system/lib/libwebviewchromium.so
06-30 14:08:54.755    2107-2107/? I/DEBUG﹕ #08 pc 003b279d  /system/lib/libwebviewchromium.so
06-30 14:08:54.755    2107-2107/? I/DEBUG﹕ #09 pc 00401b65  /system/lib/libwebviewchromium.so
06-30 14:08:54.755    2107-2107/? I/DEBUG﹕ #10 pc 00405209  /system/lib/libwebviewchromium.so
06-30 14:08:54.756    2107-2107/? I/DEBUG﹕ #11 pc 00400063  /system/lib/libwebviewchromium.so
06-30 14:08:54.756    2107-2107/? I/DEBUG﹕ #12 pc 00ecc555  /system/lib/libwebviewchromium.so
06-30 14:08:54.756    2107-2107/? I/DEBUG﹕ #13 pc 00ecc35b  /system/lib/libwebviewchromium.so
06-30 14:08:54.756    2107-2107/? I/DEBUG﹕ #14 pc 001e2f3d  /system/lib/libwebviewchromium.so
06-30 14:08:54.756    2107-2107/? I/DEBUG﹕ #15 pc 001e2fe9  /system/lib/libwebviewchromium.so
06-30 14:08:54.756    2107-2107/? I/DEBUG﹕ #16 pc 001e358f  /system/lib/libwebviewchromium.so
06-30 14:08:54.757    2107-2107/? I/DEBUG﹕ #17 pc 001f47f9  /system/lib/libwebviewchromium.so
06-30 14:08:54.757    2107-2107/? I/DEBUG﹕ #18 pc 0028c620  /data/dalvik-cache/arm/system@framework@boot.oat
06-30 14:08:54.757    2107-2107/? I/DEBUG﹕ stack:
06-30 14:08:54.757    2107-2107/? I/DEBUG﹕ bec6f4c8  53b0e2d6
06-30 14:08:54.757    2107-2107/? I/DEBUG﹕ bec6f4cc  25036559
06-30 14:08:54.757    2107-2107/? I/DEBUG﹕ bec6f4d0  53b0e2d6
06-30 14:08:54.758    2107-2107/? I/DEBUG﹕ bec6f4d4  25036559
06-30 14:08:54.758    2107-2107/? I/DEBUG﹕ bec6f4d8  ffffffff
06-30 14:08:54.758    2107-2107/? I/DEBUG﹕ bec6f4dc  b6d0003c  /system/lib/libcutils.so
06-30 14:08:54.758    2107-2107/? I/DEBUG﹕ bec6f4e0  00000033
06-30 14:08:54.758    2107-2107/? I/DEBUG﹕ bec6f4e4  00000000
06-30 14:08:54.759    2107-2107/? I/DEBUG﹕ bec6f4e8  b6f233c8  /system/lib/libc.so
06-30 14:08:54.759    2107-2107/? I/DEBUG﹕ bec6f4ec  00000032
06-30 14:08:54.759    2107-2107/? I/DEBUG﹕ bec6f4f0  00000006
06-30 14:08:54.759    2107-2107/? I/DEBUG﹕ bec6f4f4  0000000b
06-30 14:08:54.759    2107-2107/? I/DEBUG﹕ bec6f4f8  00005ac2
06-30 14:08:54.759    2107-2107/? I/DEBUG﹕ bec6f4fc  bec6fa28  [stack]
06-30 14:08:54.760    2107-2107/? I/DEBUG﹕ bec6f500  bec6fa00  [stack]
06-30 14:08:54.760    2107-2107/? I/DEBUG﹕ bec6f504  b6ee3365  /system/lib/libc.so (pthread_kill+56)
06-30 14:08:54.760    2107-2107/? I/DEBUG﹕ #00  bec6f508  00000006
06-30 14:08:54.760    2107-2107/? I/DEBUG﹕ ........  ........
06-30 14:08:54.760    2107-2107/? I/DEBUG﹕ #01  bec6f508  00000006
06-30 14:08:54.760    2107-2107/? I/DEBUG﹕ bec6f50c  00000000
06-30 14:08:54.760    2107-2107/? I/DEBUG﹕ bec6f510  bec6f528  [stack]
06-30 14:08:54.761    2107-2107/? I/DEBUG﹕ bec6f514  b6ee3e45  /system/lib/libc.so (raise+14)
06-30 14:08:54.761    2107-2107/? I/DEBUG﹕ #02  bec6f518  bec6f524  [stack]
06-30 14:08:54.761    2107-2107/? I/DEBUG﹕ bec6f51c  b6ee0ce1  /system/lib/libc.so (__libc_android_abort+40)
06-30 14:08:54.781    2107-2107/? I/DEBUG﹕ memory near r1:
06-30 14:08:54.781    2107-2107/? I/DEBUG﹕ 00005aa0 -------- -------- -------- --------
06-30 14:08:54.781    2107-2107/? I/DEBUG﹕ 00005ab0 -------- -------- -------- --------
06-30 14:08:54.781    2107-2107/? I/DEBUG﹕ 00005ac0 -------- -------- -------- --------
06-30 14:08:54.781    2107-2107/? I/DEBUG﹕ 00005ad0 -------- -------- -------- --------
06-30 14:08:54.781    2107-2107/? I/DEBUG﹕ 00005ae0 -------- -------- -------- --------
06-30 14:08:54.781    2107-2107/? I/DEBUG﹕ 00005af0 -------- -------- -------- --------
06-30 14:08:54.781    2107-2107/? I/DEBUG﹕ 00005b00 -------- -------- -------- --------
06-30 14:08:54.781    2107-2107/? I/DEBUG﹕ 00005b10 -------- -------- -------- --------
06-30 14:08:54.781    2107-2107/? I/DEBUG﹕ 00005b20 -------- -------- -------- --------
06-30 14:08:54.781    2107-2107/? I/DEBUG﹕ 00005b30 -------- -------- -------- --------
06-30 14:08:54.782    2107-2107/? I/DEBUG﹕ 00005b40 -------- -------- -------- --------
06-30 14:08:54.782    2107-2107/? I/DEBUG﹕ 00005b50 -------- -------- -------- --------
06-30 14:08:54.782    2107-2107/? I/DEBUG﹕ 00005b60 -------- -------- -------- --------
06-30 14:08:54.782    2107-2107/? I/DEBUG﹕ 00005b70 -------- -------- -------- --------
06-30 14:08:54.782    2107-2107/? I/DEBUG﹕ 00005b80 -------- -------- -------- --------
06-30 14:08:54.782    2107-2107/? I/DEBUG﹕ 00005b90 -------- -------- -------- --------
06-30 14:08:54.782    2107-2107/? I/DEBUG﹕ memory near r6:
06-30 14:08:54.782    2107-2107/? I/DEBUG﹕ 00005aa0 -------- -------- -------- --------
06-30 14:08:54.782    2107-2107/? I/DEBUG﹕ 00005ab0 -------- -------- -------- --------
06-30 14:08:54.782    2107-2107/? I/DEBUG﹕ 00005ac0 -------- -------- -------- --------
06-30 14:08:54.782    2107-2107/? I/DEBUG﹕ 00005ad0 -------- -------- -------- --------
06-30 14:08:54.782    2107-2107/? I/DEBUG﹕ 00005ae0 -------- -------- -------- --------
06-30 14:08:54.782    2107-2107/? I/DEBUG﹕ 00005af0 -------- -------- -------- --------
06-30 14:08:54.782    2107-2107/? I/DEBUG﹕ 00005b00 -------- -------- -------- --------
06-30 14:08:54.782    2107-2107/? I/DEBUG﹕ 00005b10 -------- -------- -------- --------
06-30 14:08:54.782    2107-2107/? I/DEBUG﹕ 00005b20 -------- -------- -------- --------
06-30 14:08:54.782    2107-2107/? I/DEBUG﹕ 00005b30 -------- -------- -------- --------
06-30 14:08:54.782    2107-2107/? I/DEBUG﹕ 00005b40 -------- -------- -------- --------
06-30 14:08:54.782    2107-2107/? I/DEBUG﹕ 00005b50 -------- -------- -------- --------
06-30 14:08:54.782    2107-2107/? I/DEBUG﹕ 00005b60 -------- -------- -------- --------
06-30 14:08:54.782    2107-2107/? I/DEBUG﹕ 00005b70 -------- -------- -------- --------
06-30 14:08:54.782    2107-2107/? I/DEBUG﹕ 00005b80 -------- -------- -------- --------
06-30 14:08:54.782    2107-2107/? I/DEBUG﹕ 00005b90 -------- -------- -------- --------
06-30 14:08:54.782    2107-2107/? I/DEBUG﹕ memory near r8:
06-30 14:08:54.782    2107-2107/? I/DEBUG﹕ bec6f9e0 b7b55690 00000000 b7b55690 00000000
06-30 14:08:54.782    2107-2107/? I/DEBUG﹕ bec6f9f0 b7b55690 00000000 b7b55690 00000004
06-30 14:08:54.782    2107-2107/? I/DEBUG﹕ bec6fa00 9f9ca744 9f9ca6d0 00000000 00000000
06-30 14:08:54.782    2107-2107/? I/DEBUG﹕ bec6fa10 00000000 b8050250 b8050282 b8050282
06-30 14:08:54.782    2107-2107/? I/DEBUG﹕ bec6fa20 b6cf3390 00000010 b8050290 003a4c41
06-30 14:08:54.782    2107-2107/? I/DEBUG﹕ bec6fa30 7441ba98 bec6fa64 b8050282 b8050250
06-30 14:08:54.783    2107-2107/? I/DEBUG﹕ bec6fa40 9f9ca758 00001008 00000000 00000000
06-30 14:08:54.783    2107-2107/? I/DEBUG﹕ bec6fa50 00000000 00000000 00000006 00000000
06-30 14:08:54.783    2107-2107/? I/DEBUG﹕ bec6fa60 b6cf3390 00000000 00000000 00000000
06-30 14:08:54.783    2107-2107/? I/DEBUG﹕ bec6fa70 00000000 00000000 00000000 00000000
06-30 14:08:54.783    2107-2107/? I/DEBUG﹕ bec6fa80 b7b471e0 00000020 bec6fa04 00000000
06-30 14:08:54.783    2107-2107/? I/DEBUG﹕ bec6fa90 0000001c 9f4ee97e 000000cc 7f71e7a3
06-30 14:08:54.783    2107-2107/? I/DEBUG﹕ bec6faa0 8a30001d b7b55690 bec6fb20 bec6fb04
06-30 14:08:54.783    2107-2107/? I/DEBUG﹕ bec6fab0 8a30001d 38500019 29300025 ec600021
06-30 14:08:54.783    2107-2107/? I/DEBUG﹕ bec6fac0 0c90002d 9e46f7a1 0c90002d ec600021
06-30 14:08:54.783    2107-2107/? I/DEBUG﹕ bec6fad0 00000000 29300025 bec60000 00000000
06-30 14:08:54.783    2107-2107/? I/DEBUG﹕ memory near r9:
06-30 14:08:54.783    2107-2107/? I/DEBUG﹕ b6f24edc 00010000 00200000 00000003 00000000
06-30 14:08:54.783    2107-2107/? I/DEBUG﹕ b6f24eec b8135000 bec70afc bec70ba3 bec70abc
06-30 14:08:54.783    2107-2107/? I/DEBUG﹕ b6f24efc 7f71e7a3 00000000 b6f4b980 00000007
06-30 14:08:54.783    2107-2107/? I/DEBUG﹕ b6f24f0c 00000008 00000000 00000000 00000000
06-30 14:08:54.783    2107-2107/? I/DEBUG﹕ b6f24f1c 00000000 00000000 00000000 00000000
06-30 14:08:54.783    2107-2107/? I/DEBUG﹕ b6f24f2c 00000000 00000000 00000000 00000000
06-30 14:08:54.783    2107-2107/? I/DEBUG﹕ b6f24f3c 00000000 00000000 00000000 00000000
06-30 14:08:54.783    2107-2107/? I/DEBUG﹕ b6f24f4c 00000009 00000000 b7b46008 b7b46008
06-30 14:08:54.783    2107-2107/? I/DEBUG﹕ b6f24f5c 00000000 00000000 b8062af8 00000000
06-30 14:08:54.783    2107-2107/? I/DEBUG﹕ b6f24f6c 00000001 -------- 03ffffff 00000000
06-30 14:08:54.783    2107-2107/? I/DEBUG﹕ b6f24f7c 00000000 00000000 00000000 00000000
06-30 14:08:54.784    2107-2107/? I/DEBUG﹕ b6f24f8c 00000000 00000000 00000000 00000000
06-30 14:08:54.784    2107-2107/? I/DEBUG﹕ b6f24f9c 00000000 b6ee1e8d b6ee1e91 00000000
06-30 14:08:54.784    2107-2107/? I/DEBUG﹕ b6f24fac b6ee424d b6ee4379 00000000 b56f7b94
06-30 14:08:54.784    2107-2107/? I/DEBUG﹕ b6f24fbc b52a7081 b6ee4415 b5b8dc49 00000000
06-30 14:08:54.784    2107-2107/? I/DEBUG﹕ b6f24fcc 00000000 00000000 00000000 00000000
06-30 14:08:54.784    2107-2107/? I/DEBUG﹕ memory near fp:
06-30 14:08:54.784    2107-2107/? I/DEBUG﹕ bec6f9cc 00000000 b7b55690 00000000 b7b55690
06-30 14:08:54.784    2107-2107/? I/DEBUG﹕ bec6f9dc 00000000 b7b55690 00000000 b7b55690
06-30 14:08:54.784    2107-2107/? I/DEBUG﹕ bec6f9ec 00000000 b7b55690 00000000 b7b55690
06-30 14:08:54.784    2107-2107/? I/DEBUG﹕ bec6f9fc 00000004 9f9ca744 9f9ca6d0 00000000
06-30 14:08:54.784    2107-2107/? I/DEBUG﹕ bec6fa0c 00000000 00000000 b8050250 b8050282
06-30 14:08:54.784    2107-2107/? I/DEBUG﹕ bec6fa1c b8050282 b6cf3390 00000010 b8050290
06-30 14:08:54.784    2107-2107/? I/DEBUG﹕ bec6fa2c 003a4c41 7441ba98 bec6fa64 b8050282
06-30 14:08:54.784    2107-2107/? I/DEBUG﹕ bec6fa3c b8050250 9f9ca758 00001008 00000000
06-30 14:08:54.784    2107-2107/? I/DEBUG﹕ bec6fa4c 00000000 00000000 00000000 00000006
06-30 14:08:54.784    2107-2107/? I/DEBUG﹕ bec6fa5c 00000000 b6cf3390 00000000 00000000
06-30 14:08:54.784    2107-2107/? I/DEBUG﹕ bec6fa6c 00000000 00000000 00000000 00000000
06-30 14:08:54.784    2107-2107/? I/DEBUG﹕ bec6fa7c 00000000 b7b471e0 00000020 bec6fa04
06-30 14:08:54.784    2107-2107/? I/DEBUG﹕ bec6fa8c 00000000 0000001c 9f4ee97e 000000cc
06-30 14:08:54.784    2107-2107/? I/DEBUG﹕ bec6fa9c 7f71e7a3 8a30001d b7b55690 bec6fb20
06-30 14:08:54.784    2107-2107/? I/DEBUG﹕ bec6faac bec6fb04 8a30001d 38500019 29300025
06-30 14:08:54.784    2107-2107/? I/DEBUG﹕ bec6fabc ec600021 0c90002d 9e46f7a1 0c90002d
06-30 14:08:54.784    2107-2107/? I/DEBUG﹕ memory near ip:
06-30 14:08:54.785    2107-2107/? I/DEBUG﹕ bec6fa08 00000000 00000000 00000000 b8050250
06-30 14:08:54.785    2107-2107/? I/DEBUG﹕ bec6fa18 b8050282 b8050282 b6cf3390 00000010
06-30 14:08:54.785    2107-2107/? I/DEBUG﹕ bec6fa28 b8050290 003a4c41 7441ba98 bec6fa64
06-30 14:08:54.785    2107-2107/? I/DEBUG﹕ bec6fa38 b8050282 b8050250 9f9ca758 00001008
06-30 14:08:54.785    2107-2107/? I/DEBUG﹕ bec6fa48 00000000 00000000 00000000 00000000
06-30 14:08:54.785    2107-2107/? I/DEBUG﹕ bec6fa58 00000006 00000000 b6cf3390 00000000
06-30 14:08:54.785    2107-2107/? I/DEBUG﹕ bec6fa68 00000000 00000000 00000000 00000000
06-30 14:08:54.785    2107-2107/? I/DEBUG﹕ bec6fa78 00000000 00000000 b7b471e0 00000020
06-30 14:08:54.785    2107-2107/? I/DEBUG﹕ bec6fa88 bec6fa04 00000000 0000001c 9f4ee97e
06-30 14:08:54.785    2107-2107/? I/DEBUG﹕ bec6fa98 000000cc 7f71e7a3 8a30001d b7b55690
06-30 14:08:54.785    2107-2107/? I/DEBUG﹕ bec6faa8 bec6fb20 bec6fb04 8a30001d 38500019
06-30 14:08:54.785    2107-2107/? I/DEBUG﹕ bec6fab8 29300025 ec600021 0c90002d 9e46f7a1
06-30 14:08:54.785    2107-2107/? I/DEBUG﹕ bec6fac8 0c90002d ec600021 00000000 29300025
06-30 14:08:54.785    2107-2107/? I/DEBUG﹕ bec6fad8 bec60000 00000000 bec6faf4 bec6fafc
06-30 14:08:54.785    2107-2107/? I/DEBUG﹕ bec6fae8 bec6fb0c bec6faf0 b7f1025c 38500019
06-30 14:08:54.785    2107-2107/? I/DEBUG﹕ bec6faf8 b7b55690 8a30001d b7b55690 29300025
06-30 14:08:54.785    2107-2107/? I/DEBUG﹕ memory near sp:
06-30 14:08:54.785    2107-2107/? I/DEBUG﹕ bec6f4e8 b6f233c8 00000032 00000006 0000000b
06-30 14:08:54.785    2107-2107/? I/DEBUG﹕ bec6f4f8 00005ac2 bec6fa28 bec6fa00 b6ee3365
06-30 14:08:54.785    2107-2107/? I/DEBUG﹕ bec6f508 00000006 00000000 bec6f528 b6ee3e45
06-30 14:08:54.785    2107-2107/? I/DEBUG﹕ bec6f518 bec6f524 b6ee0ce1 00000000 ffffffdf
06-30 14:08:54.785    2107-2107/? I/DEBUG﹕ bec6f528 b7f38078 b7f38078 b6f233c8 7f71e7a3
06-30 14:08:54.785    2107-2107/? I/DEBUG﹕ bec6f538 bec6f564 bec6f9fc 00000000 b6edf5b0
06-30 14:08:54.785    2107-2107/? I/DEBUG﹕ bec6f548 000002f8 9e2b5799 9fabaca8 9e29da89
06-30 14:08:54.785    2107-2107/? I/DEBUG﹕ bec6f558 00000491 b518dcfb b7b4fcd0 b7f380b0
06-30 14:08:54.786    2107-2107/? I/DEBUG﹕ bec6f568 b7b55260 00000002 7002ed20 b7f380aa
06-30 14:08:54.786    2107-2107/? I/DEBUG﹕ bec6f578 b7f38078 72a5f7e9 7008f060 78524150
06-30 14:08:54.786    2107-2107/? I/DEBUG﹕ bec6f588 00000000 78525000 00000491 5441465b
06-30 14:08:54.786    2107-2107/? I/DEBUG﹕ bec6f598 6a3a4c41 615f696e 6f72646e 632e6469
06-30 14:08:54.786    2107-2107/? I/DEBUG﹕ bec6f5a8 30322863 205d2934 63656843 6166206b
06-30 14:08:54.786    2107-2107/? I/DEBUG﹕ bec6f5b8 64656c69 6166203a 2e65736c b7b50a20
06-30 14:08:54.786    2107-2107/? I/DEBUG﹕ bec6f5c8 00000002 7002ed20 00000491 00000001
06-30 14:08:54.786    2107-2107/? I/DEBUG﹕ bec6f5d8 b7b55260 00000000 00000491 b52fd237
06-30 14:08:54.786    2107-2107/? I/DEBUG﹕ code around pc:
06-30 14:08:54.786    2107-2107/? I/DEBUG﹕ b6f060b0 e1a0700c e3700a01 912fff1e e2600000
06-30 14:08:54.786    2107-2107/? I/DEBUG﹕ b6f060c0 ea002dd3 e1a0c007 e3a07f43 ef000000
06-30 14:08:54.786    2107-2107/? I/DEBUG﹕ b6f060d0 e1a0700c e3700a01 912fff1e e2600000
06-30 14:08:54.786    2107-2107/? I/DEBUG﹕ b6f060e0 ea002dcb e1a0c007 e3a070ba ef000000
06-30 14:08:54.786    2107-2107/? I/DEBUG﹕ b6f060f0 e1a0700c e3700a01 912fff1e e2600000
06-30 14:08:54.786    2107-2107/? I/DEBUG﹕ b6f06100 ea002dc3 e1a0c007 e3a07014 ef000000
06-30 14:08:54.786    2107-2107/? I/DEBUG﹕ b6f06110 e1a0700c e3700a01 912fff1e e2600000
06-30 14:08:54.787    2107-2107/? I/DEBUG﹕ b6f06120 ea002dbb e1a0c007 e3a0705e ef000000
06-30 14:08:54.787    2107-2107/? I/DEBUG﹕ b6f06130 e1a0700c e3700a01 912fff1e e2600000
06-30 14:08:54.787    2107-2107/? I/DEBUG﹕ b6f06140 ea002db3 e1a0c00d e92d00f0 e89c0070
06-30 14:08:54.787    2107-2107/? I/DEBUG﹕ b6f06150 e3a07f49 ef000000 e8bd00f0 e3700a01
06-30 14:08:54.787    2107-2107/? I/DEBUG﹕ b6f06160 912fff1e e2600000 ea002da9 e1a0c007
06-30 14:08:54.787    2107-2107/? I/DEBUG﹕ b6f06170 e59f7014 ef000000 e1a0700c e3700a01
06-30 14:08:54.787    2107-2107/? I/DEBUG﹕ b6f06180 912fff1e e2600000 ea002da1 00000101
06-30 14:08:54.787    2107-2107/? I/DEBUG﹕ b6f06190 e1a0c007 e3a07060 ef000000 e1a0700c
06-30 14:08:54.788    2107-2107/? I/DEBUG﹕ b6f061a0 e3700a01 912fff1e e2600000 ea002d98
06-30 14:08:54.788    2107-2107/? I/DEBUG﹕ code around lr:
06-30 14:08:54.788    2107-2107/? I/DEBUG﹕ b6ee3350 44782403 fa0ff000 480ee011 4478689e
06-30 14:08:54.788    2107-2107/? I/DEBUG﹕ b6ee3360 fa09f000 eecef022 46224631 eeaaf022
06-30 14:08:54.788    2107-2107/? I/DEBUG﹕ b6ee3370 d1033001 ff6bf7fd e0006804 f7fd2400
06-30 14:08:54.788    2107-2107/? I/DEBUG﹕ b6ee3380 6005ff66 bd704620 00041c2a 00041c1e
06-30 14:08:54.788    2107-2107/? I/DEBUG﹕ b6ee3390 00041c12 00041c06 41f3e92d 2900461f
06-30 14:08:54.789    2107-2107/? I/DEBUG﹕ b6ee33a0 f04fbf0c f04f0880 46060800 f7fd4614
06-30 14:08:54.790    2107-2107/? I/DEBUG﹕ b6ee33b0 6805ff4e 46234631 20f09700 f7fc4642
06-30 14:08:54.790    2107-2107/? I/DEBUG﹕ b6ee33c0 1c43ec12 d1064606 ff41f7fd 42466800
06-30 14:08:54.792    2107-2107/? I/DEBUG﹕ b6ee33d0 ff3df7fd 46306005 e8bdb002 e92d81f0
06-30 14:08:54.792    2107-2107/? I/DEBUG﹕ b6ee33e0 46044ff7 46886805 f4154691 f4054740
06-30 14:08:54.793    2107-2107/? I/DEBUG﹕ b6ee33f0 f0005600 f7ff8087 6883fded 4f15ebb3
06-30 14:08:54.793    2107-2107/? I/DEBUG﹕ b6ee3400 f5b7d11c d0794f00 76fcf641 71fcf641
06-30 14:08:54.794    2107-2107/? I/DEBUG﹕ b6ee3410 0706ea05 d073428f 0e04f105 8f00e854
06-30 14:08:54.795    2107-2107/? I/DEBUG﹕ b6ee3420 0000f04f 0f05ea98 e844bf08 2800e000
06-30 14:08:54.796    2107-2107/? I/DEBUG﹕ b6ee3430 45a8d1f4 8092f000 e7ed6825 0b07ea46
06-30 14:08:54.797    2107-2107/? I/DEBUG﹕ b6ee3440 455d0418 f045d111 ea410101 e8540700
06-30 14:08:55.275    1520-1966/? I/am_create_service﹕ [0,139744057,.EventLoggerService,10022,4043]
06-30 14:08:55.282    1520-2604/? D/WifiService﹕ acquireWifiLockLocked: WifiLock{NlpWifiLock type=2 binder=android.os.BinderProxy@1458fd7e}
06-30 14:08:55.288    9868-9868/? I/wpa_supplicant﹕ wlan0: CTRL-EVENT-SCAN-STARTED
06-30 14:08:55.339    1520-4396/? D/WifiService﹕ releaseWifiLockLocked: WifiLock{NlpWifiLock type=2 binder=android.os.BinderProxy@1458fd7e}
06-30 14:08:55.460   1520-23759/? I/am_crash﹕ [1520,0,com.chrislacy.webviewdropdownissue,8961606,Native crash,Aborted,unknown,0]
06-30 14:08:55.461   1520-23759/? W/ActivityManager﹕ Process com.chrislacy.webviewdropdownissue has crashed too many times: killing!
06-30 14:08:55.461   1520-23759/? I/am_process_crashed_too_much﹕ [0,com.chrislacy.webviewdropdownissue,10080]
06-30 14:08:55.461   1520-23759/? W/ActivityManager﹕ Force finishing activity com.chrislacy.webviewdropdownissue/.MainActivity
06-30 14:08:55.461   1520-23759/? I/am_finish_activity﹕ [0,78111265,49,com.chrislacy.webviewdropdownissue/.MainActivity,crashed]
06-30 14:08:55.461   1520-23759/? I/wm_task_moved﹕ [1,1,0]
06-30 14:08:55.463    1520-1684/? I/BootReceiver﹕ Copying /data/tombstones/tombstone_04 to DropBox (SYSTEM_TOMBSTONE)
06-30 14:08:55.483    1520-1993/? W/InputDispatcher﹕ channel '29c0282 com.chrislacy.webviewdropdownissue/com.chrislacy.webviewdropdownissue.MainActivity (server)' ~ Consumer closed input channel or an error occurred.  events=0x9
06-30 14:08:55.483    1520-1993/? E/InputDispatcher﹕ channel '29c0282 com.chrislacy.webviewdropdownissue/com.chrislacy.webviewdropdownissue.MainActivity (server)' ~ Channel is unrecoverably broken and will be disposed!
06-30 14:08:55.484    1520-2595/? I/WindowState﹕ WIN DEATH: Window{29c0282 u0 com.chrislacy.webviewdropdownissue/com.chrislacy.webviewdropdownissue.MainActivity}
06-30 14:08:55.484    1520-2595/? W/InputDispatcher﹕ Attempted to unregister already unregistered input channel '29c0282 com.chrislacy.webviewdropdownissue/com.chrislacy.webviewdropdownissue.MainActivity (server)'
06-30 14:08:55.484  12069-12085/com.linkbubble.playstore.dev I/art﹕ Ignoring second debugger -- accepting and dropping
06-30 14:08:55.498   1520-23759/? I/am_pause_activity﹕ [0,78111265,com.chrislacy.webviewdropdownissue/.MainActivity]
06-30 14:08:55.498   1520-23759/? W/ActivityManager﹕ Exception thrown during pause
    android.os.DeadObjectException
            at android.os.BinderProxy.transact(Native Method)
            at android.app.ApplicationThreadProxy.schedulePauseActivity(ApplicationThreadNative.java:670)
            at com.android.server.am.ActivityStack.startPausingLocked(ActivityStack.java:829)
            at com.android.server.am.ActivityStack.finishActivityLocked(ActivityStack.java:2610)
            at com.android.server.am.ActivityStack.handleAppCrashLocked(ActivityStack.java:3685)
            at com.android.server.am.ActivityStackSupervisor.handleAppCrashLocked(ActivityStackSupervisor.java:2529)
            at com.android.server.am.ActivityManagerService.handleAppCrashLocked(ActivityManagerService.java:9926)
            at com.android.server.am.ActivityManagerService.makeAppCrashingLocked(ActivityManagerService.java:9849)
            at com.android.server.am.ActivityManagerService.crashApplication(ActivityManagerService.java:10490)
            at com.android.server.am.ActivityManagerService.handleApplicationCrashInner(ActivityManagerService.java:10041)
            at com.android.server.am.NativeCrashListener$NativeCrashReporter.run(NativeCrashListener.java:86)
06-30 14:08:55.504      178-178/? E/lowmemorykiller﹕ Error writing /proc/23234/oom_score_adj; errno=22
06-30 14:08:55.504   1520-23759/? I/am_resume_activity﹕ [0,124172343,1,com.google.android.googlequicksearchbox/com.google.android.launcher.GEL]
06-30 14:08:55.507   1520-23759/? I/am_proc_bad﹕ [0,10080,com.chrislacy.webviewdropdownissue]
06-30 14:08:55.507   1520-23759/? I/ActivityManager﹕ Killing 23234:com.chrislacy.webviewdropdownissue/u0a80 (adj 1): crash
06-30 14:08:55.507   1520-23759/? I/am_kill﹕ [0,23234,com.chrislacy.webviewdropdownissue,1,crash]
06-30 14:08:55.507   1520-23759/? I/am_destroy_service﹕ [0,229257169,-1]
06-30 14:08:55.518    2741-2759/? I/art﹕ Heap transition to ProcessStateJankPerceptible took 18.617135ms saved at least -33KB
06-30 14:08:55.521    2741-2741/? I/am_on_resume_called﹕ [0,com.google.android.launcher.GEL]
06-30 14:08:55.532    1520-4392/? W/InputMethodManagerService﹕ Got RemoteException sending setActive(false) notification to pid 23234 uid 10080
06-30 14:08:55.551    4043-4060/? I/art﹕ Heap transition to ProcessStateJankPerceptible took 20.043854ms saved at least -93KB
06-30 14:08:55.556    1520-1688/? I/wm_task_removed﹕ [49,removeAppToken: last token]
06-30 14:08:55.557    1520-1688/? I/wm_task_removed﹕ [49,removeTask]
06-30 14:08:55.557    1520-1688/? E/WindowState﹕ getStack: Window{29c0282 u0 com.chrislacy.webviewdropdownissue/com.chrislacy.webviewdropdownissue.MainActivity EXITING} couldn't find taskId=49 Callers=com.android.server.wm.DisplayContent.setTouchExcludeRegion:237 com.android.server.wm.WindowManagerService.setFocusedStackFrame:3820 com.android.server.wm.WindowManagerService.performLayoutAndPlaceSurfacesLockedInner:9623 com.android.server.wm.WindowManagerService.performLayoutAndPlaceSurfacesLockedLoop:8355
06-30 14:08:55.562    1520-1688/? E/WindowState﹕ getStack: Window{29c0282 u0 com.chrislacy.webviewdropdownissue/com.chrislacy.webviewdropdownissue.MainActivity EXITING} couldn't find taskId=49 Callers=com.android.server.wm.WindowManagerService.performLayoutAndPlaceSurfacesLockedInner:9230 com.android.server.wm.WindowManagerService.performLayoutAndPlaceSurfacesLockedLoop:8355 com.android.server.wm.WindowManagerService.performLayoutAndPlaceSurfacesLocked:8297 com.android.server.wm.WindowManagerService.access$400:159
06-30 14:08:55.562    1520-1688/? E/WindowState﹕ getStack: Window{29c0282 u0 com.chrislacy.webviewdropdownissue/com.chrislacy.webviewdropdownissue.MainActivity EXITING} couldn't find taskId=49 Callers=com.android.server.wm.WindowState.getDisplayContent:730 com.android.server.wm.WindowManagerService.handleNotObscuredLocked:9016 com.android.server.wm.WindowManagerService.performLayoutAndPlaceSurfacesLockedInner:9240 com.android.server.wm.WindowManagerService.performLayoutAndPlaceSurfacesLockedLoop:8355
06-30 14:08:55.563    1520-1688/? E/WindowState﹕ getStack: Window{29c0282 u0 com.chrislacy.webviewdropdownissue/com.chrislacy.webviewdropdownissue.MainActivity EXITING} couldn't find taskId=49 Callers=com.android.server.wm.WindowState.getDisplayContent:730 com.android.server.wm.WindowStateAnimator.updateSurfaceWindowCrop:1135 com.android.server.wm.WindowStateAnimator.setSurfaceBoundariesLocked:1280 com.android.server.wm.WindowManagerService.performLayoutAndPlaceSurfacesLockedInner:9311
06-30 14:08:55.563    1520-1688/? E/WindowState﹕ getStack: Window{29c0282 u0 com.chrislacy.webviewdropdownissue/com.chrislacy.webviewdropdownissue.MainActivity EXITING} couldn't find taskId=49 Callers=com.android.server.wm.WindowState.getDisplayContent:730 com.android.server.wm.WindowState.isDefaultDisplay:1227 com.android.server.wm.WindowStateAnimator.updateSurfaceWindowCrop:1146 com.android.server.wm.WindowStateAnimator.setSurfaceBoundariesLocked:1280
06-30 14:08:55.564    1520-1688/? E/WindowState﹕ getStack: Window{29c0282 u0 com.chrislacy.webviewdropdownissue/com.chrislacy.webviewdropdownissue.MainActivity EXITING} couldn't find taskId=49 Callers=com.android.server.wm.DisplayContent.setTouchExcludeRegion:237 com.android.server.wm.WindowManagerService.setFocusedStackFrame:3820 com.android.server.wm.WindowManagerService.performLayoutAndPlaceSurfacesLockedInner:9623 com.android.server.wm.WindowManagerService.performLayoutAndPlaceSurfacesLockedLoop:8355
06-30 14:08:55.566    1520-1688/? E/WindowState﹕ getStack: Window{29c0282 u0 com.chrislacy.webviewdropdownissue/com.chrislacy.webviewdropdownissue.MainActivity EXITING} couldn't find taskId=49 Callers=com.android.server.wm.WindowState.getDisplayContent:730 com.android.server.wm.WindowStateAnimator.stepAnimationLocked:273 com.android.server.wm.WindowAnimator.updateWindowsLocked:254 com.android.server.wm.WindowAnimator.animateLocked:550
06-30 14:08:55.566    1520-1688/? E/WindowState﹕ getStack: Window{29c0282 u0 com.chrislacy.webviewdropdownissue/com.chrislacy.webviewdropdownissue.MainActivity} couldn't find taskId=49 Callers=com.android.server.wm.WindowState.getDisplayContent:730 com.android.server.wm.WindowState.getDisplayId:735 com.android.server.wm.WindowStateAnimator.stepAnimationLocked:402 com.android.server.wm.WindowAnimator.updateWindowsLocked:254
06-30 14:08:55.566    1520-1688/? E/WindowState﹕ getStack: Window{29c0282 u0 com.chrislacy.webviewdropdownissue/com.chrislacy.webviewdropdownissue.MainActivity} couldn't find taskId=49 Callers=com.android.server.wm.WindowState.getDisplayContent:730 com.android.server.wm.WindowState.getDisplayId:735 com.android.server.wm.WindowStateAnimator.computeShownFrameLocked:922 com.android.server.wm.WindowStateAnimator.prepareSurfaceLocked:1297
06-30 14:08:55.566    1520-1688/? E/WindowState﹕ getStack: Window{29c0282 u0 com.chrislacy.webviewdropdownissue/com.chrislacy.webviewdropdownissue.MainActivity} couldn't find taskId=49 Callers=com.android.server.wm.WindowState.getDisplayContent:730 com.android.server.wm.WindowStateAnimator.updateSurfaceWindowCrop:1135 com.android.server.wm.WindowStateAnimator.setSurfaceBoundariesLocked:1280 com.android.server.wm.WindowStateAnimator.prepareSurfaceLocked:1299
06-30 14:08:55.567    1520-1688/? E/WindowState﹕ getStack: Window{29c0282 u0 com.chrislacy.webviewdropdownissue/com.chrislacy.webviewdropdownissue.MainActivity} couldn't find taskId=49 Callers=com.android.server.wm.WindowState.getDisplayContent:730 com.android.server.wm.WindowState.isDefaultDisplay:1227 com.android.server.wm.WindowStateAnimator.updateSurfaceWindowCrop:1146 com.android.server.wm.WindowStateAnimator.setSurfaceBoundariesLocked:1280
06-30 14:08:55.571    1520-1688/? E/WindowState﹕ getStack: Window{29c0282 u0 com.chrislacy.webviewdropdownissue/com.chrislacy.webviewdropdownissue.MainActivity} couldn't find taskId=49 Callers=com.android.server.wm.WindowManagerService.performLayoutAndPlaceSurfacesLockedInner:9230 com.android.server.wm.WindowManagerService.performLayoutAndPlaceSurfacesLockedLoop:8355 com.android.server.wm.WindowManagerService.performLayoutAndPlaceSurfacesLocked:8297 com.android.server.wm.WindowManagerService.access$400:159
06-30 14:08:55.571    1520-1688/? E/WindowState﹕ getStack: Window{29c0282 u0 com.chrislacy.webviewdropdownissue/com.chrislacy.webviewdropdownissue.MainActivity} couldn't find taskId=49 Callers=com.android.server.wm.WindowState.getDisplayContent:730 com.android.server.wm.WindowStateAnimator.updateSurfaceWindowCrop:1135 com.android.server.wm.WindowStateAnimator.setSurfaceBoundariesLocked:1280 com.android.server.wm.WindowManagerService.performLayoutAndPlaceSurfacesLockedInner:9311
06-30 14:08:55.571    1520-1688/? E/WindowState﹕ getStack: Window{29c0282 u0 com.chrislacy.webviewdropdownissue/com.chrislacy.webviewdropdownissue.MainActivity} couldn't find taskId=49 Callers=com.android.server.wm.WindowState.getDisplayContent:730 com.android.server.wm.WindowState.isDefaultDisplay:1227 com.android.server.wm.WindowStateAnimator.updateSurfaceWindowCrop:1146 com.android.server.wm.WindowStateAnimator.setSurfaceBoundariesLocked:1280
06-30 14:08:55.572    1520-2740/? I/am_create_service﹕ [0,73952763,.IndexService,10009,2596]
06-30 14:08:55.572    1520-1688/? E/WindowState﹕ getStack: Window{29c0282 u0 com.chrislacy.webviewdropdownissue/com.chrislacy.webviewdropdownissue.MainActivity} couldn't find taskId=49 Callers=com.android.server.wm.WindowState.getDisplayContent:730 com.android.server.wm.WindowState.getWindowList:1295 com.android.server.wm.WindowManagerService.removeWindowInnerLocked:2619 com.android.server.wm.WindowManagerService.performLayoutAndPlaceSurfacesLockedInner:9605
06-30 14:08:55.573    1520-1688/? E/WindowState﹕ getStack: Window{29c0282 u0 com.chrislacy.webviewdropdownissue/com.chrislacy.webviewdropdownissue.MainActivity} couldn't find taskId=49 Callers=com.android.server.wm.WindowState.getDisplayContent:730 com.android.server.wm.WindowManagerService.performLayoutAndPlaceSurfacesLockedInner:9606 com.android.server.wm.WindowManagerService.performLayoutAndPlaceSurfacesLockedLoop:8355 com.android.server.wm.WindowManagerService.performLayoutAndPlaceSurfacesLocked:8297
06-30 14:08:55.574      185-185/? I/sf_frame_dur﹕ [com.chrislacy.webviewdropdownissue/com.chrislacy.webviewdropdownissue.MainActivity,15,1,1,0,0,1,2]
06-30 14:08:55.575   4043-23799/? I/HotwordRecognitionRnr﹕ Starting hotword detection.
06-30 14:08:55.576   4043-23796/? I/MicrophoneInputStream﹕ mic_starting eze@109a8b8e
06-30 14:08:55.584      199-199/? I/﹕ Process 23234 exited due to signal (6)
06-30 14:08:55.585    188-23802/? I/AudioFlinger﹕ AudioFlinger's thread 0xb49ba008 ready to run
06-30 14:08:55.600    188-23802/? D/audio_hw_primary﹕ select_devices: out_snd_device(0: ) in_snd_device(17: handset-mic)
06-30 14:08:55.600    188-23802/? D/﹕ Failed to fetch the lookup information of the device 00000004
06-30 14:08:55.600    188-23802/? E/ACDB-LOADER﹕ Error: ACDB AudProc vol returned = -19
06-30 14:08:55.605    2596-2614/? I/art﹕ Heap transition to ProcessStateJankPerceptible took 33.556303ms saved at least -202KB
06-30 14:08:55.608    1520-2740/? I/am_create_service﹕ [0,1025211928,.IndexWorkerService,10009,2596]
06-30 14:08:55.615    1520-2739/? I/am_create_service﹕ [0,499510999,.LightweightIndexService,10009,3277]
06-30 14:08:55.619    1520-2595/? I/am_create_service﹕ [0,223765444,.LightweightIndexService$LightweightWorkerService,10009,3277]
06-30 14:08:55.622    1520-2740/? I/am_destroy_service﹕ [0,223765444,3277]
06-30 14:08:55.630    2596-3383/? I/Icing﹕ Usage reports 1 indexed 0 rejected 0 denied 0
06-30 14:08:55.632    1520-2740/? I/am_destroy_service﹕ [0,139744057,4043]
06-30 14:08:55.633    1520-1759/? I/am_destroy_service﹕ [0,1025211928,2596]
06-30 14:08:55.686    4043-4043/? I/HotwordWorker﹕ onReady
```
