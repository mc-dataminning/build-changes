import com.mojang.serialization.Codec;
import java.util.Map;

public record gaa(Map<String, fzn> d) {
   public static final Codec<String> a = aqw.b(1, 16);
   public static final Codec<gaa> b = Codec.unboundedMap(a, fzn.a).xmap(gaa::new, gaa::a);
   public static final aml<gaa> c = aml.a("language", b);

   public Map<String, fzn> a() {
      return this.d;
   }
}
