import java.util.*;

class LoginException extends Exception{
    public LoginException(){
        super();
    }
    public LoginException(String msg){
        super(msg);
    }
}

public class LoginTest{
    //定义 validateLogin() 方法，用于对用户名和密码进行验证
    public boolean validateLogin(String username,String pwd){
        boolean con=false;  //用户名密码师范正确
        boolean conUname=false; //用户名格式是否正确
        try{
            if(username.length()>=6&&username.length()<=10){
                for(int i=0;i<username.length();i++){
                    char ch=username.charAt(i); //获取每一个字符
                    if(ch>='0'&&ch<='9'){   //判断字符取值是否为0~9
                        conUname=true;
                    }else{
                        conUname=false; //字符不是0~9的数字，抛出自定义的LoginException
                        throw new LoginException("Undefined char in username");
                    }
                }
            }else{
                throw new LoginException("username is Out of length");
            }
            if(conUname){   //如果用户名格式正确，判断密码长度
                if(pwd.length()==6){
                    con=true;
                }else{
                    con=false;
                    throw new LoginException("password is Out of specification");
                }
            }
        }catch(LoginException e){
            //捕获LoginException
            System.out.println(e.getMessage());
        }
        return con;
    }

    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.println("username:");
        String username=input.next();
        System.out.println("password:");
        String pwd=input.next();
        LoginTest lt=new LoginTest();
        boolean con=lt.validateLogin(username,pwd);
        if(con){
            System.out.println("Login Successfully");
        }

    }
}


/*
 *[root@iZm5e211s4jw7g4w6pgezgZ bin]# java LoginTest 
username:
xiake8!
password:
123456
Undefined char
[root@iZm5e211s4jw7g4w6pgezgZ bin]# java LoginTest 
username:
administrator
password:
123456
Out of length
[root@iZm5e211s4jw7g4w6pgezgZ bin]# java LoginTest 
username:
20181024
password:
12345
Out of specification
[root@iZm5e211s4jw7g4w6pgezgZ bin]# java LoginTest 
username:
20181024
password:
123456
Login Successfully

 *
 * */
