package Examples

import org.testng.annotations.Test

class Test2_DataTypeConversion
{

    @Test
    public void testTypeConversion1() throws Exception
    {
        def a = 2.5
        a.toBigInteger();
        print(a.class.getName())
    }

    @Test
    public void testTypeConversion2() throws Exception
    {
        int a = 4
        def b = a.toString()
        print(b.class.getName())
    }

}
