package org.idmr.anotaciones;

import java.lang.annotation.*;

@Documented
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface JSONAtributo {
    String nombre() default "";
    boolean capitalizar() default false;
}
