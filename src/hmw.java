import com.mojang.serialization.Codec;
import java.util.Map;

public record hmw(Map<String, hml> d) {
   public static final Codec<String> a = Codec.string(1, 16);
   public static final Codec<hmw> b = Codec.unboundedMap(a, hml.a).xmap(hmw::new, hmw::a);
   public static final aug<hmw> c = new aug<>("language", b);

   public Map<String, hml> a() {
      return this.d;
   }
}
