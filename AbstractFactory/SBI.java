package AbstractFactory;

public class SBI implements Bank{
	 private final String BNAME;

     public SBI()
    {
            BNAME="SBI BANK";
    }

//  @override
    public String getBankName()
   {
              return BNAME;
    
   }
}
