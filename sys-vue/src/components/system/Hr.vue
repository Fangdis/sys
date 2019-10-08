<template>
  <div>
    <el-container>
      <el-header>HR</el-header>
      <el-main>
        <template>
          <el-table :data="hrList" border style="width: 100%">
            <el-table-column prop="name" label="姓名" width="180"></el-table-column>
            <el-table-column prop="phone" label="移动电话" width="180"></el-table-column>
            <el-table-column prop="telephone" label="固定电话" width="180"></el-table-column>
            <el-table-column prop="address" label="地址"></el-table-column>
            <el-table-column prop="remark" label="备注"></el-table-column>
          </el-table>
        </template>
      </el-main>
    </el-container>
  </div>
</template>
<script>
export default {
  name: "Hr",
  data() {
    return {
      hrList: [
        {
          name: "系统管理员",
          phone: "18568887789",
          telephone: "029-82881234",
          address: "深圳南山",
          remark: ""
        }
      ]
    };
  }
};
</script>