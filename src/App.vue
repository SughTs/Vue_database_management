<template>
  <div id="app">
    <!--布局美术有待优化-->
    <!--教程头部区域-->
    <div style="height: 60px;line-height: 60px; background-color:lightgray; margin-bottom: 2px" >
      <img src="@/assets/图书馆1.png" alt="" style="width: 40px;position: relative;top:10px;left: 20px">
      <span style="margin-left: 25px; font-size: 24px">图书管理系统</span>
    </div>
    <!--侧边栏和主体-->
    <div style="display: flex">
      <!--侧边栏-->
      <div style="width: 200px; min-height: calc(98vh);  overflow: hidden;
      margin-right: 2px ;background-color: white"><!--div里面如果有高度数据或者数据才能体现出效果-->
        <el-menu :default-active="$route.path" router class="el-menu-demo">
          <el-menu-item index="/">
            <i class="el-icon-question"></i>
            <span>首页</span>
          </el-menu-item>
          <el-submenu>
            <template slot="title">
              <i class="el-icon-user-solid"></i>
              <span>关于页面</span>
            </template>
            <el-menu-item index="/about">页面详情</el-menu-item>
            <!--/about意思是跳转到about页面,用的是router方式-->
          </el-submenu>
          <!--config 1, created by liuzihua, do not change until another line left by him-->
          <el-menu-item index="/recommend">
            <template slot="title">
              <i class="el-icon-aim"></i>
              <span>书目推荐</span>
            </template>
          </el-menu-item>
          <!--This is another line left by liuzihua, only after this can you change the code-->
        </el-menu>
      </div>

      <!--主体数据-->
      <div style="flex: 1;background-color: wheat;padding:30px">
        <router-view />
      </div>
    </div>
  </div>
</template>