public class CloneBug implements Cloneable{


    CloneBug(){

    }

    public Object clone(String accountnumber) //clone not final
    {
        return new CloneBug();
    }
}


