import javax.swing.*;
import java.awt.*;


public class Frame extends JFrame {
    public Frame() {
        setTitle("Menu 만들기 예제");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 프레임 윈도우를 닫으면 프로그램을 종료하도록 설정

        createMenuBar(); // 메뉴 생성, 프레임에 삽입
        ContentPane(); // 컨텐트 팬 생성, 프레임에 삽입

        setSize(1000, 800); // 프레임 크기
        setVisible(true); // 프레임 출력
    }


    // 메뉴바 생성
    private void createMenuBar() {
        JMenuBar mb = new JMenuBar(); // 메뉴바 생성

        // Screen 메뉴 생성
        JMenu screenMenu = new JMenu("Screen");
        // Screen 메뉴에 메뉴아이템 생성 삽입
        screenMenu.add(new JMenuItem("Load"));
        screenMenu.add(new JMenuItem("Hide"));
        screenMenu.add(new JMenuItem("ReShow"));
        screenMenu.addSeparator(); // 분리선 삽입
        screenMenu.add(new JMenuItem("Exit"));

        // 메뉴바에 메뉴 삽입
        mb.add(screenMenu); // Screen 메뉴 삽입
        mb.add(new JMenu("Edit")); // Edit 메뉴 생성 삽입
        mb.add(new JMenu("Source")); // Source 메뉴 생성 삽입
        mb.add(new JMenu("Project")); // Project 메뉴 생성 삽입
        mb.add(new JMenu("Run")); // Run 메뉴 생성 삽입

        setJMenuBar(mb); // 메뉴바를 프레임에 부착
    }


    // 컨텐트 팬 설정 및 컴포넌트 추가
    private void ContentPane() {
        Container contentPane = getContentPane(); // 컨텐트 팬을 알아낸다.
        contentPane.setBackground(Color.GRAY); // 컨텐트팬의 배경색을 오렌지색으로 설정
        contentPane.setLayout(new FlowLayout()); // FlowLayout 배치관리자 설정

        WelcomeUser(contentPane); // WelcomeUser 컴포넌트 추가
        CheckBox(contentPane); // CheckBox 컴포넌트 추가
    }


    private void WelcomeUser(Container c) {
        c.setLayout(null); // 컨텐트팬의 배치관리자 제거

        // JLabel 컴포넌트 생성하고 위치와 크기를 직접 지정한다.
        JLabel welcome = new JLabel("Hello, Welcome User!");
        welcome.setFont(new Font("Malgun Gothic", Font.PLAIN, 30)); // 폰트 설정
        welcome.setLocation(130, 50); // welcome를 (130,50) 위치로 지정
        welcome.setSize(200, 20); // welcome를 200x20 크기로 지정
        c.add(welcome); // welcome를 컨텐트팬에 부착

        // '이름' 라벨 필드
        JLabel Name = new JLabel("이름: ");
        Name.setFont(new Font("Malgun Gothic", Font.PLAIN, 20));    // 폰트 설정
        Name.setLocation(130, 150);
        Name.setSize(200, 20);
        c.add(Name);

        // '이름' 입력 필드
        JTextField NameInput = new JTextField("");
        NameInput.setLocation(230, 150);
        NameInput.setSize(200, 40);
        c.add(NameInput);

        // '나이' 라벨 필드
        JLabel Age = new JLabel("나이: ");
        Age.setFont(new Font("Malgun Gothic", Font.PLAIN, 20));
        Age.setLocation(130, 200);
        Age.setSize(200, 20);
        c.add(Age);

        // '나이' 입력 필드
        JTextField AgeInput = new JTextField("");
        AgeInput.setLocation(230, 200);
        AgeInput.setSize(200, 40);
        c.add(AgeInput);

        // '전화번호' 라벨 필드
        JLabel Phone = new JLabel("전화번호: ");
        Phone.setFont(new Font("Malgun Gothic", Font.PLAIN, 20));
        Phone.setLocation(130, 250);
        Phone.setSize(200, 20);
        c.add(Phone);

        // '전화번호' 입력 필드
        JTextField PhoneInput = new JTextField("");
        PhoneInput.setLocation(230, 250);
        PhoneInput.setSize(200, 40);
        c.add(PhoneInput);

        // '확인' 버튼
        JButton OK = new JButton("확인");
        OK.setFont(new Font("Malgun Gothic", Font.PLAIN, 20));
        OK.setLocation(130, 300);
        OK.setSize(100, 40);
        c.add(OK);

        // '취소' 버튼
        JButton Cancel = new JButton("취소");
        Cancel.setFont(new Font("Malgun Gothic", Font.PLAIN, 20));
        Cancel.setLocation(230, 300);
        Cancel.setSize(100, 40);
        c.add(Cancel);
    }


    // 체크박스
    private void CheckBox(Container c) {
        // 이미지 체크박스에 사용할 2개의 이미지 객체 생성
        ImageIcon cherryIcon = new ImageIcon("images/cherry.jpg"); // 해제 상태 이미지
        ImageIcon selectedCherryIcon = new ImageIcon("images/selectedCherry.jpg"); // 선택 상태 이미지

        // 3개의 체크박스 생성
        JCheckBox apple = new JCheckBox("사과");
        JCheckBox pear = new JCheckBox("배");
        JCheckBox cherry = new JCheckBox("체리", cherryIcon);

        cherry.setBorderPainted(true); // 체크박스 외곽선이 보이도록 설정
        cherry.setSelectedIcon(selectedCherryIcon); // 선택 상태 이미지 등록

        // 위치 설정 및 추가
        apple.setLocation(130, 350);
        apple.setSize(200, 40);
        c.add(apple);

        pear.setLocation(130, 400);
        pear.setSize(200, 40);
        c.add(pear);

        cherry.setLocation(130, 450);
        cherry.setSize(200, 40);
        c.add(cherry);
    }

    public static void main(String[] args) {
        Frame frame = new Frame();
    }
}
