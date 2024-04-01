package Java0401;

class keyvalue<k,v> {
    private k key;

    public k getKey() {
        return key;
    }
    public void setValue(v value) {
        this.value = value;
    }
    public v getValue() {
        return value;
    }

    public void setKey(k key) {
        this.key = key;
    }

    private v value;
};
public class Main2 {
    public static void main(String[] args) {

    keyvalue<String, Integer> kv1 = new keyvalue<>();
    kv1.setKey("사과");
    kv1.setValue(1000);
    System.out.println(kv1.getKey() + " : " + kv1.getValue());

// 두번째 제네릭을 사용하지 않더라도 Void타입을 지정해줘야 함
    keyvalue<String , Void> kv3 = new keyvalue<>();
    kv3.setKey("키값만 사용");
        System.out.println("key : "+ kv3.getKey());
    }

}
