package com.bridgeit.utility;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.*;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class Utility2<DocterAppointmentModel>
{
	PrintWriter mWriter=new PrintWriter(System.out,true);
	String appointmentFile="/home/bridgeit/Json/appointment.json";
	JSONObject jsObject=new JSONObject();
	JSONArray jsonArray=new JSONArray();
	public static Scanner scanner;
	Scanner scan=new Scanner(System.in);

	public Utility2()
	{
		scanner=new Scanner(System.in);
	}
	public double doubleInput1() {
		try {
			return scanner.nextDouble();

		} catch (Exception e) {

		}
		return 0;
	}
	public int IntegerInput() {
		try {
			return scanner.nextInt();

		} catch (Exception e) {

		}
		return 0;
	}public String StringInput() {
		try {
			return scanner.next();

		} catch (Exception e) {

		}
		return "";
	}
	public String StringLineInput() {
		try {
			return scanner.nextLine();

		} catch (Exception e) {

		}
		return "";}public long dInput() {
			try {
				return scanner.nextLong();

			} catch (Exception e) {

			}
			return 0;
		}
		public boolean booleanInput() {
			try {
				return scanner.nextBoolean();

			} catch (Exception e) {

			}
			return false;
		}

		public Date stringToDate(String stringInput) throws java.text.ParseException {
			Date date1=new SimpleDateFormat("dd/MM/yyyy").parse(stringInput);  
			return date1;
		}
		JSONObject jsonObject=new JSONObject();
		
		@SuppressWarnings("unused")
		/*private void savingInfile(String file, ArrayList<String> arrData)
	            throws IOException 
		   {
	        FileWriter writer = new FileWriter(file + ".txt");
	        int size = arrData.size();
	        for (int i=0;i<size;i++)
	        {
	            String str = arrData.get(i).toString();
	            writer.write(str);
	            if(i < size-1)
	                writer.write("\n");
	        }
	        writer.close();
	    }*/
		
		/*public void savingInfile(ArrayList<DoctersModel> doctorList) throws IOException {
	    FileWriter fw=new FileWriter("/home/bridgeit/Json/DoctersList.json");
	    BufferedWriter bw=new BufferedWriter(fw);
		String s="";
		
		
		for(int i=0;i<doctorList.size();i++)
		{*/
	/*	 s=JSONValue.toJSONString(doctorList.get(i));	
		Object obj=(String) s;
		System.out.println("Object : "+obj);
		JSONObject object=(JSONObject)obj;*/
		/*	jsonObject=(JSONObject)JSONSerializer.toJson(mylist)
		System.out.println();*/
			/*JSONArray jsArray =new JSONArray();
			jsArray=(JSONArray)doctorList.get(i);*/
			
		 /*bw.write(jsonObject.toJSONString());
		
             Type type = new TypeToken<List<DoctersModel>>() {}.getType();
             String json = gson.toJson(doctorList, type);
             System.out.println(json);
		 System.out.println(doctorList.get(i));
	        String jsonNames = gson.toJson(doctorList.get(i).toString());
	        System.out.println("jsonNames = " + jsonNames);
*/
		//}
		//bw.close();	
		//}
		public void printMap(HashMap<DocterAppointmentModel, Integer> appoientment)
		{
			for (DocterAppointmentModel name: appoientment.keySet()){

				String key =name.toString();
				String value = appoientment.get(name).toString();  
				System.out.println(key + " " + value);  


			} 

		}
		
		@SuppressWarnings("unused")
		private JSONArray getCurrentObject() throws FileNotFoundException, IOException, ParseException {
			JSONParser jsonParser=new JSONParser();
			Object obj=jsonParser.parse(new FileReader(appointmentFile));
			JSONObject object=(JSONObject)obj;
			JSONArray jsonArray=(JSONArray)object.get("AppointMent");
			return jsonArray;
		}
		private void WritingIntoFile(JSONObject jsonObject2) throws IOException {
			FileWriter fileWriter=new FileWriter(appointmentFile);
			BufferedWriter bufferedWriter=new BufferedWriter(fileWriter);
			bufferedWriter.write(jsonObject.toJSONString());
			bufferedWriter.flush();
			
		}
}
