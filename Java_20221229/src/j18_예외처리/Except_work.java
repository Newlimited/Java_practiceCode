package j18_예외처리;

public class Except_work {

	public void sayNick(String nick) {
		if("SB".equals(nick)) {
			return;
		}
		System.out.println("당신의 별명은 "+ nick + " 입니다");
	}
    public static void main(String[] args){
     
    //예외처리
    	/*
    	 * FileNoFoundException = 없는 파일을 찾을때
    	 * ArithmeticException = 계산 처리가 불가할때
    	 * ArrayIndexOutOfBoundsException = 배열에 벗어난 배열값을 입력했을 때 
    	 *
    	 * 오류가 발생하면 catch 부분으로 넘어간다.
    	 * 오류 발생 여부와 상관없이 실행될것들은 
    	 * 마지막에 finally 로 출력한다.
    	 *
    	 */
    	
    	
    	int c = 0;
    	
    	try {
    		c = 4 / 0;
    	}catch(ArithmeticException e) {
    		c = -1;
    	}finally { 
    		System.out.println(c);
    	}
  
    	Except_work pre = new Except_work();
    	pre.sayNick("BH");
    	pre.sayNick("바보");
    	
    }
   }