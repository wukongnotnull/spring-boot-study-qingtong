<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>首页</title>
</head>
<body>
<h1>标题：悟空非空也</h1>
<#-- 插值 jsp  黄金时期 -->
<h2>用户名为 ${name}</h2>
<#-- 选择结构 -->
<p>
    你好，
    <#if name=="悟空非空也">
        <h3>我是h3 的 ${name}</h3>
    <#elseif name == "wukongnotnull">
        <h4>我是h4 的 ${name}</h4>
    <#else>
        <h5> 我是h5 的 ${name}</h5>
    </#if>

<#-- 循环遍历用户信息-->
<#--第一种方式-->
<#--<ol>
    <#list userList as user2>
          <li>用户名为 ${user2.username},年龄为 ${user2.age}</li>
    </#list>

</ol>-->

<#-- 第二种方式 -->
<#list userList>
    <ol>
        <#items as user2 >
             <li>用户名为 ${user2.username},年龄为 ${user2.age}</li>
        </#items>
    </ol>

</#list>


</body>
</html>