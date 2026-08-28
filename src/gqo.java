import com.mojang.serialization.Codec;
import java.util.Map;

public record gqo(Map<String, gqb> d) {
   public static final Codec<String> a = Codec.string(1, 16);
   public static final Codec<gqo> b = Codec.unboundedMap(a, gqb.a).xmap(gqo::new, gqo::a);
   public static final atl<gqo> c = atl.a("language", b);

   public Map<String, gqb> a() {
      return this.d;
   }
}
