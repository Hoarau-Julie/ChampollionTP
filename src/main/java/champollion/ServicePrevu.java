package champollion;

public class ServicePrevu 
{ 
    private final int volumeTD;
    private final int volumeTP;
    private final int volumeCM;
    private final UE ue; 
    private final Enseignant Enseignant;
  

    public ServicePrevu(int volumeTD,int volumeTP,int volumeCM,UE ue,Enseignant Enseignant)
    {  this.volumeTD= volumeTD;
       this.volumeCM = volumeCM;
       this.volumeTP = volumeTP;
       this.ue = ue;
       this.Enseignant = Enseignant;
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
    public Enseignant getEnseignant()
    {   return Enseignant;
    } 
}

