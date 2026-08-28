import com.mojang.serialization.Codec;
import java.util.Map;

public record hjs(Map<String, hjh> d) {
   public static final Codec<String> a = Codec.string(1, 16);
   public static final Codec<hjs> b = Codec.unboundedMap(a, hjh.a).xmap(hjs::new, hjs::a);
   public static final aua<hjs> c = new aua<>("language", b);

   public Map<String, hjh> a() {
      return this.d;
   }
}
