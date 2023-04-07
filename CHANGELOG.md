## 更新日志

### 3.0(5.0.18)(Material3)

1. 添加很多支持库
2. 更新 AndroidX 与 Material
3. 修复华为平行视界无法使用的问题
4. 添加更多 AndroidX 依赖
5. 添加了 LuaMaterialDialog，此类作为 LuaDialog 的代替品，仅方便开发者快速将项目转移到 Material3 风格。实际编写时请使用 MaterialAlertDialogBuilder
6. 美化主题

### 2.1(5.0.18)(Material3)

1. 修复打包之后安装时，编辑器与成品它俩必须没一个

### 2.0(5.0.18)(Material3)

1. 修复导入时报错
2. 更新AndroidX
3. 添加Material3（感谢@ikimashwoo）

### 1.5(5.0.18)

1. 修复 androlua://packagename/ 无法调用

### 1.4(5.0.18)

1. 修复打包无法安装
2. 更新so
3. 删除数据文件，避免更新关闭工程

### 1.3(5.0.18)

1. 更改包名，支持共存
2. 更改图标
3. 更新Androlua+

### 5.0.16(1.2)

1. 开源AndroluaX，解决编译时检测导入的问题

### 5.0.16(1.1)

1. 修复打包错误，去除R.string.app_name

### 5.0.16(1.0)

1. 添加AndroidX，去除onMenuItemSelected


## AndroLua+

### 5.0.18

1. 支持content导入，

### 5.0.17

1. task支持最大8196个线程，同步执行1024.

### 5.0.16

1. 修复字符串编译运行时bug。

### 5.0.15

1. LuaBtmap支持设置http header。

### 5.0.14

1. 修复打包出错的bug，
2. 优化Http异步接口。

### 5.0.13

1. 接口报错优化

### 5.0.12

1. LuaWebView增加setCookie,getCookie,getSource方法

### 5.0.11

1. 修复9.png的算法bug。

### 5.0.10

1. 支持LuaPreferenceFragment(t) LuaFragment(t),
2. activity.getSharedData()返回全部内容(不可修改)。

### 5.0.9

1. bug修复。

### 5.0.8

1. bug修复。

### 5.0.7

1. 修复switch的bug。

### 5.0.6

1. 修复bug。

### 5.0.5

1. 修复http异步上传的bug。

### 5.0.4

1. 修复http异步编码bug。

### 5.0.3

1. bug修复。

### 5.0.2

1. 优化编辑器。

### 5.0.1

1. bug修复。

### 5.0.0

1. 解决65000对象引用问题

### 4.4.4

1. 支持变长参数。
2. bug 修复。

### 4.4.3

1. bug 修复。

### 4.4.2

1. bug 修复。

### 4.4.1

1. switch case 支持多个值。

### 4.4.0

1. bug 修复。

### 4.3.6

1. bug 修复。

### 4.3.5

1. 支持有参数构建函数的虚类。

### 4.3.4

1. 增加table.const(常量表)。
2. 增加数组a=[]。

### 4.3.3

1. 增加when(单行判断语句)。

### 4.3.2

1. 增加bsh(测试)。

### 4.3.1

1. 增加一些函数。

### 4.3.0

1. 增加lambda关键字。
2. 增加defer延时执行。
3. 增加toclose自关闭局部变量，变量名前加*。

### 4.2.6

1. os.date支持64位时间。

### 4.2.5

1. io增加部分函数。

### 4.2.4

1. table增加部分函数。

### 4.2.3

1. 增加luajava.override。
2. 增加使用关键字作table的key。

### 4.2.2

1. 修复setSharedData bug。

### 4.2.1

1. 优化多维数组。
2. 增加luajava.astable(obk,true)深转换。

### 4.2.0

1. 支持虚类。

### 4.1.9

1. 优化Http返回值。

### 4.1.8

1. 优化HorizontalListView。
2. 布局表支持GIF背景图设置。

### 4.1.7

1. 优化HorizontalListView。
2. 优化日志查看。

### 4.1.6

1. 增加activity.stopService()方法。
2. 修复activity.startService()方法。

### 4.1.5

1. 增加activity.getLuaResources()方法。
2. 优化LuaResources。

