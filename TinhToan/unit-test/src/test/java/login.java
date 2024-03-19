import static org.junit.Assert.assertThrows;

public class login {
    private loginMain logintest = new loginMain();

    @org.junit.Test
    public void UTCID01() {
        System.out.println(logintest.register("theanh18", "kkk123ABCD$$@", "1231234121"));
    }

    @org.junit.Test
    public void UTCID02() {
        System.out.println(logintest.register("theanh18", "kkk123ABCD$$@", "1231234121"));

    }

    @org.junit.Test
    public void UTCID03() {
        System.out.println(logintest.register("theanh18", "kkk123ABCD$2", "1231234121"));
    }

    @org.junit.Test
    public void UTCID04() {
        System.out.println(logintest.register("theanh8", "", ""));
    }

    @org.junit.Test
    public void UTCID05() {
        System.out.println(logintest.register("aaaaaaaaaa12", "Matkhaudangnhap123@", "mothaibabonnam"));
    }

    @org.junit.Test
    public void UTCID06() {
        assertThrows(IllegalArgumentException.class, () -> {
            logintest.register("@@##abc", "kkk123ABCD$$@", "1231234121");
        });

    }

    @org.junit.Test
    public void UTCID07() {
        System.out.println(logintest.register("abcdefgh9", "Matkhaudangnhap123@", "1123123412"));
    }

    @org.junit.Test
    public void UTCID08() {
        System.out.println(logintest.register("theanh22abc", "Matkhaudangnhap123", "1111111111"));
    }

    @org.junit.Test
    public void UTCID09() {
        System.out.println(logintest.register("theanh22abc", "Matkhaudangnhap123@", "1123123412"));
    }

    @org.junit.Test
    public void UTCID010() {
        System.out.println(logintest.register("theanh22abc", "theanh22abc", "mothaibabonnam"));
    }
}
