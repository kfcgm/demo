(global["webpackJsonp"]=global["webpackJsonp"]||[]).push([["pages/shop-address/shop-address"],{"3c9f":function(t,e,n){"use strict";var r=n("af75"),a=n.n(r);a.a},"447c":function(t,e,n){"use strict";var r;n.d(e,"b",(function(){return a})),n.d(e,"c",(function(){return s})),n.d(e,"a",(function(){return r}));var a=function(){var t=this,e=t.$createElement;t._self._c},s=[]},"712e":function(t,e,n){"use strict";n.r(e);var r=n("447c"),a=n("cf01");for(var s in a)"default"!==s&&function(t){n.d(e,t,(function(){return a[t]}))}(s);n("3c9f");var u,i=n("f0c5"),c=Object(i["a"])(a["default"],r["b"],r["c"],!1,null,null,null,!1,r["a"],u);e["default"]=c.exports},af75:function(t,e,n){},c779:function(t,e,n){"use strict";(function(t){n("a86f");r(n("66fd"));var e=r(n("712e"));function r(t){return t&&t.__esModule?t:{default:t}}t(e.default)}).call(this,n("543d")["createPage"])},cf01:function(t,e,n){"use strict";n.r(e);var r=n("f8b9"),a=n.n(r);for(var s in r)"default"!==s&&function(t){n.d(e,t,(function(){return r[t]}))}(s);e["default"]=a.a},f8b9:function(t,e,n){"use strict";(function(t){Object.defineProperty(e,"__esModule",{value:!0}),e.default=void 0;var r=a(n("a34a"));function a(t){return t&&t.__esModule?t:{default:t}}function s(t,e,n,r,a,s,u){try{var i=t[s](u),c=i.value}catch(o){return void n(o)}i.done?e(c):Promise.resolve(c).then(r,a)}function u(t){return function(){var e=this,n=arguments;return new Promise((function(r,a){var u=t.apply(e,n);function i(t){s(u,r,a,i,c,"next",t)}function c(t){s(u,r,a,i,c,"throw",t)}i(void 0)}))}}var i={data:function(){return{source:0,list:[],user:{}}},onLoad:function(e){var n=this;return u(r.default.mark((function e(){var a,s;return r.default.wrap((function(e){while(1)switch(e.prev=e.next){case 0:return a=t.getStorageSync("nowTable"),e.next=3,n.$api.session(a);case 3:return s=e.sent,n.user=s.data,e.next=7,n.$api.list("address",{userid:n.user.id});case 7:s=e.sent,n.list=s.data.list;case 9:case"end":return e.stop()}}),e)})))()},onShow:function(){var e=this;return u(r.default.mark((function n(){var a,s;return r.default.wrap((function(n){while(1)switch(n.prev=n.next){case 0:return a=t.getStorageSync("nowTable"),n.next=3,e.$api.session(a);case 3:return s=n.sent,e.user=s.data,n.next=7,e.$api.list("address",{userid:e.user.id});case 7:s=n.sent,e.list=s.data.list;case 9:case"end":return n.stop()}}),n)})))()},methods:{onSelectTap:function(e){t.setStorageSync("address",e),t.navigateBack({delta:1})},onAddressDtailTap:function(t){var e="";e=t?"../shop-address-detail/shop-address-detail?id="+t:"../shop-address-detail/shop-address-detail?id=",this.$utils.jump(e)},onDeleteTap:function(e){var n=this;return u(r.default.mark((function a(){var s;return r.default.wrap((function(a){while(1)switch(a.prev=a.next){case 0:s=n,t.showModal({title:"提示",content:"是否确认删除",success:function(){var t=u(r.default.mark((function t(n){var a;return r.default.wrap((function(t){while(1)switch(t.prev=t.next){case 0:if(!n.confirm){t.next=9;break}return t.next=3,s.$api.del("address",JSON.stringify([e]));case 3:return a=t.sent,t.next=6,s.$api.list("address",{userid:this.user.id});case 6:a=t.sent,s.list=a.data.list,s.$utils.msg("删除成功");case 9:case"end":return t.stop()}}),t,this)})));function n(e){return t.apply(this,arguments)}return n}()});case 2:case"end":return a.stop()}}),a)})))()}}};e.default=i}).call(this,n("543d")["default"])}},[["c779","common/runtime","common/vendor"]]]);