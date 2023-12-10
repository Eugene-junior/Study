package task.Tool;

import java.util.Arrays;

public class ToolStore {

    Tool [] ToolStore;

    public ToolStore (){
        ToolStore = new Tool [6];
        ToolStore[0] = new Tool(1, "Drill", 25.0);
        ToolStore[1] = new Tool(2, "Saw", 18.0);
        ToolStore[2] = new Tool(3, "Screwdriver", 6.0);
        ToolStore[3] = new Tool(4, "Knife", 3.0);
        ToolStore[4] = new Tool(5, "Hummer", 7.0);
        ToolStore[5] = new Tool(6, "Roulette", 2.0);

         }

    public Tool[] getToolStore() {
        return ToolStore;
    }

    @Override
    public String toString() {
        return "ToolStore{" +
                "ToolStore=" + Arrays.toString(ToolStore) +
                '}';
    }
}

