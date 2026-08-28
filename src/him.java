import com.mojang.serialization.Codec;
import java.util.Map;

public record him(Map<String, hib> d) {
   public static final Codec<String> a = Codec.string(1, 16);
   public static final Codec<him> b = Codec.unboundedMap(a, hib.a).xmap(him::new, him::a);
   public static final atz<him> c = new atz<>("language", b);

   public Map<String, hib> a() {
      return this.d;
   }
}
