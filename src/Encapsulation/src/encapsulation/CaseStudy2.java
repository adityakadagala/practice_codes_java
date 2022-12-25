package encapsulation;

class StdDetails
{
    private int stdSerialNo, stdAge;
    private String stdName;

    int getStdSerialNo()
    {
        return stdSerialNo;
    }
    void setStdSerialNo(int stdSerialNo)
    {
        this.stdSerialNo=stdSerialNo;
    }
    String getStdName()
    {
        return stdName;
    }
    void setStdName( String stdName)
    {
        this.stdName= stdName;
    }
    int getStdAge()
    {
        return stdAge;
    }
    void setStdAge(int StdAge)
    {
        this.stdAge= stdAge;
    }
}

public class CaseStudy2 {
    public static void main(String[] args) {
        StdDetails obj=new StdDetails();
        obj.setStdSerialNo(213421);
        System.out.println(obj.getStdSerialNo());
        obj.setStdName("Vijay");
        System.out.println(obj.getStdName());
        obj.setStdAge(20);
        System.out.println(obj.getStdAge());
    }
}