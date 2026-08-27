import com.mojang.serialization.Codec;
import java.util.Map;

public record ggu(Map<String, ggh> d) {
   public static final Codec<String> a = atx.b(1, 16);
   public static final Codec<ggu> b = Codec.unboundedMap(a, ggh.a).xmap(ggu::new, ggu::a);
   public static final apk<ggu> c = apk.a("language", b);

   public Map<String, ggh> a() {
      return this.d;
   }
}
