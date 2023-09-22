# AndroLuaX

<img src="./logo.svg" alt="LOGO" width="300" />

![license](https://img.shields.io/gitlab/license/Jesse205/androluax)
[![发行版](https://img.shields.io/gitlab/v/release/Jesse205/androluax?label=发布&logo=gitlab)](https://gitlab.com/Jesse205/androluax/-/releases)

## 简介

AndroLuaX 是一款反编译 AndroLua+，为 AndroLua+ 添加 AndroidX 的 AndroLua+ 衍生产品

AndroLuaX 还添加了 [AndroidFastScroll](https://github.com/zhanghai/AndroidFastScroll)
与 [FullDraggableDrawer](https://github.com/PureWriter/FullDraggableDrawer)

## 构建项目

1. 克隆本项目到本地：`git clone https://gitlab.com/Jesse205/androluax.git`  。
2. 使用 Gradle 构建：`gradle build` 。
3. 复制到 Android 设备的 `内部存储/AppProjects/<你的项目>` 。
4. 下载 [Aide Lua 的发行版](https://gitee.com/AideLua/AideLua/releases/latest)，进入 Aide Lua 后选择刚才复制的工程，然后依次点击 `菜单-项目...-二次打包并安装` 。

## 注意事项

1. 因 AndroLua+ 本身的设计问题，**不建议**将 `targetSdk` 提升到 `29` 以上，否则存储权限没有被自动授予，造成用户体验不佳
2. **已去除 `welcome.png` 启动图**，因为有更好的图标居中方案替代
3. AndroidX 尽可能添加所有 AndroidX 依赖，但会排除一些无用的依赖和与 Kotlin 与 RxJava 有关的所有依赖。
4. **部分依赖无法在较低版本的 Android 上使用**

依赖兼容性表格：

| 依赖                                                 | 最低 SDK |
| ---------------------------------------------------- | -------- |
| androidx.car.app.automotive                          | 29       |
| androidx.core.uwb                                    | 31       |
| androidx.draganddrop                                 | 24       |
| androidx.glance.wear.tiles                           | 26       |
| androidx.health.connect.client                       | 26       |
| androidx.health.services.client                      | 30       |
| androidx.heifwriter                                  | 28       |
| androidx.javascriptengine                            | 26       |
| androidx.security.identity.credential                | 24       |
| androidx.wear.input.testing                          | 25       |
| androidx.wear.ongoing                                | 25       |
| androidx.wear.protolayout.expression                 | 26       |
| androidx.wear.phone.interactions                     | 25       |
| androidx.wear.remote.interactions                    | 23       |
| androidx.wear.tiles                                  | 25       |
| androidx.wear.watchface.complications.datasource.ktx | 26       |
| androidx.wear.watchface.complications.rendering      | 26       |
| androidx.wear.watchface.editor                       | 26       |
| androidx.wear.watchface.client                       | 26       |
| androidx.wear.watchface.style                        | 26       |
| androidx.wear.watchface.data                         | 26       |

## 感谢

没有他们，就没有 AndroLuaX

- **[Aide Lua](https://gitee.com/AideLua/AideLua)**: 依赖 Aide ，使用 Lua 快速、高效开发的工。\
  AndroLuaX 使用了此项目的模板。
- **[Material Files](https://github.com/zhanghai/MaterialFiles)**: 一个开源的 Material Design 文件管理器。\
  AndroLuaX 参考了此项目的代码风格、命名习惯以及实现方式。
- **[AnimeonGo](https://github.com/frrrrrits/AnimonGo)**: Open Source Aplikasi web scraper Anime Ongoing.\
  AndroLuaX 参考了此项目的代码。
- **[Chromium](https://github.com/chromium/chromium)**: Chromium is an open-source browser project that aims to build a safer, faster, and more stable way for all users to experience the web.\
  AndroLuaX 使用了此项目的配色。
- **[AndroidFastScroll](https://github.com/zhanghai/AndroidFastScroll)**: Fast scroll for Android RecyclerView and more.\
  AndroLuaX 使用了此项目并参考了此项目的代码风格、命名习惯以及实现方式。
- **[FullDraggableDrawer](https://github.com/PureWriter/FullDraggableDrawer)**: Make the DrawerLayout can be dragged/pulled out in real-time within the range of fullscreen, like Pure Writer.\
  AndroLuaX 使用了此项目。
- **[Material Components for Android](https://github.com/material-components/material-components-android)**: Modular and customizable Material Design UI components for Android.\
  AndroLuaX 使用了此项目和此项目的部分代码。

## 开源许可

- **[Material Components for Android](https://github.com/material-components/material-components-android)**: Apache-2.0 license
- **[Android Jetpack](https://github.com/androidx/androidx)**: Apache-2.0 license
- **[Chromium](https://github.com/chromium/chromium)**: Apache-2.0 license
- **[AndroidFastScroll](https://github.com/zhanghai/AndroidFastScroll)**: Apache-2.0 license
- **[FullDraggableDrawer](https://github.com/PureWriter/FullDraggableDrawer)**: Apache-2.0 license
- **[Aide Lua](https://gitee.com/AideLua/AideLua)**: MIT license
