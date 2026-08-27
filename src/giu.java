import com.mojang.serialization.Codec;
import java.util.Map;

public record giu(Map<String, gih> d) {
   public static final Codec<String> a = avq.b(1, 16);
   public static final Codec<giu> b = Codec.unboundedMap(a, gih.a).xmap(giu::new, giu::a);
   public static final arc<giu> c = arc.a("language", b);

   public Map<String, gih> a() {
      return this.d;
   }
}
