import com.mojang.serialization.Codec;
import java.util.Map;

public record hgg(Map<String, hfv> d) {
   public static final Codec<String> a = Codec.string(1, 16);
   public static final Codec<hgg> b = Codec.unboundedMap(a, hfv.a).xmap(hgg::new, hgg::a);
   public static final ato<hgg> c = new ato<>("language", b);

   public Map<String, hfv> a() {
      return this.d;
   }
}
