import com.mojang.serialization.Codec;
import java.util.Map;

public record gbu(Map<String, gbh> d) {
   public static final Codec<String> a = asg.b(1, 16);
   public static final Codec<gbu> b = Codec.unboundedMap(a, gbh.a).xmap(gbu::new, gbu::a);
   public static final anu<gbu> c = anu.a("language", b);

   public Map<String, gbh> a() {
      return this.d;
   }
}
