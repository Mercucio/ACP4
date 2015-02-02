package week3.day1.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Created by Богдан on 31.01.2015.
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface Save {
    // primitive, enum, String(Immutable)  - that's all available types of annotations
   /*type*/ String /*decription*/ desc() /*default value*/ default "";
    int num();





}
