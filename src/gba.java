import com.mojang.serialization.Codec;
import java.util.Map;

public record gba(Map<String, gan> d) {
   public static final Codec<String> a = arh.b(1, 16);
   public static final Codec<gba> b = Codec.unboundedMap(a, gan.a).xmap(gba::new, gba::a);
   public static final amw<gba> c = amw.a("language", b);

   public Map<String, gan> a() {
      return this.d;
   }
}