### 4.1.4

1. 增加androlua://package name/path?key=value uri支持。

### 4.1.3

1. 修复FileProvider bug。
2. 修复LuaBitmapDrawable bug。
3. 最近任务可变标题与图标。
4. 第一次运行获得权限。

### 4.1.2

1. setter支持多个参数。

### 4.1.1

1. Http post增加一些方法。
2. 浮点数比较使用近似值。

### 4.1.0

1. 适配安卓P。

### 4.0.25

1. 增加LuaBitmapDrawable，支持jpg，png，gif，bmp等。
2. 支持设置网络图片缓存时间。

### 4.0.24

1. 优化强制类型处理。
2. 优化错误信息。

### 4.0.23

1. 优化HorizontalListView。
2. 可以省略所有仅使用Context的构建方法的参数。

### 4.0.22

1. 优化PageView,增加PageAdapter。
2. 增加HorizontalListView。

### 4.0.21

1. 优化task最多支持1024线程，128并行。

### 4.0.20

1. 一些更新。

### 4.0.19

1. 修复格式化bug。
1. LuaEditor增加addPackage方法。

### 4.0.18

1. 省略Dialog的context参数。

### 4.0.17

1. 修复获取内部类缓存bug。

### 4.0.16

1. 修复高亮异常。

### 4.0.15

1. 修复setter参数为table时意外错误的bug。

### 4.0.14

1. 增加LuaPreferenceFragment。

### 4.0.13

1. 修复bug。

### 4.0.12

1. 编辑器增加块区间线。

### 4.0.11

1. 优化自动换行。
2. 优化高亮。

### 4.0.10

1. 优化自动换行。
2. 优化LuaAdapter。

### 4.0.9
1. 优化getter/setter效率。
2. 优化单参数无参数方法效率。

### 4.0.8

1. 优化布局助手。
2. 优化布局表对style支持。

### 4.0.7

1. 优化LuaDialog。
2. 增加多属性赋值语句。

### 4.0.6

1. 修复第一次初始化过慢bug。

### 4.0.5

1. 增加设置luaExtDir方法。
2. 修复部分bug。

### 4.0.4

1. 优化lua字符串U码使用。
2. 支持鼠标滚轮滚动。
3. 修复部分bug。

### 4.0.3

1. 兼容旧版main入口。
2. 增加luajava.getContext()函数。
3. activity增加部分api。
4. 修复部分bug。

### 4.0.2

1. 修复部分bug。

### 4.0.1

1. 优化import对环境影响。
2. 修复部分bug。

### 4.0.0

1. 升级为lua 5.4随机数算法。
2. 修复lua部分bug。

### 4.0.0 rc4

1. 增加__type元方法。
2. 修复switch case bug。

### 4.0.0 rc3

1. 增加continue。

### 4.0.0 rc2

1. 一些优化。

### 4.0.0 alpha4

1. 使用增强的utf8模块。
2. 增加简化lambda表达式。

### 4.0.0 alpha3

1. 优化switch case。

### 4.0.0 alpha2

1. 可选择省略then do。
2. 增加switch case。

### 4.0.0 rc1

1. 修复activity缓存的bug。

### 4.0.0 beta4
2. 修复载入dex缓存的bug。

### 4.0.0 beta3

3. 模拟滑动支持指定path
4. bug修复。

### 4.0.0 beta2

1. 修复打包不能安装bug。

### 4.0.0 beta

1. 修复安卓8不能打包bug。

### 4.0.0 alpha

1. 优化辅助功能，支持监听按键，模拟点击，模拟触摸，截图等功能。
2. 增加ColorFinder类，用于颜色查找。
3. 修复loadbitmap分辨率异常的bug。

### 3.6.5

1. 修复参数转换bug。

### 3.6.4

1. 修复导入分析不能的bug。
2. 修复执行子目录文件的bug。
3. 支持画中画模式。
4. 修复适配器搜索的bug。

### 3.6.3

1. 修复参数转换bug。

### 3.6.2

1. 适配全面屏。
2. 支持分屏。
3. 增加getUriForPath/getUriForFile方法。
4. 增强超级辅助。

### 3.6.1

1. 优化辅助功能超级辅助。

### 3.6.0

