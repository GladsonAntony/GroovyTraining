package Examples

import org.testng.annotations.Test


class Test3_Loops
{

    @Test
    public void testTimes() throws Exception
    {
        10.times
                {
                    println '*'
                }
    }

    @Test
    public void testUpto() throws Exception
    {
        1.upto(10)
                {
                    num -> println num
                }
    }

    @Test
    public void testDownto() throws Exception
    {
        10.downto(1)
                {
                    num -> println num
                }
    }

    @Test
    public void testStep() throws Exception
    {
        1.step(2,0.1)
                {
                    num -> println num
                }
    }

}