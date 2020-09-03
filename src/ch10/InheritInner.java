package ch10;

import java.io.FilePermission;

/**
 * @Auther:baijinzhou
 * @Date:2020/9/2 14:19
 * @Description:
 */
public class InheritInner extends WithInner.Inner {
    InheritInner(WithInner wi){
        wi.super();
        System.out.println("hello");
    }

    public static void main(String[] args) {
        String myString="hello";
        WithInner wi=new WithInner();
        InheritInner ii=new InheritInner(wi);
        FilePermission fp=new FilePermission(myString);
    }
}
