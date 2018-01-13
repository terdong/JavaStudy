package _hoemwork.NewFish;

public class Customer {

    // 붕어빵을 사기 위한 자금.
    public int money;
    // 붕어빵 사장
    public FishBreadCEO ceo;
    // 붕어빵 사장에게 받은 붕어빵들
    public FishBread [] fishBreads;
    //붕어빵 수
    public int orderCount;

    public Customer(int money, FishBreadCEO ceo){
        this.money = money;
        this.ceo = ceo;

    }

    // 붕어빵 사장한테 붕어빵을 주문한다.
    public void orderFishBread(){
         // ceo 에게 붕어빵을 사기 위한 돈과 함께 요청.
        ceo.orderFishBread(this, money);
    }

    // 붕어빵 사장으로 부터 구워진 붕어빵을 받는다.
    // ㅡㅏㅣㅓㅣㅏㅓㅏㅓㅘㅓㅗㅓㅏㅗ[오류]
    public void setFishBreads(){

        //붕어빵 랜덤 개 만들기



        responseResult();


    }

    // 받은 붕어빵의 맛을 평가해 주는 동시에 사장에게 전달.
    public void evaluate(){



        System.out.print("각 붕어빵들의 맛입니다! ==========>>");

        //만들어진 붕어빵을 받아야 하는데 평가하면서 만듦..

        this.orderCount = this.money / 500;
        int [] FishBread = new int[orderCount] ;
        for(int i = 0; i<FishBread.length  ; i++){
            FishBread[i] = FishBreadTycoonLauncher.random.nextInt(3)+1;

        }
        for(int i = 0; i<FishBread.length; i++){

            try{
                Thread.sleep(500);
            } catch(InterruptedException e){
                System.out.println();
            }

            System.out.printf("%2d",FishBread[i]);
        }
        //붕어빵 total평가치 출력 오류..
        //배열 안의 숫자들이 문자 처리 된듯 함...
        int sum = 0;
        for(int i = 0; i < FishBread.length; i++){
            sum += FishBread[i];
            ceo.totalTasty = sum;
        }

    }

    // 돈과 평가치를 붕어빵 사장에게 전달해준다.
    public void responseResult(){
            evaluate();
    }
}