1. 修复finish activity可能导致程序退出的bug。
2. 修复运行内嵌子工程引用目录混乱的bug。
3. 增强辅助功能超级辅助。

### 3.5.9

1. 修复华为看不到log的bug。
2. 追加适配器过滤器。
3. 增加辅助功能超级辅助。

### 3.5.8

1. 修复bug。

### 3.5.7

1. 修复子目录导入bug。

### 3.5.6

1. 增加LuaContentObserver。

### 3.5.5

1. 增加LuaFileObserver。

### 3.5.4

1. 增加getActivity方法。

### 3.5.3

1. 增加LuaServer/LuaClient。
2. bug修复。

### 3.5.2

1. 修复异步Http不能获取错误请求详细信息的bug。
2. import增加一次导入多个包功能。

### 3.5

1. 增加代码加密。

### 3.4.5

1. 增加多窗口功能。

### 3.4.3

1. 增加与活动文件同名函数回调，方便处理传入参数。
2. 修复统计sdk读取app id一处bug。

### 3.4.2

1. 增加百度移动统计与错误反馈。
2. bug修复。

### 3.4.1

1. 增加共享数据getSharedData/setSharedData方法。
2. bug修复。

### 3.4.0

1. 增加LuaResources。

### 3.3.5

1. 增加辅助功能回调函数onAccessibilityEvent。
2. 修复bug。

### 3.3.4

1. 增加LuaMultiAdapter适配器。
2. 优化RippleLayout。
3. 回滚编辑器实现。
4. 支持修改工程版本号和SDK版本。
5. 支持设置关联文件。
6. 优化权限选择提示。
7. 修复bug。

### 3.3.3

1. 增加打包时编译自带模块。
2. 优化RippleLayout效果。
3. 优化编辑器高亮解析速度。
4. 优化PullingLayout效果。
5. 优化LuaDrawable和LuaAnimation实现。
6. getter支持isxxx简写。
7. LuaWebView支持打开第三方应用。
8. LuaWebView支持处理SSL错误。
9. bug修复。

### 3.3.2
增加LuaDialog。
修复RippleLayout连续点击效果异常的bug。
修复部分工程不能导入布局的bug。
增加方法调用时函数自动转为接口。

### 3.3.1
增加RippleLayout圆形扩散效果。
修复布局助手不能查看子视图的bug。

### 3.3

1. 优化setter效率提高800%。
2. 优化适配器数据格式，支持首字母小写。
3. 优化编辑器效率。
4. 更新帮助。
5. bug修复。

### 3.2.6

1. 优化setter/getter，支持首字母小写。
2. 优化异步Http多线程。
3. 优化异步task多线程。
4. 优化LuaArrayAdapter图片显示效果。
5. 优化编辑器。
6. 修复LuaUtil.zip压缩文件错误的bug。
7. 优化bmob用户登录。
8. bug修复。

### 3.2.5

1. 去除无用权限。
2. 优化编辑器。
3. 优化RippleLayout效果。
4. 优化错误信息。
5. LuaContext增加getGlobalData()方法。
6. 修复LuaThread函数调用两次的bug。
7. 增强loadlayout容错。
8. 增加导入分析。
9. 修复安卓7.x打包bug。
10. bug修复。

### 3.2.4

1. 修复悬浮窗焦点切换无效的bug。

### 3.2.3

1. 关联alp文件。
2. 增加简单test功能。
3. 修复bug。

### 3.2.2

1. 优化FloatWindow焦点切换。
2. 修复bug。

### 3.2.1

1. 增加RippleLayout。
2. 增加LuaExpandableListAdapter适配器。
3. 优化ToolBar显示效果。
4. 修复垃圾回收bug。
5. 修复jar资源加载异常的bug。

### 3.2

