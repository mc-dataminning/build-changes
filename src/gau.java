import com.mojang.serialization.Codec;
import java.util.Map;

public record gau(Map<String, gah> d) {
   public static final Codec<String> a = arj.b(1, 16);
   public static final Codec<gau> b = Codec.unboundedMap(a, gah.a).xmap(gau::new, gau::a);
   public static final amx<gau> c = amx.a("language", b);

   public Map<String, gah> a() {
      return this.d;
   }
}
