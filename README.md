

# “西小红”西南大学红十字会志愿服务管理系统—前端后台

⭐基于SpringBoot与Vue的志愿服务管理系统系统，用于简化志愿服务流程，提高志愿服务效率。

**接口文档**：https://apifox.com/apidoc/shared-51abf509-a67a-4bff-9b64-21ae1adc42bd

**后端技术栈**：

- 😄SpringBoot + MyBatis-Plus
- 🔒SpringSecurity + JWT+Redis：鉴权
- ❤Redis：用户信息缓存、志愿活动招募数据缓存
- ✉️JavaMail+FreeMarker：邮件模板的填充和发送功能
- :file_folder:七牛云OSS：图片存储 
- 🧚‍♂️okHttp + Netty建立前端、后端、大模型的websocket连接，调用星火大模型API实现流式问答。
- 🛒Rediss事务、Lua脚本实现限量志愿者招募人数秒杀
- ⛷️RabbitMQ消息重试机制与乐观锁保证活动邮件正确发送 

**前端技术栈**：

​	后台：Vue2+ vue-template-admin + Element-UI

​	微信小程序：原生开发

**部署**：Docker + Nginx

**TODO**：

- [ ] 更完善的权限控制
- [ ] 拆为微服务

本系统还有很多不完善的地方，如果您有宝贵的建议、不满 or 疑问，欢迎提issue！作者将尽快回复。

如果你对这个项目感兴趣，想要一起让它变得更好，欢迎联系我一起contribute！mail：qwretrh@qq.com

## 效果预览

![image](https://gitee.com/world_heping/RedCross/raw/front-admin/src/assets/readme/1721279956558.png)

![image](https://gitee.com/world_heping/RedCross/raw/front-admin/src/assets/readme/1721279704101.png)

![image](https://gitee.com/world_heping/RedCross/raw/front-admin/src/assets/readme/1721279851836.png)

![image](https://gitee.com/world_heping/RedCross/raw/front-admin/src/assets/readme/1721279902568.png)

## 前端后台项目运行

**后端项目在master分支下，前端后台项目在frontend-admin分支下，前端微信小程序在front-weixin分支下。**

下载项目

下载依赖 npm install --force

启动项目 npm run dev

打包项目 npm run build

如需修改ip与端口，在vue.config.js下修改baseUrl与httpPort的值

## 部署

部署见后端README.md文件