<template>
	<view class="content">
		<form class="app-update-pv">
			
									<view :style='{"boxShadow":"0 0 0px rgba(0,0,0,.3)","backgroundColor":"rgba(255, 255, 255, 1)","borderColor":"rgba(240, 239, 239, 1)","margin":"0","borderWidth":"0 0 2rpx 0","borderStyle":"solid","height":"108rpx"}' class="cu-form-group">
				<view :style='{"width":"170rpx","fontSize":"28rpx","color":"rgba(147, 193, 7, 1)","textAlign":"left"}' class="title">订单编号</view>
				<view :style='{"boxShadow":"0 0 0px rgba(0,0,0,.6) inset","borderColor":"rgba(215, 215, 215, 1)","borderRadius":"0px","color":"rgba(255, 144, 0, 1)","textAlign":"left","borderWidth":"2rpx","fontSize":"28rpx","borderStyle":"solid","height":"88rpx"}' class="right-input">
					{{ruleForm.dingdanbianhao}}
				</view>
			</view>
												<view :style='{"boxShadow":"0 0 0px rgba(0,0,0,.3)","backgroundColor":"rgba(255, 255, 255, 1)","borderColor":"rgba(240, 239, 239, 1)","margin":"0","borderWidth":"0 0 2rpx 0","borderStyle":"solid","height":"108rpx"}' class="cu-form-group">
				<view :style='{"width":"170rpx","fontSize":"28rpx","color":"rgba(147, 193, 7, 1)","textAlign":"left"}' class="title">套餐名称</view>
				<input :style='{"boxShadow":"0 0 0px rgba(0,0,0,.6) inset","borderColor":"rgba(215, 215, 215, 1)","borderRadius":"0px","color":"rgba(255, 144, 0, 1)","textAlign":"left","borderWidth":"2rpx","fontSize":"28rpx","borderStyle":"solid","height":"88rpx"}' :disabled="ro.taocanmingcheng" v-model="ruleForm.taocanmingcheng" placeholder="套餐名称"></input>
			</view>
												<view :style='{"boxShadow":"0 0 0px rgba(0,0,0,.3)","backgroundColor":"rgba(255, 255, 255, 1)","borderColor":"rgba(240, 239, 239, 1)","margin":"0","borderWidth":"0 0 2rpx 0","borderStyle":"solid","height":"108rpx"}' class="cu-form-group">
				<view :style='{"width":"170rpx","fontSize":"28rpx","color":"rgba(147, 193, 7, 1)","textAlign":"left"}' class="title">账号</view>
				<input :style='{"boxShadow":"0 0 0px rgba(0,0,0,.6) inset","borderColor":"rgba(215, 215, 215, 1)","borderRadius":"0px","color":"rgba(255, 144, 0, 1)","textAlign":"left","borderWidth":"2rpx","fontSize":"28rpx","borderStyle":"solid","height":"88rpx"}' :disabled="ro.zhanghao" v-model="ruleForm.zhanghao" placeholder="账号"></input>
			</view>
												<view :style='{"boxShadow":"0 0 0px rgba(0,0,0,.3)","backgroundColor":"rgba(255, 255, 255, 1)","borderColor":"rgba(240, 239, 239, 1)","margin":"0","borderWidth":"0 0 2rpx 0","borderStyle":"solid","height":"108rpx"}' class="cu-form-group">
				<view :style='{"width":"170rpx","fontSize":"28rpx","color":"rgba(147, 193, 7, 1)","textAlign":"left"}' class="title">姓名</view>
				<input :style='{"boxShadow":"0 0 0px rgba(0,0,0,.6) inset","borderColor":"rgba(215, 215, 215, 1)","borderRadius":"0px","color":"rgba(255, 144, 0, 1)","textAlign":"left","borderWidth":"2rpx","fontSize":"28rpx","borderStyle":"solid","height":"88rpx"}' :disabled="ro.xingming" v-model="ruleForm.xingming" placeholder="姓名"></input>
			</view>
												<view :style='{"boxShadow":"0 0 0px rgba(0,0,0,.3)","backgroundColor":"rgba(255, 255, 255, 1)","borderColor":"#ccc","margin":"0","borderWidth":"0 0 2rpx 0","borderStyle":"solid","height":"108rpx"}' class="cu-form-group" @tap="tupianTap" :class='left == "left"?"":"active"'>
				<view :style='{"width":"170rpx","fontSize":"28rpx","color":"rgba(147, 193, 7, 1)","textAlign":"left"}' class="title">图片</view>
				<view class="right-input" :style='{textAlign:"left"}' style="padding:0">
					<image :style='{"width":"88rpx","boxShadow":"0 0 16rpx rgba(0,0,0,.3)","borderRadius":"100%","textAlign":"left","height":"88rpx"}' class="avator" v-if="ruleForm.tupian" :src="ruleForm.tupian" mode="aspectFill"></image>
					<image :style='{"width":"88rpx","boxShadow":"0 0 16rpx rgba(0,0,0,.3)","borderRadius":"100%","textAlign":"left","height":"88rpx"}' class="avator" v-else src="../../static/gen/upload.png" mode="aspectFill"></image>
				</view>
			</view>
												<view :style='{"boxShadow":"0 0 0px rgba(0,0,0,.3)","backgroundColor":"rgba(255, 255, 255, 1)","borderColor":"rgba(240, 239, 239, 1)","margin":"0","borderWidth":"0 0 2rpx 0","borderStyle":"solid","height":"108rpx"}' class="cu-form-group">
				<view :style='{"width":"170rpx","fontSize":"28rpx","color":"rgba(147, 193, 7, 1)","textAlign":"left"}' class="title">价格</view>
				<input :style='{"boxShadow":"0 0 0px rgba(0,0,0,.6) inset","borderColor":"rgba(215, 215, 215, 1)","borderRadius":"0px","color":"rgba(255, 144, 0, 1)","textAlign":"left","borderWidth":"2rpx","fontSize":"28rpx","borderStyle":"solid","height":"88rpx"}' :disabled="ro.jiage" v-model="ruleForm.jiage" placeholder="价格"></input>
			</view>
																					<view :style='{"boxShadow":"0 0 0px rgba(0,0,0,.3)","backgroundColor":"rgba(255, 255, 255, 1)","borderColor":"#ccc","margin":"0","borderWidth":"0 0 2rpx 0","borderStyle":"solid","height":"108rpx"}' class="cu-form-group select">
				<view :style='{"width":"170rpx","fontSize":"28rpx","color":"rgba(147, 193, 7, 1)","textAlign":"left"}' class="title">预约日期</view>
				<picker mode="date" :value="ruleForm.yuyueriqi" @change="yuyueriqiChange">
					<view :style='{"boxShadow":"0 0 0px rgba(0,0,0,.6) inset","backgroundColor":"rgba(255, 255, 255, 0)","borderColor":"rgba(215, 215, 215, 1)","borderRadius":"0px","color":"rgba(255, 144, 0, 1)","textAlign":"left","borderWidth":"2rpx","fontSize":"28rpx","borderStyle":"solid","height":"88rpx"}' class="uni-input">{{ruleForm.yuyueriqi?ruleForm.yuyueriqi:"请选择预约日期"}}</view>
				</picker>
			</view>
												<view :style='{"boxShadow":"0 0 0px rgba(0,0,0,.3)","backgroundColor":"rgba(255, 255, 255, 1)","borderColor":"rgba(240, 239, 239, 1)","margin":"0","borderWidth":"0 0 2rpx 0","borderStyle":"solid","height":"108rpx"}' class="cu-form-group">
				<view :style='{"width":"170rpx","fontSize":"28rpx","color":"rgba(147, 193, 7, 1)","textAlign":"left"}' class="title">用户名</view>
				<input :style='{"boxShadow":"0 0 0px rgba(0,0,0,.6) inset","borderColor":"rgba(215, 215, 215, 1)","borderRadius":"0px","color":"rgba(255, 144, 0, 1)","textAlign":"left","borderWidth":"2rpx","fontSize":"28rpx","borderStyle":"solid","height":"88rpx"}' :disabled="ro.yonghuming" v-model="ruleForm.yonghuming" placeholder="用户名"></input>
			</view>
												<view :style='{"boxShadow":"0 0 0px rgba(0,0,0,.3)","backgroundColor":"rgba(255, 255, 255, 1)","borderColor":"rgba(240, 239, 239, 1)","margin":"0","borderWidth":"0 0 2rpx 0","borderStyle":"solid","height":"108rpx"}' class="cu-form-group">
				<view :style='{"width":"170rpx","fontSize":"28rpx","color":"rgba(147, 193, 7, 1)","textAlign":"left"}' class="title">用户姓名</view>
				<input :style='{"boxShadow":"0 0 0px rgba(0,0,0,.6) inset","borderColor":"rgba(215, 215, 215, 1)","borderRadius":"0px","color":"rgba(255, 144, 0, 1)","textAlign":"left","borderWidth":"2rpx","fontSize":"28rpx","borderStyle":"solid","height":"88rpx"}' :disabled="ro.yonghuxingming" v-model="ruleForm.yonghuxingming" placeholder="用户姓名"></input>
			</view>
																											
			<!-- 否 -->
 
			
			          				          				          				          				          				          				          				<view :style='{"boxShadow":"0 0 0px rgba(0,0,0,.3)","backgroundColor":"rgba(255, 255, 255, 1)","borderColor":"rgba(204, 204, 204, 1)","margin":"0","borderWidth":"0 0 2rpx 0","borderStyle":"solid","height":"308rpx"}' class="cu-form-group">
				<view :style='{"width":"170rpx","fontSize":"28rpx","color":"rgba(147, 193, 7, 1)","textAlign":"left"}' class="title">预约内容</view>
				<textarea :style='{"boxShadow":"0 0 0px rgba(0,0,0,.6) inset","backgroundColor":"rgba(255, 255, 255, 0)","borderColor":"rgba(215, 215, 215, 1)","borderRadius":"0px","color":"rgba(255, 144, 0, 1)","textAlign":"left","borderWidth":"2rpx","fontSize":"28rpx","borderStyle":"solid","height":"280rpx"}' v-model="ruleForm.yuyueneirong" placeholder="预约内容"></textarea>
			</view>
						          				          				          				          				          							
			          				          				          				          				          				          				          				          				          				          				          				          							
			<view class="btn">
				<button :style='{"boxShadow":"0 0 16rpx rgba(0,0,0,0) inset","backgroundColor":"rgba(147, 193, 7, 1)","borderColor":"rgba(147, 193, 7, 1)","borderRadius":"8rpx","color":"#fff","borderWidth":"1","width":"80%","fontSize":"28rpx","borderStyle":"solid","height":"80rpx"}' @tap="onSubmitTap" class="bg-red">提交</button>
			</view>
		</form>

																																																					
	</view>
