import com.mojang.serialization.Codec;
import java.util.Map;

public record gat(Map<String, gag> d) {
   public static final Codec<String> a = arb.b(1, 16);
   public static final Codec<gat> b = Codec.unboundedMap(a, gag.a).xmap(gat::new, gat::a);
   public static final amq<gat> c = amq.a("language", b);

   public Map<String, gag> a() {
      return this.d;
   }
}
