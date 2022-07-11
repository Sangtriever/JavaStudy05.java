// 제로베이스 과제 05번
// 달력 출력 프로그램
// 작성자 : 이상현
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Scanner;
public class 과제5 {

    public static void main(String[] args){

        Scanner in = new Scanner(System.in);

        System.out.println("[달력 출력 프로그램]");

        System.out.print("달력의 년도를 입력해 주세요. (yyyy) : ");
        int year = in.nextInt();
//      윤년 계산



        System.out.print("달력의 월을 입력해 주세요. (mm) : ");
        int month = in.nextInt();
        int day = 1;


        LocalDate nowday = LocalDate.of(year,month,day);
        DayOfWeek dayOfWeek = nowday.getDayOfWeek();
        int firstday = dayOfWeek.getValue();
//        System.out.println("요일"+firstday);


        int 윤년 ;

        if(year%4==0 && year%100 !=0){
            윤년=1;

        }else {
            윤년=0;
        }
        if(year%400==0){
            윤년=1;
        }
//        System.out.println("윤년"+윤년);

        String [] weeks = {"일", "월", "화", "수", "목", "금", "토"};
        int lastday = 0;
        for(int i = 1; i<=month ; i++){
            if( (i==4) || (i==6) || (i==9) || (i==11) ){
                lastday=30;
            }else if(i==2){
                lastday =28+윤년;
            }else{
                lastday=31;
            }
        }
//        System.out.println("마지막날 : "+lastday);





        System.out.println(String.format("[%d년 %02d월]", year,month));
        System.out.println("일\t월\t화\t수\t목\t금\t토\t");

        for(int j =0 ; j<firstday; j++){
                System.out.print("\t");
            }
        for(int i=1; i<=lastday; i++){
            day=i;
            System.out.print(String.format("%02d\t",day));
            firstday++;
            if((firstday%7)==0){
                System.out.println();
            }
        }





        }
    }

