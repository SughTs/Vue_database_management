<template >
  <div class="home">
  <!--搜索表单-->
    <div>
      <el-input style="width: 240px; margin-left: 0px;" placeholder="请输入名称"></el-input>
      <el-input style="width: 240px; margin-left: 5px;" placeholder="请输入联系方式" ></el-input>
      <el-button style="margin-left: 5px" type="primary"><i class="el-icon-search"></i>搜索</el-button>
    </div>

    <el-table :data ="tableData" stripe style="margin-top: 10px">
    <el-table-column prop="name" label="名称"></el-table-column>
      <el-table-column prop="age" label="年龄"></el-table-column>
      <el-table-column prop="address" label="地址"></el-table-column>
      <el-table-column prop="phone" label="电话"></el-table-column>
      <el-table-column prop="sex" label="性别"></el-table-column>
    </el-table>

    <!--分页(复制的代码)-->
    <div style="margin-top: 20px">
      <el-pagination
          layout="prev, pager, next"
          :total="100">
      </el-pagination>
    </div>
  </div>
</template>

<script>
export default
{
  name: 'HomeView',
  data(){
    return {
      tableData:[]
    }
  },
  created()
  {
    this.load()
  },
  methods:
      {
        load(){
          fetch('http://localhost:9090/user/list').then(res => res.json()).then(res => {
             console.log(res)
            this.tableData = res
            //容易引起跨域错误
          })
        }
      }
}
</script>


