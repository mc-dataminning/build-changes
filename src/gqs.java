import com.mojang.serialization.Codec;
import java.util.Map;

public record gqs(Map<String, gqf> d) {
   public static final Codec<String> a = Codec.string(1, 16);
   public static final Codec<gqs> b = Codec.unboundedMap(a, gqf.a).xmap(gqs::new, gqs::a);
   public static final ato<gqs> c = ato.a("language", b);

   public Map<String, gqf> a() {
      return this.d;
   }
}
