import com.mojang.serialization.Codec;
import java.util.Map;

public record gao(Map<String, gab> d) {
   public static final Codec<String> a = aqy.b(1, 16);
   public static final Codec<gao> b = Codec.unboundedMap(a, gab.a).xmap(gao::new, gao::a);
   public static final amn<gao> c = amn.a("language", b);

   public Map<String, gab> a() {
      return this.d;
   }
}
