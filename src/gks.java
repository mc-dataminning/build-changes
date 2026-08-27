import com.mojang.serialization.Codec;
import java.util.Map;

public record gks(Map<String, gkf> d) {
   public static final Codec<String> a = awe.b(1, 16);
   public static final Codec<gks> b = Codec.unboundedMap(a, gkf.a).xmap(gks::new, gks::a);
   public static final aro<gks> c = aro.a("language", b);

   public Map<String, gkf> a() {
      return this.d;
   }
}
