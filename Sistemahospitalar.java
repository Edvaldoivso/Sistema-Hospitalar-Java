
package sistemahospitalar;
import java.util.Scanner;
public class Sistemahospitalar {
    public static void main(String[] args) {
   
     
      usuario u1=new usuario();
      medicamento m1= new medicamento();
      medico d1=new medico();
      paciente p1=new paciente();
      
      Scanner en=new Scanner(System.in);
      Scanner in=new Scanner(System.in);
      Scanner rua=new Scanner(System.in);
      Scanner no=new Scanner(System.in);
      Scanner pr=new Scanner(System.in);
      
      
    int cadastrar=1;
    int consulta=2;        
    int receitar=3;
    int e;
    int s=1;
    int c=1;  
    
      
 
     while(s!=2){
      
      
    
    
    
    System.out.println("DIGITE SUA OPÇÃO");
    System.out.println("");
    System.out.println("1 PARA CADASTRAR USUÁRIO");
    System.out.println("");
    System.out.println("2 PARA  REALIZAR CONSULTA");
    System.out.println("");
    System.out.println("3 PARA RECEITAR MEDICAMENTO");
    System.out.println("");
    System.out.println("");
    System.out.println("");
    System.out.println("");
    System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------------");
  
    
   
    try{
    System.out.println("");
    System.out.println("");
    System.out.println("OPÇÃO NUMERO: "+(e=en.nextInt()));
    System.out.println("");
    System.out.println("");
    System.out.println("");
    if(e==1){
    
        //PARTE DE CADASTRO GERAL MEDICO PACIENTE FUNCIONARIO.
      
          
      System.out.println("Digite seu Nome");
      u1.setnome(in.nextLine());
      in.reset();
      
      
      
      try{
      System.out.println("Digite seu CPF ou CRM");
      double cpf=in.nextDouble();
     
      }catch( java.util.InputMismatchException exeption){
          System.out.println("");
          System.out.println("******OPS TIVEMOS UM ERRO RECOMECE O CADASTRO******");
          System.out.println("");
      
      }
      try{
      
      System.out.println("Digite sua Rua");
      u1.setRua(rua.nextLine());
    
      }catch( java.util.InputMismatchException exeption){
           System.out.println("TIVEMOS UM ERRO REINICIE O CADASTRO");
         break;
      
      }
      
      try{
      System.out.println("Digite seu numerdo de Casa");
      u1.setNumerocasa(in.nextFloat());
      
      }catch( java.util.InputMismatchException exeption){
          System.out.println("TIVEMOS UM ERRO REINICIE O CADASTRO");
         break;
      
      }
      
      try{
      System.out.println("Digite seu Telefone Fixo");
      u1.setTelefone(in.nextDouble());
     
      }catch( java.util.InputMismatchException exeption){
           System.out.println("TIVEMOS UM ERRO REINICIE O CADASTRO");
         break;
      
      }
      try{
      
      System.out.println("Digite seu Celular");
      u1.setCelular(in.nextDouble());
       
    }catch( java.util.InputMismatchException exeption){
           System.out.println("TIVEMOS UM ERRO REINICIE O CADASTRO");
         break;
      
      }
   
      System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------------"); 
   
    }if(e==2){

  //PARTE DE CRIAR CONSULTA
  
   System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------------");
  
   try{
   System.out.println("DIGITE SEU CRM");
    d1.setcrm(en.nextFloat());
    System.out.println("");
    
    }catch( java.util.InputMismatchException exeption){
           System.out.println("TIVEMOS UM ERRO REINICIE O CADASTRO");
         break;
    }
    
    try{
    System.out.println("NOME DO PACIENTE");
    u1.setNome(no.nextLine());
    System.out.println("");
    
    }catch( java.util.InputMismatchException exeption){
          System.out.println("TIVEMOS UM ERRO REINICIE O CADASTRO");
         break;
    }
          
    try{
    System.out.println("DIGITE A DROGA APLICADA");
    m1.setPrincipioativo(pr.nextLine());
    System.out.println("");
    
    }catch( java.util.InputMismatchException exeption){
          System.out.println("TIVEMOS UM ERRO REINICIE O CADASTRO");
         break;
    }
          
    try{
    System.out.println("PARECER TÉCNICO");
    p1.setParecer(no.nextLine());
    System.out.println("");
    }catch( java.util.InputMismatchException exeption){
          System.out.println("TIVEMOS UM ERRO REINICIE O CADASTRO");
         break;
    }
  
  
 System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------------");
    
    //PARTE DE RECEITAR MEDICAMENTO
    
   }else if(e==3){
   
        System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------------");
     try{
         
    System.out.println("DIGITE SEU CRM");
    
    d1.setcrm(en.nextFloat());
    
    System.out.println("");
    
    }catch( java.util.InputMismatchException exeption){
          System.out.println("TIVEMOS UM ERRO REINICIE O CADASTRO");
         break;
    }
     
     try{
          
    System.out.println("INFORME A PRESCRIÇÃO");
    
    m1.setPrescricao(no.nextLine());
    
    System.out.println("");
    
    }catch( java.util.InputMismatchException exeption){
           System.out.println("TIVEMOS UM ERRO REINICIE O CADASTRO");
         break;
    }
    
     try{
     
    System.out.println("INFORME A DOSAGEM");
    
    m1.setDosagem(en.nextFloat());
    
    System.out.println("");
    
    }catch( java.util.InputMismatchException exeption){
           System.out.println("TIVEMOS UM ERRO REINICIE O CADASTRO");
         break;
    }
    
     try{
     
    System.out.println("INFORME O PRINCIPIO ATIVO");
    
    m1.setPrincipioativo(rua.nextLine());
    
    
    }catch( java.util.InputMismatchException exeption){
          System.out.println("TIVEMOS UM ERRO REINICIE O CADASTRO");
         break;
    }
     
     try{
     
    System.out.print("EXAME VINCULADO:");
    
    p1.setexame(en.nextFloat());
    
    System.out.println("");
    
}catch( java.util.InputMismatchException exeption){
           System.out.println("TIVEMOS UM ERRO REINICIE O CADASTRO");
         break;
    }

    System.out.println("DADOS GRAVADOS COM SUCESSO  PRESCRIÇAO ENCAMINHADA");
   
   } 
    
   }catch(java.util.InputMismatchException exeption){
    
       System.out.println("DIGITE UMA OPÇÃO VÁLIDA POR FAVOR");
       break;
       
   }
   System.exit(0);
   System.out.println("");
   System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------------");
   System.out.println("");
   System.out.println("");
   System.out.println("DESEJA REALIZAR OUTRA ROTINA ");
   System.out.println("");
   System.out.println("SIM 1 ");
   System.out.println("");
   System.out.println("NÃO 2");  
   s=en.nextInt();
     }
     System.out.println("");
     System.out.println("");
     System.out.println("SISTEMA FINALIZADO!");
     
   
   
    }
}

     

      
    
     
       
    
      
       
   
    
    

    
        
    

    
    


       
    
