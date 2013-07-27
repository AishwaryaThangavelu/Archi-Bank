package aish.vaishno.groovyworkout1.persistence

import aish.vaishno.groovyworkout1.persistence.GreWordListDetails;

class GreWordListDao {




	def addWord(GreWordListDetails greWord){
		def mySqlConnection= groovy.sql.Sql.newInstance('jdbc:mysql://localhost:3306/AISH_PROJECTS','aish','vaishno','com.mysql.jdbc.Driver');
		//mySqlConnection.executeInsert("insert into gre_wordlist values(2,'abate','lessen')");

		mySqlConnection.executeInsert("insert into gre_wordlist values(${greWord.greId},${greWord.greWord},${greWord.wordMeaning})")
		mySqlConnection.close();
	}

	def getWordList(){
		def mySqlConnection= groovy.sql.Sql.newInstance('jdbc:mysql://localhost:3306/AISH_PROJECTS','aish','vaishno','com.mysql.jdbc.Driver');
		mySqlConnection.rows("select * from gre_wordlist");
		mySqlConnection.close();
	}



	static void main(def args){
		/*GreWordListDetails greWordList=new GreWordListDetails();
		 greWordList.greId=4;
		 greWordList.greWord="Harangue";
		 greWordList.wordMeaning="Counter speech";
		 //println greWordList.greId;
		 new GreWordListDao().addWord(greWordList);	
		 println ("WOrdList: "+new GreWordListDao().getWordList());
		 */

		// DATABASE DATA -----> GROOVY

		def mySqlConnection= groovy.sql.Sql.newInstance('jdbc:mysql://localhost:3306/AISH_PROJECTS','aish','vaishno','com.mysql.jdbc.Driver');
		//mySqlConnection.eachRow("select * from gre_wordlist"){row -> println "${row.gre_Id}";	 }


		def xmlBuilder=new groovy.xml.MarkupBuilder();

		xmlBuilder.greWordList{
			mySqlConnection.eachRow("select * from gre_wordlist"){
				WordList(ID: it.gre_id,GreWord: it.gre_word,Meaning: it.gre_word_meaning);
			}
		}
	
		mySqlConnection.close();
	}
	
	
	

}
