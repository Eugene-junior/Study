package task.Tool;

public class StoreApp {
    public static void main(String[] args) {

  ToolStore repository = new ToolStore();

  KitTool setTool1 = new KitTool(repository.getToolStore()[0],repository.getToolStore()[1] );
  KitTool setTool2 = new KitTool(repository.getToolStore()[2],repository.getToolStore()[3] );
  KitTool setTool3 = new KitTool(repository.getToolStore()[4],repository.getToolStore()[5] );

  KitToolStore set = new KitToolStore(setTool1, setTool2, setTool3);

        for (int i = 0; i < set.KitToolStore.length; i++) {
            System.out.println("Set " + i + ":");
            KitTool details = set.getSetToolStore()[i];
            Tool toolFromSet1 = details.getKitTool()[0];
            Tool toolFromSet2 = details.getKitTool()[1];
            System.out.println("First tool from our set: " + toolFromSet1.getToolName());
            System.out.println("Second tool from our set: " + toolFromSet2.getToolName());
            System.out.println("===============================");



        }



    }




}
