(global["webpackJsonp"]=global["webpackJsonp"]||[]).push([["pages/discusszhuangxiutaocan/add-or-update"],{"19e2":function(e,t,n){"use strict";n.r(t);var r=n("ec71"),u=n.n(r);for(var a in r)"default"!==a&&function(e){n.d(t,e,(function(){return r[e]}))}(a);t["default"]=u.a},4862:function(e,t,n){},"631c":function(e,t,n){"use strict";var r=n("4862"),u=n.n(r);u.a},"67e8":function(e,t,n){"use strict";(function(e){n("a86f");r(n("66fd"));var t=r(n("8a9c"));function r(e){return e&&e.__esModule?e:{default:e}}e(t.default)}).call(this,n("543d")["createPage"])},"8a9c":function(e,t,n){"use strict";n.r(t);var r=n("b1ec"),u=n("19e2");for(var a in u)"default"!==a&&function(e){n.d(t,e,(function(){return u[e]}))}(a);n("631c");var c,i=n("f0c5"),o=Object(i["a"])(u["default"],r["b"],r["c"],!1,null,"7c33c7cc",null,!1,r["a"],c);t["default"]=o.exports},b1ec:function(e,t,n){"use strict";var r;n.d(t,"b",(function(){return u})),n.d(t,"c",(function(){return a})),n.d(t,"a",(function(){return r}));var u=function(){var e=this,t=e.$createElement;e._self._c},a=[]},ec71:function(e,t,n){"use strict";(function(e){Object.defineProperty(t,"__esModule",{value:!0}),t.default=void 0;var r=u(n("a34a"));function u(e){return e&&e.__esModule?e:{default:e}}function a(e,t,n,r,u,a,c){try{var i=e[a](c),o=i.value}catch(s){return void n(s)}i.done?t(o):Promise.resolve(o).then(r,u)}function c(e){return function(){var t=this,n=arguments;return new Promise((function(r,u){var c=e.apply(t,n);function i(e){a(c,r,u,i,o,"next",e)}function o(e){a(c,r,u,i,o,"throw",e)}i(void 0)}))}}var i=function(){Promise.all([n.e("common/vendor"),n.e("components/w-picker/w-picker")]).then(function(){return resolve(n("670f"))}.bind(null,n)).catch(n.oe)},o={data:function(){return{ruleForm:{refid:"",userid:"",content:"",reply:""},user:{},ro:{refid:!1,userid:!1,content:!1,reply:!1}}},components:{wPicker:i},computed:{},onLoad:function(t){var n=this;return c(r.default.mark((function u(){var a,c,i,o;return r.default.wrap((function(u){while(1)switch(u.prev=u.next){case 0:return a=e.getStorageSync("nowTable"),u.next=3,n.$api.session(a);case 3:if(c=u.sent,n.user=c.data,n.ruleForm.userid=e.getStorageSync("userid"),t.refid&&(n.ruleForm.refid=t.refid),!t.id){u.next=13;break}return n.ruleForm.id=t.id,u.next=11,n.$api.info("discusszhuangxiutaocan",n.ruleForm.id);case 11:c=u.sent,n.ruleForm=c.data;case 13:if(!t.cross){u.next=36;break}i=e.getStorageSync("crossObj"),u.t0=r.default.keys(i);case 16:if((u.t1=u.t0()).done){u.next=36;break}if(o=u.t1.value,"refid"!=o){u.next=22;break}return n.ruleForm.refid=i[o],n.ro.refid=!0,u.abrupt("continue",16);case 22:if("userid"!=o){u.next=26;break}return n.ruleForm.userid=i[o],n.ro.userid=!0,u.abrupt("continue",16);case 26:if("content"!=o){u.next=30;break}return n.ruleForm.content=i[o],n.ro.content=!0,u.abrupt("continue",16);case 30:if("reply"!=o){u.next=34;break}return n.ruleForm.reply=i[o],n.ro.reply=!0,u.abrupt("continue",16);case 34:u.next=16;break;case 36:n.styleChange();case 37:case"end":return u.stop()}}),u)})))()},methods:{styleChange:function(){this.$nextTick((function(){}))},getUUID:function(){return(new Date).getTime()},onSubmitTap:function(){var e=this;return c(r.default.mark((function t(){return r.default.wrap((function(t){while(1)switch(t.prev=t.next){case 0:if(e.ruleForm.refid){t.next=3;break}return e.$utils.msg("关联表id不能为空"),t.abrupt("return");case 3:if(e.ruleForm.userid){t.next=6;break}return e.$utils.msg("用户id不能为空"),t.abrupt("return");case 6:if(e.ruleForm.content){t.next=9;break}return e.$utils.msg("评论内容不能为空"),t.abrupt("return");case 9:if(!e.ruleForm.id){t.next=14;break}return t.next=12,e.$api.update("discusszhuangxiutaocan",e.ruleForm);case 12:t.next=16;break;case 14:return t.next=16,e.$api.add("discusszhuangxiutaocan",e.ruleForm);case 16:e.$utils.msgBack("提交成功");case 17:case"end":return t.stop()}}),t)})))()},optionsChange:function(e){this.index=e.target.value},bindDateChange:function(e){this.date=e.target.value},getDate:function(e){var t=new Date,n=t.getFullYear(),r=t.getMonth()+1,u=t.getDate();return"start"===e?n-=60:"end"===e&&(n+=2),r=r>9?r:"0"+r,u=u>9?u:"0"+u,"".concat(n,"-").concat(r,"-").concat(u)},toggleTab:function(e){this.$refs[e].show()}}};t.default=o}).call(this,n("543d")["default"])}},[["67e8","common/runtime","common/vendor"]]]);