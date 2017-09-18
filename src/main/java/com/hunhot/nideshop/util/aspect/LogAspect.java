package com.hunhot.nideshop.util.aspect;

import com.alibaba.fastjson.JSON;
import com.hunhot.nideshop.util.PublicDescriptionUtil;
import org.aspectj.lang.ProceedingJoinPoint;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * TODO 描述
 * Created by bd007 on 2017/9/18.
 */
public class LogAspect {
    private static Logger logger = LoggerFactory.getLogger(LogAspect.class);
    /**
     * 环绕通知
     *
     * @param call 切入点
     * @return 返回方法返回值
     * @throws Throwable 异常
     */
    public Object doAround(ProceedingJoinPoint call) throws Throwable {
        Object obj;
        String requestInfo;
        String method;
        String title;

        /**方法执行耗时提示*/
        String methodConsumTime;

        /** 获取方法的请求参数 */
        requestInfo = JSON.toJSONString(call.getArgs());

        /** 获取方法名称 */
        method = getMehtodNameFromJoinPoint(call.toShortString());

        /** 获取方法的描述 */
        title = method + PublicDescriptionUtil.BEFOREMETHODRETURN;

        /** 记录方法执行前日志 */
        logger.info(method, title, String.format("%s,Request：%s", title, requestInfo));

        long strat = System.currentTimeMillis();

        obj = call.proceed();

        long end = System.currentTimeMillis();

        methodConsumTime = String.format(PublicDescriptionUtil.METHODTIMECONSUMING, end - strat);

        title = method + PublicDescriptionUtil.AFTERMETHODRETURN;

        /** 记录方法执行后日志，包括请求参数和返回参数 */
        logger.info(method, title, getMethodOperationInfo(title, requestInfo, obj, methodConsumTime));

        return obj;
    }

    /**
     * 从连接点中获取当前方法名称
     *
     * @param joinPointStr 连接点字符串
     * @return 方法名称字符串
     */
    private String getMehtodNameFromJoinPoint(String joinPointStr) {
        String methodName = "";
        if (joinPointStr != null && joinPointStr.length() > 0) {
            String str1 = joinPointStr.substring(joinPointStr.indexOf('(') + 1);
            if (str1.length() > 0) {
                methodName = str1.substring(0, str1.indexOf('('));
                if (methodName.length() > 0) {
                    methodName = methodName.replace('.', '/');
                }
            }
        }

        return methodName;
    }


    /**
     * 从切点通知单参数中获取需要的报文
     *
     * @param title       日志标题
     * @param requestInfo 请求参数
     * @param obj         返回值
     * @param consumTime  方法执行所耗费的时间
     * @return 返回方法操作提示信息
     */
    private String getMethodOperationInfo(String title, String requestInfo, Object obj, String consumTime) {
        return String.format("%s，Request：%s，Response：%s：。%s", title, requestInfo, JSON.toJSONString(obj), consumTime);
    }

}