</template>

<script>
	import wPicker from "@/components/w-picker/w-picker.vue";

	export default {
		data() {
			return {
				ruleForm: {
												dingdanbianhao: this.getUUID(),
																taocanmingcheng: '',
																zhanghao: '',
																xingming: '',
																tupian: '',
																jiage: '',
																yuyueneirong: '',
																yuyueriqi: '',
																yonghuming: '',
																yonghuxingming: '',
																ispay: '',
																userid: '',
												},
																																																																																																								// 登陆用户信息
				user: {},
                                ro:{
                                   dingdanbianhao : false,
                                   taocanmingcheng : false,
                                   zhanghao : false,
                                   xingming : false,
                                   tupian : false,
                                   jiage : false,
                                   yuyueneirong : false,
                                   yuyueriqi : false,
                                   yonghuming : false,
                                   yonghuxingming : false,
                                   ispay : false,
                                   userid : false,
                                },
			}
		},
		components: {
			wPicker
		},
		computed: {
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
					},
		async onLoad(options) {
			let table = uni.getStorageSync("nowTable");
			// 获取用户信息
			let res = await this.$api.session(table);
			this.user = res.data;
			
						// ss读取
																																																									this.ruleForm.yonghuming = this.user.yonghuming
												this.ruleForm.yonghuxingming = this.user.yonghuxingming
																					
																																																																																	
			// 如果有登陆，获取登陆后保存的userid
			this.ruleForm.userid = uni.getStorageSync("userid")
			if (options.refid) {
				// 如果上一级页面传递了refid，获取改refid数据信息
				this.ruleForm.refid = options.refid;
			}
			// 如果是更新操作
			if (options.id) {
				this.ruleForm.id = options.id;
				// 获取信息
				res = await this.$api.info(`xuangouxinxi`, this.ruleForm.id);
				this.ruleForm = res.data;
			}
			// 跨表
			if(options.cross){
				var obj = uni.getStorageSync('crossObj');
				for (var o in obj){
					if(o=='dingdanbianhao'){
					this.ruleForm.dingdanbianhao = obj[o];
					this.ro.dingdanbianhao = true;
					continue;
					}
					if(o=='taocanmingcheng'){
					this.ruleForm.taocanmingcheng = obj[o];
					this.ro.taocanmingcheng = true;
					continue;
					}
					if(o=='zhanghao'){
					this.ruleForm.zhanghao = obj[o];
					this.ro.zhanghao = true;
					continue;
					}
					if(o=='xingming'){
					this.ruleForm.xingming = obj[o];
					this.ro.xingming = true;
					continue;
					}
					if(o=='tupian'){
					this.ruleForm.tupian = obj[o];
					this.ro.tupian = true;
					continue;
					}
					if(o=='jiage'){
					this.ruleForm.jiage = obj[o];
					this.ro.jiage = true;
					continue;
					}
					if(o=='yuyueneirong'){
					this.ruleForm.yuyueneirong = obj[o];
					this.ro.yuyueneirong = true;
					continue;
					}
					if(o=='yuyueriqi'){
					this.ruleForm.yuyueriqi = obj[o];
					this.ro.yuyueriqi = true;
					continue;
					}
					if(o=='yonghuming'){
					this.ruleForm.yonghuming = obj[o];
					this.ro.yonghuming = true;
					continue;
					}
					if(o=='yonghuxingming'){
					this.ruleForm.yonghuxingming = obj[o];
					this.ro.yonghuxingming = true;
					continue;
					}
					if(o=='userid'){
					this.ruleForm.userid = obj[o];
					this.ro.userid = true;
					continue;
					}
				}
			}
			this.styleChange()
		},
		methods: {
			styleChange() {
				this.$nextTick(()=>{
					// document.querySelectorAll('.app-update-pv .cu-form-group .uni-input-input').forEach(el=>{
					//   el.style.backgroundColor = this.addUpdateForm.input.content.backgroundColor
					// })
				})
			},
																																																																														
			// 多级联动参数
																																																																														
																																																			yuyueriqiChange(e) {
				this.ruleForm.yuyueriqi = e.target.value;
				this.$forceUpdate();
			},
																														
																																																																											
																																																																											
																																													tupianTap() {
				let _this = this;
				this.$api.upload(function(res) {
					_this.ruleForm.tupian = _this.$base.url + 'upload/' + res.file;
					_this.$forceUpdate();
					_this.$nextTick(()=>{
						_this.styleChange()
					})
				});
			},
																																																																								
			getUUID () {
				return new Date().getTime();
			},
			async onSubmitTap() {
																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																												if((!this.ruleForm.userid)){
					this.$utils.msg(`用户id不能为空`);
					return
				}
																																				if(this.ruleForm.id){
					await this.$api.update(`xuangouxinxi`, this.ruleForm);
				}else{
					await this.$api.add(`xuangouxinxi`, this.ruleForm);
				}
				this.$utils.msgBack('提交成功');
			},
			optionsChange(e) {
				this.index = e.target.value
			},
			bindDateChange(e) {
				this.date = e.target.value
			},
			getDate(type) {
				const date = new Date();
				let year = date.getFullYear();
				let month = date.getMonth() + 1;
				let day = date.getDate();
				if (type === 'start') {
					year = year - 60;
				} else if (type === 'end') {
					year = year + 2;
				}
				month = month > 9 ? month : '0' + month;;
				day = day > 9 ? day : '0' + day;
				return `${year}-${month}-${day}`;
			},
			toggleTab(str) {
				this.$refs[str].show();
			}
		}
	}
