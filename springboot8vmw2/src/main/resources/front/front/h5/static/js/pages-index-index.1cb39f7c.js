(window["webpackJsonp"]=window["webpackJsonp"]||[]).push([["pages-index-index"],{"042d":function(i,e,t){"use strict";var a,n=function(){var i=this,e=i.$createElement,t=i._self._c||e;return t("v-uni-view",{staticClass:"uni-padding-wrap"},[t("v-uni-view",{staticClass:"header"},[t("v-uni-view",{staticClass:"headerb"},[t("v-uni-swiper",{staticClass:"swiper",attrs:{"indicator-dots":!0,autoplay:i.autoplaySwiper,circular:!1,"indicator-active-color":"#000000","indicator-color":"rgba(0, 0, 0, .3)",duration:10,interval:i.intervalSwiper,vertical:!0}},i._l(i.swiperList,(function(e,a){return t("v-uni-swiper-item",{key:a,on:{click:function(t){arguments[0]=t=i.$handleEvent(t),i.onSwiperTap(e)}}},[t("v-uni-image",{attrs:{mode:"aspectFill",src:e.img}})],1)})),1)],1)],1),t("v-uni-view",{staticClass:"pl15 col3 header-title",staticStyle:{padding:"0 12px","box-sizing":"border-box"},style:{backgroundColor:"rgba(255, 255, 255, 1)",borderColor:"red",color:"rgba(0, 0, 0, 1)",borderRadius:"0px",borderWidth:"0px",fontSize:"32rpx",lineHeight:"72rpx",borderStyle:"solid"}},[t("v-uni-view",{staticClass:"left",style:{fontSize:"32rpx",color:"rgba(0, 0, 0, 1)"}},[i._v("建材商品")]),t("v-uni-view",{staticClass:"right-content",style:{fontSize:"32rpx",color:"rgba(0, 0, 0, 1)"},on:{click:function(e){arguments[0]=e=i.$handleEvent(e),i.onPageTap("jiancaishangpin")}}},[i._v("查看更多")])],1),t("v-uni-view",{staticClass:"uni-product-list",class:"active",style:{borderRadius:"0px",backgroundColor:"#efefef"}},i._l(i.homejiancaishangpinlist,(function(e,a){return t("v-uni-view",{key:a,staticClass:"uni-product",style:{borderRadius:"8rpx",backgroundColor:"rgba(177, 159, 159, 0.13)"},on:{click:function(t){arguments[0]=t=i.$handleEvent(t),i.onDetailTap("jiancaishangpin",e.id)}}},[t("v-uni-view",{staticClass:"uni-product-title",style:{fontSize:"28rpx",lineHeight:"56rpx",color:"#333",textAlign:"center"}},[i._v(i._s(e.jiancaimingcheng))]),t("v-uni-view",{staticClass:"image-view",style:{borderRadius:"40rpx",height:"320rpx"}},[t("v-uni-image",{staticClass:"uni-product-image",style:{borderRadius:"40rpx",height:"320rpx"},attrs:{mode:"aspectFill",src:e.tupian?e.tupian.split(",")[0]:""}})],1),t("v-uni-view",{staticClass:"uni-product-price",style:{fontSize:"24rpx",lineHeight:"48rpx",color:"rgba(255, 0, 0, 1)",textAlign:"center"}},[e.price?t("v-uni-text",{},[i._v("￥"+i._s(e.price))]):i._e()],1)],1)})),1),i._e(),t("v-uni-view",{staticClass:"pl15 col3 header-title",staticStyle:{padding:"0 12px","box-sizing":"border-box"},style:{backgroundColor:"rgba(255, 255, 255, 1)",borderColor:"red",color:"rgba(0, 0, 0, 1)",borderRadius:"0px",borderWidth:"0px",fontSize:"32rpx",lineHeight:"72rpx",borderStyle:"solid"}},[t("v-uni-view",{staticClass:"left",style:{fontSize:"32rpx",color:"rgba(0, 0, 0, 1)"}},[i._v("装修套餐")]),t("v-uni-view",{staticClass:"right-content",style:{fontSize:"32rpx",color:"rgba(0, 0, 0, 1)"},on:{click:function(e){arguments[0]=e=i.$handleEvent(e),i.onPageTap("zhuangxiutaocan")}}},[i._v("查看更多")])],1),t("v-uni-view",{staticClass:"uni-product-list",class:"active",style:{borderRadius:"0px",backgroundColor:"#efefef"}},i._l(i.homezhuangxiutaocanlist,(function(e,a){return t("v-uni-view",{key:a,staticClass:"uni-product",style:{borderRadius:"8rpx",backgroundColor:"rgba(177, 159, 159, 0.13)"},on:{click:function(t){arguments[0]=t=i.$handleEvent(t),i.onDetailTap("zhuangxiutaocan",e.id)}}},[t("v-uni-view",{staticClass:"uni-product-title",style:{fontSize:"28rpx",lineHeight:"56rpx",color:"#333",textAlign:"center"}},[i._v(i._s(e.taocanmingcheng))]),t("v-uni-view",{staticClass:"image-view",style:{borderRadius:"40rpx",height:"320rpx"}},[t("v-uni-image",{staticClass:"uni-product-image",style:{borderRadius:"40rpx",height:"320rpx"},attrs:{mode:"aspectFill",src:e.tupian?e.tupian.split(",")[0]:""}})],1)],1)})),1),i._e(),t("v-uni-view",{staticClass:"pl15 col3 header-title",staticStyle:{"font-size":"36upx","font-weight":"bold"},style:{backgroundColor:"rgba(255, 255, 255, 1)",borderColor:"red",color:"rgba(0, 0, 0, 1)",borderRadius:0,borderWidth:"0px",fontSize:"32rpx",lineHeight:"72rpx",borderStyle:"solid"}},[t("v-uni-view",{staticClass:"left",style:{fontSize:"32rpx",color:"rgba(0, 0, 0, 1)"}},[i._v("资讯信息")]),t("v-uni-view",{staticClass:"right-content",style:{fontSize:"32rpx",color:"rgba(0, 0, 0, 1)"},on:{click:function(e){arguments[0]=e=i.$handleEvent(e),i.onPageTap("news")}}},[i._v("查看更多")])],1),t("v-uni-view",{staticClass:"list",style:{borderRadius:0,backgroundColor:"#efefef"}},i._l(i.news,(function(e,a){return t("v-uni-view",{key:a,staticClass:"listm flex flex-between",style:{borderRadius:"8rpx",backgroundColor:"#fff"},on:{click:function(t){arguments[0]=t=i.$handleEvent(t),i.onNewsDetailTap(e.id)}}},[e.picture?t("v-uni-image",{staticClass:"listmpic",style:{borderRadius:"8rpx",width:"160rpx",height:"160rpx"},attrs:{src:e.picture,mode:"aspectFill"}}):i._e(),t("v-uni-view",{staticClass:"listmr"},[t("v-uni-view",{staticClass:"col3 f30 elip mb15",style:{fontSize:"28rpx",lineHeight:"56rpx",color:"#333",textAlign:"left"}},[i._v(i._s(e.title))]),e.addtime?t("v-uni-view",{staticClass:"colb f24 lh35",style:{fontSize:"24rpx",lineHeight:"48rpx",color:"#999",textAlign:"left"}},[i._v("发布时间："+i._s(e.addtime))]):i._e()],1)],1)})),1)],1)},r=[];t.d(e,"b",(function(){return n})),t.d(e,"c",(function(){return r})),t.d(e,"a",(function(){return a}))},"0d9b":function(i,e,t){"use strict";var a=t("4ea4");Object.defineProperty(e,"__esModule",{value:!0}),e.default=void 0,t("ac4d"),t("8a81"),t("ac6a"),t("96cf");var n=a(t("3b8d"));t("651d");var r=a(t("b704")),o={components:{uniIcons:r.default},data:function(){return{autoplaySwiper:!0,intervalSwiper:5e3,swiperList:[],homejiancaishangpinlist:[],homezhuangxiutaocanlist:[],news:[]}},onShow:function(){var i=(0,n.default)(regeneratorRuntime.mark((function i(){var e,t,a,n,r,o,d,s;return regeneratorRuntime.wrap((function(i){while(1)switch(i.prev=i.next){case 0:return e=[],i.next=3,this.$api.page("config",{page:1,limit:5});case 3:for(t=i.sent,a=!0,n=!1,r=void 0,i.prev=7,o=t.data.list[Symbol.iterator]();!(a=(d=o.next()).done);a=!0)s=d.value,s.name.indexOf("picture")>=0&&s.value&&""!=s.value&&null!=s.value&&(console.log(s),e.push({img:s.value}));i.next=15;break;case 11:i.prev=11,i.t0=i["catch"](7),n=!0,r=i.t0;case 15:i.prev=15,i.prev=16,a||null==o.return||o.return();case 18:if(i.prev=18,!n){i.next=21;break}throw r;case 21:return i.finish(18);case 22:return i.finish(15);case 23:return e&&(this.swiperList=e),i.next=26,this.$api.list("news",{page:1,limit:3});case 26:return t=i.sent,this.news=t.data.list,i.next=30,this.$api.list("jiancaishangpin",{page:1,limit:6});case 30:return t=i.sent,this.homejiancaishangpinlist=t.data.list,i.next=34,this.$api.list("zhuangxiutaocan",{page:1,limit:6});case 34:t=i.sent,this.homezhuangxiutaocanlist=t.data.list;case 36:case"end":return i.stop()}}),i,this,[[7,11,15,23],[16,,18,22]])})));function e(){return i.apply(this,arguments)}return e}(),methods:{onSwiperTap:function(i){},onNewsDetailTap:function(i){this.$utils.jump("../news-detail/news-detail?id=".concat(i))},onDetailTap:function(i,e){this.$utils.jump("../".concat(i,"/detail?id=").concat(e))},onPageTap:function(i){uni.navigateTo({url:"../".concat(i,"/list"),fail:function(){uni.switchTab({url:"../".concat(i,"/list")})}})}}};e.default=o},"162c":function(i,e,t){var a=t("24fb");e=a(!1),e.push([i.i,'uni-page-body[data-v-7cd893de]{background:#f8f8f8}.uni-padding-wrap[data-v-7cd893de]:after{position:fixed;top:0;right:0;left:0;bottom:0;content:"";background-attachment:fixed;background-size:cover;background-position:50%}uni-view[data-v-7cd893de]{font-family:"\\5FAE\\8F6F\\96C5\\9ED1";font-size:%?30?%}.header[data-v-7cd893de]{background:#eee;padding:0 0 %?300?% 0;margin-bottom:%?20?%;position:relative}.ssbox[data-v-7cd893de]{background:hsla(0,0%,100%,.35);width:%?530?%;border-radius:%?60?%;padding:%?10?% %?15?%;box-sizing:border-box}.ss_input[data-v-7cd893de]{border:none;width:%?450?%;font-size:%?30?%;color:#fff;background:none;height:%?45?%;line-break:%?45?%}.headerb[data-v-7cd893de]{position:absolute;left:0;width:100%;box-sizing:border-box}.headerb uni-image[data-v-7cd893de]{width:100%;position:relative;z-index:10}.headerb .swiper[data-v-7cd893de]{height:%?300?%}.swiper[data-v-7cd893de] .uni-swiper-dot{width:%?16?%;height:%?16?%;broder-radius:50%}.notice[data-v-7cd893de]{position:relative;z-index:5;padding:0 %?50?%}.noticem[data-v-7cd893de]{background:#fff;padding:%?55?% %?30?% %?15?%;border-radius:%?10?%;margin-top:%?-45?%}.noticer[data-v-7cd893de]{width:%?480?%;height:%?50?%}.noticer .swiper-item[data-v-7cd893de]{white-space:nowrap;text-overflow:ellipsis;overflow:hidden;height:%?50?%;line-height:%?50?%;font-size:%?24?%}.list[data-v-7cd893de]{padding:%?20?% %?20?% %?20?%}.listm[data-v-7cd893de]{background:#fff;border-radius:%?15?%;box-shadow:0 0 %?2?% rgba(0,0,0,.1);margin-bottom:%?20?%;padding:%?30?%}.listmpic[data-v-7cd893de]{border-radius:%?10?%;width:%?166?%;margin-right:%?20?%}.listmr[data-v-7cd893de]{\n\t/* width: 460upx; */display:inline-block;-webkit-box-flex:1;-webkit-flex:1;flex:1;display:-webkit-box;display:-webkit-flex;display:flex;-webkit-box-pack:justify;-webkit-justify-content:space-between;justify-content:space-between;-webkit-box-orient:vertical;-webkit-box-direction:normal;-webkit-flex-direction:column;flex-direction:column}\n\n\n\n\n\n\n\n\n\n.uni-product-list[data-v-7cd893de]{display:-webkit-box;display:-webkit-flex;display:flex;width:100%;-webkit-flex-wrap:wrap;flex-wrap:wrap;-webkit-box-orient:horizontal;-webkit-box-direction:normal;-webkit-flex-direction:row;flex-direction:row;margin-top:0;padding:0 %?14?%;box-sizing:border-box}.uni-product-list.active[data-v-7cd893de]{padding:0 %?12?%}.uni-product[data-v-7cd893de]{padding:%?10?%;margin:%?10?%;width:%?341?%;box-sizing:border-box;display:-webkit-box;display:-webkit-flex;display:flex;-webkit-box-orient:vertical;-webkit-box-direction:normal;-webkit-flex-direction:column;flex-direction:column;background:#fff}.uni-product-list.active .uni-product[data-v-7cd893de]{width:%?222?%}.image-view[data-v-7cd893de]{height:%?321?%;width:%?321?%;\n\t/* margin: 12upx 0; */display:-webkit-box;display:-webkit-flex;display:flex;-webkit-box-align:center;-webkit-align-items:center;align-items:center;overflow:hidden}.uni-product-list.active .image-view[data-v-7cd893de]{height:%?202?%;width:%?202?%;overflow:hidden}.uni-product-image[data-v-7cd893de]{height:100%;width:100%;margin:0 auto;display:block}.uni-product-title[data-v-7cd893de]{width:100%;word-break:break-all;display:-webkit-box;overflow:hidden;line-height:1.5;text-overflow:ellipsis;-webkit-box-orient:vertical;-webkit-line-clamp:1}.uni-product-price[data-v-7cd893de]{width:100%;margin-top:%?10?%;font-size:%?28?%;line-height:1.5;position:relative}.uni-product-price-original[data-v-7cd893de]{color:#e80080}.uni-product-price-favour[data-v-7cd893de]{color:#888;text-decoration:line-through;margin-left:%?10?%}.uni-product-tip[data-v-7cd893de]{position:absolute;right:%?10?%;background-color:#f33;color:#fff;padding:0 %?10?%;border-radius:%?5?%}.header-title[data-v-7cd893de]{display:-webkit-box;display:-webkit-flex;display:flex;-webkit-box-align:center;-webkit-align-items:center;align-items:center;text-align:center;-webkit-box-pack:justify;-webkit-justify-content:space-between;justify-content:space-between;padding:0 %?40?%}body.?%PAGE?%[data-v-7cd893de]{background:#f8f8f8}',""]),i.exports=e},7101:function(i,e,t){var a=t("162c");"string"===typeof a&&(a=[[i.i,a,""]]),a.locals&&(i.exports=a.locals);var n=t("4f06").default;n("fca3f91c",a,!0,{sourceMap:!1,shadowMode:!1})},8069:function(i,e,t){"use strict";t.r(e);var a=t("0d9b"),n=t.n(a);for(var r in a)"default"!==r&&function(i){t.d(e,i,(function(){return a[i]}))}(r);e["default"]=n.a},c356:function(i,e,t){"use strict";var a=t("7101"),n=t.n(a);n.a},f75a:function(i,e,t){"use strict";t.r(e);var a=t("042d"),n=t("8069");for(var r in n)"default"!==r&&function(i){t.d(e,i,(function(){return n[i]}))}(r);t("c356");var o,d=t("f0c5"),s=Object(d["a"])(n["default"],a["b"],a["c"],!1,null,"7cd893de",null,!1,a["a"],o);e["default"]=s.exports}}]);