<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<html>
<head>
<title>사용자 등록</title>

<!-- 
          정적자원들은 resources 폴더에 저장
	 현재 프로젝트명에서 user 경로를 더한 상태이기에 상위경로를 올라갔다가 resources를 찾음.
 -->

<link rel="stylesheet" href="../resources/style/stylecss.css" type="text/css">
<script type="text/javascript" src="../resources/js/jquery-1.7.1.js"></script>
<script  src="../resources/js/js_userinput.js"></script>
</head>



<body bgcolor="#FFFFFF">

<table class='table1'>
  <tr bgcolor="#3399CC"> 
    <td height="30" class="normalbold"><font color="#FFFFFF">사용자 정보입력</font></td>
  </tr>
  <tr>
    <td>안녕하세요. 우리 홈페이지를 자유롭게 이용하려면 회원가입을 하셔야 합니다.<br>
      아래의 사항들을 빠짐없이 기록해 주세요.</td>
  </tr>
</table>

<form method="post" action="userInsert.do" name="userinput" id="userinput">
  <table class='table2'>
    <tr> 
      <td class="normalbold tb_ttl"> 
        <div align="center">사용자 ID</div>
      </td>
      <td colspan="3" class="normal"> 
        <input type="text" name="userId" id="userId" size="20"> 
        <span id="idCheckResult" style="width:150px;color:red"></span>
      </td>
    </tr>
    <tr> 
      <td class="normalbold tb_ttl">
        <div align="center">비밀번호</div>
      </td>
      <td width="154" class="normal"> 
        <input type="password" name="userPass" id="userPass">
      </td>
      <td class="normalbold tb_ttl"> 
        <div align="center">비밀번호 확인</div>
      </td>
      <td width="160"> 
        <input type="password" name="userPass2" id="userPass2">
      </td>
    </tr>
    <tr> 
      <td class="normalbold tb_ttl"> 
        <div align="center">사용자 이름</div>
      </td>
      <td colspan="3" height="23" class="normal"> 
        <input type="text" name="userName" id="userName">
      </td>
    </tr>
    <tr>
      <td colspan="4" class="normal"> 
        <div align="center"> 
          <input type="button" name="confirm" id="confirm" value="등   록">
          <input type="reset" name="reset" value="취   소">
        </div>
      </td>
    </tr>
  </table>
</form>

</body>
</html>
