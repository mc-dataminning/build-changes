import com.mojang.serialization.Codec;
import java.util.Map;

public record ggf(Map<String, gfs> d) {
   public static final Codec<String> a = atv.b(1, 16);
   public static final Codec<ggf> b = Codec.unboundedMap(a, gfs.a).xmap(ggf::new, ggf::a);
   public static final api<ggf> c = api.a("language", b);

   public Map<String, gfs> a() {
      return this.d;
   }
}
