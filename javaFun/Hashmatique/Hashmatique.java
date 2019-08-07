import java.util.Set;
import java.util.HashMap;

public class Hashmatique {
    public static void main(String[] args) {
        HashMap<String, String> userMap = new HashMap<String, String>();
        userMap.put("Brand New World", "Hashiridase! Hashiridase! sora takaku hata kazashi hatenai kono umi wo koete sagashi ni ikou yo dare mo imada mitsukerarenai sekai no kiseki wo takanaru mune omoi no mama tsuki susumu dake sa yume oibito nokosu ashiato wo");
        userMap.put("Hey Julie!", "Hey Julie, heard you got that wet, wet, wet Something for my neck, neck, neck Hey Julie, heard you got that drip, got that drip Something for my wrist, for my wrist Hey Julie Ooh, hey Julie");
        userMap.put("Big Fish", "You can get anything you want Know what I'm saying? You want that over there? You want that over there? I got you");
        userMap.put("Kyouran Hey Kids!!", "Fusagu no men ni kowasu kyouran kids Uso kirai? houkai? Hibi o touka shite Amai taion no mitsu nioi tatte Sosoru flavor flavor flavor");

        String title = userMap.get("Brand New World");
        System.out.println("The track name is: " + title);

        // get the keys by using the keySet method
        Set<String> keys = userMap.keySet();
        for(String key : keys) {
            System.out.println(key);
            System.out.println(userMap.get(key));    
        }
    }
}


