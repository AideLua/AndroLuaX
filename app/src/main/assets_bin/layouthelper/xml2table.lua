require "import"
import "console"
import "androidx"
import "android.app.*"
import "android.os.*"
import "android.widget.*"
import "android.view.*"
import "android.content.*"
import "com.androlua.*"
import "androidx.appcompat.app.AppCompatDialog"
import "loadlayout3"
--activity.setTitle('XML转换器')
activity.setTheme(autotheme())
cm=activity.getSystemService(Context.CLIPBOARD_SERVICE)
t={
  LinearLayout,
  id="l",
  orientation="vertical" ,
  --backgroundColor="#eeeeff",
  {
    LuaEditor,
    id="edit",
    --hint= "XML布局代码转换AndroLua布局表",
    layout_width="fill",
    layout_height="fill",
    layout_weight=1,
    --gravity="top"
  },
  {
    CardView;
    layout_width="fill",
    {
      LinearLayout,
      layout_width="fill",
      --backgroundColor="#eeeeff",
      layout_marginLeft="12dp";
      layout_marginRight="12dp";
      {
        Button,
        id="open",
        text="转换",
        layout_width="fill",
        layout_weight=1,
        onClick ="click",
        layout_margin="4dp";
      } ,
      {
        Button,
        id="open",
        text="预览",
        layout_width="fill",
        layout_weight=1,
        onClick ="click2",
        layout_margin="4dp";
      } ,
      {
        Button,
        id="open",
        text="复制",
        layout_width="fill",
        layout_weight=1,
        onClick ="click3",
        layout_margin="4dp";
      } ,
      {
        Button,
        id="open",
        text="确定",
        layout_width="fill",
        layout_weight=1,
        onClick ="click4",
        layout_margin="4dp";
      } ,

    }
  }
}

function xml2table(xml)
  local xml,s=xml:gsub("</%w+>","}")
  if s==0 then
    return xml
  end
  xml=xml:gsub("<%?[^<>]+%?>","")
  xml=xml:gsub("xmlns:android=%b\"\"","")
  xml=xml:gsub("%w+:","")
  xml=xml:gsub("\"([^\"]+)\"",function(s)return (string.format("\"%s\"",s:match("([^/]+)$")))end)
  xml=xml:gsub("[\t ]+","")
  xml=xml:gsub("\n+","\n")
  xml=xml:gsub("^\n",""):gsub("\n$","")
  xml=xml:gsub("<","{"):gsub("/>","}"):gsub(">",""):gsub("\n",",\n")
  return (xml)
end

dlg=AppCompatDialog(activity,autotheme())
dlg.setTitle("布局表预览")
function show(s)
  dlg.setContentView(loadlayout3(loadstring("return "..s)(),{}))
  dlg.show()
end

function click()
  local str=edit.getText().toString()
  str=xml2table(str)
  str=console.format(str)
  edit.setText(str)
end

function click2()
  local str=edit.getText().toString()
  show(str)
end


function click3(s)
  local cd = ClipData.newPlainText("label", edit.getText().toString())
  cm.setPrimaryClip(cd)
  Toast.makeText(activity,"已复制的剪切板",1000).show()
end

function click4()
  local str=edit.getText().toString()
  layout.main=loadstring("return "..str)()
  activity.setContentView(loadlayout2(layout.main,{}))
  dlg2.hide()

end


loadlayout(t)
dlg2=AppCompatDialog(activity,autotheme())
dlg2.setTitle("编辑代码")
dlg2.getWindow().setSoftInputMode(0x10)

dlg2.setContentView(l)


function editlayout(txt)
  edit.Text=txt
  edit.format()
  dlg2.show()
end

function onResume2()
  local cd=cm.getPrimaryClip();
  local msg=cd.getItemAt(0).getText()--.toString();
  edit.setText(msg)
end
