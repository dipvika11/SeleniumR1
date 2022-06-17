package comm.implimentation;
import static Common_Variables.Global_Variables.*;//cdriver globally declared variable
import static BDD_driversUtils.WebdriversUtils.getDriver;//get driver from this class
public class AppAccess {
	public static void accessapp()
	{
		if(cdriver==null || cdriver.toString().contains("null"));
		cdriver=getDriver();
		
		accessUrl();
	}
	public static void accessUrl()
	{
		cdriver.get("http://automationpractice.com/index.php?controller=authentication");
		
	}

}
