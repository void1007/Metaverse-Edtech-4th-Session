package Java20240402;
import java.util.ArrayList;
import java.util.List;
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

import java.util.List;

class FreeBoard{ //-->FreeBoard클래스의 시작,이 클래스는 게시판 글을 나타냅니다.
    private int id;
    private String title;
    private String content;
    private String loginId; // --> id,title,content,loginId라는 필드를 선언 이필드들은 게시판 글의 고유 식별자,제목,내용,작성자를 나타냅니다.

    private List<Reply> replies; // --> Reply 객체들을 저장하기 위한 리스트인 'replies'를 선언합니다.

    public FreeBoard(int id, String title, String content, String loginId ) { // --> FreeBoard 클래스의 생성자를 정의합니다. 이생성자는 게시판 글을 초기화 할때 사용됩니다.
        this.id = id;
        this.title = title;
        this.content = content;
        this.loginId = loginId;
        this.replies = new ArrayList<>(); // --> 생성자의 매개변수로 전달된 값들을 사용하여 필드를 초기화합니다. 또한,'replies'리스트를 새로운 ArrayList로 초기화합니다.
    }

    public void addReply(Reply reply){ // -->게시판 글에 새로운 댓글을 추가하는 메서드인 'addReply'를 정의합니다.
        replies.add(reply); // --> 'replies'리스트에 새로운 댓글을 추가합니다.
    }

    public List<Reply> getReplies() { // --> 게시판 글에 달린 댓글 목록을 반환하는 메서드인 'getReplies'를 정의합니다.
        return replies;
    }

}
class Reply{ // --> 'Reply' 클래스의 시작입니다. 이 클래스는 게시판 글에 달린 댓글을 나타냅니다.
    private int id;
    private String content;
    private String loginId;
    private int freeBoardId; // --> 'id','content',loginId,'freeBoardId'라는 필드를 선언합니다. 이 필드들은 각각 댓글의 고유 식별자, 내용, 작성자, 해당 게시판 글의 고유 식별자를 나타냅니다.
    public Reply(int id, String content, String loginId, int freeBoardId){ // --> 'Reply'클래스의 생성자를 정의합니다. 이 생성자는 댓글을 초기화할 때 사용됩니다.
        this.id = id;
        this.content = content;
        this.loginId = loginId;
        this.freeBoardId = freeBoardId; // -->생성자의 매개변수로 전달된 값들을 사용하여 필드를 초기화합니다.
    }

}

