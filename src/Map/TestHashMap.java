package Map;

import java.util.HashMap;
import java.util.Set;

/**
 * @Auther:baijinzhou
 * @Date:2020/8/30 18:14
 * @Description:
 */
public class TestHashMap {
    public static void main(String[] args) {
        show01();
    }

        private static void show01() {
            //创建HashMap集合
            HashMap<String,Person> map = new HashMap<>();
            //往集合中添加元素
            map.put("北京",new Person("张三",18));
            map.put("上海",new Person("李四",19));
            map.put("广州",new Person("王五",20));
            map.put("北京",new Person("赵六",18));
            //使用keySet加增强for遍历Map集合
            Set<String> set = map.keySet();
            for (String key : set) {
                Person value = map.get(key);
                System.out.println(key+"-->"+value);
            }
        }


}
