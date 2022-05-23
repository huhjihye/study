package alone;

public class length01 {
    public static void main(String[] args) {
        String txt="스트링객체는 문자열을 저장합니다.";
        System.out.println(txt);
        System.out.println("문자열의 길이는: "+txt.length());
        System.out.println("저장이란 단어는 몇번째에 있을까요?");
        System.out.println(txt.indexOf("저장")+"번쨰에서 발견!");
    }
}
