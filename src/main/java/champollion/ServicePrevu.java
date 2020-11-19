package champollion;

public class ServicePrevu 
{ 
    private final int volumeTD;
    private final int volumeTP;
    private final int volumeCM;
    private final UE ue; 
  

    public ServicePrevu(int volumeTD,int volumeTP,int volumeCM,UE ue)
    {  this.volumeTD= volumeTD;
       this.volumeCM = volumeCM;
       this.volumeTP = volumeTP;
       this.ue = ue;
    }
    
    public int getvolumeCM()
    {  return volumeCM;
    }

    public int getvolumeTD()
    {  return volumeTD;
    }

    public int getvolumeTP()
    {  return volumeTP;
    }
    
    public UE getue()
    {   return ue;
    } 
}
