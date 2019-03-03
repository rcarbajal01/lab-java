package sts;

import java.io.*;
import java.util.*;
import java.util.logging.*;

public class Test6 {

  public static void main(String... args) {
    //create a Serializable List
    List<String> quarks = (List<String>) Arrays.asList(
      "up", "down", "strange", "charm", "top", "bottom"
    );

    //serialize the List
    //note the use of abstract base class references

    try{
      //use buffering
      OutputStream file = new FileOutputStream("quarks.ser");
      OutputStream buffer = new BufferedOutputStream(file);
      ObjectOutput output = new ObjectOutputStream(buffer);
      try{
        output.writeObject(quarks);
      }
      finally{
        output.close();
      }
    }  
    catch(IOException ex){
      logger.log(Level.SEVERE, "Cannot perform output.", ex);
    }

    //deserialize the quarks.ser file
    //note the use of abstract base class references
    
    try{
      //use buffering
      InputStream file = new FileInputStream("quarks.ser");
      InputStream buffer = new BufferedInputStream(file);
      ObjectInput input = new ObjectInputStream (buffer);
      try{
        //deserialize the List
        List<String> recoveredQuarks = (List<String>)input.readObject();
        //display its data
        for(String quark: recoveredQuarks){
          logger.info("Recovered Quark: " + quark);
        }
      }
      catch (Exception ex) {
    	  logger.log(Level.SEVERE, "Got exception when serializing", ex);
      }
      
    }
    catch(ClassNotFoundException ex){
      logger.log(Level.SEVERE, "Cannot perform input. Class not found.", ex);
    }
    catch(IOException ex){
      logger.log(Level.SEVERE, "Cannot perform input.", ex);
    }
  }

  private static final Logger logger =
    Logger.getLogger(Test6.class.getPackage().getName());
} 