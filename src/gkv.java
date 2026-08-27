import com.mojang.serialization.Codec;
import java.util.Map;

public record gkv(Map<String, gki> d) {
   public static final Codec<String> a = awe.b(1, 16);
   public static final Codec<gkv> b = Codec.unboundedMap(a, gki.a).xmap(gkv::new, gkv::a);
   public static final aro<gkv> c = aro.a("language", b);

   public Map<String, gki> a() {
      return this.d;
   }
}
