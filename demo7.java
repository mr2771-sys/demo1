public class OOPSbannerApp {
	static class CharacterPatternMap {
		char character ;
		String[] pattern;
		CharacterPatternMap(char character,String[]pattern){
			this.character = character;
			this.pattern = pattern;
			}
		}
public static CharacterPatternMap[]
createCharacterPatternMap(){
			return new CharacterPatternMap[]{
			new CharacterPatternMap('O',new String[]{
					" *** ",
					"*   *",
					"*   *", 
					"*   *",
					" *** "
				}),
				new CharacterPatternMap('O'new String[]{
				    " *** ",
					"*   *",
					"*   *", 
					"*   *",
					" *** ",
				}),	
				
				newCharacterPatternMap('P',new String[]
				    "*****",
					"*   *",
					"**** ",
					"*    ",
					"*    ",
					"*    ",
				
				}),
				newCharacterPatternMap('S'new String[]
				    " ****",
					"*    ",
					" *** ",
					"    *",
					"**** ",
				
				})	
			};
		}
public static String [] getCharacterpattern(char ch, CharacterPatternMap[] charMaps){
			for (CharacterPatternMap map : charMaps){
			if(map.character ==  ch){
			return map.pattern ;
			}
		}		
		return null;
}
public static void printmessage(String message , CharacterPatternMap[] charMaps){
			int height =5;
			for (int row = 0; row < height; row++) {

            for (int i = 0; i < message.length(); i++) {
                String[] pattern = getCharacterPattern(message.charAt(i), charMaps);

                if (pattern != null) {
                    System.out.print(pattern[row] + "  ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        CharacterPatternMap[] charMaps = createCharacterPatternMaps();

        String message = "OOPS";

        printMessage(message, charMaps);
    }
}
			
			
			