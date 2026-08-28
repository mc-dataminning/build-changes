import com.mojang.serialization.Codec;
import java.util.Map;

public record gyw(Map<String, gyj> d) {
   public static final Codec<String> a = Codec.string(1, 16);
   public static final Codec<gyw> b = Codec.unboundedMap(a, gyj.a).xmap(gyw::new, gyw::a);
   public static final att<gyw> c = att.a("language", b);

   public Map<String, gyj> a() {
      return this.d;
   }
}
