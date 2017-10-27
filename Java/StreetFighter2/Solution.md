    public class Solution{
        public static String[] streetFighterSelection(String[][] fighters, int[] position, String[] moves){
            int x = position[1];
            int y = position[0];
            String[] result = new String[moves.length];
        
            for (int i = 0; i < moves.length; i++) {
                String mv = moves[i];
                switch(mv) {
                    case "up":    y = 0; break;
                    case "right": x = (x + 1) % 6; break;
                    case "down":  y = 1; break;
                    case "left":  x = (x + 5) % 6; break;
                    default: break;
                }
                result[i] = fighters[y][x];
            }
            return result;
        }
    }
>배열에 이동한 값 계속 저장했는데 이거보니 직전값만 있어도 된다는 걸 깨달음..ㅎㅎ....ㅎ..
modular devision쓰면 이렇게 간단했던 걸... 활용 짱이다