// http://habrahabr.ru/post/145138/
import java.io.File;
import java.io.IOException;

import org.codehaus.groovy.control.CompilationFailedException;

import groovy.lang.GroovyShell;


public class Runner {
	public static void main(String... args) throws CompilationFailedException, IOException{
	    GroovyShell shell = new GroovyShell();
	    Integer result = (Integer) shell.evaluate(new File("groovy-scripts/GroovyScript.groovy"));
	    System.out.println("result=" + result);
	}
}
