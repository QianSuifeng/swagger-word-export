### 使用步骤（Google Chrome）
1. 启动工程，访问地址： http://127.0.0.1:8081/swagger-ui.html
2. swagger-word-export 提供了多种方式生成 word 文档，可以通过 swagger json 的资源地址，例如：https://petstore.swagger.io/v2/swagger.json ；可以通过上传 json 文件；甚至可以直接输入 json 字符串。  
![Image text](https://github.com/qiany-sui/swagger-word-export/blob/master/src/main/resources/static/swagger-ui-1.jpg)
3. 生成的 WORD 示例：  
![Image text](https://github.com/qiany-sui/swagger-word-export/blob/master/src/main/resources/static/word-demo-1.jpg)
   
<br>

注:还有一种方式可以提前预览需要导出的Word文件的样式
1. 修改application.yml中的swagger.url值,将其改成需要预览的那个word所对应的swagger-ui的api-docs地址
2. 访问地址: http://127.0.0.1:8081/word
   
<br>
<br>
<br>
<br>
<p>--------------版本迭代历程--------------</p>


#### 版本：SwaggerToWord 1.0 (2021-02-08)
1. 代码梳理和页面美化。

#### 版本：SwaggerToWord 1.1 (2021-02-19)
1. 增加body型数据require的解析,另其能够正确显示出被@RequestBody所标识对象内部的require


注意：
1. 该代码是在[JMCuixy](https://github.com/JMCuixy/swagger2word)的代码基础上进行的自定义扩展,
有需要的小伙伴,也可直接下载原作者的源码进行调整
