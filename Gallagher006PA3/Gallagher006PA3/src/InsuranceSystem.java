import java.util.Calendar; 
import java.util.Scanner;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.File;
import java.util.ArrayList;
public class InsuranceSystem
{
 private static EarthquakeInsurance[] claims;
 private static Scanner input = new Scanner(System.in);
 private static Calendar dateTime = Calendar.getInstance();
 private static ArrayList<String> claimsReport = newArrayList<String>();
 private static String fileName = "";
 private static char cont;
 private static char correct;
public InsuranceSystem()
{
}

public static void processClaims()
{

  int size = 0, j = 0, k = 0;
  String suffix = "" , aClaim = "";
  System.out.printf("%nHow many claims will be filled? ");
  size = input.nextInt();
  input.nextLine();
  while(size <0)
  {
  System.out.printf("%nInvalid integer! Re-enter the number of claims to be files: ");
  size = input.nextInt();
  input.nextLine();
}
  claims = new EarthquakeInsurance[size];
  for(int i = 0; i < claims.length; i ++)
  {
    j = (i+1) % 10;
    k = (i+1) % 100;
    suffix = j ==1 && k != 11 ? "st" : j == 2 && k != 12 ? "nd" : j ==3 && k != 13 ? "rd" : "th";
    claims[i] = new EarthquakeInsurance();
    if(i>0)
    {
      System.out.printf("is this %d%s claim for"
                          +" that same property owner? 'Y' or 'N': ", i +1, suffix);
      cont = input.next().toLowerCase().charAt(0);
      if(cont =='n')
      {
        claims[i].setInsured();
      }
      else
      {
        claims[i].setInsured(claims[i].getInsured());
      }
    }
    else
    {
       claims[i].setInsured();
    }
      claims[i].setHomeinsVal();
      claims[i].setRichter();
      //input.nextLine();
      
      aClaim = String.format("%n%nPAYOUT FOR EARTHQUAKE DAMAGE"
                               +"%n%nHomeowner: %s"
                               + "%n%nDate:     %tD"
                               + "%nTime: %tr%n"
                               + "%n%-52s %4s $%,20.2f"
                               + "%nDeductible %47s %,20.2f"
                               + "%n%46s TOTAL %4s $%,20.2f%n" ,
                             claims[i].getInsured(), dateTime, dateTime,
                             claims[i].getMessage(), " ",
                             claims[i].getPayout(), " ",
                             claims[i].getDeductible(), " ",
                             " ", claims[i].getPayout() +
                             claims[i].getDeductible());
    
      claimsReport.add(aClaim);
    }
      for(String eachClaim : claimsReport)
      {
        System.out.print(eachClaim);
      }
    }

  
    
public static void writeClaimsRecords() throws IOexception
{
  String record = "";
  System.out.printf("%nEnter the file name for claims\' records (WARNING: This will erase a pre-exisitng file!")
  PrintWriter outputfile = new PrintWriter(filename);
  for(int i = 0; i < claims.length; i++)
  {
    record += String.format("%s, %f, %f%n", claims[i].getInsured().claims[i].getHomeInsVal().claims[i].getRichter();
 //Something goes here//                                            
}
}
 public static void checkInputFile() throws IOException
 {
   File file;
   Scanner inputFile
   string fileRecord = "";
   System.out.printf("%nEnter the name for the claims\' file: ");
   fileName = input.nextLine();
   file = new File(fileName);
   inputFile = new Scanner(file);
 while(inputFile.hasNext())
 {
   fileRecord = inputFile.nextLine();
     System.out.printf(fileRecord + "%n");
 }
System.out.printf("%n");
   inputfile.close();
 }

 public static void printThankYou()
 {
   System.out.printf("%nThank you for using the Earthquake Coverage Analyzer. %n");
  }

 public static void start() throws Exception
 {
   System.out.printf("%nMUTUALLY ACCIDENTAL, INC.%n%nDo you want an analysis of earthquake coverage " 
                        + "for your property?  Enter \'Y\' or \'N\':  "); 
    cont = input.nextLine().toLowerCase().charAt(0);
    if(cont == 'N')
    {
      printthankYou();
    }
    else if (cont == 'Y')
    {
      processClaims();
      writeClaimsRecords();
      checkINputFile();
      printThankYou();
    }
 }
 }

                                                                                   
                                             
 
  