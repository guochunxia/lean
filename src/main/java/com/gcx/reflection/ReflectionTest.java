package com.gcx.reflection;


import org.junit.Test;

import java.lang.annotation.Annotation;
import java.lang.reflect.*;
import java.util.Random;

/**
 * @ClassName ReflectionTest
 * @Author guo_chx@suixingpay.com
 * @Date 2019/12/13 下午4:54
 * @Version 1.0
 *
 * 类的加载load
 * 类的链接link
 * 类的初始化initialize
 */
public class ReflectionTest {

    /**
     * 获取class的四种方法
     */
    @org.junit.Test
    public void test1() throws ClassNotFoundException {

        Class<Person> clazz1 = Person.class;
        System.out.println(clazz1);

        Person person = new Person();
        Class<? extends Person> clazz2 = person.getClass();
        System.out.println(clazz2);

        Class<?> clazz3 = Class.forName("com.gcx.reflection.Person");
        System.out.println(clazz3);

        Class<?> clazz4 = ReflectionTest.class.getClassLoader().loadClass("com.gcx.reflection.Person");
        System.out.println(clazz4);

    }

    @Test
    public void test2(){

        //系统类加载器
        ClassLoader classLoader = ReflectionTest.class.getClassLoader();
        System.out.println("系统类加载器"+classLoader);
        //拓展类加载器
        ClassLoader classLoader1 = classLoader.getParent();
        System.out.println("拓展类加载器"+classLoader1);
        //引导类加载器（我们访问不到）
        ClassLoader classLoader2 = classLoader1.getParent();
        System.out.println("引导类加载器"+classLoader2);


    }

    @Test
    public void test3() throws IllegalAccessException, InstantiationException, ClassNotFoundException {

        Class<Person> clazz1 = Person.class;
        Person person1 = clazz1.newInstance();
        System.out.println(person1);

        Person person = new Person();
        Class<? extends Person> clazz2 = person.getClass();
        Person person2 = clazz2.newInstance();
        System.out.println(person2);

        Class<?> clazz3 = Class.forName("com.gcx.reflection.Person");
        Object o = clazz3.newInstance();
        System.out.println(o);

        Class<?> clazz4 = ReflectionTest.class.getClassLoader().loadClass("com.gcx.reflection.Person");
        Object o1 = clazz4.newInstance();
        System.out.println(o1);

    }

