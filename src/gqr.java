import com.mojang.serialization.Codec;
import java.util.Map;

public record gqr(Map<String, gqe> d) {
   public static final Codec<String> a = Codec.string(1, 16);
   public static final Codec<gqr> b = Codec.unboundedMap(a, gqe.a).xmap(gqr::new, gqr::a);
   public static final ato<gqr> c = ato.a("language", b);

   public Map<String, gqe> a() {
      return this.d;
   }
}
