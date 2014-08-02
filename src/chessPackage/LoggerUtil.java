package chessPackage;

import java.io.IOException;
import java.io.OutputStream;
import java.util.Date;
import java.util.logging.ConsoleHandler;
import java.util.logging.FileHandler;
import java.util.logging.Formatter;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.LogManager;
import java.util.logging.LogRecord;

class StdoutConsoleHandler extends ConsoleHandler {
	  protected void setOutputStream(OutputStream out) throws SecurityException {
	    super.setOutputStream(System.out);
	  }
	}

public class LoggerUtil {

	   static public void setup() throws IOException {

		 Chess.LOGGER.setUseParentHandlers(false);
	     Chess.LOGGER.setLevel(Level.ALL);
	   
	     Formatter formatter = new Formatter() {

	            @Override
	            public String format(LogRecord arg0) {
	                StringBuilder b = new StringBuilder();
	                b.append(new Date());
	                b.append(" ");
	          
	                b.append(arg0.getSourceClassName());
	                b.append(" ");
	                b.append(arg0.getSourceMethodName());
	                b.append(" | ");
	                b.append(arg0.getLevel());
	               
	                b.append(" | ");
	                b.append(arg0.getMessage());
	                if(arg0.getLevel().intValue() == 500){
	                	b.append(" | FINE |");
	                }
	                b.append(System.getProperty("line.separator"));
	             
	                return b.toString();
	            }
	        };
       
	        Handler fh = new FileHandler(Chess.class.getName() + ".log");
	        fh.setFormatter(formatter);
	        Chess.LOGGER.addHandler(fh);
	        
	        Handler ch = new StdoutConsoleHandler();
	       
	        ch.setLevel(Level.FINEST);
	        ch.setFormatter(formatter);
	        Chess.LOGGER.addHandler(ch);
	        
	        Chess.LOGGER.setLevel(Level.FINEST);

	        LogManager lm = LogManager.getLogManager();
	        lm.addLogger(Chess.LOGGER);
	   }
}