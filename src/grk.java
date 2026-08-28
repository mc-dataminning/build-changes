import com.mojang.serialization.Codec;
import java.util.Map;

public record grk(Map<String, gqx> d) {
   public static final Codec<String> a = Codec.string(1, 16);
   public static final Codec<grk> b = Codec.unboundedMap(a, gqx.a).xmap(grk::new, grk::a);
   public static final asw<grk> c = asw.a("language", b);

   public Map<String, gqx> a() {
      return this.d;
   }
}
