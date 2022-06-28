/**
 * 
 */
package stringoperation;

/**
 * @author Nasim Hasan
 *
 */
public class StringOp {
	
	StringStr objstr= new StringStr();
	
    public StringOp()
	{
		
	}
	
	public int getlength(String arg)
	{
		return objstr.lengthvalue(arg);
		
	}
	
	public String getconcat(String arg1, String arg2)
	{
		return objstr.concatvalue(arg1, arg2);
	}

}
