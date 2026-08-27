import com.mojang.serialization.Codec;
import java.util.Map;

public record gin(Map<String, gia> d) {
   public static final Codec<String> a = avp.b(1, 16);
   public static final Codec<gin> b = Codec.unboundedMap(a, gia.a).xmap(gin::new, gin::a);
   public static final arb<gin> c = arb.a("language", b);

   public Map<String, gia> a() {
      return this.d;
   }
}
