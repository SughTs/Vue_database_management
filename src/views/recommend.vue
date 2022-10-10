<template>
  <div class="recommend">
    <h2>书目推荐</h2>
    <!--此处插入ID搜索与数据库交互，在做了在做了！-->
    <el-input v-model="input" placeholder="请在此处输入用户ID" prefix-icon="el-icon-search"></el-input>
    <button type="button" onclick="change1();recommend_book()">获得推荐书目</button>
    <h3 id="r1"></h3>
  </div>
</template>
<script>
export default
{
  name: "recommend",
}
function recommend_book()
{

}
function change1()
{
  document.getElementById("r1").innerHTML="根据对象的阅读兴趣，推荐以下书籍";
  alert('建议如下!');
}
</script>
<style scoped>
</style>