    /**
     * 根据路径获取一个实例对象
     * @param path
     * @return
     */
    private Object getInstance(String path)
            throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        Class<?> aClass = Class.forName(path);
        return aClass.newInstance();

    }

    @Test
    public void test4() throws IllegalAccessException, InstantiationException, ClassNotFoundException {

        String path = "";
        int i = new Random().nextInt(3);
        switch (i){
            case 0 : path = "java.util.Date";
                break;
            case 1 : path = "java.lang.Object";
                break;
            case 2 : path = "com.gcx.reflection.Person";
                break;
        }
        Object instance = getInstance(path);
        System.out.println(instance);
    }

    @Test
    public void test5(){
        Class<Person> personClass = Person.class;
        Field[] fields = personClass.getFields();
        for (Field field : fields) {
            System.out.println(field);
        }

        System.out.println("****************");
        Field[] fields1 = personClass.getDeclaredFields();
        for (Field field : fields1) {
            System.out.println(field);
            int modifiers = field.getModifiers();
            System.out.println(Modifier.toString(modifiers));
            System.out.println(field.getType());
            System.out.println(field.getName());
            System.out.println("================");
        }
    }

    @Test
    public void test6(){

        Class<Person> personClass = Person.class;
        Method[] methods = personClass.getMethods();
        for (Method method:methods) {
            System.out.println(method);
        }
        System.out.println("**************");

        Method[] declaredMethods = personClass.getDeclaredMethods();
        for (Method method:declaredMethods) {
            System.out.println(method);
        }

    }

    /**
     * Method相关操作
     */
    @Test
    public void test7(){


        Class<Person> personClass = Person.class;
        Method[] declaredMethods = personClass.getDeclaredMethods();
        for (Method method:declaredMethods) {
            System.out.println(method);

            //方法注解
            Annotation[] annotations = method.getAnnotations();
            if(annotations.length>0){
                for (Annotation annotation:annotations) {
                    System.out.println(annotation);
                }
            }

            //方法修饰符
            System.out.println(Modifier.toString(method.getModifiers()));

            //方法返回类型
            Class returnType = method.getReturnType();
            System.out.println(returnType.getName());

            //方法名
            System.out.println(method.getName());

            //参数列表
            Parameter[] parameters = method.getParameters();
            if(parameters.length>0){
                for (Parameter p :parameters) {
                    System.out.println(p.getParameterizedType().getTypeName()+"--"+p.getType().getName()+"-- "+p.getName());
                }
            }

            //异常
            Class[] exceptionTypes = method.getExceptionTypes();
            if(exceptionTypes.length>0)
            for (Class e : exceptionTypes) {
                System.out.println(e.getName());
            }
            System.out.println("***************");
        }

    }

    /**
     * 获取构造器
     */
    @Test
    public void test8(){

        //获取public的构造器
        Class<Person> personClass = Person.class;
        Constructor [] constructors = personClass.getConstructors();
        for (Constructor constructor:constructors) {
            System.out.println(constructor);
        }
        System.out.println("=====================");

        //获取所有的构造器
        Constructor [] declaredConstructors = personClass.getDeclaredConstructors();
        for (Constructor constructor:declaredConstructors) {
            System.out.println(constructor);
        }

    }

    /**
     * 获取父类
     */
    @Test
    public void test9(){

        //不带泛型的
        Class<Person> personClass = Person.class;
        Class<? super Person> superclass = personClass.getSuperclass();
        System.out.println(superclass);

        //带泛型的
        Type genericSuperclass = personClass.getGenericSuperclass();
        System.out.println(genericSuperclass);
        //获取泛型
        ParameterizedType parameterizedType = (ParameterizedType) genericSuperclass;
        Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
        System.out.println(actualTypeArguments[0].getTypeName());

    }

    /**
     * 获取实现接口
     */
    @Test
    public void test10(){

        //获取实现接口
        Class<Person> personClass = Person.class;
        Class [] interfaces = personClass.getInterfaces();
        for (Class inter:interfaces) {
            System.out.println(inter.getName());
        }
    }

    /**
     * 获取包名和注解
     */
    @Test
    public void test11(){
        Class<Person> personClass = Person.class;
        Package aPackage = personClass.getPackage();
        System.out.println(aPackage);

        Annotation[] annotations = personClass.getAnnotations();
        for (Annotation annotation:annotations) {
            System.out.println(annotation);
            System.out.println(annotation.annotationType().getCanonicalName());
        }

    }

    /**
     * 操作运行时类属性
     */
    @Test
    public  void test12() throws IllegalAccessException, InstantiationException, NoSuchFieldException {

        Class<Person> personClass = Person.class;

        //获取运行时类对象
        Person person = personClass.newInstance();

        //获取运行时类属性
        Field name = personClass.getDeclaredField("name");

        //设置操作权限
        name.setAccessible(true);

        //设置值
        name.set(person,"123");

        //获取值
        Object o = name.get(person);
        System.out.println(o);

    }

    /**
     * 操作运行时类方法
     */
    @Test
    public void test13()
            throws IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException {

        Class<Person> personClass = Person.class;

        Person person = personClass.newInstance();

        Method showPrivate = personClass.getDeclaredMethod("showPrivate",String.class);

        showPrivate.setAccessible(true);

        Object o = showPrivate.invoke(person, "张三");

        System.out.println(o);

    }

    /**
     * 反射通过构造器创建对象
     * @throws NoSuchMethodException
     * @throws IllegalAccessException
     * @throws InvocationTargetException
     * @throws InstantiationException
     */
    @Test
    public void test14()
            throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {

        Class<Person> personClass = Person.class;

//        Class [] classArr = new Class[2];
//        classArr[0] = String.class;
//        classArr[1] = Integer.class;

        Constructor<Person> declaredConstructor = personClass.getDeclaredConstructor(String.class,Integer.class);
        declaredConstructor.setAccessible(true);

//        Object [] objects = new Object[2];
//        objects[0] = "123";
//        objects[1] = 12;
        Person person = declaredConstructor.newInstance("23",24);
        System.out.println(person);

    }

}
