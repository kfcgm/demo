(global["webpackJsonp"]=global["webpackJsonp"]||[]).push([["pages/register/register"],{1678:function(e,n,t){},2824:function(e,n,t){"use strict";(function(e){Object.defineProperty(n,"__esModule",{value:!0}),n.default=void 0;var r=a(t("a34a"));function a(e){return e&&e.__esModule?e:{default:e}}function i(e,n,t,r,a,i,u){try{var o=e[i](u),g=o.value}catch(s){return void t(s)}o.done?n(g):Promise.resolve(g).then(r,a)}function u(e){return function(){var n=this,t=arguments;return new Promise((function(r,a){var u=e.apply(n,t);function o(e){i(u,r,a,o,g,"next",e)}function g(e){i(u,r,a,o,g,"throw",e)}o(void 0)}))}}var o={data:function(){return{yonghuxingbieOptions:[],yonghuxingbieIndex:0,gongjiangxingbieOptions:[],gongjiangxingbieIndex:0,ruleForm:{},tableName:""}},onLoad:function(){var n=this;return u(r.default.mark((function t(){var a;return r.default.wrap((function(t){while(1)switch(t.prev=t.next){case 0:[],a=e.getStorageSync("loginTable"),n.tableName=a,"yonghu"==n.tableName&&(n.yonghuxingbieOptions="男,女".split(","),n.ruleForm.xingbie=n.yonghuxingbieOptions[0]),"gongjiang"==n.tableName&&(n.gongjiangxingbieOptions="男,女".split(","),n.ruleForm.xingbie=n.gongjiangxingbieOptions[0]),n.styleChange();case 6:case"end":return t.stop()}}),t)})))()},methods:{yonghuxingbieChange:function(e){this.yonghuxingbieIndex=e.target.value,this.ruleForm.xingbie=this.yonghuxingbieOptions[this.yonghuxingbieIndex]},gongjiangxingbieChange:function(e){this.gongjiangxingbieIndex=e.target.value,this.ruleForm.xingbie=this.gongjiangxingbieOptions[this.gongjiangxingbieIndex]},styleChange:function(){this.$nextTick((function(){}))},getUUID:function(){return(new Date).getTime()},register:function(){var e=this;return u(r.default.mark((function n(){return r.default.wrap((function(n){while(1)switch(n.prev=n.next){case 0:if(e.ruleForm.yonghuming||"yonghu"!=e.tableName){n.next=3;break}return e.$utils.msg("用户名不能为空"),n.abrupt("return");case 3:if(e.ruleForm.mima||"yonghu"!=e.tableName){n.next=6;break}return e.$utils.msg("密码不能为空"),n.abrupt("return");case 6:if("yonghu"!=e.tableName||!e.ruleForm.shenfenzheng||e.$validate.checkIdCard(e.ruleForm.shenfenzheng)){n.next=9;break}return e.$utils.msg("身份证应输入身份证格式"),n.abrupt("return");case 9:if("yonghu"!=e.tableName||!e.ruleForm.shouji||e.$validate.isMobile(e.ruleForm.shouji)){n.next=12;break}return e.$utils.msg("手机应输入手机格式"),n.abrupt("return");case 12:if("yonghu"!=e.tableName||!e.ruleForm.money||e.$validate.isNumber(e.ruleForm.money)){n.next=15;break}return e.$utils.msg("余额应输入数字"),n.abrupt("return");case 15:if(e.ruleForm.zhanghao||"gongjiang"!=e.tableName){n.next=18;break}return e.$utils.msg("账号不能为空"),n.abrupt("return");case 18:if(e.ruleForm.mima||"gongjiang"!=e.tableName){n.next=21;break}return e.$utils.msg("密码不能为空"),n.abrupt("return");case 21:if("gongjiang"!=e.tableName||!e.ruleForm.shenfenzheng||e.$validate.checkIdCard(e.ruleForm.shenfenzheng)){n.next=24;break}return e.$utils.msg("身份证应输入身份证格式"),n.abrupt("return");case 24:if("gongjiang"!=e.tableName||!e.ruleForm.lianxidianhua||e.$validate.isMobile(e.ruleForm.lianxidianhua)){n.next=27;break}return e.$utils.msg("联系电话应输入手机格式"),n.abrupt("return");case 27:if("gongjiang"!=e.tableName||!e.ruleForm.money||e.$validate.isNumber(e.ruleForm.money)){n.next=30;break}return e.$utils.msg("余额应输入数字"),n.abrupt("return");case 30:return n.next=32,e.$api.register("".concat(e.tableName),e.ruleForm);case 32:e.$utils.msgBack("注册成功");case 34:case"end":return n.stop()}}),n)})))()}}};n.default=o}).call(this,t("543d")["default"])},"52b4":function(e,n,t){"use strict";var r=t("1678"),a=t.n(r);a.a},a06a:function(e,n,t){"use strict";(function(e){t("a86f");r(t("66fd"));var n=r(t("c0d8"));function r(e){return e&&e.__esModule?e:{default:e}}e(n.default)}).call(this,t("543d")["createPage"])},c0d8:function(e,n,t){"use strict";t.r(n);var r=t("c1b2"),a=t("f87a");for(var i in a)"default"!==i&&function(e){t.d(n,e,(function(){return a[e]}))}(i);t("52b4");var u,o=t("f0c5"),g=Object(o["a"])(a["default"],r["b"],r["c"],!1,null,"e8c82e18",null,!1,r["a"],u);n["default"]=g.exports},c1b2:function(e,n,t){"use strict";var r;t.d(n,"b",(function(){return a})),t.d(n,"c",(function(){return i})),t.d(n,"a",(function(){return r}));var a=function(){var e=this,n=e.$createElement;e._self._c},i=[]},f87a:function(e,n,t){"use strict";t.r(n);var r=t("2824"),a=t.n(r);for(var i in r)"default"!==i&&function(e){t.d(n,e,(function(){return r[e]}))}(i);n["default"]=a.a}},[["a06a","common/runtime","common/vendor"]]]);