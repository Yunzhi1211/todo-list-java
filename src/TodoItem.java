public class TodoItem {
    // 1. 定义属性（成员变量）
    private String description; // 任务描述
    private boolean isCompleted; // 完成状态（true表示完成，false未完成）

    // 2. 构造方法：用于创建新的TodoItem对象
    public TodoItem(String description) {
        this.description = description;
        this.isCompleted = false; // 新任务默认未完成
    }

    // 3. Getter和Setter方法：用于外部安全地访问和修改私有属性
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isCompleted() {
        return isCompleted;
    }

    public void setCompleted(boolean completed) {
        isCompleted = completed;
    }

    // 4. 重写toString方法：定制对象被打印时的格式
    @Override
    public String toString() {
        // 例如：[ ] 买牛奶  或 [✓] 写报告
        String status = isCompleted ? "[x]" : "[ ]";
        return status + " " + description;
    
    }
}