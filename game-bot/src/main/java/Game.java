import org.telegram.telegrambots.api.methods.send.SendMessage;
import org.telegram.telegrambots.api.objects.Update;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.exceptions.TelegramApiException;
import java.util.Random;

public class Game extends TelegramLongPollingBot {
		String result="";
		String resultt="";
		String resulttt="";
		String[] tos= {"HEAD","TAIL"};
		String[] rol= {"1","2","3","4","5","6"};
		String[] arr= {"1" , "3" , "5"};
		String[] ar= {"2" , "4" , "6"};
		String[] cric= {"DOT BALL","1","2","3","4","6","WIDE","WICKET"};
		int i;
		
		Random r=new Random();
	
		public String odd()
		{
			resultt=arr[r.nextInt(arr.length)];
			return resultt;
		}
		
		public String even()
		{
			resultt=ar[r.nextInt(ar.length)];
			return resultt;
		}
		
		
	
        public void onUpdateReceived(Update update) {

            String command=update.getMessage().getText();
            
            SendMessage message = new SendMessage();
            System.out.println(update.getMessage().getFrom().getFirstName() );
            if (command.equals("/toss") || command.equals("/dice") || command.equals("/ball 01") || command.equals("/ball 02") || command.equals("/ball 03") || command.equals("/ball 04") || command.equals("/ball 05") || command.equals("/ball 06")  && !update.getMessage().getFrom().getFirstName().equals("Harsh") && !update.getMessage().getFrom().getFirstName().equals("Tinku"))
            {
            	message.setText("ONLY ADMIN CAN GIVE COMMAND!!!!!!");
            }
            if (update.getMessage().getFrom().getFirstName().equals("Harsh") || update.getMessage().getFrom().getFirstName().equals("Tinku"))
            {
	            if (command.equals("50 head") || command.equals("100 head")|| command.equals("150 head")|| command.equals("200 head") || command.equals("250 head") || command.equals("300 head") || command.equals("350 head") || command.equals("400 head") || command.equals("450 head") || command.equals("500 head") || command.equals("550 head") || command.equals("600 head") || command.equals("650 head") || command.equals("700 head") || command.equals("750 head") || command.equals("800 head") || command.equals("850 head") || command.equals("900 head") || command.equals("950 head") || command.equals("1000 head")){
	            	
	            	result="tail";
	               
	            }
	            
	            if (command.equals("50 tail") || command.equals("100 tail")|| command.equals("150 tail")|| command.equals("200 tail") || command.equals("250 tail") || command.equals("300 tail") || command.equals("350 tail") || command.equals("400 tail") || command.equals("450 tail") || command.equals("500 tail") || command.equals("550 tail") || command.equals("600 tail") || command.equals("650 tail") || command.equals("700 tail") || command.equals("750 tail") || command.equals("800 tail") || command.equals("850 tail") || command.equals("900 tail") || command.equals("950 tail") || command.equals("1000 tail")){
	            	
	            	result="head";
	               
	            }
	            
	            if (command.equals("50 odd") || command.equals("100 odd")|| command.equals("150 odd")|| command.equals("200 odd") || command.equals("250 odd") || command.equals("300 odd") || command.equals("350 odd") || command.equals("400 odd") || command.equals("450 odd") || command.equals("500 odd") || command.equals("550 odd") || command.equals("600 odd") || command.equals("650 odd") || command.equals("700 odd") || command.equals("750 odd") || command.equals("800 odd") || command.equals("850 odd") || command.equals("900 odd") || command.equals("950 odd") || command.equals("1000 odd")){
	            	
	            	resultt=even();
	            }
	            
	            if (command.equals("50 even") || command.equals("100 even")|| command.equals("150 even")|| command.equals("200 even") || command.equals("250 even") || command.equals("300 even") || command.equals("350 even") || command.equals("400 even") || command.equals("450 even") || command.equals("500 even") || command.equals("550 even") || command.equals("600 even") || command.equals("650 even") || command.equals("700 even") || command.equals("750 even") || command.equals("800 even") || command.equals("850 even") || command.equals("900 even") || command.equals("950 even") || command.equals("1000 even")){
	            	
	            	result=odd();
	               
	            }
	            
		            if (command.equals("/toss") && result.equals("")){
		            	result=tos[r.nextInt(tos.length)];
		            	System.out.println(result);
			            message.setText(result);
			            result="";
		            }
		            if (command.equals("/toss") && result.equals("head")){
		                System.out.println("HEADS");
		                message.setText("HEADS");
		                result="";
		            }
		
		            if (command.equals("/toss") && result.equals("tail")){
		                System.out.println("TAILS");
		                message.setText("TAILS");
		                result="";
		            }
		            
		            if (command.equals("/dice") && resultt.equals("")){
		            	resultt=rol[r.nextInt(rol.length)];
		            	System.out.println(resultt);
			            message.setText(resultt);
			            resultt="";
		            }
		            
		            if (command.equals("/dice") && (resultt.equals("1") || resultt.equals("3") || resultt.equals("5"))){
		                System.out.println(resultt);
		                message.setText(resultt);
		                resultt="";
		            }
		            
		            if (command.equals("/dice") && (resultt.equals("2") || resultt.equals("4") || resultt.equals("6"))){
		                System.out.println(resultt);
		                message.setText(resultt);
		                resultt="";
		            }
		            
		            if (command.equals("/ball 01"))
		            {	
		            	resulttt=cric[r.nextInt(cric.length)];
		            	if(resulttt.equals("WICKET"))
		            	{
		            		resulttt=cric[r.nextInt(cric.length)];
		            	}
		            	if(resulttt.equals("WICKET"))
		            	{
		            		resulttt=cric[r.nextInt(cric.length)];
		            	}
		            	System.out.println(resulttt);	            	
			            message.setText("BALL 0.1//SCORE -: "+resulttt);
		            }
		            if (command.equals("/ball 02"))
		            {	
		            	resulttt=cric[r.nextInt(cric.length)];
		            	if(resulttt.equals("WICKET"))
		            	{
		            		resulttt=cric[r.nextInt(cric.length)];
		            	}
		            	if(resulttt.equals("WICKET"))
		            	{
		            		resulttt=cric[r.nextInt(cric.length)];
		            	}
		            	System.out.println(resulttt);
			            message.setText("BALL 0.2//SCORE -: "+resulttt);
		            }
		            if (command.equals("/ball 03"))
		            {	
		            	resulttt=cric[r.nextInt(cric.length)];
		            	if(resulttt.equals("WICKET"))
		            	{
		            		resulttt=cric[r.nextInt(cric.length)];
		            	}
		            	if(resulttt.equals("WICKET"))
		            	{
		            		resulttt=cric[r.nextInt(cric.length)];
		            	}
		            	System.out.println(resulttt);
			            message.setText("BALL 0.3//SCORE -: "+resulttt);
		            }
		            if (command.equals("/ball 04"))
		            {	
		            	resulttt=cric[r.nextInt(cric.length)];
		            	if(resulttt.equals("WICKET"))
		            	{
		            		resulttt=cric[r.nextInt(cric.length)];
		            	}
		            	if(resulttt.equals("WICKET"))
		            	{
		            		resulttt=cric[r.nextInt(cric.length)];
		            	}
		            	System.out.println(resulttt);
			            message.setText("BALL 0.4//SCORE -: "+resulttt);
		            }
		            if (command.equals("/ball 05"))
		            {	
		            	resulttt=cric[r.nextInt(cric.length)];
		            	if(resulttt.equals("WICKET"))
		            	{
		            		resulttt=cric[r.nextInt(cric.length)];
		            	}
		            	if(resulttt.equals("WICKET"))
		            	{
		            		resulttt=cric[r.nextInt(cric.length)];
		            	}
		            	System.out.println(resulttt);
			            message.setText("BALL 0.5//SCORE -: "+resulttt);
		            }
		            if (command.equals("/ball 06"))
		            {	
		            	resulttt=cric[r.nextInt(cric.length)];
		            	if(resulttt.equals("WICKET"))
		            	{
		            		resulttt=cric[r.nextInt(cric.length)];
		            	}
		            	if(resulttt.equals("WICKET"))
		            	{
		            		resulttt=cric[r.nextInt(cric.length)];
		            	}
		            	System.out.println(resulttt);
			            message.setText("BALL 0.6//SCORE -: "+resulttt);
		            }
		 
            }
            
            message.setChatId(update.getMessage().getChatId());


            try {
                execute(message);
            } catch (TelegramApiException e) {
                e.printStackTrace();
            }


        }

        public String getBotUsername() {
            return "Gamezone123_bot";
        }

        public String getBotToken() {
            return "1142119657:AAEeNbrRoik4qtbbxz_0xNsEO6F2vdIPWqc";
        }
    }
