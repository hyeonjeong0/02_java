package eraser.three;

/**
 * 칠판 지우개를 정의하는 클래스
 * -----------------------------
 * 칠판 지우개 속성 정의 => 멤버 변수로 생성
 * 가로 : width  : double
 * 세로 : height : double
 * 높이 : depth  : double
 * 겹   : layer  : int
 * 색상 : color  : String
 * -----------------------------
 * 생성자 정의 : 중복정의
 * 기본 생성자 명시
 * 매개변수를 받는 생성자 : 모든 필드를 다 받도록 정의
 * 생성자리팩토링 (1)
 *                        : this 키워드를 사용하여 매개변수 생성자 정의
 * 생성자리팩토링 (2)
 *                        : this() 다른 생성자 호출 적용하여
 *                          생성자를 여러개 중복정의
 * ------------------------------------------------
 * 기능 정의 : 메소드로 생성
 * 칠판지우기  : erase() : void    : "칠판을 지웠습니다." 문자열 출력
 * 한겹씩 제거 : peel()  : void    : 현재 layer 값에서 1 감소 
 *                                   layer 가 0이 될 때까지
 * 지우개 상태 출력      : print() : void 
 * 						 : 현재 지우개의 가로, 세로, 높이, 겹, 색상 등의 상태를 출력       
 * 
 * 
 * @author Administrator
 *
 */
public class Eraser {
	
	// 1. 멤버변수 선언부
	/**가로*/
	double width;
	
	/**세로*/
	double height;
	
	/**높이*/
	double depth;
	
	/**겹*/
	int layer;
	
	/**색상*/
	String color;
	
	// 2. 생성자 선언부
	// (1) 기본 생성자
	Eraser() {
		
	}
	// (2) 매개변수가 있는 생성자 : 다섯개의 매개변수를 모두 받는다.
	Eraser(double width) {
		// 53 줄의 기본 생성자 호출
		//     : 매개 변수가 비어있는 this() 이므로
		this();
		// width 필드는 매개변수로 넘겨진 값으로 초기화
		this.width = width;
	}
	
	
	/**
	 * 지우개의 가로, 세로 필드만 초기화하는 생성자
	 * @param Width : 가로길이
	 * 			=> width 필드를 초기화하는 생성자의 기능을 사용
	 * @param Height : 세로길이 => 직접초기화
	 */
	Eraser(double width, double height) {
		this(width);
		this.height = height;
	}
	
	Eraser(double width, double height, double depth) {
		this(width, height);
		this.depth = depth;
	}
	
	Eraser(double width, double height, double depth, int layer) {
		this(width, height, depth);
		this.layer = layer;
	}
	
	Eraser(double width, double height, double depth, int layer, String color) {
		this(width, height, depth, layer);
		this.color = color;
	}

	// 3. 메소드 선언부
	// (1) eraser()
	public void erase() {
		System.out.println("칠판을 지웠습니다.");
	}
	
	// (2) peel()
	/**
	 * 남아있는 지우개 겹을 벗겨내는 메소드
	 * layer 값이 0보다 작을수는 없다.
	 */
	public void peel() {
		// if를 사용하여 layer 값이
		// 0보다 작아질 수 없도록
		// 값을 체크
		if ((layer - 1) > 0) {
			layer--;
		}
		
	}
	
	// (3) print()
	public void print() {
		System.out.printf("가로 : %4.2f, 세로 : %4.2f, 높이 : %4.2f, 남은 겹 : %d, 색상 : %s%n"
				           , width, height, depth, layer, color);
	}

}