</script>

<style lang="scss" scoped>
	.container {
		padding: 20upx;
	}
	
	.content:after {
		position: fixed;
		top: 0;
		right: 0;
		left: 0;
		bottom: 0;
		content: '';
				background-attachment: fixed;
		background-size: cover;
		background-position: center;
	}

	textarea {
		border: 1upx solid #EEEEEE;
		border-radius: 20upx;
		padding: 20upx;
	}

	.title {
		width: 180upx;
	}

	.avator {
		width: 150upx;
		height: 60upx;
	}

	.right-input {
		flex: 1;
		text-align: left;
		padding: 0 24upx;
	}
	
	.cu-form-group.active {
		justify-content: space-between;
	}
	
	.btn {
	  display: flex;
	  align-items: center;
	  justify-content: center;
	  flex-wrap: wrap;
	  padding: 20upx 0;
	}
	
	.cu-form-group {
		padding: 0 24upx;
		background-color: transparent;
		min-height: inherit;
	}
	
	.cu-form-group+.cu-form-group {
		border: 0;
	}
	
	.cu-form-group uni-input {
		padding: 0 30upx;
	}
	
	.uni-input {
		padding: 0 30upx;
	}
	
	.cu-form-group uni-textarea {
		padding: 30upx;
		margin: 0;
	}
	
	.cu-form-group uni-picker::after {
		line-height: 88rpx;
	}
	
	.select .uni-input {
		line-height: 88rpx;
	}
	
	.input .right-input {
		line-height: 88rpx;
	}
</style>
