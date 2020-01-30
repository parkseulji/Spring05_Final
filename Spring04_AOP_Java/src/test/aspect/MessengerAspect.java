package test.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MessengerAspect {
	/*
	 * 1. 리턴type은 상관없다.
	 * 2. 메소드명이 send로 시작하는 메소드
	 * 3. 메소드에 전달되는 인자도 상관없다.
	 * 	3-1. .. : 인자의 타입, 갯수 상관없음
	 * 	3-2. * : 인자의 타입은 상관없지만 갯수는 * 수 만큼(*,*,* ~)
	 * 
	 * 위의 3가지 조건을 모두 만족시키는 메소드에 아래의 aop가 적용된다.
	 */
	@Around("execution(* send*(..))")
	public void around(ProceedingJoinPoint joinPoint) //joinPoint는 @Around에만 사용가능
			throws Throwable {
		//aop가 적용 된 메소드 수행 직전
		System.out.println("-- 수행이전 --");
		
		//aop가 적용 된 메소드에 전달 된 인자를 Object[]로 얻어낼 수 있다.
		Object[] args=joinPoint.getArgs();
		//반복문 돌면서 찾고싶은 type을 찾는다
		for(Object tmp:args) {
			if(tmp instanceof String) {//만일 String type이면 
				//원래 type으로 casting
				String msg=(String)tmp;
				System.out.println("aop에서 읽어낸 내용:"+msg);
				if(msg.contains("바보")) {
					System.out.println("바보라고 하기 없기!");
					return; //메소드를 여기서 종료시킨다.
				}
			}
		}
		
		//aop가 적용 된 메소드 수행하고 리턴되는 값 받아오기(void면 null이다.)
		Object obj=joinPoint.proceed();
			
		//aop가 적용 된 메소드 리턴 직후
		System.out.println("-- 수행직후 --");
	}
}
