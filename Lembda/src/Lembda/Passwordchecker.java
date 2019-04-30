package Lembda;

import java.util.function.Predicate;

public class Passwordchecker {
void check(String t, Predicate<String> p) {
	System.out.println(p.test(t));
}
}