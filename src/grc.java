import com.mojang.serialization.Codec;
import java.util.Map;

public record grc(Map<String, gqp> d) {
   public static final Codec<String> a = Codec.string(1, 16);
   public static final Codec<grc> b = Codec.unboundedMap(a, gqp.a).xmap(grc::new, grc::a);
   public static final asu<grc> c = asu.a("language", b);

   public Map<String, gqp> a() {
      return this.d;
   }
}
