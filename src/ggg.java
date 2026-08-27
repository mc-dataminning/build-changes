import com.mojang.serialization.Codec;
import java.util.Map;

public record ggg(Map<String, gft> d) {
   public static final Codec<String> a = atw.b(1, 16);
   public static final Codec<ggg> b = Codec.unboundedMap(a, gft.a).xmap(ggg::new, ggg::a);
   public static final apj<ggg> c = apj.a("language", b);

   public Map<String, gft> a() {
      return this.d;
   }
}
