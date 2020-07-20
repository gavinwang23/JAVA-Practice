package wjw;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Work {

	public static void main(String[] args) {
		String URL="jdbc:mysql://localhost:3306/wjw?useUnicode=true&characterEncoding=UTF-8";
		String NAME="root";
		String PASSWORD="863445607";
		
		Connection con = null;
		Statement st = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection(URL, NAME, PASSWORD);
			st=con.createStatement();
			
			ResultSet rs=st.executeQuery("SELECT * FROM EMP WHERE sal<2000 Order by sal ASC");
			System.out.println("低于2000的员工");
			System.out.println("姓名"+"\t"+"工作"+"\t"+"工资");
			while(rs.next()) {
				String ename=rs.getString(2);
				String job=rs.getString(3);
				int sal=rs.getInt(6);
				System.out.println(ename+"\t"+job+"\t"+sal);
			}
			
			ResultSet rs2=st.executeQuery("SELECT * FROM EMP LEFT JOIN dept on dept.deptno=EMP.deptno WHERE job='CLERK' ");
			System.out.println("工作是CLERK的员工");
			System.out.println("姓名"+"\t"+"工资"+"\t"+"部门号"+"\t"+"部门名"+"\t"+"部门地址");
			while(rs2.next()) {
				String ename=rs2.getString(2);
				int sal=rs2.getInt(6);
				int deptno=rs2.getInt(8);
				String dname=rs2.getString(10);
				String loc=rs2.getString(11);
				System.out.println(ename+"\t"+sal+"\t"+deptno+"\t"+dname+"\t"+loc);
			}
			
			ResultSet rs3=st.executeQuery("SELECT * FROM EMP WHERE sal>=2000");
			System.out.println("工资大于等于2000的员工");
			System.out.println("姓名"+"\t"+"经理名字");
			while(rs3.next()) {
				String ename=rs3.getString(2);
				String job=rs3.getString(3);
				int mgr=rs3.getInt(4);
				System.out.println(ename+"\t"+mgr);
			}
			
			ResultSet rs4=st.executeQuery("SELECT * FROM EMP WHERE sal>(select sal from EMP where ename='JONES')");
			System.out.println("工资高于JONES的员工");
			System.out.println("姓名"+"\t"+"工作"+"\t"+"工资");
			while(rs4.next()) {
				String ename=rs4.getString(2);
				String job=rs4.getString(3);
				int sal=rs4.getInt(6);
				System.out.println(ename+"\t"+job+"\t"+sal);
			}
			
			ResultSet rs5=st.executeQuery("SELECT * FROM EMP LEFT JOIN dept on dept.deptno=EMP.deptno WHERE dept.deptno is null ");
			System.out.println("没有对应部门表信息的所有雇员");
			System.out.println("姓名"+"\t"+"工作"+"\t"+"部门号");
			while(rs5.next()) {
				String ename=rs5.getString(2);
				String job=rs5.getString(3);
				int deptno=rs5.getInt(8);
				System.out.println(ename+"\t"+job+"\t"+deptno);
			}
			
			ResultSet rs6=st.executeQuery("SELECT * FROM EMP WHERE deptno in(select deptno from EMP where sal between 1000 and 3000)");
			System.out.println("低于2000的员工");
			System.out.println("姓名"+"\t"+"工作"+"\t"+"工资");
			while(rs6.next()) {
				String ename=rs6.getString(2);
				String job=rs6.getString(3);
				int sal=rs6.getInt(6);
				System.out.println(ename+"\t"+job+"\t"+sal);
			}
			
			ResultSet rs7=st.executeQuery("SELECT * FROM EMP WHERE (now()-hiredate)>24*365*24*60*60");
			System.out.println("超过24年的员工");
			System.out.println("姓名"+"\t"+"工作"+"\t"+"工资");
			while(rs7.next()) {
				String ename=rs7.getString(2);
				String job=rs7.getString(3);
				int sal=rs7.getInt(6);
				System.out.println(ename+"\t"+job+"\t"+sal);
			}
			
			ResultSet rs8=st.executeQuery("SELECT ename,DATE_FORMAT(hiredate,'%Y年%m月%d日 %H:%i:%s') FROM EMP");
			System.out.println("详细日期");
			System.out.println("姓名"+"\t"+"日期");
			while(rs8.next()) {
				String ename=rs8.getString(1);
				String hiredate=rs8.getString(2);
				System.out.println(ename+"\t"+hiredate);
			}
			
			ResultSet rs9=st.executeQuery("SELECT * FROM EMP LEFT JOIN dept on dept.deptno=EMP.deptno WHERE hiredate<DATE_FORMAT('1987-07-01','%Y-%m-%d')");
			System.out.println("1981年7月1日以前的员工");
			System.out.println("姓名"+"\t"+"工资"+"\t"+"部门");
			while(rs9.next()) {
				String ename=rs9.getString(2);
				int sal=rs9.getInt(6);
				String dname=rs9.getString(10);
				System.out.println(ename+"\t"+sal+"\t"+dname);
			}
			
			st.execute("insert into dept values(50,'MANAGEMENT','BEUING')");
			st.execute("update dept set loc='SHANGHAI' where deptno=50");
			
			
			con.close();
		} 
		catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
