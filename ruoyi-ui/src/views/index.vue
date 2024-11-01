<template>
  <div class="app-container home">
    <el-row :gutter="20">
      <el-col :sm="24" :lg="24">
        
      </el-col>
    </el-row>
    <el-row :gutter="20">
      <el-col :sm="24" :lg="12" style="padding-left: 20px">
        <h2>体系资料管理系統</h2>

        <p>
          <b>当前版本:</b> <span>v{{ version }}</span>
        </p>
      </el-col>

    </el-row>
    <el-divider />
    <el-row :gutter="20">
      <el-col :xs="24" :sm="24" :md="12" :lg="8">
        <el-card class="update-log">
          <div slot="header" class="clearfix">
            <span>功能介绍</span>
          </div>
          <div class="body">
            <p>  
              <i class="el-icon-s-promotion"></i> 班组安全生产责任书；  
            </p>  
            <p>  
              <i class="el-icon-s-promotion"></i> 班组危险源、隐患清单；  
            </p>   
            <p>  
              <i class="el-icon-s-promotion"></i> 劳防用品申请、领用记录；  
            </p>  
            <p>  
              <i class="el-icon-s-promotion"></i> 危化品MSDS；  
            </p>  
            <p>  
              <i class="el-icon-s-promotion"></i> 应急救援预案、演练记录；  
            </p>  
          </div>
        </el-card>
      </el-col>
      <el-col :xs="24" :sm="24" :md="12" :lg="8">
        <el-card class="update-log">
          <div slot="header" class="clearfix">
            <span>计量云表单</span>
          </div>
          <div class="body">
            <img
              src="@/assets/images/pay.png"
              alt="donate"
              width="100%"
            />
          </div>
        </el-card>
      </el-col>
      <el-col :xs="24" :sm="24" :md="12" :lg="8">
        <el-card class="update-log">
          <div slot="header" class="clearfix">
            <span>技术支持</span>
          </div>
          <div class="body">
            <p>
              <i class="el-icon-user-solid"></i> 账号：工号
            </p>
            <p>
              <i class="el-icon-user-solid"></i> 初始密码：123456
            </p>  
            <span style="display: inline-block; height: 30px; line-height: 30px"
              >新用户请联系管理员67077开通账号</span
            >
          </div>
        </el-card>
      </el-col>
    </el-row>
  </div>
</template>

<script>
export default {
  name: "Index",
  data() {
    return {
      // 版本号
      version: "1.0.0",
    };
  },
  methods: {
    goTarget(href) {
      window.open(href, "_blank");
    },
  },
};
</script>

<style scoped lang="scss">
.home {
  blockquote {
    padding: 10px 20px;
    margin: 0 0 20px;
    font-size: 17.5px;
    border-left: 5px solid #eee;
  }
  hr {
    margin-top: 20px;
    margin-bottom: 20px;
    border: 0;
    border-top: 1px solid #eee;
  }
  .col-item {
    margin-bottom: 20px;
  }

  ul {
    padding: 0;
    margin: 0;
  }

  font-family: "open sans", "Helvetica Neue", Helvetica, Arial, sans-serif;
  font-size: 13px;
  color: #676a6c;
  overflow-x: hidden;

  ul {
    list-style-type: none;
  }

  h4 {
    margin-top: 0px;
  }

  h2 {
    margin-top: 10px;
    font-size: 26px;
    font-weight: 100;
  }

  p {
    margin-top: 10px;

    b {
      font-weight: 700;
    }
  }

  .update-log {
    ol {
      display: block;
      list-style-type: decimal;
      margin-block-start: 1em;
      margin-block-end: 1em;
      margin-inline-start: 0;
      margin-inline-end: 0;
      padding-inline-start: 40px;
    }
  }
}
</style>
