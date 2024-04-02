package Java20240402;
//1.FreeBoard 클래스(자유게시판 엔티티)
//1-1)id.title,content,loginid 필드 필수, 나머지 필요하다고 생각되는 필드는 각자 추가,
//1-2)List<Reply> replies 필드 사용
//:Reply 클래스와의 관계를 따로 외부 클래스로 작성하지 않고 내부에 List타입으로 저장

//2.Reply 클래스 (답글 엔티티)
//1-1)id,content,loginid필드 필수,나머지 필요하다고 생각되는 필드는 각자 추가
//1-2)freeBoardid필드 사용
//:댓글이 자유게시판의 어느 글의 댓글인지 저장
//1-3)Reply 객체가 생성될때 1-2의 해당 글의 객체에 있는 replies에 등록이 되어야 한다!!!
//:해결하기 위한 단계발 예시
//-freeBoardid를 이용하여 해당 FreeBoard 객체를 찾는다.
//-FreeBoard 객체의 replies에 추가한다
//=> 이 때 setReplies 메서드의 내용을 변경할 필요가 있을 수 있음!!
public class FreeBoard {
    public static void main(String[] args) {

    }
}
