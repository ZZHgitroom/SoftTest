import java.util.*;
public class Salary {
    private final int hour = 0;
    private final int money= 30;
    private final int base_salary =2000;
    private final int vacation = 3;
    private final double sum = 0;
    public static double cal_salary(int hour, int money, int base_salary, int vacation, double sum) {


        System.out.print("请输入雇员的月工作时间(小时)：");
        Scanner console = new Scanner(System.in);
        hour = console.nextInt();
        System.out.print("1.短假 2.长假 3.不请假，请输入雇员的假期类型：");
        vacation = console.nextInt();
        if (hour >=176){
            if(hour<=192 ) {
                sum = hour*money+base_salary;
                System.out.println("雇员本月的工资为："+sum+"元");
            }
            else {
                if (hour <= 220) {
                    sum = 192 * money + (hour - 192) * money * 1.5+base_salary;
                    System.out.println("雇员本月的工资为：" + sum + "元");
                } else if(hour <= 260){
                    sum = 192 * money + 40 * money * 1.5 + (hour - 220) * money * 3+base_salary;
                    System.out.println("雇员本月的工资为：" + sum + "元");
                }else {
                    sum = 192 * money + 40 * money * 1.5 + 40 * money * 3+ (hour-260) * money * 0.5 +base_salary;
                    System.out.println("雇员本月的工资为：" + sum + "元,员工已超过最大加班时间，加班费减少");
                }
            }
        } else if(hour >= 144){
            if(vacation == 3){
                sum = hour*money + base_salary - (176- hour) * vacation;
                System.out.println("雇员无故缺勤,雇员本月的工资为："+sum+"元");
            }else{
                sum = hour * money+base_salary;
                System.out.println("雇员本月的工资为："+sum+"元");
            }
        }else if(hour >=120){
            if(vacation == 3){
                sum = hour*money + base_salary - (176- hour) * vacation;
                System.out.println("雇员无故缺勤,雇员本月的工资为："+sum+"元");
            }else if(vacation == 2){
                sum = hour*money+base_salary;
                System.out.println("雇员本月的工资为："+sum+"元");
            }else {
                sum = hour*money+base_salary-(144 -hour);
                System.out.println("雇员本月的工资为："+sum+"元");
            }
        }else if(hour >= 80){
            sum = hour*money+base_salary-5*hour;
            System.out.println("雇员无故缺勤,雇员本月的工资为："+sum+"元");
        }else if (hour >= 0){
            sum = hour*15+base_salary;
            System.out.println("雇员无故缺勤,雇员本月的工资为："+sum+"元");
        }
        else {
            System.out.println("输入的月工时有误，请重新输入！");
        }
        return sum;
    }
}
