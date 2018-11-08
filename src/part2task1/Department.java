package part2task1;

import java.util.ArrayList;

public class Department
{
    private String depName;
    private ArrayList<Employee> employeeMap = new ArrayList<>();

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
        this.employeeMap.add(employee);

    }

    public String getEmployees()
    {
        String str = "";

        for (int i = 0; i < employeeMap.size(); i++)
        {
            str = str + " " + employeeMap.get(i).toString();

        }
        return str;
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
