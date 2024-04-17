package Principal;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/*programa que pida nombre del club y muestre todos los jugadores del club*/
public class Ejer02 {
	/*
	public static void main(String[] args) {
	String linea="full_name,age,birthday,birthday_GMT,league,season,position,Club,minutes_played_overall,minutes_played_home,minutes_played_away,nationality,appearances_overall,appearances_home,appearances_away,goals_overall,goals_home,goals_away,assists_overall,assists_home,assists_away,penalty_goals,penalty_misses,clean_sheets_overall,clean_sheets_home,clean_sheets_away,conceded_overall,conceded_home,conceded_away,yellow_cards_overall,red_cards_overall,goals_involved_per_90_overall,assists_per_90_overall,goals_per_90_overall,goals_per_90_home,goals_per_90_away,min_per_goal_overall,conceded_per_90_overall,min_per_conceded_overall,min_per_match,min_per_card_overall,min_per_assist_overall,cards_per_90_overall,rank_in_league_top_attackers,rank_in_league_top_midfielders,rank_in_league_top_defenders,rank_in_club_top_scorer\r\n";
	String tb[]=linea.split(",");
	for(int i=0;i<tb.length;i++) System.out.println(i+" "+tb[i]);
	*/
	
	public static Scanner sc = new Scanner(System.in);
	
	
	public static void main(String[] args) {
		ArrayList<String>lista=new ArrayList<String>();
		
		String linea,campos[];
		String fichero="c:\\FICHEROS\\jugadores.csv";
		
		
		
		System.out.print("Nombre del Club ");
		String club= sc.nextLine();
		
		try(BufferedReader br=new BufferedReader(new FileReader(fichero));){
			
			linea=br.readLine();
			while(linea!=null) {
				
				campos=linea.split(",");
				
				
				if(campos[7].equalsIgnoreCase(club) )
				 lista.add(campos[6]+" "+campos[0]);
				
				 
				 linea=br.readLine();
			}
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		Collections.sort(lista);
		
		for (String item : lista)
		System.out.println(item);	
	}
}
