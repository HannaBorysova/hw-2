class NameEncoderDecoder {
    public String encode(String name) {
       return "NOTFORYOU" + name.replace("e", "1").strip()
                .replace("u", "2").strip()
                .replace("i", "3").strip()
                .replace("o", "4").strip()
                .replace("a", "5").strip() + "YESNOTFORYOU";
    }
  
    public String decode(String name) {
     return name.replace("NOTFORYOU", "").strip()
                .replace("YES", "").strip()
                .replace("1", "e").strip()
                .replace("2", "u").strip()
                .replace("3", "i").strip()
                .replace("4", "o").strip()
                .replace("5", "a").strip();
    }
}
