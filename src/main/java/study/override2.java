package study;


    class Car_01 {
        String color;
        int speed;

        void upSpeed(int value){
            speed = speed + value;
        }

        void downSpeed(int value){
            speed = speed - value;
        }
    }

    public class override2{
        public static void main(String[] args) {
            Car_01 myCar1 = new Car_01();
            myCar1.color = "빨강";
            myCar1.speed = 0;

            Car_01 myCar2 = new Car_01();
            myCar2.color = "빨강";
            myCar2.speed = 0;

            Car_01 myCar3 = new Car_01();
            myCar3.color = "빨강";
            myCar3.speed = 0;

            myCar1.upSpeed(30);
            System.out.println("자동차 1의 색상은" + myCar1.color + "이며, 현재 속도는 " + myCar1.speed + "km 입니다.");

            myCar2.upSpeed(60);
            System.out.println("자동차 2의 색상은" + myCar2.color + "이며, 현재 속도는 " + myCar2.speed + "km 입니다.");

            myCar3.upSpeed(0);
            System.out.println("자동차 3의 색상은" + myCar3.color + "이며, 현재 속도는 " + myCar3.speed + "km 입니다.");
        }
    }

