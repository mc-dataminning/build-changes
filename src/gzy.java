import com.mojang.serialization.Codec;
import java.util.Map;

public record gzy(Map<String, gzl> d) {
   public static final Codec<String> a = Codec.string(1, 16);
   public static final Codec<gzy> b = Codec.unboundedMap(a, gzl.a).xmap(gzy::new, gzy::a);
   public static final aua<gzy> c = aua.a("language", b);

   public Map<String, gzl> a() {
      return this.d;
   }
}
