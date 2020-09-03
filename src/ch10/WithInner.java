package ch10;

import com.sun.org.apache.xpath.internal.SourceTree;

/**
 * @Auther:baijinzhou
 * @Date:2020/9/2 14:20
 * @Description:
 */
public class WithInner {
    class Inner{
        @Override
        public String toString() {
            return "Inner{}";
        }
    }
}
