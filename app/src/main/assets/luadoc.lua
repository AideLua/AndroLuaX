require "import"
import "android.widget.*"
import "android.view.*"
import "com.androlua.*"
import "android.app.*"
import "autotheme"

activity.setTheme(autotheme())
activity.setTitle("Lua参考手册")
activity.getSupportActionBar().setDisplayHomeAsUpEnabled(true)

items={"目录",--[["返回",]]}
function onCreateOptionsMenu(menu)
  for k,v in ipairs(items) do
    m=menu.add(v)
    m.setShowAsActionFlags(1)
  end
end

function onOptionsItemSelected(item)
  local id=item.getItemId()
  if id==android.R.id.home then
    activity.finish()
   else
    onMenuItemSelected(id, item)
  end
end

function onMenuItemSelected(id,item)
  func[item.getTitle()]()
end
func={}
func["目录"]=function()
  doc_web.loadUrl("file://"..activity.getLuaDir().."/luadoc/contents.html#contents")
end
--[[
func["返回"]=function()
  --luajava.clear(doc_web)
  activity.finish()
end]]

doc_web=LuaWebView(activity)
doc_web.loadUrl("file://"..activity.getLuaDir().."/luadoc/manual.html")
doc_web.setOnKeyListener(View.OnKeyListener{
  onKey=function (view,keyCode,event)
    if ((keyCode == event.KEYCODE_BACK) and view.canGoBack()) then
      view.goBack();
      return true;
    end
    return false
  end
})


activity.setContentView(doc_web)





