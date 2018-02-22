package com.home.notes.annotations;

import java.lang.annotation.Documented;

//аннотация содержит информацию о чем либо; похоже в некотором смысле на комментирование
@Documented
public @interface MyAnnotation {
	String author();

	String date();

	int currentRevision() default 1;

	String lastModified() default "N/A";

	String lastModifiedBy() default "N/A";

	// Note use of array
	String[] reviewers();
}
