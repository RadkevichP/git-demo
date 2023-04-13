package pl.pingwit.classwork_11;

import org.apache.commons.lang3.StringUtils;

import java.nio.charset.StandardCharsets;

/**
 * @author Pavel Radkevich
 * @since 2.03.23
 */
public class StringExample {

    public static void main(String[] args) {
        String example = "example";

        byte[] bytes1 = example.getBytes();
        example.isBlank();

        byte[] bytes = example.getBytes(StandardCharsets.UTF_8);

        for (byte aByte : bytes) {
            System.out.println(aByte);
        }

        String s = String.valueOf(new char[]{'e', 'x', 'a', 'm', 'p', 'l', 'e'});
        String s2 = "example";
        System.out.println(s == example);
        System.out.println(s2 == example);


        String format = String.format("My name is: %s. I am a %s", "Pavel", "engineer");
        String stringWithWhitespaces = " hello world! ";

        String[] split = format.split("\\.");

        for (String s1 : split) {
            System.out.println(s1);
        }
        System.out.println(stringWithWhitespaces);
        String withoutWhitespaces = stringWithWhitespaces.strip();
        System.out.println(withoutWhitespaces);

        String join = String.join(" ", "Papa", "Mama", "Ya");
        System.out.println(join);
        String upper = format.toUpperCase();

        boolean eer = format.endsWith("eer");
        System.out.println(eer);
        System.out.println(upper);


        String s1 = "Hello my friend.\nI'm here again!\nNobody can stop me!";
        System.out.println(s1);

        String preformatted =
                """
                Hello my friend!
                I'm here again!
                Nobody can stop me!
                """;
        System.out.println(preformatted);


        StringUtils.isBlank("");

    }
}
