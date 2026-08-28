import com.mojang.serialization.Codec;
import java.util.Map;

public record gqv(Map<String, gqi> d) {
   public static final Codec<String> a = Codec.string(1, 16);
   public static final Codec<gqv> b = Codec.unboundedMap(a, gqi.a).xmap(gqv::new, gqv::a);
   public static final atp<gqv> c = atp.a("language", b);

   public Map<String, gqi> a() {
      return this.d;
   }
}
