tool={
  version="1.1",
}
appName="AndroLuaX "--应用名称
packageName="com.jesse205.androlua.androidX.material3"--应用包名
include={"project:app","project:androlua"}--导入，第一个为主程序
main="app"--老版本
compileLua=false--编译Lua

--相对路径位于工程根目录下
icon={
  day="ic_launcher-aidelua.png",--图标
  night="ic_launcher_night-aidelua.png",--暗色模式图标
}