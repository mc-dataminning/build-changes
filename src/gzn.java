import com.mojang.serialization.Codec;
import java.util.Map;

public record gzn(Map<String, gza> d) {
   public static final Codec<String> a = Codec.string(1, 16);
   public static final Codec<gzn> b = Codec.unboundedMap(a, gza.a).xmap(gzn::new, gzn::a);
   public static final atz<gzn> c = atz.a("language", b);

   public Map<String, gza> a() {
      return this.d;
   }
}
