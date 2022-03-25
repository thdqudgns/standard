package standard.chapter06;

//각각 다른 인스턴스지만, 클래스변수는 공유함을 이용하여 문서번호 자동으로 붙이기

class Document {
	static int count = 0;
	String name;	//문서명(Document name)
	
	Document() {	//문서 생성 시 문서명을 지정하지 않았을 때
		this("제목없음" + ++count);		// 제목없는 인스턴스를 생성할 때마다 1씩 증가
	}
	
	Document(String name) {
		this.name = name;
		System.out.println("문서 " + this.name + "가 생성되었습니다.");
	}
}

class DocumentTest {
	public static void main(String[] args) {
		Document d1 = new Document();
		Document d2 = new Document("자바.txt");
		Document d3 = new Document();
		Document d4 = new Document();
	}
}

/*
문서 제목없음1가 생성되었습니다.
문서 자바.txt가 생성되었습니다.
문서 제목없음2가 생성되었습니다.
문서 제목없음3가 생성되었습니다.
*/