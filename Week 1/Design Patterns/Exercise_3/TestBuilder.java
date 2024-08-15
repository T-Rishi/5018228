package com.mycompany.builder;


public class TestBuilder {
    
    public static void main (String  args[])
    {
        Computer ProfessionalPC = new Computer.Builder()
                .setCPU("Intel i5")
                .setRAM("16 GB")
               .setStorage("1 TB")
                        .build();
        
        
        System.out.println("---System Configurations---");
        System.out.println("CPU: "+ProfessionalPC.getCPU());
        System.out.println("RAM: "+ProfessionalPC.getRAM());
        System.out.println("Storage: "+ProfessionalPC.getStorage());
    }
    
}
