const base = {
    get() {
                return {
            url : "http://localhost:8080/springboot8vmw2/",
            name: "springboot8vmw2",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/springboot8vmw2/front/index.html'
        };
            },
    getProjectName(){
        return {
            projectName: "巧匠家装小程序"
        } 
    }
}
export default base
