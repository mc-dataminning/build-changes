import com.mojang.serialization.Codec;
import java.util.Map;

public record gfi(Map<String, gev> d) {
   public static final Codec<String> a = atg.b(1, 16);
   public static final Codec<gfi> b = Codec.unboundedMap(a, gev.a).xmap(gfi::new, gfi::a);
   public static final aot<gfi> c = aot.a("language", b);

   public Map<String, gev> a() {
      return this.d;
   }
}
