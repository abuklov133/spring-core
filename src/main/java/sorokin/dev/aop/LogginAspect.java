package sorokin.dev.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LogginAspect {

    @Before("execution(* sorokin.dev.TaskManager.*(..))")
    public void logBefore(JoinPoint joinPoint) {
        System.out.println("Перед вызовом метода : " +
                joinPoint.getSignature().getName());
    }

    @AfterReturning(
            value = "execution(* sorokin.dev.TaskManager.*(..))",
            returning = "result"
    )
    public void logAfterReturning(JoinPoint joinPoint,
                                  Object result
    ) {
        System.out.println("После возвращения результата: " +
                joinPoint.getSignature().getName() + " результат = " + result);
    }
}
