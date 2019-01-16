package learn.jf.mypermission;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by jf on 2019/1/11.
 */

public class MyCache {

    private static Map<String,String[]> permissionMap=new HashMap<>();

    public void registPermission(String ruter,String[] permission){
        synchronized (permissionMap){
            if (permissionMap.containsKey(ruter)){
                permissionMap.remove(ruter);
            }
            permissionMap.put(ruter,permission);
        }
    }

    public String[] getPermission(String ruter){
        return permissionMap.get(ruter);
    }

}
