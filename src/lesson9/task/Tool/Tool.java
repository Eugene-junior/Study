package task.Tool;

public class Tool {

    private int id;
    private String toolName;
    private double price;

    public Tool(int id, String toolName, Double price) {
        this.id = id;
        this.toolName = toolName;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public String getToolName() {
        return toolName;
    }

    public Double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Tool{" +
                "id=" + id +
                ", toolName='" + toolName + '\'' +
                ", price=" + price +
                '}';
    }
}















