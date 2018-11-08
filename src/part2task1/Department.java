package part2task1;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Department
{
    private String depName;
    private Map<Integer, String> employeeMap = new HashMap<>();
    Integer index = 1;

    private class Employee
    {
        String position, fullName;

        Employee(String fullName, String position)
        {
            this.position = position;
            this.fullName = fullName;
        }

        @Override
        public String toString()
        {
            return fullName + " " + position;
        }
    }

    public void addEmplyee(String fullName, String position)
    {
        Employee employee = new Employee(fullName, position);
        this.employeeMap.put(index, employee.toString());
        index++;
    }


    public String getEmployee()
    {
        String[] str = new String[employeeMap.size()];
        int index = 1;
        for (int i = 0; i < employeeMap.size(); i++)
        {
            str[i] = employeeMap.get(index);
            index++;
        }
        return Arrays.toString(str);
    }

    public String getDepName()
    {
        return depName;
    }

    public void setDepName(String depName)
    {
        this.depName = depName;
    }
}
