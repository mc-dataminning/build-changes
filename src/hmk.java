import com.mojang.serialization.Codec;
import java.util.Map;

public record hmk(Map<String, hlz> d) {
   public static final Codec<String> a = Codec.string(1, 16);
   public static final Codec<hmk> b = Codec.unboundedMap(a, hlz.a).xmap(hmk::new, hmk::a);
   public static final aun<hmk> c = new aun<>("language", b);

   public Map<String, hlz> a() {
      return this.d;
   }
}
