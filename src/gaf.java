import com.mojang.serialization.Codec;
import java.util.Map;

public record gaf(Map<String, fzs> d) {
   public static final Codec<String> a = aqy.b(1, 16);
   public static final Codec<gaf> b = Codec.unboundedMap(a, fzs.a).xmap(gaf::new, gaf::a);
   public static final amn<gaf> c = amn.a("language", b);

   public Map<String, fzs> a() {
      return this.d;
   }
}
