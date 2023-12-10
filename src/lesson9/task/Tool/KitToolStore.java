package task.Tool;

import java.util.Arrays;

public class KitToolStore {

    KitTool[] KitToolStore = new KitTool[3];

    public KitToolStore(KitTool KitTool1, KitTool KitTool2, KitTool KitTool3){

        KitToolStore [0] = KitTool1;
        KitToolStore [1] = KitTool2;
        KitToolStore [2] = KitTool3;


    }

    public KitToolStore(KitTool[] KitToolStore) {
        this.KitToolStore = KitToolStore;
    }

    public void setSetToolStore(KitTool[] setToolStore) {
        KitToolStore = setToolStore;
    }

    public KitTool[] getSetToolStore() {
        return KitToolStore;
    }

    @Override
    public String toString() {
        return "SetToolStore{" +
                "SetToolStore=" + Arrays.toString(KitToolStore) +
                '}';
    }
}
