import java.util.ArrayList;
import java.util.List;

public class TodoList {
    // 使用List接口，而不是具体的ArrayList
    private List<TodoItem> items;
    
    public TodoList() {
        items = new ArrayList<>();
    }
    
    // 1. 添加任务
    public void addItem(String description) {
        TodoItem newItem = new TodoItem(description);
        items.add(newItem);
        System.out.println("任务已添加: " + description);
    }
    
    // 2. 查看所有任务
    public void listItems() {
        if (items.isEmpty()) {
            System.out.println("当前没有待办事项。");
        } else {
            System.out.println("--- 待办事项列表 ---");
            for (int i = 0; i < items.size(); i++) {
                System.out.println((i + 1) + ". " + items.get(i));
            }
            System.out.println("-------------------");
        }
    }
    
    // 3. 标记任务为完成（或取消完成）
    public void toggleItem(int index) {
        if (index >= 1 && index <= items.size()) {
            TodoItem item = items.get(index - 1);
            item.setCompleted(!item.isCompleted());
            String status = item.isCompleted() ? "已完成" : "未完成";
            System.out.println("任务 '" + item.getDescription() + "' 状态已更新为: " + status);
        } else {
            System.out.println("错误：无效的任务序号！");
        }
    }
    
    // 4. 删除任务
    public void removeItem(int index) {
        if (index >= 1 && index <= items.size()) {
            TodoItem removedItem = items.remove(index - 1);
            System.out.println("任务已删除: " + removedItem.getDescription());
        } else {
            System.out.println("错误：无效的任务序号！");
        }
    }
}