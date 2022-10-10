<!--
<template>
  <div id="app">

    <nav>
      <router-link to="/">Home</router-link> |
      <router-link to="/about">About</router-link>
    </nav>
    <router-view/>
  </div>
</template>

<style>
#app {
  font-family: Avenir, Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
  color: #2c3e50;
}

nav {
  padding: 30px;
}

nav a {
  font-weight: bold;
  color: #2c3e50;
}

nav a.router-link-exact-active {
  color: #42b983;
}
</style>
-->
<template>
  <dvi id="app">
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
            <el-menu-item index="/about">关于详情</el-menu-item>
            <!--/about意思是跳转到about页面,用的是router方式-->
          </el-submenu>
        </el-menu>
      </div>

      <!--主体数据-->
      <div style="flex: 1;background-color: wheat;padding:30px">
        <router-view />
      </div>
    </div>
  </dvi>
</template>