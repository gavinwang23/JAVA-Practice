package wjw;

public class Exception7 {
    public static void main(String[] args) {
        
        Cat c1=null ;
        try{
        c1=new Cat("小喵",-2,true);
        }catch(IllegalAgeException e){
            System.out.println("输入的年龄非法！异常的原因是："+e.getMessage());
        }
        System.out.println(c1);
        
    }

}
//定义一个异常类
class IllegalAgeException extends Exception{
    public IllegalAgeException(){
        
    }
     public IllegalAgeException(String Message){
        super(Message);
        
    }
}
//定义一个Cat类
class Cat{
        
    private String name;
    private int age;
    private boolean SEX;
    public Cat() {
        
    }
    public Cat(String name, int age, boolean sEX) throws IllegalAgeException {
        this.name = name;
        if(age<0){
            throw new IllegalAgeException("给定的年龄"+age+"是非法的！");
        }
        this.age = age;
        SEX = sEX;
    }
    public String toString(){
        return " "+name+" "+age+" "+(SEX?"公":"母");
    }
    
    
    
    
}
