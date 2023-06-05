public class Main {

    public static void main(String[] args) {

        String tekst = "krhizmmgmcrecekgyljqkldocicziihtgpqwbticmvuyznragqoyrukzopfmjhjjxemsxmrsxuqmnkrzhgvtgdgtykhcglurvppvcwhrhrjoislonvvglhdciilduvuiebmffaagxerjeewmtcwmhmtwlxtvlbocczlrppmpjbpnifqtlninyzjtmazxdbzwxthpvrfulvrspycqcghuopjirzoeuqhetnbrcdakilzmklxwudxxhwilasbjjhhfgghogqoofsufysmcqeilaivtmfziumjloewbkjvaahsaaggteppqyuoylgpbdwqubaalfwcqrjeycjbbpifjbpigjdnnswocusuprydgrtxuaojeriigwumlovafxnpibjopjfqzrwemoinmptxddgcszmfprdrichjeqcvikynzigleaajcysusqasqadjemgnyvmzmbcfrttrzonwafrnedglhpudovigwvpimttiketopkvqw";
        String[] nizTeksta = new String[tekst.length()];
        int b = 0;
        int a = 0;
        int l = 0;
        int o = 0;
        int n = 0;
        int counter = 0;

        for (int i = 0; i < tekst.length(); i++) {
            nizTeksta[i] = String.valueOf(tekst.charAt(i));
        }
        for (int i = 0; i < nizTeksta.length; i++) {

            switch (nizTeksta[i]){
                case "b":
                    b++;
                    break;
                case "a":
                    a++;
                    break;
                case "l":
                    l++;
                    break;
                case "o":
                    o++;
                    break;
                case "n":
                    n++;
                    break;
                default:
                    break;

            }
            int c = Math.min(a,b);
            int c1 = Math.min(c,n);
            int c2 = Math.min(l,o);
            if(c2 == 0 || c1 == 0){
                counter = 0;
            }
            else if(c2 / c1 >= 2)
            {
                counter = c1;
            }
            else
            {
                int raz = c2 % 2;
                c2 = c2 - raz;
                counter = c2/2;
            }
        }

        System.out.println(counter);

    }
}
