package test.main;

import test.dto.FDto;

public class Flist {
	public static void main(String[] args) {
		FDto[] flist = new FDto[4];
		FDto f1=new FDto(1, "이준규", "010-00", "노원구");
		FDto f2=new FDto(2, "xxx", "111", "중랑구");
		FDto f3=new FDto(3, "ccc", "222", "도봉구");
		FDto f4=new FDto(4, "vvv", "333", "성북구");
		
		flist[0]=f1;
		flist[1]=f2;
		flist[2]=f3;
		flist[3]=f4;
		
		for(int i=0; i<flist.length; i++) {
//			System.out.println("번호:"+flist[i].getNum()+" 이름:"+flist[i].getName()+" 핸드폰번호:"+flist[i].getPhone()+" 주소:"+
//			flist[i].getAddr());
		
		FDto member = new FDto();
		member.setNum(flist[i].getNum());
		member.setName(flist[i].getName());
		member.setPhone(flist[i].getPhone());
		member.setAddr(flist[i].getAddr());
		
		showInfo(member);
		}
	}
	public static void showInfo(FDto flist1) {
		System.out.println("번호:"+flist1.getNum());
		System.out.println("이름:"+flist1.getName());
		System.out.println("핸드폰번호:"+flist1.getPhone());
		System.out.println("주소:"+flist1.getAddr());
		System.out.println("------------------");
	}
}