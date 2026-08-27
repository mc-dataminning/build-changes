import com.mojang.serialization.Codec;
import java.util.Map;

public record gge(Map<String, gfr> d) {
   public static final Codec<String> a = atv.b(1, 16);
   public static final Codec<gge> b = Codec.unboundedMap(a, gfr.a).xmap(gge::new, gge::a);
   public static final api<gge> c = api.a("language", b);

   public Map<String, gfr> a() {
      return this.d;
   }
}
