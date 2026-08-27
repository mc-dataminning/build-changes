import com.mojang.serialization.Codec;
import java.util.Map;

public record gay(Map<String, gal> d) {
   public static final Codec<String> a = arg.b(1, 16);
   public static final Codec<gay> b = Codec.unboundedMap(a, gal.a).xmap(gay::new, gay::a);
   public static final amv<gay> c = amv.a("language", b);

   public Map<String, gal> a() {
      return this.d;
   }
}
