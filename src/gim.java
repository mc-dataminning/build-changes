import com.mojang.serialization.Codec;
import java.util.Map;

public record gim(Map<String, ghz> d) {
   public static final Codec<String> a = avp.b(1, 16);
   public static final Codec<gim> b = Codec.unboundedMap(a, ghz.a).xmap(gim::new, gim::a);
   public static final arb<gim> c = arb.a("language", b);

   public Map<String, ghz> a() {
      return this.d;
   }
}