1. 更新Lua5.3.3。
2. 增加onVersionChanged回调函数。
3. 增加onResult回调函数。
4. 优化搜索选中效果。
5. 增加ide支持高亮与补全Java类。
6. 修复横竖屏切换bug。
7. 增加Http异步网络模块。
8. 修复在最左边删除，看不到待删除字符的问题。
9. 修复ToolBar不能设置空白标题的bug。
10. 优化PageLayouts与SlidingLayout.
11. 增加PullingLayout布局。
12. 增加线程自动回收机制。
13. 增加PageView。
14. 增加LuaFragment。
15. 增加级联风格调用。
16. 修复未实现接口函数调用出错的bug。
17. 增加支持自动导入libs目录so模块。
18. 增加支持TextView跑马灯。
19. 修复加载dex异常的bug。
20. 增加设置壁纸权限。
21. 优化task用法，自动导入外部代码导入的包与类。
22. 优化启动闪图逻辑。
23. 增加启动图不全屏时，自动适应空白区域颜色。
24. 优化内核，性能提高40%。
25. 优化打开工程逻辑。
26. 打开工程支持搜索。
27. 增加比例尺寸。
28. 优化log显示效果。
29. 优化第一次启动闪图效果。
30. 增加ide最近打开功能。
31. 增加记录最近打开文件光标位置功能。
32. 更新帮助。

### 3.1

1. 增加可视布局设计器，
2. 升级内核，速度提高20%，
3. http模块支持自定义UA与header
4. 优化luajava错误提示，
5. 增加工程导出/导入，
6. 修复打开文件的bug，
7. 增加后台服务，
8. 优化错误提示，
9. 修复类型转换bug，
10. 增加Ticker主线程回调定时器，
11. 编辑器自动夜间模式，
12. 编辑器支持自定义配色，
13. 增加导入dex函数，
14. loadbitmap加载网络图片支持本地缓存，
15. LuaArrayAdapter和LuaAdapter适配器支持异步加载图片与缓存，
16. 增加Java方法浏览器，
17. 增加导包提示，

### 3.0.0

1. 支持打包apk的权限配置，
2. 增加Map对象的简洁使用，
3. 完善luajavaa.astable函数，全面支持array List Map，
4. 增加在方法调用时Lua表自动转换为Java数组或接口，
5. 增加LuaArrayAdapter和LuaAdapter适配器，
6. LuaWebView支WebClient，在js调用Lua函数，
7. timer支持设置时间间隔，
8. newActivity支持传递参数，
9. http增加download和upload，
10. 日志支持清除，
11. Java方法支持table与array，map与interface自动转换，
12. 增强取长度运算符，可以获取Java对象大小，
13. 更换运行方式，
14. 支持打包文件夹，
15. 打包自动分析使用的c模块，
16. 增加tointeger函数，
17. setContentView支持布局表参数，

### 2.1.0

1. 去除广告，欢迎捐赠，
2. 修复接口方法错误无法显示错误信息的问题，
3. 修复import函数一处逻辑错误，
4. 修复onKeyDown等回调方法不能返回值的bug，
5. 优化luajava性能，
6. 优化IDE编辑器性能，
7. 修复IDE打开文件bug，
8. 增加setXXXListener控件事件快速设置，
9. 重写task与thread函数
10. 增加timer函数，
11. 修复数字类型转换bug，
12. 增加查看logcat输出功能，
13. 布局表支持绝对布局，
14. 布局表支持ListView预设项目，
15. 布局表支持style属性，
16. 布局表支持?android获取系统资源，
17. 修复astable索引0的bug，
18. IDE增加函数导航，
19. IDE增加搜索与转到，

### 2.0.4

1. 增加luajava.astable方法，
2. 增加each与enum迭代器
3. 布局表支持相对布局，
4. 布局表gravity属性支持或( | )操作，
5. 优化IDE逻辑，

### 2.0.3

1. 修复IDE布局bug

### 2.0.2

1. 增加getter与setter快速调用，用于简化控件属性设置，
2. 修复Java方法返回null没有返回值的bug，
3. 更新布局表算法，支持布局间距，
4. 优化Java方法缓存机制，效率提高一倍，布局表效率提高8倍，

### 2.0.1

1. 布局表增加自绘制背景，
2. 修复自动缩进算法错误，
3. 增加百度广告，仅在打包时出现，不影响使用，希望大家支持，

### 2.0

1. 更新Lua5.3.1，
2. 更新luajava3.0，
3. 增加打包apk功能，
4. 增加布局表，
5. 增加线程，
6. 增加更多回调方法，
7. 更新支持高亮，自动缩进，自动补全编辑器，
