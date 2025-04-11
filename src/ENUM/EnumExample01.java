package ENUM;

public class EnumExample01 {
    public static void main(String[] args){
        System.out.println(BrowserUrl.CHROME.getUrl());
        System.out.println(Colours.RED.getHexCd());
        System.out.println(Colours.BLACK);
    }
}

enum BrowserUrl{
    CHROME("chrome.com"),
    EDGE("edge.com"),
    FIREFORX("firefox.com"),
    SAFARI("safari.com");

    private String url;
    BrowserUrl(String url){
        this.url=url;
    }

    String getUrl(){
        return this.url;
    }
}

enum Colours{
    RED("XO111"),
    BLACK("09CTDT"),
    YELLOW("XYTFYT");

    private String hexCd;
    Colours(String hexCd){
        this.hexCd=hexCd;
    }
    String getHexCd(){
        return this.hexCd;
    }
}


