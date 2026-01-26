import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.setProperty("file.encoding", "UTF-8");
        TodoList myTodoList = new TodoList();
        Scanner scanner = new Scanner(System.in);
        String command;
        
        System.out.println("欢迎使用命令行待办事项列表！");
        
        while (true) {
            System.out.println("\n请选择操作：");
            System.out.println("  add    - 添加任务");
            System.out.println("  list   - 列出所有任务");
            System.out.println("  toggle - 标记/取消任务");
            System.out.println("  remove - 删除任务");
            System.out.println("  quit   - 退出程序");
            System.out.print("请输入命令: ");
            
            command = scanner.nextLine().trim().toLowerCase();
            
            switch (command) {
                case "add":
                    System.out.print("请输入任务描述: ");
                    String description = scanner.nextLine();
                    myTodoList.addItem(description);
                    break;
                    
                case "list":
                    myTodoList.listItems();
                    break;
                    
                case "toggle":
                    System.out.print("请输入要标记/取消的任务序号: ");
                    try {
                        int toggleIndex = Integer.parseInt(scanner.nextLine());
                        myTodoList.toggleItem(toggleIndex);
                    } catch (NumberFormatException e) {
                        System.out.println("错误：请输入有效的数字序号！");
                    }
                    break;
                    
                case "remove":
                    System.out.print("请输入要删除的任务序号: ");
                    try {
                        int removeIndex = Integer.parseInt(scanner.nextLine());
                        myTodoList.removeItem(removeIndex);
                    } catch (NumberFormatException e) {
                        System.out.println("错误：请输入有效的数字序号！");
                    }
                    break;
                    
                case "quit":
                    System.out.println("感谢使用，再见！");
                    scanner.close();
                    return;
                    
                default:
                    System.out.println("未知命令，请重新输入。");
            }
        }
    }
}