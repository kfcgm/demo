(window["webpackJsonp"]=window["webpackJsonp"]||[]).push([["pages-register-register"],{3735:function(e,t,i){"use strict";i.r(t);var n=i("bd35"),r=i("48c7");for(var o in r)"default"!==o&&function(e){i.d(t,e,(function(){return r[e]}))}(o);i("3d17");var a,u=i("f0c5"),l=Object(u["a"])(r["default"],n["b"],n["c"],!1,null,"29fafd5d",null,!1,n["a"],a);t["default"]=l.exports},"3d17":function(e,t,i){"use strict";var n=i("8ca6"),r=i.n(n);r.a},"48c7":function(e,t,i){"use strict";i.r(t);var n=i("4e2d"),r=i.n(n);for(var o in n)"default"!==o&&function(e){i.d(t,e,(function(){return n[e]}))}(o);t["default"]=r.a},"4e2d":function(e,t,i){"use strict";var n=i("4ea4");Object.defineProperty(t,"__esModule",{value:!0}),t.default=void 0,i("28a5"),i("96cf");var r=n(i("3b8d")),o={data:function(){return{yonghuxingbieOptions:[],yonghuxingbieIndex:0,gongjiangxingbieOptions:[],gongjiangxingbieIndex:0,ruleForm:{},tableName:""}},onLoad:function(){var e=(0,r.default)(regeneratorRuntime.mark((function e(){var t;return regeneratorRuntime.wrap((function(e){while(1)switch(e.prev=e.next){case 0:[],t=uni.getStorageSync("loginTable"),this.tableName=t,"yonghu"==this.tableName&&(this.yonghuxingbieOptions="男,女".split(","),this.ruleForm.xingbie=this.yonghuxingbieOptions[0]),"gongjiang"==this.tableName&&(this.gongjiangxingbieOptions="男,女".split(","),this.ruleForm.xingbie=this.gongjiangxingbieOptions[0]),this.styleChange();case 6:case"end":return e.stop()}}),e,this)})));function t(){return e.apply(this,arguments)}return t}(),methods:{yonghuxingbieChange:function(e){this.yonghuxingbieIndex=e.target.value,this.ruleForm.xingbie=this.yonghuxingbieOptions[this.yonghuxingbieIndex]},gongjiangxingbieChange:function(e){this.gongjiangxingbieIndex=e.target.value,this.ruleForm.xingbie=this.gongjiangxingbieOptions[this.gongjiangxingbieIndex]},styleChange:function(){this.$nextTick((function(){}))},getUUID:function(){return(new Date).getTime()},register:function(){var e=(0,r.default)(regeneratorRuntime.mark((function e(){return regeneratorRuntime.wrap((function(e){while(1)switch(e.prev=e.next){case 0:if(this.ruleForm.yonghuming||"yonghu"!=this.tableName){e.next=3;break}return this.$utils.msg("用户名不能为空"),e.abrupt("return");case 3:if(this.ruleForm.mima||"yonghu"!=this.tableName){e.next=6;break}return this.$utils.msg("密码不能为空"),e.abrupt("return");case 6:if("yonghu"!=this.tableName||!this.ruleForm.shenfenzheng||this.$validate.checkIdCard(this.ruleForm.shenfenzheng)){e.next=9;break}return this.$utils.msg("身份证应输入身份证格式"),e.abrupt("return");case 9:if("yonghu"!=this.tableName||!this.ruleForm.shouji||this.$validate.isMobile(this.ruleForm.shouji)){e.next=12;break}return this.$utils.msg("手机应输入手机格式"),e.abrupt("return");case 12:if("yonghu"!=this.tableName||!this.ruleForm.money||this.$validate.isNumber(this.ruleForm.money)){e.next=15;break}return this.$utils.msg("余额应输入数字"),e.abrupt("return");case 15:if(this.ruleForm.zhanghao||"gongjiang"!=this.tableName){e.next=18;break}return this.$utils.msg("账号不能为空"),e.abrupt("return");case 18:if(this.ruleForm.mima||"gongjiang"!=this.tableName){e.next=21;break}return this.$utils.msg("密码不能为空"),e.abrupt("return");case 21:if("gongjiang"!=this.tableName||!this.ruleForm.shenfenzheng||this.$validate.checkIdCard(this.ruleForm.shenfenzheng)){e.next=24;break}return this.$utils.msg("身份证应输入身份证格式"),e.abrupt("return");case 24:if("gongjiang"!=this.tableName||!this.ruleForm.lianxidianhua||this.$validate.isMobile(this.ruleForm.lianxidianhua)){e.next=27;break}return this.$utils.msg("联系电话应输入手机格式"),e.abrupt("return");case 27:if("gongjiang"!=this.tableName||!this.ruleForm.money||this.$validate.isNumber(this.ruleForm.money)){e.next=30;break}return this.$utils.msg("余额应输入数字"),e.abrupt("return");case 30:return e.next=32,this.$api.register("".concat(this.tableName),this.ruleForm);case 32:this.$utils.msgBack("注册成功");case 34:case"end":return e.stop()}}),e,this)})));function t(){return e.apply(this,arguments)}return t}()}};t.default=o},"8ca6":function(e,t,i){var n=i("8d5d");"string"===typeof n&&(n=[[e.i,n,""]]),n.locals&&(e.exports=n.locals);var r=i("4f06").default;r("d43f3b50",n,!0,{sourceMap:!1,shadowMode:!1})},"8d5d":function(e,t,i){var n=i("24fb");t=n(!1),t.push([e.i,'@charset "UTF-8";\n/**\r\n * 这里是uni-app内置的常用样式变量\r\n *\r\n * uni-app 官方扩展插件及插件市场（https://ext.dcloud.net.cn）上很多三方插件均使用了这些样式变量\r\n * 如果你是插件开发者，建议你使用scss预处理，并在插件代码中直接使用这些变量（无需 import 这个文件），方便用户通过搭积木的方式开发整体风格一致的App\r\n *\r\n */\n/**\r\n * 如果你是App开发者（插件使用者），你可以通过修改这些变量来定制自己的插件主题，实现自定义主题功能\r\n *\r\n * 如果你的项目同样使用了scss预处理，你也可以直接在你的 scss 代码中使用如下变量，同时无需 import 这个文件\r\n */\n/* 颜色变量 */\n/* 行为相关颜色 */\n/* 文字基本颜色 */\n/* 背景颜色 */\n/* 边框颜色 */\n/* 尺寸变量 */\n/* 文字尺寸 */\n/* 图片尺寸 */\n/* Border Radius */\n/* 水平间距 */\n/* 垂直间距 */\n/* 透明度 */\n/* 文章场景相关 */.content[data-v-29fafd5d]{padding:%?100?%}.content[data-v-29fafd5d]:after{position:fixed;top:0;right:0;left:0;bottom:0;content:"";background-attachment:fixed;background-size:cover;background-position:50%}.logo[data-v-29fafd5d]{text-align:center}.logo uni-image[data-v-29fafd5d]{height:%?200?%;width:%?200?%;margin:0 0 %?60?%}.uni-form-item[data-v-29fafd5d]{margin-bottom:%?40?%;padding:0}.uni-form-item .uni-input[data-v-29fafd5d]{font-size:%?30?%;padding:7px 0}uni-button[type="primary"][data-v-29fafd5d]{background-color:#b49950;border-radius:0;font-size:%?34?%;margin-top:%?60?%}.links[data-v-29fafd5d]{text-align:center;margin-top:%?40?%;font-size:%?26?%;color:#999}.links uni-view[data-v-29fafd5d]{display:inline-block;vertical-align:top;margin:0 %?10?%}.links .link-highlight[data-v-29fafd5d]{color:#b49950}.picker-select-input[data-v-29fafd5d]{line-height:%?88?%}',""]),e.exports=t},bd35:function(e,t,i){"use strict";var n,r=function(){var e=this,t=e.$createElement,i=e._self._c||t;return i("v-uni-view",{staticClass:"content"},[i("v-uni-view",{staticClass:"logo"},[i("v-uni-image",{style:{boxShadow:"0 0 16rpx #59f43e",borderColor:"#ccc",borderRadius:"40rpx",borderWidth:"2rpx",width:"160rpx",borderStyle:"solid",url:"http://codegen.caihongy.cn/20201024/ed5e326ca66f403aa3197b5fbb4ec733.jpg",isShow:!0,height:"160rpx"},attrs:{src:"http://codegen.caihongy.cn/20201024/ed5e326ca66f403aa3197b5fbb4ec733.jpg",mode:"aspectFill"}})],1),"yonghu"==e.tableName?i("v-uni-view",{staticClass:"uni-form-item uni-column"},[i("v-uni-input",{staticClass:"uni-input",style:{borderColor:"rgba(147, 193, 7, 1)",backgroundColor:"#fff",borderRadius:"16rpx",color:"#333",textAlign:"left",borderWidth:"4rpx",fontSize:"28rpx",borderStyle:"solid",height:"88rpx"},attrs:{type:"text",name:"",placeholder:"用户名"},model:{value:e.ruleForm.yonghuming,callback:function(t){e.$set(e.ruleForm,"yonghuming",t)},expression:"ruleForm.yonghuming"}})],1):e._e(),"yonghu"==e.tableName?i("v-uni-view",{staticClass:"uni-form-item uni-column"},[i("v-uni-input",{staticClass:"uni-input",style:{borderColor:"rgba(147, 193, 7, 1)",backgroundColor:"#fff",borderRadius:"16rpx",color:"#333",textAlign:"left",borderWidth:"4rpx",fontSize:"28rpx",borderStyle:"solid",height:"88rpx"},attrs:{type:"text",name:"",placeholder:"密码"},model:{value:e.ruleForm.mima,callback:function(t){e.$set(e.ruleForm,"mima",t)},expression:"ruleForm.mima"}})],1):e._e(),"yonghu"==e.tableName?i("v-uni-view",{staticClass:"uni-form-item uni-column"},[i("v-uni-input",{staticClass:"uni-input",style:{borderColor:"rgba(147, 193, 7, 1)",backgroundColor:"#fff",borderRadius:"16rpx",color:"#333",textAlign:"left",borderWidth:"4rpx",fontSize:"28rpx",borderStyle:"solid",height:"88rpx"},attrs:{type:"text",name:"",placeholder:"用户姓名"},model:{value:e.ruleForm.yonghuxingming,callback:function(t){e.$set(e.ruleForm,"yonghuxingming",t)},expression:"ruleForm.yonghuxingming"}})],1):e._e(),"yonghu"==e.tableName?i("v-uni-view",{staticClass:"uni-form-item uni-column"},[i("v-uni-picker",{attrs:{value:e.yonghuxingbieIndex,range:e.yonghuxingbieOptions},on:{change:function(t){arguments[0]=t=e.$handleEvent(t),e.yonghuxingbieChange.apply(void 0,arguments)}}},[i("v-uni-view",{staticClass:"uni-input",style:{borderColor:"rgba(147, 193, 7, 1)",backgroundColor:"#fff",borderRadius:"16rpx",color:"#333",textAlign:"left",borderWidth:"4rpx",fontSize:"28rpx",borderStyle:"solid",height:"88rpx"}},[e._v(e._s(e.ruleForm.xingbie?e.ruleForm.xingbie:"请选择性别"))])],1)],1):e._e(),"yonghu"==e.tableName?i("v-uni-view",{staticClass:"uni-form-item uni-column"},[i("v-uni-input",{staticClass:"uni-input",style:{borderColor:"rgba(147, 193, 7, 1)",backgroundColor:"#fff",borderRadius:"16rpx",color:"#333",textAlign:"left",borderWidth:"4rpx",fontSize:"28rpx",borderStyle:"solid",height:"88rpx"},attrs:{type:"text",name:"",placeholder:"身份证"},model:{value:e.ruleForm.shenfenzheng,callback:function(t){e.$set(e.ruleForm,"shenfenzheng",t)},expression:"ruleForm.shenfenzheng"}})],1):e._e(),"yonghu"==e.tableName?i("v-uni-view",{staticClass:"uni-form-item uni-column"},[i("v-uni-input",{staticClass:"uni-input",style:{borderColor:"rgba(147, 193, 7, 1)",backgroundColor:"#fff",borderRadius:"16rpx",color:"#333",textAlign:"left",borderWidth:"4rpx",fontSize:"28rpx",borderStyle:"solid",height:"88rpx"},attrs:{type:"text",name:"",placeholder:"手机"},model:{value:e.ruleForm.shouji,callback:function(t){e.$set(e.ruleForm,"shouji",t)},expression:"ruleForm.shouji"}})],1):e._e(),"gongjiang"==e.tableName?i("v-uni-view",{staticClass:"uni-form-item uni-column"},[i("v-uni-input",{staticClass:"uni-input",style:{borderColor:"rgba(147, 193, 7, 1)",backgroundColor:"#fff",borderRadius:"16rpx",color:"#333",textAlign:"left",borderWidth:"4rpx",fontSize:"28rpx",borderStyle:"solid",height:"88rpx"},attrs:{type:"text",name:"",placeholder:"账号"},model:{value:e.ruleForm.zhanghao,callback:function(t){e.$set(e.ruleForm,"zhanghao",t)},expression:"ruleForm.zhanghao"}})],1):e._e(),"gongjiang"==e.tableName?i("v-uni-view",{staticClass:"uni-form-item uni-column"},[i("v-uni-input",{staticClass:"uni-input",style:{borderColor:"rgba(147, 193, 7, 1)",backgroundColor:"#fff",borderRadius:"16rpx",color:"#333",textAlign:"left",borderWidth:"4rpx",fontSize:"28rpx",borderStyle:"solid",height:"88rpx"},attrs:{type:"text",name:"",placeholder:"密码"},model:{value:e.ruleForm.mima,callback:function(t){e.$set(e.ruleForm,"mima",t)},expression:"ruleForm.mima"}})],1):e._e(),"gongjiang"==e.tableName?i("v-uni-view",{staticClass:"uni-form-item uni-column"},[i("v-uni-input",{staticClass:"uni-input",style:{borderColor:"rgba(147, 193, 7, 1)",backgroundColor:"#fff",borderRadius:"16rpx",color:"#333",textAlign:"left",borderWidth:"4rpx",fontSize:"28rpx",borderStyle:"solid",height:"88rpx"},attrs:{type:"text",name:"",placeholder:"姓名"},model:{value:e.ruleForm.xingming,callback:function(t){e.$set(e.ruleForm,"xingming",t)},expression:"ruleForm.xingming"}})],1):e._e(),"gongjiang"==e.tableName?i("v-uni-view",{staticClass:"uni-form-item uni-column"},[i("v-uni-picker",{attrs:{value:e.gongjiangxingbieIndex,range:e.gongjiangxingbieOptions},on:{change:function(t){arguments[0]=t=e.$handleEvent(t),e.gongjiangxingbieChange.apply(void 0,arguments)}}},[i("v-uni-view",{staticClass:"uni-input",style:{borderColor:"rgba(147, 193, 7, 1)",backgroundColor:"#fff",borderRadius:"16rpx",color:"#333",textAlign:"left",borderWidth:"4rpx",fontSize:"28rpx",borderStyle:"solid",height:"88rpx"}},[e._v(e._s(e.ruleForm.xingbie?e.ruleForm.xingbie:"请选择性别"))])],1)],1):e._e(),"gongjiang"==e.tableName?i("v-uni-view",{staticClass:"uni-form-item uni-column"},[i("v-uni-input",{staticClass:"uni-input",style:{borderColor:"rgba(147, 193, 7, 1)",backgroundColor:"#fff",borderRadius:"16rpx",color:"#333",textAlign:"left",borderWidth:"4rpx",fontSize:"28rpx",borderStyle:"solid",height:"88rpx"},attrs:{type:"text",name:"",placeholder:"工种"},model:{value:e.ruleForm.gongzhong,callback:function(t){e.$set(e.ruleForm,"gongzhong",t)},expression:"ruleForm.gongzhong"}})],1):e._e(),"gongjiang"==e.tableName?i("v-uni-view",{staticClass:"uni-form-item uni-column"},[i("v-uni-input",{staticClass:"uni-input",style:{borderColor:"rgba(147, 193, 7, 1)",backgroundColor:"#fff",borderRadius:"16rpx",color:"#333",textAlign:"left",borderWidth:"4rpx",fontSize:"28rpx",borderStyle:"solid",height:"88rpx"},attrs:{type:"text",name:"",placeholder:"身份证"},model:{value:e.ruleForm.shenfenzheng,callback:function(t){e.$set(e.ruleForm,"shenfenzheng",t)},expression:"ruleForm.shenfenzheng"}})],1):e._e(),"gongjiang"==e.tableName?i("v-uni-view",{staticClass:"uni-form-item uni-column"},[i("v-uni-input",{staticClass:"uni-input",style:{borderColor:"rgba(147, 193, 7, 1)",backgroundColor:"#fff",borderRadius:"16rpx",color:"#333",textAlign:"left",borderWidth:"4rpx",fontSize:"28rpx",borderStyle:"solid",height:"88rpx"},attrs:{type:"text",name:"",placeholder:"联系电话"},model:{value:e.ruleForm.lianxidianhua,callback:function(t){e.$set(e.ruleForm,"lianxidianhua",t)},expression:"ruleForm.lianxidianhua"}})],1):e._e(),i("v-uni-view",[i("v-uni-button",{style:{borderColor:"#ccc",backgroundColor:"rgba(147, 193, 7, 1)",borderRadius:"40rpx",color:"rgba(255, 255, 255, 1)",borderWidth:"2rpx",fontSize:"32rpx",borderStyle:"solid",height:"88rpx"},attrs:{type:"primary"},on:{click:function(t){arguments[0]=t=e.$handleEvent(t),e.register.apply(void 0,arguments)}}},[e._v("注册")])],1)],1)},o=[];i.d(t,"b",(function(){return r})),i.d(t,"c",(function(){return o})),i.d(t,"a",(function(){return n}))}}]);