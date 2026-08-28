import com.mojang.serialization.Codec;
import java.util.Map;

public record gsd(Map<String, grq> d) {
   public static final Codec<String> a = Codec.string(1, 16);
   public static final Codec<gsd> b = Codec.unboundedMap(a, grq.a).xmap(gsd::new, gsd::a);
   public static final ate<gsd> c = ate.a("language", b);

   public Map<String, grq> a() {
      return this.d;
   }
}
