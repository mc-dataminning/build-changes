import com.mojang.serialization.Codec;
import java.util.Map;

public record gri(Map<String, gqv> d) {
   public static final Codec<String> a = Codec.string(1, 16);
   public static final Codec<gri> b = Codec.unboundedMap(a, gqv.a).xmap(gri::new, gri::a);
   public static final asw<gri> c = asw.a("language", b);

   public Map<String, gqv> a() {
      return this.d;
   }
}
