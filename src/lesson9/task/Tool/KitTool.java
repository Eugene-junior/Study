package task.Tool;

import java.util.Arrays;

public class KitTool {


    Tool [] KitTool = new Tool [2];

     public KitTool(Tool tool1, Tool tool2){
         KitTool[0] = tool1;
         KitTool[1] = tool2;
     }

    public Tool[] getKitTool() {
        return KitTool;
    }

    @Override
    public String toString() {
        return "SetTool{" +
                "setTool=" + Arrays.toString(KitTool) +
                '}';
    }
}

