import com.mojang.serialization.Codec;
import java.util.Map;

public record goh(Map<String, gnu> d) {
   public static final Codec<String> a = axe.b(1, 16);
   public static final Codec<goh> b = Codec.unboundedMap(a, gnu.a).xmap(goh::new, goh::a);
   public static final aso<goh> c = aso.a("language", b);

   public Map<String, gnu> a() {
      return this.d;
   }
}
